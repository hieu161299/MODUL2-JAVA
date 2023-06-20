package demo1;

public class Circle {
    private int id;
    private double radius;
    final double PI = 3.14;
    static int countId = 0;
    static int countCircle = 0; // dem so hinh tron dc tao ra  va in ra so luong

    static double maxRadius = 0 ;

    static double sumArea = 0;

    static double sumPerimeter = 0;


    public Circle(double radius) {
        this.radius = radius;
        this.id = countId;
        countId++;
        countCircle++;
        if (maxRadius < radius) {
            maxRadius = radius;
        }
        sumArea += this.getArea();
        sumPerimeter += this.getPerimeter();
    }

     double getArea() { // lay gia tri ra ko phai truyen tham so vao de tinh area
        return PI * Math.pow(radius, 2);
    }

    double getPerimeter() {
        return 2 * PI * radius;
    }

    public static void main(String[] args) {



    }

}