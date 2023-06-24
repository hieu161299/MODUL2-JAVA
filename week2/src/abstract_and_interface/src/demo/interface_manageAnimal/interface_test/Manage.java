package demo.interface_manageAnimal.interface_test;

public interface Manage<E> {
    void add(E e);
    void delete(int id);
    void edit(int id , E e);
    E findId(int id);
    int findIndexById(int id);
    E[] showAll();
}
