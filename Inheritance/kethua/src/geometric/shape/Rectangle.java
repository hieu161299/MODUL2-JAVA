package geometric.shape;

public class Rectangle extends Shape {
    private double width = 1.0;
    private double height = 1.0;

    public Rectangle(){

    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(String newColor, boolean newFilled, double width, double height) {
        super(newColor, newFilled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea(){
        return width*height;
    }
    public double getPerimeter(){
        return ( width + height )*2;
    }

    public String toString(){
        String result =  "A Rectangle with width = " + getWidth() +
                " and length = " + getHeight() + ", which is a subclass of " +  super.toString();
        return result;
    }
}
