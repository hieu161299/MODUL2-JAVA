package demo.example_manage.animal;

public class Cat extends Animal{
    private String eyeColor;
    private String catType;
    private boolean status;

    public Cat() {
    }

    public Cat(int id, String name, int birth, String eyeColor, String catType, boolean status) {
        super(id, name, birth);
        this.eyeColor = eyeColor;
        this.catType = catType;
        this.status = status;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getCatType() {
        return catType;
    }

    public void setCatType(String catType) {
        this.catType = catType;
    }

    public boolean isStatus() {
        return status;
    }
    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public void makeSound() {
        System.out.println("meow meow");
    }

    @Override
    public String toString() {
        return super.toString() + " ,eyes color : " + getEyeColor() + " ,type " +
                getCatType() + " ,status : " + getStatus() ;
    }
}
