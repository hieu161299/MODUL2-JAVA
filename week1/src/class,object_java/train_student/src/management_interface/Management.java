package management_interface;

import java.util.List;

public interface Management<E> {
    public void addStudent(E e);
    public void showList();
    public int checkId(int id);
    public void deleteStudent(int id);
    public void editStudent(int id);
    public void findById(int id);

    public void sortByName();
}
