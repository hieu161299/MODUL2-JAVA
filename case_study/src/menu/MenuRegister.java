package menu;

import management.UserManage;
import model.User;
import validate.ValidateUser;

import java.util.Scanner;

public class MenuRegister {
    private UserManage userManage = new UserManage();
    private ValidateUser validateUser = new ValidateUser(userManage);
    private Scanner scanner = new Scanner(System.in);

    public MenuRegister(UserManage userManage1) {
        this.userManage = userManage1;
    }

    public void getMenuRegister(){ // add account
        System.out.println("===== Đăng ký tài khoản =====");

        System.out.println("Tên đăng nhâp :");
        String userName = validateUser.checkInputAccount();

        System.out.println("Mật khẩu :");
        String pwd = validateUser.checkInputAccount();

        System.out.println("Họ và tên :");
        String name = validateUser.checkInputName();

        System.out.println("Tuổi :");
        String age = validateUser.checkInputAge();

        System.out.println("Địa chỉ :");
        String address = validateUser.checkInputAddress();

        System.out.println("Số điện thoại :");
        String phone = validateUser.checkInputPhone();

        System.out.println("Email :");
        String email = validateUser.checkInputEmail();

        System.out.println("dăng ký thành công");

        User user = new User(userName , pwd , phone , address , email , name , age);
        userManage.add(user);

    }



}
