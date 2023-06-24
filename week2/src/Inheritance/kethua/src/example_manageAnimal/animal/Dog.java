package demo.example_manage.animal;

public class Dog extends Animal{
    private String featherColor;
    private String dogType;

    public Dog() {
    }

    public Dog(int id, String name, int birth, String featherColor, String dogType) {
        super(id, name, birth);
        this.featherColor = featherColor;
        this.dogType = dogType;
    }

    public String getFeatherColor() {
        return featherColor;
    }

    public void setFeatherColor(String featherColor) {
        this.featherColor = featherColor;
    }

    public String getDogType() {
        return dogType;
    }

    public void setDogType(String dogType) {
        this.dogType = dogType;
    }

    @Override
    public void makeSound() {
        System.out.println("Go Go");
    }

    @Override
    public String toString() {
        return super.toString() + " ,feather color : " + getFeatherColor() + " ,type : " + getDogType();
    }
}
