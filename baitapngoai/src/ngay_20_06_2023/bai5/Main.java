package ngay_20_06_2023.bai5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SquareNumber test = new SquareNumber();

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number");

        double number1 = scanner.nextDouble();

        System.out.println("enter number");
        double number2 = scanner.nextDouble();

        test.findSquareNumber(number1 , number2);
    }
}
