package bai3.menu;

import bai3.manament.ManageBlockA;
import bai3.model.BlockA;
import bai3.model.Student;

import java.util.Scanner;

public class MenuBlockA {
    private Scanner scanner = new Scanner(System.in);
    private ManageBlockA manageBlockA = new ManageBlockA();
    public void showMenuBlockA(){
        int choice;
        do {
            System.out.println("----- Manage Block A -----");
            System.out.println("1. Add student \n2. Search by id\n3. Show list\n0. Exit");
            System.out.println("enter your choice");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    addStudent();
                    break;
                case 2:
                    searchById();
                    break;
                case 3:
                    manageBlockA.showList();
                    break;
            }
        }while (choice != 0);
    }
    public void addStudent(){
        BlockA studentBlockA = new BlockA();
        studentBlockA.inputStudent();
        manageBlockA.addStudent(studentBlockA);
    }
    public void searchById(){
        System.out.println("enter id to find");
        int idFind = scanner.nextInt();
        manageBlockA.findById(idFind);
    }


}
