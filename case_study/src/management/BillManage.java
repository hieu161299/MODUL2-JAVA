package management;

import fileIO.BillFile;
import management.iManagement.Management;
import model.Bill;

import java.util.ArrayList;
import java.util.List;

public class BillManage implements Management<Bill> {
    private List<Bill> billList;
    private BillFile billFile = new BillFile();

    public BillManage() {
        billList = billFile.readRoomFile();
    }

    @Override
    public void add(Bill bill) {
        billList.add(bill);
        billFile.writeRoomFile(billList);
    }

    @Override
    public void edit(int id, Bill bill) {
        String data = id + "";
        int index = findIndexById(data);
        billList.set(index, bill);
        billFile.writeRoomFile(billList);
    }

    public void edit(String id, Bill bill) {

        int index = findIndexById(id);
        billList.set(index, bill);
        billFile.writeRoomFile(billList);
    }

    @Override
    public void delete(int id) {
        String data = id + "";
        int index = findIndexById(data);
        billList.remove(index);
        billFile.writeRoomFile(billList);
    }

    @Override
    public List<Bill> getAll() {
        return billFile.readRoomFile();
    }

    public int findIndexById(String id) {
        for (int i = 0; i < billList.size(); i++) {
            if (billList.get(i).getIdBIll().equals(id)) {
                return i;
            }
        }
        return -1;
    }

}
