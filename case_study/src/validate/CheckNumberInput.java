package validate;

import java.util.Scanner;

public class CheckNumberInput {
    private Scanner input = new Scanner(System.in);
    public int checkInput(){
       int value = 0;
       while (true){
           try {
               value = Integer.parseInt(input.nextLine());
               break;
           }catch (NumberFormatException e){
               System.out.println("Vui lòng nhập số!");
           }
       }
       return value;
    }
}
