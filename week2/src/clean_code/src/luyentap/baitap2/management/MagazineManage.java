package luyentap.baitap2.management;

import luyentap.baitap2.model.Magazine;

import java.util.ArrayList;
import java.util.List;

public class MagazineManage implements Management<Magazine> {
    private ArrayList<Magazine> magazineArrayList;

    public MagazineManage() {
        Magazine magazine1 = new Magazine(2, "wer", 156, 13, 1);
        magazineArrayList = new ArrayList<>();
        magazineArrayList.add(magazine1);
    }

    @Override
    public void addDocument(Magazine magazine) {
        magazineArrayList.add(magazine);
    }

    @Override
    public void deleteDocument(int id) {
        int index = checkId(id);
        if (index == -1) {
            System.out.println("not found id");
        } else {
            magazineArrayList.remove(index);
        }
    }

    @Override
    public void editDocument(int id) {
        int index = checkId(id);
        if (index == -1) {
            System.out.println("not found id");
        } else {
            magazineArrayList.get(index).inputDocument();
        }

    }

    @Override
    public int checkId(int id) {
        for (int i = 0; i < magazineArrayList.size(); i++) {
            if (magazineArrayList.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void findAllById(int id) {
        for (int i = 0; i < magazineArrayList.size(); i++) {
            if (magazineArrayList.get(i).getId() == id) {
                System.out.println(magazineArrayList.get(i).toString());
            }
        }
    }

    @Override
    public List<Magazine> findAll() {
        return magazineArrayList;
    }
}
