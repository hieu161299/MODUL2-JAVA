package menu;

import management.BillManage;
import management.RoomManage;
import management.UserManage;
import validate.CheckNumberInput;
import validate.ValidateBill;

import java.util.Scanner;

public class MenuBill {
    private Scanner input = new Scanner(System.in);
    private BillManage billManage = new BillManage();
    private CheckNumberInput checkNumberInput = new CheckNumberInput();
    private RoomManage roomManage;
    private ValidateBill validateBill = new ValidateBill(billManage , roomManage);

    public MenuBill(RoomManage roomManage) {
        this.roomManage = roomManage;
    }

    public void getMenuBill(){
        int choice ;
        do {
            System.out.println("===== Quản lý Hóa Đơn =====");
            System.out.println("1. Thêm hóa đơn\n2. Sửa hóa đơn\n3. ");
            choice = checkNumberInput.checkInput();

            switch (choice){
                case 1:
                    break;
            }
        }while (choice != 0);
    }
    public void inputBill(){

        System.out.println("Nhập id hóa đơn");
        String idBill = validateBill.checkInputId();

        System.out.println("Nhập tên phòng cho thuê");
        String roomName = input.nextLine();

        System.out.println("Nhập tên người thuê");
        String renter = input.nextLine();

        System.out.println("Nhập ngày bắt đầu thuê");
        String dayStart = input.nextLine();

        System.out.println("Nhập ngày trả phòng");
        String datEnd = input.nextLine();

        System.out.println("Tổng tiền phải thanh toán");
        String paymentTotal = input.nextLine();

        System.out.println("Trạng thái háo đơn"); // đã thanh toán  hay chưa thanh toán
        String status = input.nextLine();
    }

}
