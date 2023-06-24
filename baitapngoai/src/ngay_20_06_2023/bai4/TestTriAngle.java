package ngay_20_06_2023.bai4;

import java.util.Scanner;

public class TestTriAngle {
    public static void main(String[] args) {
        TriAngle triAngle = new TriAngle();

        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("độ dài cạnh 1");
            int side1 = Integer.parseInt(scanner.nextLine());

            System.out.println("độ dài cạnh 2");
            int side2 = Integer.parseInt(scanner.nextLine());

            System.out.println("độ dài cạnh 3");
            int side3 = Integer.parseInt(scanner.nextLine());

            triAngle.typeTriangle(side1 ,side2 , side3);
        }
    }
}
