package ngay_20_06_2023.bai2;

public class KiemTra {
    public void kiemTraChanLe(int number){
        if (number == 0){
            System.out.println(number + " không phải số lẻ và không phải là số chẵn");
        }else if (number % 2 == 0){
            System.out.println(number + " là số chẵn");
        }else {
            System.out.println(number + " là số lẻ");
        }
    }
}
