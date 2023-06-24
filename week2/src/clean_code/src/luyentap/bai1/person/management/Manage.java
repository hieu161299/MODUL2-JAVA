package luyentap.bai1.person.management;

public interface Manage<E> {

     void add(E e);
      E[] showAll();
      void findByName(String name);


}
