package model;

public class Product {
    private String idProduct;
    private String nameProduct;
    private double price;
    private int quantity;
    private String detail;

    public Product() {
    }

    public Product(String idProduct, String nameProduct, double price, int quantity, String detail) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.price = price;
        this.quantity = quantity;
        this.detail = detail;
    }

    public String getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "Mã Sản Phẩm: " + this.getIdProduct() + "\n" +
                "Tên Sản Phẩm: " + this.getNameProduct() + "\n" +
                "Giá Sản Phẩm: " + this.getPrice() + "\n" +
                "Số Lượng Sản Phẩm: " + this.getQuantity() + "\n" +
                "Mô Tả Sản Phẩm: " + this.getDetail();
    }
}
