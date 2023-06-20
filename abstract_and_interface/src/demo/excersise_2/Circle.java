package demo.excersise_2;

public abstract class Circle {
    private String color;
    private boolean filled;

    private double radius = 1.0;

    public Circle() {
    }
    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        this.color = color;
        this.filled = filled;
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ", radius=" + radius +
                '}';
    }
}
