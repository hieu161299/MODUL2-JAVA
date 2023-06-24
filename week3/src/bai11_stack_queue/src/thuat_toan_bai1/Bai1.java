package thuat_toan_bai1;

import java.util.Scanner;

public class Bai1 {
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //Nhập 2 số nguyên x và y. Viết chương trình tính tổng bình phương các số từ x đến y.
    }

    public int square(int x, int y) {
        int sum = 0;
        if (x < y) {
            for (int i = x; i <= y; i++) {
                sum += i * i;
            }
        } else {
            for (int i = y; i <= x; i++) {
                sum += i * i;
            }
        }
        return sum;
    }

}
