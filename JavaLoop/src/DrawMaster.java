import java.util.Scanner;

public class DrawMaster {
    public static void main(String[] args) {


        while (true)  {
            Scanner scanner = new Scanner(System.in);

            System.out.println("\n----- in hinh  -----");
            System.out.println("1.  In hình chữ nhật.");
            System.out.println("2. In hình tam giác vuông, có cạnh góc vuông ở botton-left");
            System.out.println("3.  In hình tam giác vuông, có cạnh góc vuông ở top-left .");
            System.out.println("4. In tam giac can.");
            System.out.println("0. Thoát chương trình");
            System.out.println("-----------------------------");

            int choice;
            do {
                System.out.println("nhap gia tri lua chon : ");
                choice = scanner.nextInt();
            } while (choice < 0 || choice > 6);

            switch (choice) {
                case 1:
                    System.out.println("nhap chieu rong :");
                    int width = scanner.nextInt();

                    System.out.println("nhap chieu dai :");
                    int height = scanner.nextInt();
                    for (int i = 0; i < width; i++) {
                        for (int j = 0; j < height; j++) {
                            System.out.print("* ");
                        }
                        System.out.println(" ");
                    }
                    break;

                case 2:
                    System.out.println("nhap size vuong tren xuong duoi :");
                    int size = scanner.nextInt();

                    for (int i = size; i > 0; i--) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println(" ");
                    }
                    break;

                case 3:
                    System.out.println("nhap size vuong duoi len tren:");
                    size = scanner.nextInt();

                    for (int i = 0; i <= size; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println(" ");
                    }
                    break;
                case 4:
                    System.out.println("nhap size tam giac can:");
                    size = scanner.nextInt();

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
                case 0:
                    System.exit(0);
            }
        }


    }
}
