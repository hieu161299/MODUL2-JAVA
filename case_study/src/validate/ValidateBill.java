package validate;

import management.BillManage;
import management.RoomManage;
import model.Bill;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateBill {
    private static Pattern pattern;
    private Matcher matcher;
    private Scanner input = new Scanner(System.in);
    private BillManage billManage;
    private RoomManage roomManage;
    private static final String Regex_Id = "^D[1-9]+$";
    private static final String Regex_Room_Name = "^[1-9]0[1-9]$";
    private static final String Regex_Renter = "^[a-zA-Z\\s]*$";
    private static final String Regex_Day = "^[([0-2][1-9]|10|20)|30|31]+-[([0-2][1-9]|10|20)]+-2[0-9]{3}$";
    private static final String Regex_Month = "^(0[1-9])|(1[0-2])$";

    public ValidateBill(BillManage billManage, RoomManage roomManage) {
        this.billManage = billManage;
        this.roomManage = roomManage;
    }

    public boolean validate(String str, String regex) {
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(str);
        return matcher.matches();
    }

    public String checkInputId() {
        String id = null;
        while (true) {
            id = input.nextLine();
            if (validate(id, Regex_Id)) {
                int index = billManage.findIndexById(id);
                if (index == -1) {
                    return id;
                } else {
                    System.out.println("ID hóa đơn đã tồn tại");
                }
            } else {
                System.out.println("Nhập ID hóa đơn theo định dạng D + số ví dụ : D1 , D12 , D123");
            }
        }
    }

    public String checkIdEdit() {
        String id = null;
        while (true) {
            id = input.nextLine();
            if (validate(id, Regex_Id)) {
                int index = billManage.findIndexById(id);
                if (index != -1) {
                    return id;
                } else {
                    System.out.println("ID hóa đơn không tồn tại");
                }
            } else {
                System.out.println("Nhập ID hóa đơn theo định dạng D + số ví dụ : D1 , D12 , D123");
            }
        }
    }

    public String checkRoomInput() {
        String data = null;
        while (true) {
            data = input.nextLine();
            if (validate(data, Regex_Room_Name)) {
                int index = roomManage.findIndexByName(data);
                if (index != -1) {
                    return data;
                } else {
                    System.out.println("Phòng không tồn tại");
                }
            } else {
                System.out.println("Nhập tên phòng theo dạng : 101  ");
            }
        }
    }

    public String checkRenter() {
        String data = null;
        while (true) {
            data = input.nextLine();
            if (validate(data, Regex_Renter)) {
                return data;

            } else {
                System.out.println("Nhập tên không chứa kí tự đặc biệt ");
            }
        }
    }

    public String checkInputDay() {
        String day = null;
        while (true) {
            day = input.nextLine();
            if (validate(day, Regex_Day)) {
                return day;

            } else {
                System.out.println("Nhập ngày theo định dạng : 02-03-2019 ");
            }
        }
    }


    public String checkMonth() {
        String month = null;
        while (true) {
            month = input.nextLine();
            if (validate(month, Regex_Month)) {
                    return month;
            } else {
                System.out.println("Nhập tháng gồm 2 kí tự ví dụ : 05 , 11");
            }
        }
    }


}
