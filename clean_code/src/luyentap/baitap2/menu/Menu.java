package luyentap.baitap2.menu;

import java.util.Scanner;

public class Menu {
    private Scanner scanner = new Scanner(System.in);
    private BookMenu bookMenu = new BookMenu();
    private MagazineMenu magazineMenu = new MagazineMenu();
    private NewspaperMenu newspaperMenu = new NewspaperMenu();

    public void showMainMenu() {
        int choice;
        do {
            System.out.println("===== Main Menu =====");
            System.out.println("1. Manage book\n2. Manage magazine\n3. Manage newspaper\n0. Exit");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    bookMenu.manageBook();
                    break;
                case 2:
                    magazineMenu.manageMagazine();
                    break;
                case 3:
                    newspaperMenu.manageNewspaper();
                    break;
                case 0:
                    System.exit(0);
            }
        } while (choice != 0);
    }

}
