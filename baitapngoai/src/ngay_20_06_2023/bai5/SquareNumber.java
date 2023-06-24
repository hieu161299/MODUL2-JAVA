package ngay_20_06_2023.bai5;

public class SquareNumber {
    public static void main(String[] args) {
        // Nhập và a, b. In ra các số chính phương từ a đến b
    }

    public SquareNumber() {
    }

    public void findSquareNumber(double number1 , double number2){
        for (double i = number1; i <= number2 ; i++) {
            if (check(i) ){
                System.out.println(i);
            }

        }
    }

    public boolean check(double num){

        if (num % (Math.pow(num,0.5)) ==  0){
            return true;
        }
        return false;
    }



}
