package demo.example_manage.main_test;

import demo.example_manage.animal.Cat;
import demo.example_manage.animal.Dog;
import demo.example_manage.managament.Manage;

public class Main {
    public static void main(String[] args) {
        Manage manage = new Manage();
        Cat cat1 = new Cat(1,"tom",2020,"blue","english",true);
        Dog dog1 = new Dog(2,"jac",2021,"white","ngu");

        manage.addAnimal(cat1);
        manage.addAnimal(dog1);
        System.out.println("list animal after add: ");
        manage.show();

        manage.deleteAnimal(1);
        System.out.println("list animal after delete:");
        manage.show();

    }
}
