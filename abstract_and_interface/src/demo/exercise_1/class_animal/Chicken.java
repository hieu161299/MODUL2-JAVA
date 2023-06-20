package demo.exercise_1.class_animal;

import demo.exercise_1.interface_edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "chicken sound";
    }

    @Override
    public String howToEat() {
        return "fry it";
    }
}
