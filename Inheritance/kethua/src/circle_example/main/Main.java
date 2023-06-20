package circle_example.main;

import circle_example.class_circle.Circle;
import circle_example.class_circle.Cylinder;

public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(2.3 , "white");
        System.out.println(circle1);

        Cylinder cylinder1 = new Cylinder(3.4 , "black" , 4.87);
        System.out.println(cylinder1);
    }

}
