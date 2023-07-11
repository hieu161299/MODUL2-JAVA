package menu;

import validate.CheckInput;

public class MainMenu {
    private CheckInput checkInput = new CheckInput();
    private ProductMenu productMenu = new ProductMenu();
    public void showMainMenu(){
        int choice = -1;
        do {
            String menu = "===== CHƯƠNG TRÌNH QUẢN LÍ SẢN PHẨM =====\n" +
                    "1. Xem danh sách\n" +
                    "2. Thêm mới\n" +
                    "3. Cập nhật\n" +
                    "4. Xóa\n" +
                    "5. Sắp xếp\n" +
                    "6. Tìm sản phẩm có giá đắt nhất\n" +
                    "0. Thoát";

            System.out.println(menu);
            System.out.println("----------");
            String str = "Nhập Lựa Chọn: ";
            choice = checkInput.checkInputNumber(str);
            System.out.println("----------");

            switch (choice) {
                case 1:
                    productMenu.showAll();
                    break;
                case 2:
                    productMenu.addProduct();
                    break;
                case 3:
                    productMenu.editProduct();
                    break;
                case 4:
                    productMenu.deleteProduct();
                    break;
                case 5:
                    productMenu.sortProduct();
                    break;
                case 6:
                    productMenu.findMaxPriceProduct();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Không Có Lựa Chọn !!!");
                    System.out.println("----------");
                    break;
            }
        } while (choice != 0);
    }
}
