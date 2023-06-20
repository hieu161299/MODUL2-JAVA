import java.util.Scanner;

public class ConvertTemperature {
    public static void  main(String[] args) {
        while (true) {
            Scanner input = new Scanner(System.in);

            System.out.println(" 1. Fahrenheit to Celsius ");
            System.out.println(" 2. Celsius to Fahrenheit ");
            System.out.println(" 0. Exit  ");

            int choice;
            do {
                System.out.println("enter your choice");
                choice = input.nextInt();

            } while (choice < 0 || choice > 2);

            switch (choice){

                case 1:
                    System.out.println("enter Celsius temperature :");
                    double celsiusValue = input.nextDouble();
                    System.out.println("Celsius to Fahrenheit :" + celsiusToFahrenheit(celsiusValue));
                    break;
                case 2:
                    System.out.println("enter Fahrenheit temperature :");
                    double fahrenheit = input.nextDouble();
                    System.out.println("Fahrenheit to Celsius : " + fahrenheitToCelsius(fahrenheit));
                    break;
                case 0:
                    System.exit(0);

            }
        }

    }
    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheitResult = (9 / 5.0) * celsius+ 32;
        return fahrenheitResult;
    }
    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsiusResult = (5.0 / 9) * (fahrenheit - 32);
        return celsiusResult;
    }

}