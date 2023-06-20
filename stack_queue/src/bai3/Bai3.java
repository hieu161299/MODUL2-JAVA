package bai3;

import java.util.Scanner;

public class Bai3 {

    public static int timUCLN(int a, int b) {
        int x = a;
        int y = b;
        while (x != y) {
            if (x > y) {
                x = x - y;
            } else if (x < y) {
                y = y - x;
            }
        }
        int ucln = x;
        return ucln;
    }

    public static void main(String[] args) {
        // Cho 2 số nguyên dương a và b. Hãy tìm ước chung lớn nhất của 2 số này.
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter x");
        int a = scanner.nextInt();

        System.out.println("enter y");
        int b = scanner.nextInt();

        System.out.println(timUCLN(a, b));
    }
}
