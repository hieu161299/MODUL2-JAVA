package menu;

import managemant.ProductManagement;
import model.Product;
import validate.CheckInput;

import java.util.Scanner;

public class ProductMenu {
    private ProductManagement productManagement = new ProductManagement();
    private CheckInput checkInput = new CheckInput();

    public void showAll() {
        if (productManagement.getAll().size() == 0) {
            System.out.println("Danh sách hiện tại chưa có sản phẩm");
        } else {
            System.out.println("===== Danh sách sản phẩm =====");
            System.out.printf("%-20s%-20s%-20s%-20s%-20s\n", "Mã Sản Phẩm ", "Tên Sản Phẩm: ", "Giá Sản Phẩm ",
                    "Số Lượng ", "Mô Tả Sản Phẩm");
            for (int i = 0; i < productManagement.getAll().size(); i++) {
                Product product = productManagement.getAll().get(i);
                System.out.printf("%-20s%-20s%-20s%-20s%-20s\n", product.getIdProduct(), product.getNameProduct(),
                        product.getPrice(), product.getQuantity(), product.getDetail());
            }
        }
    }

    public Product inputProduct() {
        String productId;
        while (true) {
            String str = "Nhập ID Sản Phẩm(vd: D01 , D02): ";
            productId = checkInput.checkRegex(str, checkInput.PRODUCT_ID);
            if (productManagement.findIndexById(productId) == -1) {
                break;
            }
            System.out.println("ID Sản Phẩm Đã Tồn Tại");
        }

        String productName;
        while (true) {
            String str = "Nhập Tên Sản Phẩm: ";
            productName = checkInput.checkRegex(str, checkInput.STRING);
            break;
        }

        double price;
        while (true) {
            String str = "Nhập Giá Sản Phẩm: ";
            price = checkInput.checkInputNumber(str);
            break;
        }

        int quantity;
        while (true) {
            String str = "Nhập Số Lượng Sản Phẩm: ";
            quantity = checkInput.checkInputNumber(str);
            break;
        }

        String detail;
        while (true) {
            String str = "Nhập Mô Tả Sản Phẩm: ";
            detail = checkInput.checkRegex(str, checkInput.STRING);
            break;
        }
        Product product = new Product(productId, productName, price, quantity, detail);
        return product;
    }

    public void addProduct() {
        System.out.println("===== Thêm sản phẩm =====");
        Product product = inputProduct();
        productManagement.add(product);
    }

    public void editProduct() {
        System.out.println("***** Sửa Sản Phẩm");

        String str = "Nhập ID Sản Phẩm(vd: D01 , D02): ";
        String idProduct = checkInput.checkRegex(str, checkInput.PRODUCT_ID);

        if (productManagement.findIndexById(idProduct) == -1) {
            System.out.println("Không Tìm Được Sản Phẩm Với Mã Sản Phẩm Trên !!!");
        } else {
            System.out.println("----------");
            System.out.println(productManagement.getAll().get(productManagement.findIndexById(idProduct)).toString());
            System.out.println("----------");

            String nameProduct;
            while (true) {
                String str1 = "Nhập Tên Sản Phẩm: ";
                nameProduct = checkInput.checkRegex(str1, checkInput.STRING);
                break;
            }

            double price;
            while (true) {
                String str2 = "Nhập Giá Sản Phẩm: ";
                price = checkInput.checkInputNumber(str2);
                break;
            }

            int quantity;
            while (true) {
                String str3 = "Nhập Số Lượng Sản Phẩm: ";
                quantity = checkInput.checkInputNumber(str3);
                break;
            }

            String detail;
            while (true) {
                String str4 = "Nhập Mô Tả Sản Phẩm: ";
                detail = checkInput.checkRegex(str4, checkInput.STRING);
                break;
            }

            Product product = new Product(idProduct, nameProduct, price, quantity, detail);
            productManagement.edit(idProduct, product);

        }

    }

    public void deleteProduct() {
        System.out.println("===== MENU Xóa Sản Phẩm =====");
        String idProduct;
        while (true) {
            String str;
            str = "Nhập ID Sản Phẩm muốn xóa(vd: D01 , D01): ";
            idProduct = checkInput.checkRegex(str, checkInput.PRODUCT_ID);
            if (productManagement.findIndexById(idProduct) == -1) {
                System.out.println(" ID không tồn tại");
            } else {
                break;
            }
        }
        productManagement.delete(idProduct);
    }

    public void sortProduct() {
        int choice = -1;
        do {
            String menu = "----- SẮP XẾP QUẢN LÍ SẢN PHẨM -----\n" +
                    "1. Sắp Xếp Tăng Dần\n" +
                    "2. Sắp Xếp Giảm Dần\n" +
                    "0. Thoát";

            System.out.println(menu);
            System.out.println("----------");
            String str = "Nhập Lựa Chọn: ";
            choice = checkInput.checkInputNumber(str);
            System.out.println("----------");

            switch (choice) {
                case 1:
                    System.out.println("Sắp Xếp Tăng Dần");
                    System.out.printf("%-20s%-20s%-20s%-20s%-20s\n", "Mã Sản Phẩm ", "Tên Sản Phẩm: ", "Giá Sản Phẩm ",
                            "Số Lượng ", "Mô Tả Sản Phẩm");
                    for (Product product : productManagement.sortAsc()) {
                        System.out.printf("%-20s%-20s%-20s%-20s%-20s\n", product.getIdProduct(), product.getNameProduct(),
                                product.getPrice(), product.getQuantity(), product.getDetail());

                    }
                    break;
                case 2:
                    System.out.println("Sắp Xếp Giảm Dần");
                    System.out.printf("%-20s%-20s%-20s%-20s%-20s\n", "Mã Sản Phẩm ", "Tên Sản Phẩm: ", "Giá Sản Phẩm ",
                            "Số Lượng ", "Mô Tả Sản Phẩm");
                    for (Product product : productManagement.sortDec()) {
                        System.out.printf("%-20s%-20s%-20s%-20s%-20s\n", product.getIdProduct(), product.getNameProduct(),
                                product.getPrice(), product.getQuantity(), product.getDetail());

                    }
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ");
                    System.out.println("----------");
                    break;
            }
        }while (choice != 0);
    }

    public void findMaxPriceProduct(){
        System.out.println("===== Tìm Sản Phẩm Có Giá Đắt Nhất =====");
        System.out.println("===== Danh sách sản phẩm =====");
        System.out.printf("%-20s%-20s%-20s%-20s%-20s\n", "Mã Sản Phẩm ", "Tên Sản Phẩm: ", "Giá Sản Phẩm ",
                "Số Lượng ", "Mô Tả Sản Phẩm");
        for (Product product : productManagement.getAll()) {
            if (product.getPrice() == productManagement.sortDec().get(0).getPrice()) {
                System.out.printf("%-20s%-20s%-20s%-20s%-20s\n", product.getIdProduct(), product.getNameProduct(),
                        product.getPrice(), product.getQuantity(), product.getDetail());
            }
        }
    }
}
