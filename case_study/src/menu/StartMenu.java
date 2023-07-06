package menu;

import management.UserManage;
import validate.CheckNumberInput;

import java.util.Scanner;

public class StartMenu {
    private CheckNumberInput checkNumberInput = new CheckNumberInput();
    private UserManage userManage = new UserManage();
    private MenuRegister menuRegister = new MenuRegister(userManage);
    private MenuLogin menuLogin = new MenuLogin(userManage);


    public void  showStartMenu() {
        int choice = -1;
        do {
            System.out.println("1. Đăng kí\n2. Đăng nhập\n0. Thoát");
            System.out.println("Nhập lựa chọn :");
            choice = checkNumberInput.checkInput();
            switch (choice) {
                case 1:
                    menuRegister.getMenuRegister();
                    break;
                case 2:
                    menuLogin.getMenuLogin();
                    break;
                case 0:
                    System.exit(-1);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (choice != 0);
    }
}
