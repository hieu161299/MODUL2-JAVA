package menu;

import management.ManageStudent;
import student.Student;

import java.io.IOException;
import java.util.Scanner;

public class Menu {
    private Scanner inputNumber = new Scanner(System.in);
    private Scanner inputString = new Scanner(System.in);
    private ManageStudent manageStudent = new ManageStudent();


    public void showMenu() {
        int choice = -1;
        while (true) {
            do {
                System.out.println("===== Menu manage student =====");
                System.out.println("1. Add student\n2. Edit student\n3. Delete student\n" +
                        "4. Show student list\n5. Search by name\n0. Exit");
                try {
                    System.out.println("enter your choice");
                    choice = Integer.parseInt(inputNumber.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("choose from 0 to 5");
                }
            } while (choice < 0 || choice > 5);

            switch (choice) {
                case 1:
                    try {
                        addStudent();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 2:
                    editStudent();
                    break;
                case 3:
                    deleteStudent();
                    break;
                case 4:
                    manageStudent.showAll();
                    break;
                case 5:
                    searchByName();
                    break;
                case 0:
                    System.exit(-1);
            }
        }
    }

    public void addStudent() throws IOException {
        System.out.println("===== Menu add student =====");

        int id = -1;
        do {
            try {
                System.out.println("enter id");
                id = Integer.parseInt(inputNumber.nextLine());
            } catch (NumberFormatException e) {
                System.out.println(" id is number, enter again");
            }
        } while (id < 0);

        System.out.println("enter full name");
        String fullName = inputString.nextLine();
        int age = -1;
        do {
            try {
                System.out.println("enter age");
                age = Integer.parseInt(inputNumber.nextLine());
            } catch (NumberFormatException e) {
                System.out.println(" age is number, enter again");
            }
        } while (age < 0);

        System.out.println("enter address");
        String address = inputString.nextLine();

        Student student = new Student(id, fullName, age, address);
        manageStudent.add(student);
    }

    public void editStudent() {
        System.out.println("===== Menu edit student =====");
        int idEdit = -1;

           do {
               try {
                   System.out.println("enter id to edit");
                   idEdit = Integer.parseInt(inputNumber.nextLine());
               } catch (NumberFormatException e) {
                   System.out.println("id is number, enter again");
               }
           } while (idEdit < 0);


           if (manageStudent.findIndexById(idEdit) == -1) {
               System.out.println("id not exist , enter again");
           } else {
               int id = -1;
               do {
                   try {
                       System.out.println("enter id");
                       id = Integer.parseInt(inputNumber.nextLine());
                   } catch (NumberFormatException e) {
                       System.out.println(" id is number, enter again");
                   }
               } while (id < 1);

               System.out.println("enter full name to edit");
               String name = inputString.nextLine();

               int age = -1;
               do {
                   try {
                       System.out.println("enter age");
                       age = Integer.parseInt(inputNumber.nextLine());
                   } catch (NumberFormatException e) {
                       System.out.println(" age is number, enter again");
                   }
               } while (age < 1);

               System.out.println("enter address");
               String address = inputString.nextLine();

               Student student = new Student(id, name, age, address);
               manageStudent.edit(idEdit, student);
           }

    }


    public void deleteStudent() {
        System.out.println("===== Menu delete student =====");
        int idDelete = -1;
        do {
            try {
                System.out.println("enter id to delete");
                idDelete = Integer.parseInt(inputNumber.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("id is number, enter again");
            }
        } while (idDelete < 0);
        manageStudent.delete(idDelete);
    }
    public void searchByName(){
        System.out.println("enter name to search");
        String name = inputString.nextLine();

        manageStudent.findByName(name);
    }

}
