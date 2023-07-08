package menu;

import management.RoomManage;
import model.Room;
import validate.CheckNumberInput;
import validate.ValidateRoom;

import java.util.List;
import java.util.Scanner;

public class MenuRoom {
    private CheckNumberInput checkNumberInput = new CheckNumberInput();
    private RoomManage roomManage = new RoomManage();
    private ValidateRoom validateRoom = new ValidateRoom(roomManage);
    private Scanner input = new Scanner(System.in);

    public RoomManage getRoomManage() {
        return roomManage;
    }



    public void getMenuRoom() { // menu room manage
        int choice = -1;
        do {
            System.out.println("===== Menu Room Manage =====");
            System.out.println("1. Thêm phòng\n2. Sửa thông tin phòng\n3. Xóa phòng\n4. Xem danh sách phòng\n" +
                    "5. Tìm phòng theo giá");
            choice = checkNumberInput.checkInput();

            switch (choice) {
                case 1:
                    addRoom();
                    break;
                case 2:
                    editRoom();
                    break;
                case 3:
                    deleteRoom();
                    break;
                case 4:
                    showRoomList();
                    break;
                case 5:
                    findRoomByPrice();
                    break;
            }
        } while (choice != 0);
    }

    public Room inputRoomValue(){
        System.out.println("Tên phòng");
        String name = validateRoom.checkInputName();

        System.out.println("Giá phòng");
        String price = validateRoom.checkInputPrice();

        boolean status = checkStatus();

        System.out.println("Số phòng tắm");
        String bathRoom = validateRoom.checkInputBedroom();

        System.out.println("Số phòng ngủ");
        String bedRoom = validateRoom.checkInputBedroom();

        Room room = new Room(name, price, status, bathRoom, bedRoom);
        return room;
    }

    public void addRoom() {
        System.out.println("==== Menu Add Room =====");
        Room room = inputRoomValue();
        roomManage.add(room);
    }
    public void editRoom(){
        System.out.println("==== Menu edit Room =====");
        System.out.println("Tên phòng muốn sửa");

        String name = validateRoom.inputNameEdit();
        //String name = input.nextLine();

        int index = roomManage.findIndexByName(name);
        Room room = inputRoomValue();

        roomManage.edit(index , room);
    }
    public void deleteRoom(){
        while (true){
            System.out.println("Nhập tên phòng muốn xóa");
            String name = input.nextLine();
            int index = roomManage.findIndexByName(name);
            if (index == -1){
                System.out.println("Phòng không tồn tại");
            }else {
                roomManage.delete(index);
                break;
            }
        }
    }

    public boolean checkStatus() {
        int number = 0;
        boolean status = false;

        do {
            try {
                System.out.println("Trạng thái phòng \n0. Chưa cho thuê\n1. Đã tho thuê");
                number = Integer.parseInt(input.nextLine());
                if (number == 0) {
                    status = true;
                } else if (number == 1) {
                    status = false;
                } else {
                    System.out.println("Chọn  phòng 0 hoặc 1");
                }
            } catch (NumberFormatException e) {
                System.out.println("vui lòng nhập số!");
            }
        } while (number < 0 || number > 1);
        return status;
    }

    public String printStatus(boolean status) {
        String data = null;
        if (status == true) {
            data = "Chưa cho thuê";
        } else if (!status) {
            data = "Đã tho thuê";
        }
        return data;
    }


    public void showRoomList() {
        int size = roomManage.getAll().size();
        if (size == 0) {
            System.out.println("không có phòng tồn tại trong danh sách");
        } else {
            System.out.printf("%-15s%-15s%-20s%-20s%-20s\n",
                    "Tên phòng", "Giá phòng", "Số phòng ngủ", "Số phòng tắm", "Trạng thái phòng");
            for (int i = 0; i < roomManage.getAll().size(); i++) {
                Room room = roomManage.getAll().get(i);

                String status = printStatus(room.isStatus());

                System.out.printf("%-15s%-15s%-20s%-20s%-20s\n",
                        room.getName(), room.getPrice(), room.getBedRoom(), room.getBathRoom(), status);
            }
        }

    }


    private void findRoomByPrice() {
        System.out.println("===== Tìm phòng theo giá =====");
        System.out.println("Nhập giá phòng muốn tìm kiếm");
        String price = validateRoom.checkInputPrice();
        List<Room> rooms = roomManage.findAllByPrice(price);

        if (rooms.size() == 0 ){
            System.out.println("Hết phòng theo mức giá tìm kiếm");
        }else {
            System.out.println("===== Danh sách phòng chưa cho thuê theo giá bạn muốn tìm =====");
            System.out.printf("%-15s%-15s%-20s%-20s%-20s\n",
                    "Tên phòng", "Giá phòng", "Số phòng ngủ", "Số phòng tắm", "Trạng thái phòng");
            for (Room room: rooms) {
                String status = printStatus(room.isStatus());
                System.out.printf("%-15s%-15s%-20s%-20s%-20s\n",
                        room.getName(), room.getPrice(), room.getBedRoom(), room.getBathRoom(), status);
            }
        }

    }
}
