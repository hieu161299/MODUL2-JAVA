package do_while_try_catch;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        do {
            System.out.println("==== Danh sánh =====");
            System.out.println("1. thêm\n2. sửa\n3. xóa\n0. exit");
            try {
                System.out.println("enter your choice");
                choice = Integer.parseInt(scanner.nextLine());
            }catch (Exception e){
                System.out.println("hãy nhập lựa chọn bằng số");

            }
        } while (choice < 0 || choice >= 4);

    }
}
