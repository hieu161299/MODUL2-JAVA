package fileIO;

import menu.MenuRoom;
import model.Room;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class RoomFile {

    public void writeRoomFile(List<Room> roomList){
        String data = "";
        for (Room room:roomList) {
            data += room.getName() + "," + room.getPrice() + "," + room.isStatus() + "," + room.getBathRoom() + "," +
                    room.getBedRoom() + "\n";
        }
        try {
            FileWriter fileWriter = new FileWriter("G:\\MODULE2 - JAVA\\case_study\\src\\model_file\\room.csv");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(data);
            bufferedWriter.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public List<Room> readRoomFile(){
        List<Room> roomList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader("G:\\MODULE2 - JAVA\\case_study\\src\\model_file\\room.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line = null ;
            while ((line = bufferedReader.readLine()) != null){
                String[] data = line.split(",");
                boolean status = false;
                if (data[2].contains("true")){
                    status = true;
                }
                roomList.add(new Room(data[0],data[1],status,data[3],data[4] ));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return roomList;
    }
}
