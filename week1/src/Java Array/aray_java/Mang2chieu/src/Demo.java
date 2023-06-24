import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {


        // khởi tạo mạng 2 chiều

        int[][] matrix = new int[3][3];

        // Nhập liệu các giá trị vào mảng

        Scanner input = new Scanner(System.in);
        System.out.println("Enter " + matrix.length + " rows and " +
                matrix[0].length + " columns: ");

        //Chạy vòng lặp để đưa giá trị nhập liệu của người dùng vào mảng:

        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = input.nextInt();
            }
        }

        /*In mảng
        Sử dụng vòng lặp để in lần lượt từng phần tử một của mảng như trong khối lệnh dưới đây:*/

        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }

        /* 1. Tính tổng tất cả các phần tử trong mảng
        Sử dụng một biến total để lưu trữ giá trị tổng, được khởi tạo với giá trị 0.
        Sử dụng vòng lặp để cộng lần lượt từng phần tử một của mảng vào biến này:*/

       /*  int total = 0;
        for (int row = 0; row < matrix.length ; row++) {
            for (int colum = 0 ; colum < matrix[row].length ; colum++) {
                total += matrix[row][colum];
            }
        }
        System.out.println("sum of matrix ís " + total); */

        // 2. Tính tổng từng cột
        /*for (int colum = 0 ; colum < matrix[0].length ; colum++) {
            int sum = 0;
            for (int row = 0; row < matrix.length ; row++) {
                sum += matrix[row][colum];
            }
            System.out.println("sum of colum" + colum  + " is " + sum);
        }*/


        // 3. Tìm ra dòng có tổng các phần tử là lớn nhất
        /*Sử dụng các biến maxRow và indexOfMaxRow để theo dấu tổng lớn nhất và định vị của dòng có tổng đó.
        Với mỗi dòng, tính tổng các phần tử của nó và cập nhật maxRow và indexOfMaxRow
        nếu dòng mới tính xong có tổng lớn hơn giá trị cũ:*/

       /* int maxRow = 0;
        int indexOfMaxRow = 0;
        for (int row = 0; row < matrix.length ; row++) {
            int sum = 0;
            for (int colum = 0 ; colum < matrix[row].length ; colum++) {
                sum += matrix[row][colum];
            }
            if (maxRow < sum) {
                maxRow = sum;
                indexOfMaxRow = row;
            }
        }
        System.out.println("index of row is " + indexOfMaxRow + " have max sum of row is " + maxRow);
        */


       // Xáo trộn mảng

      /*  for (int i = 0 ; i < matrix.length ; i++) {
            for (int j = 0 ; j < matrix[i].length ; j++) {
                int i1 = (int) (Math.random()* matrix.length);
                int j1 = (int) (Math.random()* matrix[i].length);

                int tem = matrix[i][j];
                matrix[i][j] = matrix[i1][j1];
                matrix[i1][j1] = tem;
            }
        }


        System.out.println("mang sau khi xao tron la :");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }*/
    }
}