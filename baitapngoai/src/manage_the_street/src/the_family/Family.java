package manage_the_street.src.the_family;

import manage_the_street.src.the_function.Management;
import manage_the_street.src.the_people.Person;

import java.util.ArrayList;
import java.util.List;

public class Family implements Management<Person> {
    private int id;
    private int peopleQuantity = 0;

    private ArrayList<Person> people = new ArrayList<>();

    public Family(int id) {
        this.id = id;
        this.peopleQuantity++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPeopleQuantity() {
        return peopleQuantity;
    }

    @Override
    public String toString() {
        return "Family{" +
                "id=" + id +
                ", peopleQuantity=" + peopleQuantity +
                '}';
    }

    @Override
    public void add(Person person) {
        people.add(person);
    }

    @Override
    public List<Person> getAll() {
        return this.people;
    }

    @Override
    public void delete(int id) {
        int index = findIndexById(id);
        this.people.remove(index);

    }

    @Override
    public void edit(int id , Person person) {
        int index = findIndexById(id);
        this.people.set(index , person);
    }

    @Override
    public int findIndexById(int id) {
        for (int i = 0; i < this.people.size(); i++) {
               if (this.people.get(i).getId() == id){
                   return i;
               }
        }
        return -1;
    }
}
