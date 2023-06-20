package luyentap.baitap2.model;

import java.util.Scanner;

public class Document {
    private int id;
    private String publisherRelease;
    private int quantityOfRelease;

    public Document() {
    }

    public Document(int id, String publisherRelease, int quantityOfRelease) {
        this.id = id;
        this.publisherRelease = publisherRelease;
        this.quantityOfRelease = quantityOfRelease;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPublisherRelease() {
        return publisherRelease;
    }

    public void setPublisherRelease(String publisherRelease) {
        this.publisherRelease = publisherRelease;
    }

    public int getQuantityOfRelease() {
        return quantityOfRelease;
    }

    public void setQuantityOfRelease(int quantityOfRelease) {
        this.quantityOfRelease = quantityOfRelease;
    }

    public void inputDocument() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter information of document:");

        System.out.println("enter id");
        this.id = Integer.parseInt(scanner.nextLine());

        System.out.println("enter publisher release");
        this.publisherRelease = scanner.nextLine();

        System.out.println("enter quantity of release");
        this.quantityOfRelease = Integer.parseInt(scanner.nextLine());

    }

    @Override
    public String toString() {
        return "id= '" + id +
                "', publisherRelease= '" + publisherRelease + '\'' +
                ", quantityOfRelease= '" + quantityOfRelease + "' ";
    }
}
