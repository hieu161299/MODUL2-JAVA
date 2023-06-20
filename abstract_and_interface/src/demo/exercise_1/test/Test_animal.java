package demo.exercise_1.test;

import demo.exercise_1.class_animal.Animal;
import demo.exercise_1.class_animal.Chicken;
import demo.exercise_1.class_animal.Tiger;
import demo.exercise_1.interface_edible.Edible;

public class Test_animal {
    public static void main(String[] args) {
        Animal[] animalList = new Animal[2];
        animalList[0] = new Tiger();
        animalList[1] = new Chicken();

        for (Animal animal:animalList ) {
            System.out.println(animal.makeSound());

            if (animal instanceof  Chicken){
                Edible edible1 = (Chicken) animal;
                System.out.println(((Chicken) animal).howToEat());
            }
        }

    }
}
