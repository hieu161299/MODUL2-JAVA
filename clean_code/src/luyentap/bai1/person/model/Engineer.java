package luyentap.bai1.person.model;

public class Engineer extends Cadres{
    private String major;

    public Engineer() {
    }

    public Engineer(String name, int age, String gender, String address, String major) {
        super(name, age, gender, address);
        this.major = major;
    }

    @Override
    public String toString() {
        return "Worker{" +
                ", name=" + super.getName() +
                " ,age=" + super.getAge() +
                ", gender='" + super.getGender() + '\'' +
                ", address='" + super.getAddress() + '\'' +
                ", major='" + major + '\'' +
                '}';
    }
}
