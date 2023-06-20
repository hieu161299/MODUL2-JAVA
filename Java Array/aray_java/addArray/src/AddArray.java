import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class AddArray {
    public static void main(String[] args) {
        int size;
        int[] numbers ;
        Scanner input = new Scanner(System.in);

        // nhap kich thuoc mang tu ban phim
        System.out.println("Enter size of array : ");
        size = input.nextInt();

        // tao mang voi kick thuoc da nhap tu ban phim
        numbers = new int[size];

        // nhap phan tu cua mang tu ban phim
        int i = 0;

        while (i < numbers.length){
            System.out.println("enter element number " + (i + 1) + " : ");
            numbers[i] = input.nextInt();
            i++;
        }
        System.out.println("Property list:");
        System.out.println(Arrays.toString(numbers));

        System.out.println("enter number to add  :");
        int valueInput = input.nextInt();

        System.out.println("enter position to add :");
        int indexInput = input.nextInt();

        int[] numbers2 = new int[numbers.length +1];
        System.out.println("The array after add :");
        System.out.println(Arrays.toString(insertElement(numbers,valueInput,indexInput)));
    }

    public static int[] insertElement(int[] array, int value , int index) {
        int[] arr = new int[array.length +1];
        for (int i = 0 ; i < arr.length ; i++) {
            if ( i < index) {
                arr[i] = array[i];
            }else if (i == index) {
                arr[i] = value;
            }else {
                arr[i] = array[i - 1];
            }
        }
        return arr;
    }

}