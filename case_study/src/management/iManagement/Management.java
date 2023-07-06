package management.iManagement;

import java.util.List;

public interface Management<E> {
    void add(E e);
    void edit(int index , E e);
    void delete(int index);
    List<E> getAll();

}
