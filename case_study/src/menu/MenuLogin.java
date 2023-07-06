package menu;

import management.UserManage;
import model.StaticUser;
import model.User;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuLogin {
    private UserManage userManage  ;
    private Scanner scanner = new Scanner(System.in);
    private MenuProgram menuProgram = new MenuProgram();
    private StaticUser staticUser = new StaticUser();
    public MenuLogin(UserManage userManage) {
        this.userManage = userManage;
    }

    public void getMenuLogin(){
        System.out.println("===== Menu Login =====");

        System.out.println("Tên đăng nhập:");
        String userName = scanner.nextLine();

        System.out.println("Mật khẩu:");
        String pwd = scanner.nextLine();

        login(userName , pwd);
    }

    public void login(String userName , String pwd){
        int index = userManage.findIndex(userName);
        if (index != -1){
            String userCheck = userManage.getAll().get(index).getUserName();
            String pswCheck = userManage.getAll().get(index).getPwd();
            if (userCheck.equals(userName) && pswCheck.equals(pwd)){
                StaticUser.user = userManage.getAll().get(index);
                menuProgram.getProgram();
            }else {
                System.out.println("Mật khẩu không đúng");
            }
        }else {
            System.out.println("Tài khoản không tồn tại");
        }


    }


}
