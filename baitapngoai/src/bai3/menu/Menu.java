package bai3.menu;

import bai3.manament.ManageBlockA;

import java.util.Scanner;

public class Menu {
    private Scanner scanner = new Scanner(System.in);
    private MenuBlockA blockA = new MenuBlockA();
    private MenuBlockB blockB = new MenuBlockB();

    public void showMenu(){
        int choice;
        do {
            System.out.println("----- Manage Menu -----");
            System.out.println("1. Manage Block A\n2. Manage Block b\n3. Manage Block C\n0. Exit");
            System.out.println("enter your choice");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    blockA.showMenuBlockA();
                    break;
                case 2:
                    blockB.showMenuBlockB();
                    break;
                case 0:
                    System.exit(0);
            }
        }while (choice != 0);
    }
}
