package excersise_stack_queue;

import java.util.Arrays;
import java.util.Stack;

public class Reverse {
    public static int[] reverseNumber(int[] arr){
        Stack<Integer> integerStack = new Stack<>();
        for (int element: arr){
            integerStack.push(element);
        }
        int n = integerStack.size();
        for (int i = 0; i < n; i++) {
            System.out.println(integerStack.pop());
        }
        return arr;
    }
    public static String reverseString(String str){
        Stack<String> stringStack = new Stack<>();
        int n = str.length();

        for (int i = 0; i < n; i++) {
           stringStack.push(str.charAt(i) + "");
        }
        String resultStr = "";
        for (int i = 0; i < n; i++) {
            resultStr += stringStack.pop();
        }
        return resultStr;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{4,6,9,8};
        System.out.println("Array before reverse: " + Arrays.toString(arr));
        System.out.println("Array after reverse: " + Arrays.toString(reverseNumber(arr)));

        String str="hieu";
        System.out.println("String before reverse: "+str);
        System.out.println("String after reverse: "+reverseString(str));
    }
}
