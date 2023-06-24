package demo.interface_manageAnimal.test;


import demo.interface_manageAnimal.animal.Cat;
import demo.interface_manageAnimal.interface_test.CatManage;

public class AnimalTest {
    public static void main(String[] args) {
        CatManage cats = new CatManage();
       Cat cat = new Cat(1,"tom",2001,"eng",true);
       cats.add(cat);

        for (int i = 0; i < CatManage.size; i++) {
            System.out.println(cats.showAll()[i]);
        }
    }
}
