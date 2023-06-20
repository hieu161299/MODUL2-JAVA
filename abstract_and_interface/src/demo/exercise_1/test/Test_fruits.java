package demo.exercise_1.test;

import demo.exercise_1.fruits.Apple;
import demo.exercise_1.fruits.Fruits;
import demo.exercise_1.fruits.Orange;

public class Test_fruits {
    public static void main(String[] args) {
        Fruits[] fruitList = new Fruits[2];
        fruitList[0] = new Apple();
        fruitList[1] = new Orange();

        for (Fruits fruit: fruitList) {
            System.out.println(fruit.howToEat());
        }
    }
}
