package menu;

import java.util.Scanner;

public class TestTryCatchInput {
    private static Scanner inputNumber = new Scanner(System.in);

    public static int inputNumber() {
        int temp = -1;
        do {
            try {
                temp = inputNumber.nextInt();
            } catch (Exception e) {
                System.out.println("Sai dinh dang, nhap lai: ");
                inputNumber.nextLine();
            }
        } while (temp == -1);
        return temp;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // TestTryCatchInput.inputNumber();
        while (true){
            int choice = -1;
            do {

                System.out.println("1.them\n 2. sua\n 3. xoa");
                System.out.println("choice");
                choice = TestTryCatchInput.inputNumber();
            }while (choice < 0 || choice > 3);

            switch (choice){
                case 1:
                    System.out.println("1");
                    break;
                case 2:
                    System.out.println("2");
                    break;
            }
        }
    }
}

