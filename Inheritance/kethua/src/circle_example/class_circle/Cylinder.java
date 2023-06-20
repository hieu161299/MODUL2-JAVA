package circle_example.class_circle;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {

    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return super.getArea() * 2 + 2 * Math.PI * getRadius() * getHeight() ;
    }
    public  double getVolume(){
        return getArea() * getHeight();
    }

    @Override
    public String toString() {
        return "Cylinder has height = " + height  + " is a subclass of"  + super.toString();
    }
}
