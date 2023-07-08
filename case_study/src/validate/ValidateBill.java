package validate;

import management.BillManage;
import management.RoomManage;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateBill {
    private static Pattern pattern;
    private Matcher matcher;
    private Scanner scanner = new Scanner(System.in);
    private BillManage billManage ;
    private RoomManage roomManage;
    private static final String Regex_Id = "^D[1-9]+$";
    private static final String Regex_Room_Name = "^[1-9]0[1-9]$";

    public ValidateBill(BillManage billManage , RoomManage roomManage) {
        this.billManage = billManage;
        this.roomManage = roomManage;
    }
    public boolean validate( String regex , String str) {
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(str);
        return matcher.matches();
    }

    public String checkInputId() {
        String data = null;
        while (true) {
            data = scanner.nextLine();
            if (validate(data, Regex_Id)) {
                int index = roomManage.findIndexByName(data);
                if (index == -1){
                    return data;
                }else {
                    System.out.println("ID hóa đơn đã tồn tại");
                }
            } else {
                System.out.println("Nhập ID hóa đơn theo định dạng D + số ví dụ : D1 , D12 , D123");
            }
        }
    }
    public String checkRoomName() {
        String data = null;
        while (true) {
            data = scanner.nextLine();
            if (validate(data, Regex_Room_Name)) {
                int index = roomManage.findIndexByName(data);
                if (index != -1){
                    return data;
                }else {
                    System.out.println("ID phòng không tồn tại");
                }
            } else {
                System.out.println("Nhập ID hóa đơn bắt đầu bằng D theo sau là số ví dụ : D1 , D12 , D123");
            }
        }
    }
}
