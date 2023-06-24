import java.util.Arrays;

public class ArrayAddArray {
    public static void main(String[] args) {
       int[] number1 = {12,23,35,44,56};
       int[] number2 = {67,75,80,97};

       int[] number3 = arrayAddArray(number1,number2);
        System.out.println(Arrays.toString(number3));

    }

    public static int[] arrayAddArray(int[] arr1 , int[] arr2) {
        int[] numbers = new int[arr1.length + arr2.length];

        for ( int i = 0; i < arr1.length  ; i++ ) {
                    numbers[i] = arr1[i];
            }
        for ( int i = 0; i < arr2.length  ; i++ ) {
            numbers[arr1.length +i] = arr2[i];
        }
        return numbers;
    }
}