package luyentap.bai1.person.model;

public class Staff extends Cadres{
    private String job;

    public Staff() {
    }

    public Staff(String name, int age, String gender, String address, String job) {
        super(name, age, gender, address);
        this.job = job;
    }

    @Override
    public String toString() {
        return "Staff { " +
                " ,name= " + super.getName() +
                " ,age= " + super.getAge() +
                " ,gender " + super.getGender()+
                " ,job= " + job +
                "}";
    }
}
