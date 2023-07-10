package fileIO;

import model.Bill;
import model.Room;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BillFile {
    public void writeRoomFile(List<Bill> billList){
        String data = "";
        for (Bill bill:billList) {
            data += bill.getIdBIll() + "," + bill.getRoomName() + "," + bill.getRenter() + "," +
                    bill.getDayStart() + "," + bill.getDayEnd() + "," + bill.getPaymentTotal() + "," +
                    bill.getNameEmployee() + "," + bill.isStatus() +  "\n";
        }
        try {
            FileWriter fileWriter = new FileWriter("G:\\MODULE2 - JAVA\\case_study\\src\\model_file\\bill.csv");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(data);
            bufferedWriter.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public List<Bill> readRoomFile(){
        List<Bill> billList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader("G:\\MODULE2 - JAVA\\case_study\\src\\model_file\\bill.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line = null ;
            while ((line = bufferedReader.readLine()) != null){
                String[] data = line.split(",");
                boolean status = false;
                if (data[7].contains("true")){
                    status = true;
                }
                billList.add(new Bill(data[0],data[1],data[2], data[3],data[4],data[5],data[6],status ));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return billList;
    }
}
