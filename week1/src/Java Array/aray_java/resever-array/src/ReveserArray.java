import java.util.Scanner;

public class ReveserArray {
    public static void main(String[] args) {

        //Bước 3: Khai báo các biến

        int size;
        int[] myArray;
        Scanner input = new Scanner(System.in);

        //nhập và kiểm tra kích thước mảng
        do {
            System.out.println("enter a size");
            size = input.nextInt();
            if (size > 20) {
                System.out.println("size does not exceed 20");
            }
        }while (size > 20);

        myArray = new  int[size];
        int i = 0;
        while ( i < myArray.length) {
            System.out.println("enter element" + (i + 1) + ": ");
            myArray[i] = input.nextInt();
            i++;
        }
        // in ra mang da nhap
        System.out.printf("%-20s%s", "Elements in array: ", "");
        for (int j = 0; j < myArray.length; j++) {
            System.out.print(myArray[j] + "\t");
        }
        System.out.println();
        //dao nguoc ac phan tu mang
        for (int a = 0 , b = myArray.length -1 ; a < myArray.length/2 ; a++ , b--) {
            int temp = 0;
            temp = myArray[a];
            myArray[a] = myArray[b];
            myArray[b] = temp;
        }
        System.out.printf("%-20s%s", "Array after reversing: ", "");
        for (int k = 0; k < myArray.length ; k++) {
            System.out.print(myArray[k] + "\t");
        }



    }
}