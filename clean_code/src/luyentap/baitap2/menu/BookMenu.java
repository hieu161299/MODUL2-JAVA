package luyentap.baitap2.menu;

import luyentap.baitap2.management.BookManage;
import luyentap.baitap2.model.Book;

import java.util.Scanner;

public class BookMenu {
    Scanner scanner = new Scanner(System.in);
    private BookManage bookManage = new BookManage();

    public void manageBook() {
        int choice;
        do {
            System.out.println("===== Book Menu =====");
            System.out.println("1. Add Book\n2. Delete book\n3. Edit book\n4. Show book list" +
                    "\n5. Search by ID\n0. Exit");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    deleteBook();
                    break;
                case 3:
                    editBook();
                    break;
                case 4:
                    showBookList();
                    break;
                case 5:
                    searchById();
                    break;

            }
        } while (choice != 0);
    }

    public void addBook() {
        Book book = new Book();
        book.inputDocument();
        bookManage.addDocument(book);
    }

    public void deleteBook() {
        System.out.println("enter id of book to delete");
        int idDelete = scanner.nextInt();
        bookManage.deleteDocument(idDelete);
        System.out.println("book list :");
        showBookList();
    }

    public void editBook() {
        System.out.println("enter id of book to edit");
        int idEdit = scanner.nextInt();
        bookManage.editDocument(idEdit);
    }

    public void showBookList() {
        System.out.println("=== Book list ====");
        for (int i = 0; i < bookManage.findAll().size(); i++) {
            System.out.println(bookManage.findAll().get(i).toString());
        }
    }

    public void searchById() {
        System.out.println("enter id to search");
        int idSearch = scanner.nextInt();
        bookManage.findAllById(idSearch);
    }
}
