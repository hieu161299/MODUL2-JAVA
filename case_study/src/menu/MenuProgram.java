package menu;

import model.StaticUser;
import validate.CheckNumberInput;

public class MenuProgram {
    private CheckNumberInput checkNumberInput = new CheckNumberInput();
    private StaticUser staticUser = new StaticUser();
    private MenuRoom menuRoom = new MenuRoom();
    private MenuBill menuBill = new MenuBill(menuRoom.getRoomManage());

    public void getProgram() {
        int choice = -1;
        do {
            System.out.println("===== Trang Chủ Quản Lý Khách Sạn =====");
            System.out.println("1. Thông tin tài khoản\n2. Quản lý phòng\n3. Quản lý hóa đơn\n0. Thoát");
            choice = checkNumberInput.checkInput();
            switch (choice) {
                case 1:
                    showUserInfor();
                    break;
                case 2:
                    menuRoom.getMenuRoom();
                    break;
                case 3:
                    menuBill.getMenuBill();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ");

            }
        } while (choice != 0);
    }

    public void showUserInfor() {

        System.out.printf("%-15s%-15s%-15s%-20s\n", "Họ và tên", "UserName:", "Tuổi:", "Số điện thoại:");
        System.out.printf("%-15s%-15s%-15s%-20s\n", StaticUser.user.getName(), StaticUser.user.getUserName(),
                StaticUser.user.getAge(), StaticUser.user.getPhone());
    }

}
