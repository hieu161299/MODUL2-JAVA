public class Fan {

    private final int slow = 1;
    private final int medium = 2;
    private final int fast = 3;
    private int speed = 1;
    private boolean on = false ;
    private double radius = 5;
    private String color = "blue";

    public int getSlow() {
        return slow;
    }

    public int getMedium() {
        return medium;
    }

    public int getFast() {
        return fast;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    @Override
    public String toString() {
        String state = "";
        if (this.isOn()){
            state += "fan is on  \n";
            state += "speed : " + speed + "\n";

        }else {
            state += "fan is off \n" ;
        }
        state +=  "color : " + this.color + "\n";
        state += ("Radius: " + this.radius + "\n");

        return state;
    }

    public static void main(String[] args) {
        Fan firstFan = new Fan(3,true,10,"yellow");
        firstFan.setOn(true);
        Fan secondFan = new Fan(2,false,5,"blue");

        System.out.println(firstFan.toString());
        System.out.println(secondFan.toString());


    }
}