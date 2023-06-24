package manage_the_street.src.menu;

import manage_the_street.src.the_family.Family;
import manage_the_street.src.the_people.Person;

import java.util.Scanner;

public class MenuPerson {
    private Scanner inputNumber = new Scanner(System.in);
    private Scanner inputString = new Scanner(System.in);

    public void showMenuPerson(Family family) {
        int choice = -1;
        do {
            System.out.println("Menu nhà số " + family.getId());
            System.out.println("1. Thêm người\n2. Sửa thông tin người\n" +
                    "3. Xóa người\n4. Hiển thị thông tin người\n0. Exit");
            System.out.println("Nhập lựa chọn");
            choice = inputNumber.nextInt();
            switch (choice) {
                case 1:
                    addPerson(family);
                    break;
                case 2:
                    editPerson(family);
                    break;
                case 3:
                    deletePerson(family);
                    break;
                case 4:
                    showPerson(family);
                    break;
            }
        } while (choice != 0);

    }

    public void addPerson(Family family) {
        System.out.println("===== Thêm người vào nhà số" + family.getId() + " =====");
        System.out.println("nhập id");
        int id = inputNumber.nextInt();
        System.out.println("nhập tên");
        String name = inputString.nextLine();
        System.out.println("nhập tuổi");
        int age = inputNumber.nextInt();
        System.out.println("nhập nghề nghiệp");
        String job = inputString.nextLine();

        Person person = new Person(id, name, age, job);
        family.add(person);
    }

    public void showPerson(Family family) {
        for (int i = 0; i < family.getAll().size(); i++) {
            System.out.println(family.getAll().get(i));
        }
    }

    public void deletePerson(Family family) {
        int index = family.findIndexById(family.getId());
        if (index == -1) {
            System.out.println("ID không tồn tại");
        } else family.delete(index);
    }

    public void editPerson(Family family) {
        System.out.println("Nhập ID của người muốn sửa");
        int idEdit = inputNumber.nextInt();

        if (family.findIndexById(idEdit) == -1) {
            System.out.println("id không tồn tại");
        } else {
            System.out.println("nhập id sau khi sửa");
            int id = inputNumber.nextInt();

            System.out.println("nhập tên sau khi sửa");
            String name = inputString.nextLine();

            System.out.println("nhập tuổi sau khi sửa");
            int age = inputNumber.nextInt();

            System.out.println("nhập nghề nghiệp sau khi sửa");
            String job = inputString.nextLine();
            Person person = new Person(id, name, age, job);
            family.edit(idEdit, person);
        }
    }
}
