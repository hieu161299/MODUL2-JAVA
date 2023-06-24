package luyentap.baitap2.management;

import java.util.List;

public interface Management<E> {
    public void addDocument(E e);

    public void deleteDocument(int id);

    public void editDocument(int id);

    public int checkId(int id);

    public void findAllById(int id);

    List<E> findAll();
}
