package manage;

import management_interface.Management;
import student_class.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ManageStudent implements Management<Student> {
    ArrayList<Student> studentArrayList = new ArrayList<>();

    public ManageStudent() {
    }

    @Override
    public void addStudent(Student student) {
        studentArrayList.add(student);
    }

    @Override
    public int checkId(int id) {
        for (int i = 0; i < studentArrayList.size(); i++) {
            if (studentArrayList.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void deleteStudent(int id) {
        int index = checkId(id);
        if (index == -1) {
            System.out.println("id not exist");
        } else {
            studentArrayList.remove(index);
        }
    }

    @Override
    public void editStudent(int id) {
        int index = checkId(id);
        if (index == -1) {
            System.out.println("id not exist");
        } else {
            studentArrayList.get(index).inputStudent();
        }
    }

    @Override
    public void findById(int id) {
        int index = checkId(id);
        if (index == -1) {
            System.out.println("id not exist");
        } else {
            studentArrayList.get(index).toString();
        }
    }

    @Override
    public void showList() {
        if (studentArrayList.size() == 0) {
            System.out.println("list is empty");
        } else {
            for (int i = 0; i < studentArrayList.size(); i++) {
                System.out.println(studentArrayList.get(i).toString());
            }
        }
    }

    @Override
    public void sortByName() {
        if (studentArrayList.isEmpty()) {
            System.out.println("gia tri rong !");
        }
        for (int i = 0; i < studentArrayList.size(); i++) {
            for (int j = 0; j < studentArrayList.size(); j++) {
                Student studentGetI = studentArrayList.get(i);
                Student studentGetJ = studentArrayList.get(j);
                if (studentGetI.getName().compareTo(studentGetJ.getName()) < 0) {
                    Student studentTrungGian = studentGetI;
                    studentArrayList.set(i, studentGetJ);
                    studentArrayList.set(j, studentTrungGian);
                }
            }
        }
        for (Student student : studentArrayList) {
            System.out.println(student.toString());
        }
    }
}
