package bai2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Bai2 test = new Bai2();

        System.out.println("enter number");
        int number = scanner.nextInt();

        test.calculate(number);

    }
}
