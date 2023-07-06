package data_student;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ManageStudent {
    List<Student> studentList = new ArrayList<>();
    private ReadAndWriteStudent readAndWriteStudent = new ReadAndWriteStudent();

    public ManageStudent() {
        try {
            studentList = readAndWriteStudent.readFile();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void add(Student student) throws IOException {
        studentList.add(student);
        readAndWriteStudent.writeFile(student);
    }
    public List<Student> getStudentList(){

        try {
            return this.readAndWriteStudent.readFile();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
