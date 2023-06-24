package demo1;

public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5.4);
        Circle circle2 = new Circle(6.7);
        Circle circle3 = new Circle(3.2);
        Circle circle4 = new Circle(8.9);

        System.out.println(" Circle quanlity = " + Circle.countCircle );
        System.out.println("Max radius is " + Circle.maxRadius );
        System.out.println("Sum area is " + Circle.sumArea );
        System.out.println("Sum perimeter is " + Circle.sumPerimeter );


        System.out.println(circle1.getArea());
    }
}
