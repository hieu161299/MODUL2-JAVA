package managemant;

import io_file.ReadWriteFile;
import managemant.i_management.Management;
import model.Product;

import java.io.IOException;
import java.util.Comparator;
import java.util.List;

public class ProductManagement implements Management<Product> {
    List<Product> productList = null;
    private ReadWriteFile readWriteFile = new ReadWriteFile();

    public ProductManagement() {
        try {
            this.productList = readWriteFile.readFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void add(Product product) {
        try {
            this.productList = readWriteFile.readFile();

            this.productList.add(product);
            this.readWriteFile.writeFile(this.productList);

            System.out.println("Thêm Sản Phẩm Thành Công");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void edit(String id, Product product) {
        try {
            this.productList = this.readWriteFile.readFile();

            int index = findIndexById(id);
            if (index != -1) {
                this.productList.set(index, product);
                this.readWriteFile.writeFile(this.productList);

                System.out.println("Sửa Sản Phẩm Thành Công !!!");
            } else {
                System.out.println("Không Tìm Được Sản Phẩm Với Mã Sản Phẩm Trên !!!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(String id) {
        try {
            this.productList = this.readWriteFile.readFile();

            int index = findIndexById(id);
            if (index != -1) {
                this.productList.remove(index);
                this.readWriteFile.writeFile(this.productList);

                System.out.println("Xóa Sản Phẩm Thành Công !!!");
            } else {
                System.out.println("Sản phầm không tồn tại");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public int findIndexById(String id) {
        for (int i = 0; i < this.productList.size(); i++) {
            if (id.equalsIgnoreCase(this.productList.get(i).getIdProduct())) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public List<Product> getAll() {
        try {
            return this.productList = this.readWriteFile.readFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Product> sortAsc() {
        try {
            this.productList = this.readWriteFile.readFile();
            this.productList.sort(Comparator.comparingDouble(Product::getPrice));
            return this.productList;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    public List<Product> sortDec() {
        try {
            this.productList = this.readWriteFile.readFile();
            this.productList.sort(Comparator.comparingDouble(Product::getPrice).reversed());
            return this.productList;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
