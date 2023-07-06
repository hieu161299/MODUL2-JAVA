package read_write_file;

import student.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {

    public void writeFile(List<Student> studentList) throws IOException {

        String data = "";

        for (Student student: studentList) {
            data += student.getId() + "," + student.getFullName() + "," + student.getAge() +
                    "," + student.getAddress() + "\n";
        }

        FileWriter fileWriter = new FileWriter("student.csv");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        bufferedWriter.write(data);
        bufferedWriter.close();

    }
    public List<Student> readFile() throws IOException {
        List<Student> studentList = new ArrayList<Student>();

        FileReader fileReader = new FileReader("student.csv");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line = null;

        while ((line = bufferedReader.readLine()) != null) {
            String[] data = line.split(",");
            studentList.add(new Student(Integer.parseInt(data[0]), data[1], Integer.parseInt(data[2]), data[3]));
        }
        return studentList;
    }

}
