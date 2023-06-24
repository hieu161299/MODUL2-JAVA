package ngay_20_06_2023.bai1;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Bai1 bai1 = new Bai1();
        Scanner scanner = new Scanner(System.in);
        int quantity;
        while (true) {
            do {
                System.out.println("nhập số lượng bánh phải rán:");
                quantity = Integer.parseInt(scanner.nextLine());
                if (quantity > 0 && quantity < 1000) {
                    System.out.println("sô lần phải rán là : " + bai1.timSoLanRan(quantity));
                } else System.out.println("số lượng bánh phải lớn hơn 0 và nhỏ hơn 1000");
            } while (quantity < 0 || quantity > 1000);
        }
    }
}
