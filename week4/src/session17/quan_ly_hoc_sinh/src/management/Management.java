package management;

import java.io.IOException;
import java.util.List;

public interface Management<E> {
    void add(E e) throws IOException;

    List<E> getAll();

    void showAll();

    void edit(int id, E e);

    void delete(int id);

    int findIndexById(int id);

    void findByName(String str);

}
