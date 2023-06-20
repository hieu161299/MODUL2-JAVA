package demo_super.superExample;

public class Person {
    public Person() {
        System.out.println("Person performing its tasks!");
    }
}

class Employee extends Person {
    public Employee() {
        this("Employee overloading its tasks");
        System.out.println("Employee performing its tasks!");
    }

    public Employee(String s) {
        System.out.println(s);
    }
}

class Faculty extends Employee {
    public Faculty() {

        System.out.println("Faculty performing its tasks");
    }

    public static void main(String[] args) {
        new Faculty();

    }
}
