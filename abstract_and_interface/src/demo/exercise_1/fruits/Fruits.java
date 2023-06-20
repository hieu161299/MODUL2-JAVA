package demo.exercise_1.fruits;

import demo.exercise_1.interface_edible.Edible;

public abstract class Fruits  implements Edible {
    @Override
    public String howToEat() {
        return "eat fruits";
    }
}
