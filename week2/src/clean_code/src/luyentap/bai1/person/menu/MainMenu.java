package luyentap.bai1.person.menu;

import luyentap.bai1.person.management.WorkerManage;

import luyentap.bai1.person.model.Cadres;
import luyentap.bai1.person.model.Worker;

import java.util.Scanner;

public class MainMenu {
    private WorkerManage workerManage;
    private Scanner input = new Scanner(System.in);
    private String enterNumber = "enter your choice:";

    public MainMenu() {
        workerManage = new WorkerManage();
    }

    public void showMainMenu() {
        String menu = "1. Add Cadres \n2. Find Cadres \n3. Show list\n4. Search\n0. Exit";
        int choice;
        do {
            System.out.println("========Main menu========\n" + menu);
            System.out.println(enterNumber);
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    showMenuAdd();
                    break;
                case 3:
                    showList();
                    break;
                case 4:
                    break;
                case 0:
                    System.exit(0);
            }
        } while (choice != 0);
    }

    public void showMenuAdd() {
        int choice;
        do {
            System.out.println("======Manage Add Cadres=====");
            System.out.println("1. Add Worker\n2. Add Engineer\n3. Add Staff");
            System.out.println(enterNumber);
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    showMenuWorker();
                    break;

            }
        } while (choice != 0);

    }

    public void showMenuWorker() {
        System.out.println("======Manage Add Cadres=====");
        input.nextLine();
        //Worker worker = new Worker();
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter name:");
        String name = scanner.nextLine();

        System.out.println("enter age:");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("enter gender:");
        String gender = scanner.nextLine();

        System.out.println("enter address:");
        String address = scanner.nextLine();

        int level;
        do {
            System.out.println("enter level worker");
            level = input.nextInt();
            if (level < 1 || level > 10) System.out.println("level from 1 to 10!");
        } while (level < 1 || level > 10);
        Worker worker = new Worker(name, age, gender, address, level);
        workerManage.add(worker);
    }

    public void showList() {
        Cadres[] cadres = workerManage.showAll();
        int size = workerManage.size;
        System.out.println("------List Worker------");
        for (int i = 0; i < size; i++) {
            System.out.println(cadres[i].toString());
        }
    }

    public void Search(){

    }
}
