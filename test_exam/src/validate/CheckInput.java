package validate;

import java.util.Scanner;

public class CheckInput {
    public static final String PRODUCT_ID = "^[D]\\d+$";
    public static final String STRING = "^[\\w,\\s]+$";
    private Scanner scanner = new Scanner(System.in);

    public int checkInputNumber(String str) {
        int input;
        while (true) {
            try {
                System.out.print(str);
                input = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Hãy Nhập Số ");
            }
        }
        return input;
    }

    public String checkRegex(String str, String regex) {
        String input;
        boolean check = false;
        do {
            System.out.print(str);
            input = scanner.nextLine();
            check = input.matches(regex);
            if (!check) {
                System.out.println("Sai Định Dạng. Nhập Lại");
            }
        } while (!check);
        return input;
    }
}
