package ngay_20_06_2023.bai1;

import java.util.Scanner;

public class Bai1 {
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Cứ mỗi đợt Tết đến xuân về, trong mâm cơm nhà Duy lại không thể thiếu được các món ăn dân gian như
        // bánh chưng, gà luộc, bánh đa nem.

        //Năm nay Duy được giao cho công việc rán bánh đa nem,
        // vì chảo rán nhà Duy chỉ rán được từ 1-9 chiếc bánh đa nem một lúc.

        //Vì vậy Duy muốn nhờ các bạn tính xem với N chiếc bánh đa nem thì Duy phải ngồi rán ít nhất bao nhiêu lần.

    }
    public int timSoLanRan(int num){
        int count = 0;
        if (num % 9 == 0){
            count = num/9;
        }else {
            count = num/9 +1;
        }
        return count;
    }
}
