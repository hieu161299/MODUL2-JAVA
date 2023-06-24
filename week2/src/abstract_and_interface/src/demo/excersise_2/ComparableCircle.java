package demo.excersise_2;

import java.util.Arrays;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {

    public ComparableCircle() {
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    public ComparableCircle(String color, boolean filled, double radius) {
        super(color, filled, radius);
    }

    @Override
    public int compareTo(ComparableCircle o) {
        if (getRadius() >= o.getRadius()) {
            return 1;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return "which is subclass is " + super.toString();
    }

    public static void main(String[] args) {
        ComparableCircle[] comparableCircles1 = new ComparableCircle[3];
        comparableCircles1[0] = new ComparableCircle(3.6);
        comparableCircles1[1] = new ComparableCircle();
        comparableCircles1[2] = new ComparableCircle("green", true, 3.2);

        System.out.println("pre-sorted: ");
        for (ComparableCircle element : comparableCircles1) {
            System.out.println(element);
        }

        Arrays.sort(comparableCircles1);
        System.out.println("After-sorted:");
        for (ComparableCircle circle : comparableCircles1) {
            System.out.println(circle);
        }
    }
}
