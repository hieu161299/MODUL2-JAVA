package Test;

import manage.ManageStudent;
import student_class.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ManageStudent studentList = new ManageStudent();
        Scanner scanner = new Scanner(System.in);
        while (true){

            int choice;
            do {
                System.out.println("===== Main Menu =====");
                System.out.println("1. Add Student\n2. Delete Student\n3. Edit Student\n4. Search Student" +
                        "\n5. Show list\n" + "\n6. Show list\n" +
                        "0. Exit");
                System.out.println("enter your choice");
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice){
                    case 1:
                        Student student = new Student();
                        student.inputStudent();
                        studentList.addStudent(student);
                        break;
                    case 2:
                        System.out.println("enter id");
                        int idDelete = Integer.parseInt(scanner.nextLine());
                        studentList.deleteStudent(idDelete);
                        break;
                    case 3:
                        System.out.println("enter id");
                        int idEdit = Integer.parseInt(scanner.nextLine());
                        studentList.editStudent(idEdit);
                        break;
                    case 4:
                        System.out.println("enter id");
                        int idFind = Integer.parseInt(scanner.nextLine());
                        studentList.findById(idFind);
                        break;
                    case 5:
                        studentList.showList();
                        break;
                    case 6:
                        studentList.sortByName();
                        break;
                    case 0:
                        System.exit(0);
                }
            }while (choice != 0);
        }
    }
}
