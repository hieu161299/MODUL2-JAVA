package demo.interface_manageAnimal.interface_test;

import demo.interface_manageAnimal.animal.Cat;

public class CatManage implements Manage<Cat> {

    private Cat[] cats;
    public static int size = 0;
    public CatManage(){
        cats = new Cat[1000];
    }
    @Override
    public void add(Cat cat) {
        cats[size] = cat;
        size++;
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void edit(int id, Cat cat) {
        int index = findIndexById(id);
        if (index  == -1){
            System.out.println(" not found this id");
        }else {
            this.cats[index] = cat;
        }
    }

    @Override
    public Cat findId(int id) {
        return null;
    }

    @Override
    public int findIndexById(int id) {
        for (int i = 0; i < size; i++) {
            if (id == cats[i].getId()) return i;
        }
        return  -1;
    }

    @Override
    public Cat[] showAll() {
        return this.cats;
    }
}
