package bai3.menu;

import bai3.manament.ManageBlockB;
import bai3.model.BlockB;

import java.util.Scanner;

public class MenuBlockB {
    private Scanner scanner = new Scanner(System.in);
    private ManageBlockB manageBlockB;

    public MenuBlockB() {
       manageBlockB = new ManageBlockB();
    }
    public void showMenuBlockB(){
        int choice;
        do {
            System.out.println("----- Manage Block B -----");
            System.out.println("1. Add student\n2. Search by Id\n3. Show list\n0. Exit");
            System.out.println("enter your choice");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    addStudentBlockB();
                    break;
                case 2:

                case 3:
                    showListBlockB();
                    break;
            }
        }while (choice != 0);
    }
    public void addStudentBlockB(){
        BlockB student = new BlockB();
        student.inputStudent();
        manageBlockB.addStudent(student);
    }
    public void searchById(){
        
    }
    public void showListBlockB(){
        if (manageBlockB.findAll().size() < 1){
            System.out.println("list is empty");
        }else {
            manageBlockB.showList();
        }
    }


}
