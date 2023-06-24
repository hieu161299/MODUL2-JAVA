package luyentap.baitap2.management;

import luyentap.baitap2.model.Newspaper;

import java.util.ArrayList;
import java.util.List;

public class NewspaperManage implements Management<Newspaper> {
    private ArrayList<Newspaper> newspapers;

    public NewspaperManage() {
        Newspaper newspaper1 = new Newspaper(1, "awe", 50, 12);
        newspapers = new ArrayList<>();
        newspapers.add(newspaper1);
    }

    @Override
    public void addDocument(Newspaper newspaper2) {
        int index = checkId(newspaper2.getId());
        if (index == -1) {
            newspapers.add(newspaper2);
        } else {
            System.out.println("id already exists");
        }
    }

    @Override
    public void deleteDocument(int id) {
        int index = checkId(id);
        if (index == -1) {
            System.out.println("id not found");
        } else {
            newspapers.remove(index);
        }
    }

    @Override
    public void editDocument(int id) {
        int index = checkId(id);
        if (index == -1) {
            System.out.println("id not found");
        } else {
            newspapers.get(index).inputDocument();
        }
    }

    @Override
    public int checkId(int id) {
        for (int i = 0; i < newspapers.size(); i++) {
            if (newspapers.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void findAllById(int id) {
        int index = checkId(id);
        if (index == -1) {
            System.out.println("id not found");
        } else {
            for (int i = 0; i < newspapers.size(); i++) {
                if (newspapers.get(i).getId() == id) {
                    System.out.println(newspapers.get(i).toString());
                }
            }
        }
    }

    @Override
    public List<Newspaper> findAll() {
        return newspapers;
    }
}
