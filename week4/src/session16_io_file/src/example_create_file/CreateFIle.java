package example_create_file;

import java.io.*;

public class CreateFIle {


    public static void main(String[] args)  {
       File file = new File("src/example_create_file/data.txt");

        try {
            file.createNewFile(); // tao file data
        } catch (IOException e) {
            // khong co quyen truy cap tep tin
            // o cung bi day
            // duong dan sai
            throw new RuntimeException(e);
        }

    }
}
