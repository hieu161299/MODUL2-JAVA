import java.util.Scanner;

public class FindMaxInArray {
    public static void main(String[] args) {
      int size ;
      int[] array;
      Scanner input = new Scanner(System.in);

      do {
          System.out.print("enter size of array : ");
          size = input.nextInt();
          if (size > 20) {
              System.out.print("size should not exceed 20");
          }
      }while (size > 20);

      array = new int[size];
      int i = 0;
      while ( i < array.length){
          System.out.print("enter element " + (i + 1) + " : " );
            array[i] = input.nextInt();
            i++;
      }
        System.out.printf("%-15s%s","property list:" , "");
      for ( int j = 0 ; j < array.length ; j++) {
          System.out.print(array[j] + "\t");
      }

      int maxInArray = array[0];
      for (int j = 1; j < array.length ; j++) {
          if (maxInArray < array[j]) {
              maxInArray = array[j];
          }
      }
        System.out.println( "\n" + "max in list is " + maxInArray);
    }
}