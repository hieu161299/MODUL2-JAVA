package luyentap.baitap2.model;

import java.util.Scanner;

public class Newspaper extends Document{
    private Scanner scanner = new Scanner(System.in);
    private int dayRelease;

    public Newspaper() {
    }

    public Newspaper(int id, String publisherRelease, int quantityOfRelease, int dayRelease) {
        super(id, publisherRelease, quantityOfRelease);
        this.dayRelease = dayRelease;
    }

    public int getDayRelease() {
        return dayRelease;
    }

    public void setDayRelease(int dayRelease) {
        this.dayRelease = dayRelease;
    }

    @Override
    public void inputDocument() {
        super.inputDocument();
        System.out.println("enter day release");
        dayRelease = scanner.nextInt();
    }

    @Override
    public String toString() {
        return "Newspaper {" + super.toString() + "release day is " + dayRelease + "}";
    }
}
