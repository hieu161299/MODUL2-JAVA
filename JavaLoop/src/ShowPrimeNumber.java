import java.util.Scanner;

public class ShowPrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhap so nguyen to ban muon hien thi:");
        int number = input.nextInt();
        System.out.println("ket qua la:");
        for (int i = 2, count = 0; count < number; i++) {
            if (i == 2) {
                System.out.print(i + " ");
                count++;
            } else {
                boolean check = true;
                for (int j = 2; j <= i / 2; j++) {
                    if (i % j == 0) {
                        check = false;
                    }
                }
                if (check) {
                    System.out.print(i + " ");
                    count++;
                }
            }

        }


    }
}
