package bai3.model;

import java.util.Scanner;

public class BlockB extends Student {
    private float mathPoint ;
    private float chemistryPoint;
    private float biologyPoint;
    private Scanner scanner = new Scanner(System.in);

    public BlockB() {
    }

    public BlockB(int id, String name, String address, int priorityLevel, float mathPoint,
                  float biologyPoint, float chemistryPoint, Scanner scanner) {
        super(id, name, address, priorityLevel);
        this.mathPoint = mathPoint;
        this.biologyPoint = biologyPoint;
        this.chemistryPoint = chemistryPoint;
        this.scanner = scanner;
    }

    @Override
    public void inputStudent() {
        super.inputStudent();
        System.out.println("enter math score:");
        this.mathPoint = scanner.nextFloat();

        System.out.println("enter biology point:");
        this.biologyPoint = scanner.nextFloat();

        System.out.println("enter chemistry score:");
        this.chemistryPoint = scanner.nextFloat();
    }

    @Override
    public String toString() {
        return  "Student BlockB{" + super.toString() +
                "mathPoint=" + mathPoint +
                ", physicsPoint=" + biologyPoint +
                ", chemistryPoint=" + chemistryPoint +
                '}';
    }
}
