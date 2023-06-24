package demo.example_manage.test;

import demo.example_manage.animal.Animal;
import demo.example_manage.animal.Cat;
import demo.example_manage.animal.Dog;

public class AnimalTest {
    Animal[] animals;
    public static void main(String[] args) {

        Cat cat1 = new Cat(1,"tom",2019,"red","eng",true);
        Dog dog1 = new Dog(2,"jac",2021,"white","ngu");

        System.out.println(cat1);

    }
}
