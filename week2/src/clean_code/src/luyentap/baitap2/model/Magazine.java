package luyentap.baitap2.model;

import java.util.Scanner;

public class Magazine extends Document {
    private int numberRelease;
    private int monthRelease;

    public Magazine() {
    }

    public Magazine(int id, String publisherRelease, int quantityOfRelease, int numberRelease, int monthRelease) {
        super(id, publisherRelease, quantityOfRelease);
        this.numberRelease = numberRelease;
        this.monthRelease = monthRelease;
    }

    @Override
    public void inputDocument() {
        Scanner scanner = new Scanner(System.in);
        super.inputDocument();
        System.out.println("enter number release ");
        this.numberRelease = Integer.parseInt(scanner.nextLine());
        System.out.println("enter month release");
        this.monthRelease = Integer.parseInt(scanner.nextLine());
    }

    @Override
    public String toString() {
        return "Magazine{" + super.toString()+
                "numberRelease=" + numberRelease +
                ", monthRelease=" + monthRelease +
                '}';
    }
}
