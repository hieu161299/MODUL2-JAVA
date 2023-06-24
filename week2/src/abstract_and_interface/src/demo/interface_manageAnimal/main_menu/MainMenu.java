package demo.interface_manageAnimal.main_menu;

import demo.interface_manageAnimal.animal.Cat;
import demo.interface_manageAnimal.interface_test.CatManage;

import java.util.Scanner;

public class MainMenu {
    private CatManage catManage;
    private Scanner input = new Scanner(System.in);

    public MainMenu(){
        catManage = new CatManage();
    }

    public void showMainMenu(){
        String menu = "=========Menu =========\n1.Manage cat\n2.Manage dog\n0.Exit";
        int choice;
        do {
            System.out.println(menu);
            System.out.println("enter your choice:");
            choice = input.nextInt();
            switch (choice){
                case 1:
                    showMenuOfCat();
                    break;
                case 2:
                    break;
                case  0:
                    System.exit(0);
            }
        }while (choice != 0);
    }

    public void showMenuOfCat(){
        String menu = "=======Menu quản lý mèo=========\n1.Thêm mèo\n2.Xóa mèo\n" +
                "3.Sửa mèo\n4.Tìm kiếm\n5.Hiển thị tất\n0.Thoát";
        int choice;
        do {
            System.out.println(menu);
            System.out.println("enter your choice:");
            choice = input.nextInt();
            switch (choice){
                case 1:
                    showMenuAddCat();
                    break;
                case 2:
                    break;

                case 5:
                    showAll();
                    break;

            }
        }while (choice !=0);
    }

    public void showMenuAddCat(){
        System.out.println("you are adding cat");

        System.out.println("enter cat id:");
        int id = input.nextInt();
        input.nextLine();

        System.out.println("enter cat name:");
        String name = input.nextLine();


        System.out.println("enter cat birth:");
        int birth = input.nextInt();
        input.nextLine();

        System.out.println("enter cat type:");
        String catType = input.nextLine();

        System.out.println(" is cat sick: ");
        boolean isSick = input.nextBoolean();

        Cat cat = new Cat(id,name,birth,catType,isSick);
        catManage.add(cat);
    }

    public void showAll() {
        Cat[] cat1 = catManage.showAll();
        int size = CatManage.size;
        System.out.println("-----Danh sách mèo------");
        for (int i = 0; i < size; i++) {
            System.out.println(i + " - " + cat1[i].toString());
        }
    }
}
