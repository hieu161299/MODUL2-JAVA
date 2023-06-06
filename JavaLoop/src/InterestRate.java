import java.util.Scanner;
public class InterestRate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter moneys");
        double money = scanner.nextDouble();

        System.out.println("enter months");
        int month = scanner.nextInt();

        System.out.println("enter rate");
        double rate = scanner.nextDouble();

        double totalInvestRate = 0;

        for (int i = 0 ; i < month; i++ ) {
            totalInvestRate += money * ((rate/100)/12) * month;
        }
        System.out.println("total ivest rate = " + totalInvestRate);
    }
}
