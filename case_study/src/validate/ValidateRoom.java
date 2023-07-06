package validate;

import management.RoomManage;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateRoom {
    private RoomManage roomManage ;
    private static Pattern pattern;
    private Matcher matcher;
    private Scanner scanner = new Scanner(System.in);
    private static final String Regex_Name = "^[1-9]0[1-9]$";
    private static final String Regex_Price = "^[2-9][0-9]{2,3}$";
    private static final String Regex_BedRoom = "^[1-3]$";

    public ValidateRoom(RoomManage roomManage1) {
        this.roomManage = roomManage1;
    }

    public boolean validate(String str, String regex) {
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(str);
        return matcher.matches();
    }

    public String checkInputName() {
        String data = null;
        while (true) {
            data = scanner.nextLine();
            if (validate(data, Regex_Name)) {
                int index = roomManage.findIndexByName(data);
                if (index == -1){
                    return data;
                }else {
                    System.out.println("Tên phòng đã tồn tại");
                }
            } else {
                System.out.println("Nhập tên phòng gồm 3 kí tự số theo định dạng : 101");
            }
        }
    }
    public String inputNameEdit(){
        String data = null;
        while (true) {
            data = scanner.nextLine();
            if (validate(data, Regex_Name)) {
                int index = roomManage.findIndexByName(data);
                if (index != -1){
                    return data;
                }else {
                    System.out.println("Tên phòng không tồn tại. Nhập lại tên phòng");
                }
            } else {
                System.out.println("Nhập tên phòng gồm 3 kí tự số theo định dạng : 101");
            }
        }
    }
    public String checkInputPrice() {
        String data = null;
        while (true) {
            data = scanner.nextLine();
            if (validate(data, Regex_Price)) {
                return data;
            } else {
                System.out.println("Giá phòng lớn hơn 199 nhỏ hơn 10000");
            }
        }
    }
    public String checkInputBedroom(){
        String data = null;
        while (true) {
            data = scanner.nextLine();
            if (validate(data, Regex_BedRoom)) {
                return data;
            } else {
                System.out.println("Số lượng phòng tắm / phòng ngủ lớn hơn 0 nhỏ hơn 3");
            }
        }
    }


}
