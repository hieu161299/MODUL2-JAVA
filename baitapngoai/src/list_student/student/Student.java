package list_student.student;

import java.util.Scanner;

public class Student {
    private int id;
    private String name;
    private int age;

    public Student() {
    }

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void inputStudent(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("=====enter information=====");

        System.out.println("enter id");
        this.id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("enter name");
        this.name = scanner.nextLine();

        System.out.println("enter age");
        this.age =scanner.nextInt();
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
