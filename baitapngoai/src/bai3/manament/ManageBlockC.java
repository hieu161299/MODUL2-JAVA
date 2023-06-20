package bai3.manament;

import bai3.model.BlockC;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class ManageBlockC implements Management<BlockC> {
    private AbstractList<BlockC> studentBlockC;
    @Override
    public void addStudent(BlockC blockB) {
        studentBlockC = new ArrayList<>();
    }

    @Override
    public List<BlockC> findAll() {
        return studentBlockC;
    }

    @Override
    public void findById(int id) {
        int index = checkId(id);
        if (index == -1){
            System.out.println("id not found");
        }else {
            System.out.println(studentBlockC.get(index).toString());
        }
    }

    @Override
    public int checkId(int id) {
        for (int i = 0; i < studentBlockC.size(); i++) {
            if (studentBlockC.get(i).getId() == id){
                return  i;
            }
        }
        return -1;
    }

    @Override
    public void showList() {
        for (int i = 0; i < studentBlockC.size(); i++) {
            System.out.println(studentBlockC.get(i).toString());
        }
    }
}
