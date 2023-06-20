package luyentap.baitap2.model;

import java.util.Scanner;

public class Book extends Document {
    private String nameAuthor;
    private int pagesNumber;

    public Book() {
    }

    public Book(int id, String publisherRelease, int quantityOfRelease, String nameAuthor, int pagesNumber) {
        super(id, publisherRelease, quantityOfRelease);
        this.nameAuthor = nameAuthor;
        this.pagesNumber = pagesNumber;
    }

    @Override
    public void inputDocument() {
        Scanner scanner = new Scanner(System.in);
        super.inputDocument();
        System.out.println("enter name of author");
        this.nameAuthor = scanner.nextLine();
        System.out.println("enter pages number");
        this.pagesNumber = Integer.parseInt(scanner.nextLine());
    }

    @Override
    public String toString() {
        return "Book{" + super.toString() +
                "nameAuthor= '" + nameAuthor + '\'' +
                ", pagesNumber= '" + pagesNumber + "'" +
                '}';
    }
}
