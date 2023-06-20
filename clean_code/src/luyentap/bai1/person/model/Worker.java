package luyentap.bai1.person.model;

import java.util.Scanner;

public class Worker extends Cadres {
    private int level;

    public Worker() {
    }

    public Worker(String name, int age, String gender, String address, int level) {
        super(name, age, gender, address);
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Worker{" +
                " name=" + super.getName() +
                " ,age=" + super.getAge() +
                ", gender='" + super.getGender() + '\'' +
                ", address='" + super.getAddress() + '\'' +
                "level='" + level + '\'' +
                '}';
    }
}



