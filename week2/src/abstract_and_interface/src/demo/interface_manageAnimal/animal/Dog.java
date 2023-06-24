package demo.interface_manageAnimal.animal;

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
    public String toString() {
        return "Dog{" +
                "featherColor='" + featherColor + '\'' +
                ", dogType='" + dogType + '\'' +
                '}';
    }
}
