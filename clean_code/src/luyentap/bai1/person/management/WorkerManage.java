package luyentap.bai1.person.management;

import luyentap.bai1.person.model.Cadres;
import luyentap.bai1.person.model.Worker;

public class WorkerManage implements Manage<Worker> {
    private Worker[] workers;
    public static int size = 0;

    public WorkerManage() {
        this.workers = new Worker[1000];
    }

    @Override
    public void add(Worker worker) {
        this.workers[size] = worker;
        size++;
    }

    @Override
    public Worker[] showAll() {
        return this.workers;
    }

    @Override
    public void findByName(String name) {
        for (int i = 0; i < size; i++) {
            if (workers[i].getName().equalsIgnoreCase(name));
            System.out.println(workers[i].toString());
        }
    }
}
