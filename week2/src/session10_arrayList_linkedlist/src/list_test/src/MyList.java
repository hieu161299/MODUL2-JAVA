import java.util.Arrays;

public class MyList<E> { //Bước 1: Tạo lớp MyList với các thuộc tính như mô tả
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object element[];

    public MyList() {
        element = new Object[DEFAULT_CAPACITY];
    }
    private void ensureCapa(){ //Bước 2: Cài đặt phương thức ensureCapa()
        int newSize = element.length *2;
        element = Arrays.copyOf(element,newSize);
    }
    /*Bước 3: Cài đặt phương thức add()
    Mục đích: thêm một phần tử vào cuối của danh sách
    Tham số đầu vào: phần tử cần thêm vào danh sách*/
    public void add(E e){
        if (size == element.length){
            ensureCapa();
        }
        element[size] = e;
        size++;
    }

    /*Bước 4: Cài đặt phương thức get()
    Mục đích: Phương thức get() trả về phần tử vừa ở vị trí thứ i trong danh sách.
    Tham số đầu vào: số nguyên chứa vị trí cần truy cập đến phần tử trong danh sách*/

    public E get(int i) {
        if (i>= size || i <0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        return (E) element[i];
    }

}
