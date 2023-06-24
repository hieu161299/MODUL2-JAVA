package manage_the_street.src.menu;

import manage_the_street.src.the_family.Family;
import manage_the_street.src.the_people.Person;
import manage_the_street.src.the_street.Street;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainMenu {
    private MenuPerson menuPerson = new MenuPerson();
    private Street street = new Street(1, "Thanh Xuân");
    private Scanner inputNumber = new Scanner(System.in);
    private Scanner inputString = new Scanner(System.in);

    public void showMainMenu() {

        int choice = -1;
        do {
            System.out.println("===== Khu phố =====");
            System.out.println("1. Thêm nhà\n2. Sửa nhà theo id\n3. Xóa nhà\n4. Danh sách các nhà\n0. Thoát");

            try {
                System.out.println("Nhập lựa chọn của bạn");
                choice = inputNumber.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Vui lòng nhập số ");
                inputString.nextInt();
                choice = -1;
            }
            switch (choice) {
                case 1:
                    showMenuAddFamily();
                    break;
                case 2:
                    editFamily();
                    break;
                case 3:
                    deleteFamilyById();
                    break;
                case 4:
                    showListFamily();
                    break;
                case 0:
                    System.exit(0);
            }
        } while (choice != 0);
    }

    public void showMenuAddFamily() {
        System.out.println("===== Menu thêm nhà mới =====");
        System.out.println("nhập id");
        int id = inputNumber.nextInt();
        Family family = new Family(id);
        street.add(family);
    }

    public void showListFamily() {
        int choice = -1;
        System.out.println("==== Danh sách nhà trong khu phố ====");
        for (int i = 0; i < street.getAll().size(); i++) {
            System.out.println((i + 1) + ". Hộ gia đình số " + street.getAll().get(i).getId());
        }
        System.out.println("0. Exit");
        System.out.println("Nhập lựa chọn");
        choice = inputNumber.nextInt();
        if (choice <= 0 || choice >= street.getAll().size()) {
            showMainMenu();
        } else {
            menuPerson.showMenuPerson(street.getAll().get(choice - 1));
        }
    }

    public void deleteFamilyById() {
        System.out.println("Nhập id của nhà muốn xóa");
        int id = inputNumber.nextInt();
        street.delete(id);
    }

    public void editFamily() {
        System.out.println("Nhập id của nhà muốn sửa");
        int id = inputNumber.nextInt();
        if (street.findIndexById(id) == -1) {
            System.out.println("ID không tồn tại");
            showListFamily();
        } else {
            System.out.println("nhập id sau khi sửa");
            int idEdit = inputNumber.nextInt();
            Family family = new Family(idEdit);
            street.edit(id, family);
        }
    }

}
