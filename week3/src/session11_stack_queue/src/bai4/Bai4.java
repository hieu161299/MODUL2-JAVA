package bai4;

import java.util.Scanner;

public class Bai4 {
    public static int uCLN(int a , int b){
        int uCLN;

        while ( a != b){
            if (a > b){
                a = a -b;
            }else if ( a < b){
                b = b - a;
            }
        }
        uCLN = a;
        return uCLN;
    }

    public static int bCNN(int a , int b){
        return (a*b)/uCLN(a, b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a");
        int a = scanner.nextInt();

        System.out.println("enter b");
        int b = scanner.nextInt();
        System.out.println(bCNN(a , b));
    }
}
