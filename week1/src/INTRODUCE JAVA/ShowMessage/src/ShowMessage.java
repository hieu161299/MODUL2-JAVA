import java.util.Scanner;

public class ShowMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name:");
        String name = scanner.nextLine();

        System.out.println("Hello " + name);
    }
}
