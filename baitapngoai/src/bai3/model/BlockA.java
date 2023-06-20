package bai3.model;

import java.util.Scanner;

public class BlockA extends Student{
    private float mathPoint ;
    private float physicsPoint;
    private float chemistryPoint;
    private Scanner scanner = new Scanner(System.in);

    public BlockA() {
    }

    public BlockA(int id, String name, String address, int priorityLevel, int mathPoint, int physicsPoint, int chemistryPoint) {
        super(id, name, address, priorityLevel);
        this.mathPoint = mathPoint;
        this.physicsPoint = physicsPoint;
        this.chemistryPoint = chemistryPoint;
    }

    @Override
    public void inputStudent() {
        super.inputStudent();
        System.out.println("enter math score:");
        this.mathPoint = scanner.nextFloat();

        System.out.println("enter physics point:");
        this.physicsPoint = scanner.nextFloat();

        System.out.println("enter chemistry score:");
        this.chemistryPoint = scanner.nextFloat();
    }

    @Override
    public String toString() {
        return  "Student BlockA{" + super.toString() +
                "mathPoint=" + mathPoint +
                ", physicsPoint=" + physicsPoint +
                ", chemistryPoint=" + chemistryPoint +
                '}';
    }

}
