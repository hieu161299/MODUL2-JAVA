import java.util.Arrays;
import java.util.Scanner;

public class DeleteElementInArray {
    public static void main(String[] args) {
        int size;
        int[] arr;
        Scanner input = new Scanner(System.in);
        System.out.println("enter size of array:");
        size = input.nextInt();
        arr = new int[size];
        int i = 0 ;
        while ( i < size) {
            System.out.println("Enter element number " + ( i + 1) + " : "  );
            arr[i] = input.nextInt();
            i ++;
        }
        System.out.printf("%s%s" ,"Property list : " , "");
        for (int j = 0 ; j < arr.length ; j++) {
            System.out.print(arr[j] + "\t");
        }

        System.out.println("\n" + "Enter index:");
        int indexValue = input.nextInt();

        int[] newArr = DeleteElement(arr,indexValue);
        System.out.println("The array after deleting : ");
        for (int k = 0 ; k < newArr.length ; k++) {
            System.out.print( newArr[k] + " ");
        }
    }

    public static int[] DeleteElement(int[] array,  int index) {
        int[] newArray = new int[array.length -1];
        for (int i = 0 ; i < newArray.length ; i++) {
            if (i < index) {
                newArray[i] = array[i];
            }else if (i >= index) {
                newArray[i] = array[i + 1];
            }
        }

        return newArray;
    }

}