package bai3.manament;

import java.util.List;

public interface Management<E> {
    public void addStudent( E e);
    List<E> findAll();
    public void findById(int id);
    public int checkId(int id);
    public void showList();
}
