package luyentap.baitap2.menu;

import luyentap.baitap2.management.NewspaperManage;
import luyentap.baitap2.model.Newspaper;

import java.util.Scanner;

public class NewspaperMenu {
    private Scanner scanner = new Scanner(System.in);
    private NewspaperManage newspaperManage = new NewspaperManage();

    public void manageNewspaper() {
        int choice;
        do {
            System.out.println("===== Book Menu =====");
            System.out.println("1. Add Newspaper\n2. Delete Newspaper\n3. Edit Newspaper\n4. Show Newspaper list" +
                    "\n5. Search by ID\n0. Exit");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addNewspaper();
                    break;
                case 2:
                    deleteNewspaper();
                    break;
                case 3:
                    editNewspaper();
                    break;
                case 4:
                    showNewspaperList();
                    ;
                    break;
                case 5:
                    searchById();
                    break;
            }
        } while (choice != 0);
    }

    public void addNewspaper() {
        Newspaper newspaper1 = new Newspaper();
        newspaper1.inputDocument();
        newspaperManage.addDocument(newspaper1);
    }

    public void deleteNewspaper() {
        System.out.println("enter id to delete");
        int idDelete = scanner.nextInt();
        newspaperManage.deleteDocument(idDelete);
        System.out.println("Newspaper list");
        showNewspaperList();
    }

    public void editNewspaper() {
        System.out.println("enter id to edit");
        int idEdit = scanner.nextInt();
        newspaperManage.editDocument(idEdit);
        System.out.println("Newspaper list");
        showNewspaperList();
    }

    public void searchById() {
        System.out.println("enter id to search");
        int idSearch = scanner.nextInt();
        newspaperManage.findAllById(idSearch);
    }

    public void showNewspaperList() {
        System.out.println("===== Newspaper List =====");
        for (int i = 0; i < newspaperManage.findAll().size(); i++) {
            System.out.println(newspaperManage.findAll().get(i).toString());
        }
    }

}
