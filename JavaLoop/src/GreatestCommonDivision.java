import java.util.Scanner;

public class GreatestCommonDivision {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);

        System.out.println("nhập số thứ nhất");
        int a = input.nextInt();

        System.out.println("nhập số thứ hai");
        int b = input.nextInt();

        a = Math.abs(a);
        b = Math.abs(b);

        if ( a == 0 || b == 0) {
            System.out.println("no greatest common factor");
        }
        while ( a != b ) {
            if (a > b) {
                a = a - b;
            }else {
                b = b - a;
            }
        }
        System.out.println("Greatest common factor: " + a);
    }
}
