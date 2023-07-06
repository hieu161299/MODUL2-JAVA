package validate;

import management.UserManage;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateUser {
    private UserManage userManage ;
    private static Pattern pattern;
    private Matcher matcher;
    private Scanner scanner = new Scanner(System.in);
    private static final String Regex_Account = "^[a-zA-z0-9]{8,16}$";
    private static final String Regex_Name = "^[a-zA-Z\\s]*$";
    private static final String Regex_Age = "^19|[2-9][0-9]$";
    private static final String Regex_Address = "^[a-zA-Z0-9\\s,-]*$";
    private static final String Regex_Phone = "^[0][0-9]{3}-[0-9]{3}-[0-9]{3}$";
    public static final String Regex_Email = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)+$";

    public ValidateUser(UserManage userManage1) {
        this.userManage = userManage1;
    }

    public boolean validate(String str, String regex) {
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(str);
        return matcher.matches();
    }


    public String checkInputAccount() {
        String data = null;
        while (true) {
            data = scanner.nextLine();
            if (validate(data, Regex_Account)) {
                for (int i = 0; i < userManage.getAll().size(); i++) {
                    if (userManage.getAll().get(i).getUserName().equals(data)) {
                        System.out.println("Tài khoản đã tồn tại");
                    } else {
                        return data;
                    }
                }
                return data;
            } else {
                System.out.println("Nhập đúng định dạng 8-16 ký tự  gồm các ký tự bất kỳ : a - z , A - Z , 0 - 9");
            }
        }
    }


    public String checkInputName() {
        String data = null;
        while (true) {
            data = scanner.nextLine();
            if (validate(data, Regex_Name)) {
                break;
            } else {
                System.out.println("Tên không chứa số hặc kí tự đặc biệt");
            }
        }
        return data;
    }

    public String checkInputAge() {
        String age = null;
        while (true) {
            age = scanner.nextLine();
            if (validate(age, Regex_Age)) {
                break;
            } else {
                System.out.println("Tuổi lớn hơn 18");
            }
        }
        return age;
    }

    public String checkInputAddress() {
        String address = null;
        while (true) {
            address = scanner.nextLine();
            if (validate(address, Regex_Address)) {
                break;
            } else {
                System.out.println("Nhập địa chỉ theo mẫu xã/phường - quận/huyện - tỉnh/thành phố");
            }
        }
        return address;
    }

    public String checkInputPhone() {
        String phone = null;
        while (true) {
            phone = scanner.nextLine();
            if (validate(phone, Regex_Phone)) {
                break;
            } else {
                System.out.println("Số điện thoại gồm 10 số , bắt đầu với số 0");
            }
        }
        return phone;
    }

    public String checkInputEmail() {
        String email = null;
        while (true) {
            email = scanner.nextLine();
            if (validate(email, Regex_Email)) {
                break;
            } else {
                System.out.println("Nhập email theo định dạng abc@gmail.com");
            }
        }
        return email;
    }


}
