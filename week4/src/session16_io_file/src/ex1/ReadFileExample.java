package ex1;

import java.io.*;
import java.util.Scanner;

public class ReadFileExample {
    public static void main(String[] args) throws IOException {
        File file = new File("src/readFileText.txt");
        file.createNewFile();

        System.out.println("Nhập đường dẫn file: ");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();

        ReadFileExample readfileEx = new ReadFileExample();
        readfileEx.readFile(path);
    }
    public void readFile(String url){
            try{
                File file1 = new File(url);
                // Kiểm tra nếu file không tồn tại thì ném ra ngoại lệ.
                if (!file1.exists())
                    throw new FileNotFoundException();
                // Đọc từng dòng của file và tiến hành cộng tổng lại
                BufferedReader br = new BufferedReader(new  FileReader(file1));
                String line = "";
                int sum = 0;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                    sum += Integer.parseInt(line);
                }
                System.out.println(sum);
                br.close();
            }catch (Exception e){
                // TH file không tồn tại hoặc nội dung file có lỗi thì sẽ hiển thị thông báo lỗi.
                System.err.println("Fie không tồn tại or nội dung có lỗi!");
            }

    }

}
