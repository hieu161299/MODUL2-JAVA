package bai3.model;

import java.util.Scanner;

public class BlockC extends Student {
    private float literaturePoint;
    private float historyPont;
    private float geographyPoint;
    private Scanner scanner = new Scanner(System.in);

    public BlockC() {
    }

    public BlockC(int id, String name, String address, int priorityLevel,
                  float literaturePoint, float historyPont, float geographyPoint) {
        super(id, name, address, priorityLevel);
        this.literaturePoint = literaturePoint;
        this.historyPont = historyPont;
        this.geographyPoint = geographyPoint;
    }

    @Override
    public void inputStudent() {
        super.inputStudent();
        System.out.println("enter math score:");
        this.literaturePoint = scanner.nextFloat();

        System.out.println("enter biology point:");
        this.historyPont = scanner.nextFloat();

        System.out.println("enter chemistry score:");
        this.geographyPoint = scanner.nextFloat();

    }
    @Override
    public String toString() {
        return "BlockC{" + super.toString() +
                "literaturePoint=" + literaturePoint +
                ", historyPont=" + historyPont +
                ", geographyPoint=" + geographyPoint +
                ", scanner=" + scanner +
                '}';
    }
}
