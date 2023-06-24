package ngay_20_06_2023.bai2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        KiemTra numbers = new KiemTra();
        Scanner scanner =new Scanner(System.in);
        int number;
        do {
            System.out.println("nhập số muốn kiểm tra");
            number = Integer.parseInt(scanner.nextLine());
            numbers.kiemTraChanLe(number);
        }while (number !=  0);
    }
}
