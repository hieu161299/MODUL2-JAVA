package list_student.interface_list;

public interface Manage<E> {
    public void addStudent(E e);
    public void showAll();
    public void deleteStudent(int idDelete);
    public void findById(int id);
    public void editStudent(int id);
}
