import java.util.Scanner;

public class ConvertMoney {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;

        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so tien usd:");
        double convert = scanner.nextDouble();

        System.out.printf("gia tri vnd : " + convert*23000 );
    }
}

