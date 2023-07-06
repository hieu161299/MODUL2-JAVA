package data_student;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        ManageStudent manageStudent = new ManageStudent();
       /* Student student1 = new Student(1,"tuan",7.3);
        Student student2 = new Student(6,"tung",5.3);*/

        /*manageStudent.add(student1);
        manageStudent.add(student2);*/

        List<Student> students = manageStudent.getStudentList();
        for (Student value : students) {
            System.out.println(value);
        }


    }
}
