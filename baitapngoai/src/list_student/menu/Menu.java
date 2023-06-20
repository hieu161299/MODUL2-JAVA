package list_student.menu;

import list_student.interface_list.ManageStudent;
import list_student.student.Student;

import java.util.Scanner;

public class Menu {
    private Scanner scanner = new Scanner(System.in);
    private ManageStudent manageStudent ;
    public Menu(){
        manageStudent = new ManageStudent();
    }
    public void showMainMenu(){

        int choice;
        do {
            System.out.println("----- Main Menu -----");
            System.out.println("1. Add student\n2. Delete Student\n3. Edit student\n" +
                    "4. Show list student\n5. Search student by id\n0. Exit");
            System.out.println("enter your choice");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    Student student = new Student();
                    student.inputStudent();
                    manageStudent.addStudent(student);
                    break;
                case 2:
                    System.out.println("enter id of student you want to delete");
                    int idDelete = scanner.nextInt();
                    manageStudent.deleteStudent(idDelete);
                    break;
                case 3:
                    System.out.println("enter id to edit");
                    int idEdit = scanner.nextInt();
                     manageStudent.editStudent(idEdit);
                    break;
                case 4:
                    manageStudent.showAll();
                    break;
                case 5:
                    System.out.println("enter id of student you want to find");
                    int idSearch = scanner.nextInt();
                    manageStudent.findById(idSearch);
                    break;
                case 0:
                    System.exit(0);
            }
        }while (choice != 0);
    }
}
