package bai14_sort.src.buble_sort_demo;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {9,4,15,34,2};
        /*for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if ((array[i] < array[j])) {
                    int temp = array[i];
                    array[i] = array[j ];
                    array[j ] = temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }*/

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1; j > i; j--)
                if (array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
