import java.util.Scanner;

public class DayOfMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("which day that you want to count days");
        int month = scanner.nextInt();
        String dayOfMonth ;

        switch (month) {
            case 2:
                dayOfMonth = "28 or 29 days";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dayOfMonth = "31 days";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dayOfMonth = "30 days";
                break;
            default:
                dayOfMonth = "";
                break;
        }
        if (!dayOfMonth.equals("")) {
            System.out.printf("The month '%d' has %s days!", month, dayOfMonth);
        }
        else {
            System.out.print("Invalid input!");
        }
    }
}