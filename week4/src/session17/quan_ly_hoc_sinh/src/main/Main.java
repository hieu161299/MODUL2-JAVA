package main;

import management.ManageStudent;
import menu.Menu;
import read_write_file.ReadAndWriteFile;
import student.Student;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        Menu menu = new Menu();
        menu.showMenu();

        ManageStudent manageStudent = new ManageStudent();

        List<Student> students = manageStudent.getAll();
        for (Student value : students) {
            System.out.println(value);
        }

    }
}
