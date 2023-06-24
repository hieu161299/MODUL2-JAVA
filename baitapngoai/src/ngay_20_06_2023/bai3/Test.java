package ngay_20_06_2023.bai3;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        findMax check = new findMax();
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhập số thứ nhất");
        int firstNumber = Integer.parseInt(scanner.nextLine());

        System.out.println("nhập số thứ hai");
        int secondNumber = Integer.parseInt(scanner.nextLine());

        System.out.println("nhập số thứ ba");
        int thirdNumber = Integer.parseInt(scanner.nextLine());

        System.out.println(check.checkMax(firstNumber,secondNumber,thirdNumber));
    }
}
