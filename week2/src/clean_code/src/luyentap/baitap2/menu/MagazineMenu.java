package luyentap.baitap2.menu;

import luyentap.baitap2.management.MagazineManage;
import luyentap.baitap2.model.Magazine;

import java.util.Scanner;

public class MagazineMenu {
    private Scanner scanner = new Scanner(System.in);
    private MagazineManage magazineManage = new MagazineManage();

    public void manageMagazine() {
        int choice;
        do {
            System.out.println("===== Magazine Menu=====");
            System.out.println("1. Add Magazine\n2. Delete Magazine\n3. Edit Magazine\n4. Show Magazine list" +
                    "\n5. Search by id\n0. Exit");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addMagazine();
                    break;
                case 2:
                    deleteMagazine();
                    ;
                    break;
                case 3:
                    editBook();
                    break;
                case 4:
                    showMagazineList();
                    break;
                case 5:
                    searchByID();
                    break;
            }
        } while (choice != 0);
    }

    public void addMagazine() {
        Magazine magazine = new Magazine();
        magazine.inputDocument();
        magazineManage.addDocument(magazine);
    }

    public void deleteMagazine() {
        System.out.println("enter id to delete");
        int idDelete = scanner.nextInt();
        magazineManage.deleteDocument(idDelete);
        showMagazineList();
    }

    public void editBook() {
        System.out.println("enter id of book to edit");
        int idEdit = scanner.nextInt();
        magazineManage.editDocument(idEdit);
    }

    public void showMagazineList() {
        System.out.println("===== Magazine List =====");
        for (int i = 0; i < magazineManage.findAll().size(); i++) {
            System.out.println(magazineManage.findAll().get(i).toString());
        }
    }

    public void searchByID() {
        System.out.println("enter id to search");
        int idSearch = scanner.nextInt();
        magazineManage.findAllById(idSearch);
    }
}
