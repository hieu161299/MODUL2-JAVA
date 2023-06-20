package luyentap.baitap2.management;

import luyentap.baitap2.model.Book;

import java.util.ArrayList;
import java.util.List;


public class BookManage implements Management<Book> {
    ArrayList<Book> bookArrayList;

    public BookManage() {
        Book book1 = new Book(1, "tim", 12, "tom", 152);
        bookArrayList = new ArrayList<Book>();
        bookArrayList.add(book1);
    }

    @Override
    public void addDocument(Book book) {
        bookArrayList.add(book);
    }

    @Override
    public void deleteDocument(int id) {
        int index = checkId(id);
        if (index == -1) {
            System.out.println("not found id");
        } else {
            bookArrayList.remove(index);
        }
    }

    @Override
    public void editDocument(int id) {
        for (int i = 0; i < bookArrayList.size(); i++) {
            if (bookArrayList.get(i).getId() == id) {
                bookArrayList.get(i).inputDocument();
            }
        }
    }

    @Override
    public int checkId(int id) {
        for (int i = 0; i < bookArrayList.size(); i++) {
            if (bookArrayList.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void findAllById(int id) {
        for (int i = 0; i < bookArrayList.size(); i++) {
            if (bookArrayList.get(i).getId() == id) {
                System.out.println(bookArrayList.get(i).toString());
            }
        }
    }

    @Override
    public List<Book> findAll() {
        return bookArrayList;
    }
}
