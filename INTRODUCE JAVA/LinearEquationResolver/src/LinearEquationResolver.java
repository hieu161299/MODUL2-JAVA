import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver :");
        System.out.println("Given a equation as 'a * x + b = c' , please enter constants:");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap a :");
        double a = scanner.nextDouble();

        System.out.println("Nhap b :");
        double b = scanner.nextDouble();

        System.out.println("Nhap c :");
        double c = scanner.nextDouble();

        if ( a != 0) {
            double answer = ( c - b )/a;
            System.out.printf("equation pass with x = %f\n", answer);
        }else {
            if ( b == c) {
                System.out.print("The solution is all x!");
            }else {
                System.out.print("No solution!");
            }
        }
    }
}
