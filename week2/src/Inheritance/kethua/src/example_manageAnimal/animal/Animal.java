package demo.example_manage.animal;

public class Animal {
    private int id;
    private String name;
    private int birth;

    public Animal() {
    }

    public Animal(int id, String name, int birth) {
        this.id = id;
        this.name = name;
        this.birth = birth;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirth() {
        return birth;
    }

    public void setBirth(int birth) {
        this.birth = birth;
    }
    public void makeSound(){
        System.out.println("animal sound");
    }

    @Override
    public String toString() {
        return    "id : " + id + " ,name : " + name  + " ,birth : " + birth ;
    }
}
