package management;

import read_write_file.ReadAndWriteFile;
import student.Student;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManageStudent implements Management<Student> {
    private List<Student> studentList = null;
    private ReadAndWriteFile readWriteFile = new ReadAndWriteFile();

    public ManageStudent() {
        try {
            studentList = readWriteFile.readFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void add(Student student) {
        int index = findIndexById(student.getId());
        if (index == -1) {
            this.studentList.add(student);
            try {
                this.readWriteFile.writeFile(this.studentList);
                System.out.println("add success");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            System.out.println("id is exist ");
        }

    }

    @Override
    public List<Student> getAll() {
        try {
            return readWriteFile.readFile();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void showAll() {

        for (int i = 0; i < studentList.size(); i++) {
            System.out.println(studentList.get(i).toString());
        }
    }

    @Override
    public void edit(int idEdit, Student student) {
        int index = findIndexById(idEdit);
        if (index == -1) {
            System.out.println(" id not exist");
        } else {
            studentList.set(index, student);
            try {
                this.readWriteFile.writeFile(this.studentList);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    @Override
    public void delete(int idDelete) {

        int index = findIndexById(idDelete);
        if (index == -1) {
            System.out.println(" id not exist");
        } else {
            studentList.remove(index);
            try {
                this.readWriteFile.writeFile(this.studentList);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    @Override
    public int findIndexById(int id) {
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void findByName(String name) {

        boolean check = false;
        for (int i = 0; i < studentList.size(); i++) {
            String nameStudent = studentList.get(i).getFullName().toLowerCase();
            if (nameStudent.contains(name.toLowerCase())) {
                System.out.println(studentList.get(i).toString());
                check = true;
            }
        }
        if (check == false) System.out.println("name is not exist");
    }

}
