package ngay_20_06_2023.bai3;

public class findMax {
    public int checkMax(int number1 , int number2 , int number3){
        int max = 0;
        if (number1 >= number2 ) {
            max =((number1 > number3)? number1: number3) ;
        }else if(number2 >= number3){
            max = number2;
        }else {
            max = number3;
        }
        return max;
    }
}
