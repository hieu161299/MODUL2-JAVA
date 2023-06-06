import java.util.Scanner;
public class Demo {
    public static void main(String[] args) {


        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle (The corner is square at  top-left)");
            System.out.println("3. Print the rectangle (The corner is square at  bottom-left)");
            System.out.println("4. Print isosceles triangle");
            System.out.println("0. Exit");

            int choice ;
            do {
                System.out.println("Enter your choice");
                choice = input.nextInt();
            }while (choice < 0 || choice > 7);

            switch (choice){
                case 1:
                    System.out.println("enter width");
                    int width = input.nextInt();
                    System.out.println("enter height");
                    int height = input.nextInt();

                    for (int i = 0 ; i< height ; i++) {
                        for (int j = 0 ; j < width ; j++) {
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    break;
                case 2:
                    System.out.println("enter size of triangle");
                    int size = input.nextInt();

                    for (int i = 0 ; i< size ; i++) {
                        for (int j = size ; j > i ; j--) {
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    break;
                case 3:
                    System.out.println("enter size of triangle");
                    size = input.nextInt();
                    for (int i = 0 ; i < size ; i++) {
                        for (int j = 0  ; j <= i ; j++) {
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    break;
                case 4:
                    System.out.println("enter size of triangle");
                    size = input.nextInt();
                    for (int i = 0; i < size; i++) {
                        for (int j = 0; j < size - i - 1; j++) {
                            System.out.print(" ");
                        }

                        for (int j = 0; j < 2 * i + 1; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 0 :
                    System.exit(0);
            }
        }
    }

}
