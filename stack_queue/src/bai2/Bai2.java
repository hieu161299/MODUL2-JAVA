package bai2;

import java.util.Scanner;

public class Bai2 {
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Nhập vào n. Tính S = 100 +1/3 + 1/2 + 3/5 + … + n*(n + 1)/ (n+1)*(n + 2);
    }

    public Bai2() {
    }

    public void calculate(int number){
        double result = 100;
        for ( int i = 0; i <= number; i++) {
            result  += (double) i / (i + 2 );
        }
        System.out.println(result);
    }

}
