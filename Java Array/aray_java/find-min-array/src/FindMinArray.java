import java.util.Arrays;
import java.util.Scanner;

public class FindMinArray {
    public static void main(String[] args) {
       int size ;
       int[] numbers;
       Scanner input = new Scanner(System.in);
       System.out.println("enter size of array:");
       size = input.nextInt();
       numbers = new int[size];
       int i = 0 ;
       while (i < numbers.length){
           System.out.println("enter element " + (i+1)  + " :");
           numbers[i] = input.nextInt();
           i++;
       }
        System.out.println("Property list:");
       for (int element : numbers) {
           System.out.print(element + " ");
       }

        System.out.println("\n" + "Min element of the array is " + minValue(numbers));
    }

    public static int minValue(int[] arr) {
        int min = arr[0];
        for ( int i = 0 ; i < arr.length ; i++) {
            if (min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }

}