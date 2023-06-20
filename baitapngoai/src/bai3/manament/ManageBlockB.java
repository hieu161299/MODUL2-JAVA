package bai3.manament;

import bai3.model.BlockB;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class ManageBlockB implements Management<BlockB> {
    private AbstractList<BlockB> studentBlockB ;

    public ManageBlockB() {
        studentBlockB = new ArrayList<>();
    }

    @Override
    public void addStudent(BlockB blockB) {
        studentBlockB.add(blockB);
    }

    @Override
    public List<BlockB> findAll() {
        return studentBlockB;
    }

    @Override
    public void findById(int id) {
        int index = checkId(id);
        if (index == -1){
            System.out.println("id not found");
        }else {
            System.out.println(studentBlockB.get(index).toString());
        }
    }

    @Override
    public int checkId(int id) {
        for (int i = 0; i < studentBlockB.size(); i++) {
            if (studentBlockB.get(i).getId() == id){
                return  i;
            }
        }
        return -1;
    }

    @Override
    public void showList() {
        for (int i = 0; i < studentBlockB.size(); i++) {
            System.out.println(studentBlockB.get(i).toString());
        }
    }
}
