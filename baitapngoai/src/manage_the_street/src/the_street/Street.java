package manage_the_street.src.the_street;

import manage_the_street.src.the_family.Family;
import manage_the_street.src.the_function.Management;


import java.util.ArrayList;
import java.util.List;

public class Street implements Management<Family> {
    private int id;
    private String name;
    private ArrayList<Family> families = new ArrayList<>();

    public Street(int id, String name) {
        this.id = id;
        this.name = name;
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

    @Override
    public void add(Family family) {
        int index = findIndexById(family.getId());
        if (index == -1) {
            this.families.add(family);
        } else System.out.println(" ID đã tồn tại");

    }

    @Override
    public List<Family> getAll() {
        return this.families;
    }

    @Override
    public void delete(int id) {
        int index = findIndexById(id);
        if (index == -1) {
            System.out.println("ID không tồn tại");
        } else this.families.remove(index);
    }

    @Override
    public void edit(int id, Family family) {
        int index = findIndexById(id);
        this.families.set(index, family);
    }

    @Override
    public int findIndexById(int id) {
        for (int i = 0; i < this.families.size(); i++) {
            if (this.families.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }
}
