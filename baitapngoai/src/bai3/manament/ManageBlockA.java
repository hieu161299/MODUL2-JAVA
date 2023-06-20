package bai3.manament;

import bai3.model.BlockA;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class ManageBlockA implements Management<BlockA> {
    private AbstractList<BlockA> studentBlockA ;

    public ManageBlockA() {
        studentBlockA = new ArrayList<>();
    }

    @Override
    public void addStudent(BlockA blockA) {
        studentBlockA.add(blockA);
    }

    @Override
    public List<BlockA> findAll() {
        return studentBlockA;
    }

    @Override
    public void findById(int id) {
        int index = checkId(id);
        if (index == -1){
            System.out.println("id not found");
        }else {
            System.out.println(studentBlockA.get(index).toString());
        }
    }

    @Override
    public int checkId(int id) {
        for (int i = 0; i < studentBlockA.size(); i++) {
            if (studentBlockA.get(i).getId() == id){
                return  i;
            }
        }
        return  -1;
    }
    @Override
    public void showList() {
        for (int i = 0; i < studentBlockA.size(); i++) {
            System.out.println(studentBlockA.get(i).toString());
        }
    }

}
