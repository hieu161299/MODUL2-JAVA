import java.util.Arrays;
import java.util.Scanner;

public class FIndMaxArray2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter size matrix");
        int size = input.nextInt();

        int[][] arr = new int[size][size];

        for (int i = 0 ; i < size ; i++) {
            for (int j = 0 ; j < size ; j ++) {
                System.out.println("Enter element");
                int elementValue = input.nextInt();
                arr[i][j] = elementValue;
            }
        }
        System.out.println("mang da nhap la :");
        for (int i = 0 ; i < arr.length ; i++){
            for (int j = 0 ; j < arr[i].length ; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
        int maxArray = maxArray(arr);
        System.out.println("max in array is : " + maxArray);

        int minArray = minArray(arr);
        System.out.println("min in array is : " + minArray);

    }

    public static int maxArray(int[][] arr) {
        int max = 0;
        for (int i = 0 ; i < arr.length ; i++){
            for (int j = 0 ; j < arr[i].length ; j++) {
                if ( max < arr[i][j]){
                    max = arr[i][j];
                }
            }
        }
        return max;
    }

    public static int minArray(int[][] arr1) {
        int min = arr1[0][0];
        for (int[] ints : arr1) {
            for (int j = 0; j < ints.length; j++) {
                if (min > ints[j]) {
                    min = ints[j];
                }
            }
        }
        return min;
    }
}