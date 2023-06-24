package rectangle;

import java.util.Scanner;

public class Rectangle {
    static double width;
    static double height;

    public Rectangle() {
        this.width = 1;
        this.height = 1;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public static double getArea(){
        return width*height;
    }
    public static double getPerimeter(){
        return (width + height) * 2;
    }

    public static String display(){
        return "Rectangle{" + "width=" + width + ", height=" + height + "}";
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the width: ");
        double width = input.nextDouble();

        System.out.println("Enter the height: ");
        double height = input.nextDouble();

        Rectangle rectangle1 = new Rectangle(width,height);

        System.out.println("your rectangle \n" + display());

        System.out.println("area of rectangle is :  " + rectangle1.getArea());

        System.out.println("perimeter of rectangle is :  " + rectangle1.getPerimeter() );
    }

}
