package session16_io_file.src.ex2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    // Bước 1: Tạo lớp ReadAndWriteFile
    //Tạo phương thức readFile với đối số truyền vào là đường dẫn file mà người dùng nhập vào và trả về một List<Integer>
    public void readFile(String filePath)  {
        List<Integer> numbers = new ArrayList<>();
        try {
            File file = new File("numbers.txt");

            if (!file.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
        }catch (Exception e){
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
        }
    }

    public void write(int number){
        try {
            FileWriter fileWriter = new FileWriter("numbers.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) throws IOException {

    }
}
