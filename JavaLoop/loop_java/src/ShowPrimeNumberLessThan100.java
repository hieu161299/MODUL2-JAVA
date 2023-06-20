public class ShowPrimeNumberLessThan100 {
    public static void main(String[] args) {
        for (int i = 2; i < 100 ; i++) {
            boolean check = true;
            if ( i == 2 ){
                check = true;
            }else {
                for (int j = 2 ; j <= i/2 ; j++) {
                    if (i % j == 0) {
                        check = false;
                    }
                }
            }
            if (check) {
                System.out.print(i + " ");
            }
        }
    }
}
