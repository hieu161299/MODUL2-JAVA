import java.util.Scanner;

public class QuadraticEquation {
    double a;
    double b;
    double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    double getDiscriminant(double a, double b, double c) {

        return b * b - 4 * a * c;
    }

    double getRoot(double a, double b, double c) {

        return -b / (2 * a);
    }

    double getRoot1(double a, double b, double c) {
        return -b + Math.pow((Math.pow(b, 2) - 4 * a * c), 0.5) / (2 * a);
    }

    double getRoot2(double a, double b, double c) {
        return -b - Math.pow((Math.pow(b, 2) - 4 * a * c), 0.5) / (2 * a);
    }

    public static void main(String[] args) {
        while (true) {
            Scanner input = new Scanner(System.in);

            System.out.println("enter a");
            double a = input.nextDouble();

            System.out.println("enter b");
            double b = input.nextDouble();

            System.out.println("enter c");
            double c = input.nextDouble();

            QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
            //  Object s = new QuadraticEquation(a, b,c);

            double delta = quadraticEquation.getDiscriminant(a, b, c);
            System.out.println(delta);

            if (delta > 0) {
                System.out.println("the roots are :");
                System.out.println("r1 = " + quadraticEquation.getRoot1(a, b, c));
                System.out.println("r2 = " + quadraticEquation.getRoot2(a, b, c));
            } else if (delta == 0) {
                System.out.println("the roots are :");
                System.out.println(" r1 = r2 = " + quadraticEquation.getRoot(a, b, c));
            } else {
                System.out.println("The equation has no roots");
            }
        }

    }
}
