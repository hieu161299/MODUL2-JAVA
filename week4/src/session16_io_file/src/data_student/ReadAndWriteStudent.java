package data_student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteStudent {
    File file = new File("src/data_student/data.csv");

   public void writeFile(Student student) throws IOException {
        // khi ghi data vào file thì data mới sẽ chèn vào data cũ nên phải đọc và lấy data cũ + data mới chèn vào data cũ

       FileReader fileReader = new FileReader(file);
       BufferedReader bufferedReader = new BufferedReader(fileReader);
       String line = null;
       String data = "";
       while ((line = bufferedReader.readLine()) != null){
           data += line + "\n";
       }
       bufferedReader.close();

       data += student.getId() + "," + student.getName() + "," + student.getScore();
       System.out.println(data);

       FileWriter fileWriter = new FileWriter(file);
       BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

       bufferedWriter.write(data);
       bufferedWriter.close();
   }

   public List<Student> readFile( ) throws IOException {
       //đọc và lấy data trong file cho vào list

        List<Student> studentList = new ArrayList<>(); // tạo 1 list chứa các đối tượng kiểu student
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line = null; // tạo biến line dùng ở phía dưới  để nhận giá trị khi duyệt từng dòng của file

       // duyệt file từ đầu đến hết, duyệt xong file thì dòng tiếp theo sẽ ko có giá trị và sẽ = null , khi đó sẽ dừng
       // t ko biết duyết đến khi nào nên dùng vòng lặp while sẽ duyệt đến khi = null và dừng lại.


        while ((line = bufferedReader.readLine()) != null){

            String[] data = line.split(","); // giá trị từng dòng cách nhau bởi dấu " , " nên dùng spilit để xóa nó đi

            studentList.add(new Student(Integer.parseInt(data[0]),data[1],Double.parseDouble(data[2]) ));
        }
        return studentList;
   }

}
