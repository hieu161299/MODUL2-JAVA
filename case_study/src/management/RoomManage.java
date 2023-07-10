package management;

import fileIO.RoomFile;
import management.iManagement.Management;
import model.Bill;
import model.Room;

import java.util.ArrayList;
import java.util.List;

public class RoomManage implements Management<Room> {
    private List<Room> roomList = null;

    private RoomFile roomFile = new RoomFile();

    public RoomManage() {
        roomList = roomFile.readRoomFile();
    }

    @Override
    public void add(Room room) {
        roomList.add(room);
        roomFile.writeRoomFile(roomList);
    }

    @Override
    public void edit(int index , Room room) {
        roomList.set(index , room);
        roomFile.writeRoomFile(roomList);
    }

    @Override
    public void delete(int index) {
        roomList.remove(index);
        roomFile.writeRoomFile(roomList);
    }

    @Override
    public List<Room> getAll() {
        return roomList;
    }

    public int findIndexByName(String name){
        for (int i = 0; i < roomList.size(); i++) {
            if (roomList.get(i).getName().equals(name)){
                return i;
            }
        }
        return -1;
    }

    public List<Room> findAllByPrice(String price){
        List<Room> rooms = new ArrayList<>();
        for (int i = 0; i < roomList.size(); i++) {
            int roomPrice = Integer.valueOf(roomList.get(i).getPrice());
            int priceCheck = Integer.valueOf(price);
            if (roomPrice <= priceCheck && roomList.get(i).isStatus() == true){
                rooms.add(roomList.get(i));
            }
        }
        return rooms;
    }
    public void changeStatusRoom(Bill bill , boolean status){
        int index = findIndexByName(bill.getRoomName());
        roomList.get(index).setStatus(!status);
        roomFile.writeRoomFile(roomList);
    }


}
