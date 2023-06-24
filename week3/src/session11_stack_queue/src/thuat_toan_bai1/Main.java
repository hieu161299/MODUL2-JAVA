package thuat_toan_bai1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bai1 test = new Bai1();

        System.out.println("enter x");
        int x = Integer.parseInt(scanner.nextLine());

        System.out.println("enter y");
        int y = Integer.parseInt(scanner.nextLine());

        System.out.println("sum of square from " + x +" to " + y + " is " + test.square(x,y));
    }
}
