import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap chi so can nang:");
        float weight = scanner.nextFloat();

        System.out.println("nhap chi so chieu cao:");
        float height = scanner.nextFloat();

        float bmi = weight / (height*height);

        if (bmi < 18.5) {
            System.out.println(bmi + " is Underweight");
        } else if (18.5 <= bmi && bmi <= 25.0) {
            System.out.println(bmi + " is Normal");
        } else if (25.0 <= bmi && bmi < 30.0) {
            System.out.println(bmi + " is Overweight");
        } else {
            System.out.println(bmi + " is Obese");
        }
    }
}