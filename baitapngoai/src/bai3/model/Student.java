package bai3.model;

import java.util.Scanner;

public class Student {
    private int id;
    private String name;
    private String address;
    private int priorityLevel;
    private Scanner scanner = new Scanner(System.in);

    public Student() {
    }

    public Student(int id, String name, String address, int priorityLevel) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.priorityLevel = priorityLevel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPriorityLevel() {
        return priorityLevel;
    }

    public void setPriorityLevel(int priorityLevel) {
        this.priorityLevel = priorityLevel;
    }

    public void inputStudent() {
        System.out.println("-----Enter information of student-----");

        System.out.println("Enter id:");
        this.id = Integer.parseInt(scanner.nextLine());

        System.out.println("enter name");
        this.name = scanner.nextLine();

        System.out.println("enter student's address");
        this.address = scanner.nextLine();

        System.out.println("enter the priority level ");
        this.priorityLevel = Integer.parseInt(scanner.nextLine());
    }

    @Override
    public String toString() {
        return  "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", priorityLevel=" + priorityLevel ;
    }


}
