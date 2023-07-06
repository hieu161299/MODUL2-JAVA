package model;

public class Bill {
    private String id; // id hóa đơn
    private String roomName;   // tên phòng
    private String renter; //  người thuê
    private String nameEmployee; // tên nhân viên tạo hóa đơn
    private String timeStart;   // thời gian bắt đầu thuê
    private String timeEnd;  // thời gian kết thúc thuê
    private String paymentTotal; // tổng tiền phải thanh toán

    public Bill() {
    }

    public Bill(String id, String roomName, String renter, String nameEmployee,
                String timeStart, String timeEnd, String paymentTotal) {
        this.id = id;
        this.roomName = roomName;
        this.renter = renter;
        this.nameEmployee = nameEmployee;
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
        this.paymentTotal = paymentTotal;
    }

    public static void main(String[] args) {
        String a = "7/6/2023";
    }
}
