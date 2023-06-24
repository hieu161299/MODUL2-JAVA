package student_class;

import java.util.Scanner;

public class Student {
    private int id;
    private String name;
    private int age;
    private static int count = 0  ;

    public Student() {
        count++;
        this.id =count;
    }

    public Student(String name, int age) {
        count++;
        this.id = count;
        this.name = name;
        this.age = age;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void inputStudent(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("----- Student information -----");

        System.out.println("enter name");
        this.name = scanner.nextLine();

        System.out.println("enter age");
        this.age = Integer.parseInt(scanner.nextLine());

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
