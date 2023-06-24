package manage_the_street.src.the_function;

import java.util.List;

public interface Management<E>{
    public void add(E e);
    List<E>  getAll();
    public void delete(int id);
    public void edit(int id, E e);
    public int findIndexById(int id);

}
