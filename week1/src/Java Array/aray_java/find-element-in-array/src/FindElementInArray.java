import java.util.Scanner;

public class FindElementInArray {
    public static void main(String[] args) {
        String[] students = {"nguyen","hai","khanh","toan","nam"};

        Scanner input = new Scanner(System.in);
        System.out.println("Enter name");
        String name = input.nextLine();


        //Phương thức equals() so sánh hai chuỗi đưa ra dựa trên nội dung của chuỗi.
        // Nếu hai chuỗi khác nhau nó trả về false. Nếu hai chuỗi bằng nhau nó trả về true.


        boolean isExit = false;
        for (int i = 0 ; i < students.length ; i++) {
            if (students[i].equals(name) ) {
                System.out.println("position of the students in the list " + name + " is " + i);
                isExit = true;
                break;
            }
        }
        if (!isExit){
            System.out.println("not found " + name + " in the list.");
        }
    }
}