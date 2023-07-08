package management;

import management.iManagement.Management;
import model.Bill;

import java.util.ArrayList;
import java.util.List;

public class BillManage implements Management<Bill> {
    private List<Bill> billList = new ArrayList<>();

    public BillManage() {
    }

    @Override
    public void add(Bill bill) {
        billList.add(bill);
    }

    @Override
    public void edit(int id, Bill bill) {
        String data = id + "";
        int index = findIndex(data);
        billList.set(index,bill);
    }

    @Override
    public void delete(int id) {
        String data = id + "";
        int index = findIndex(data);
        billList.remove(index);
    }

    @Override
    public List<Bill> getAll() {
        return billList;
    }
    public int findIndex(String id){
        for (int i = 0; i < billList.size() ; i ++ ){
            if (billList.get(i).getIdBIll().equals(id)){
                return  i;
            }
        }
        return  -1;
    }

}
