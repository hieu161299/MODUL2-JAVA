package menu;

import management.UserManage;
import model.StaticUser;
import validate.CheckNumberInput;

import java.security.PublicKey;
import java.util.PrimitiveIterator;

public class MenuProgram {
    private CheckNumberInput checkNumberInput = new CheckNumberInput();
    private StaticUser staticUser = new StaticUser();
    private MenuRoom menuRoom = new MenuRoom();

    public void getProgram(){
        int choice = -1;
        do {
            System.out.println("===== Trang Chủ Quản Lý Khách Sạn =====");
            System.out.println("1. Thông tin tài khoản\n2. Quản lý phòng\n3. Quản lý hóa đơn");
            choice = checkNumberInput.checkInput();
            switch (choice){
                case 1:
                    showAccountInfor();
                    break;
                case 2:
                    menuRoom.getMenuRoom();
                    break;
                case 3:
                    break;

            }
        }while (choice != 0);
    }

    public void showAccountInfor(){
        System.out.println("Họ và tên:");
        System.out.println(StaticUser.user.getName());

        System.out.println("UserName:");
        System.out.println(StaticUser.user.getUserName());

        System.out.println("Tuổi:");
        System.out.println(StaticUser.user.getAge());

        System.out.println("Số điện thoại:");
        System.out.println(StaticUser.user.getPhone());
    }

}
