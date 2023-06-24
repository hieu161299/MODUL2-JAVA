package list_student.interface_list;

import list_student.student.Student;

import java.util.ArrayList;

public class ManageStudent implements Manage<Student>{
    ArrayList<Student> studentArrayList = new ArrayList<>() ;

    @Override

    public void addStudent(Student student) {
        studentArrayList.add(student);
    }

    @Override
    public void showAll() {
        for (int i = 0; i < studentArrayList.size(); i++) {
            System.out.println(studentArrayList.get(i).toString());
        }
    }
    @Override
    public void deleteStudent(int idDelete) {
        for (int i = 0; i < studentArrayList.size(); i++) {
            if (studentArrayList.get(i).getId() == idDelete){
                studentArrayList.remove(i);
            }
        }
    }

    @Override
    public void findById(int id) {
        for (int i = 0; i < studentArrayList.size(); i++) {
            if (studentArrayList.get(i).getId() == id){
                System.out.println(studentArrayList.get(i).toString());;
            }
        }
    }

    @Override
    public void editStudent(int idEdit) {
        for (int i = 0; i < studentArrayList.size(); i++) {
            if (studentArrayList.get(i).getId() == idEdit){
                studentArrayList.get(i).inputStudent();
            }
        }
    }
}
