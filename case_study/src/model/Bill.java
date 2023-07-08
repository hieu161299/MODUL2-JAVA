package model;

public class Bill {
    private String idBIll; // id hóa đơn
    private String roomName;   // tên phòng
    private String renter; //  người thuê
    private String dayStart;   // thời gian bắt đầu thuê
    private String dayEnd;  // thời gian kết thúc thuê
    private String paymentTotal; //  tiền thuê phòng
    private String nameEmployee; // tên nhân viên tạo hóa đơn
    private boolean status; // đã trả tiền hoặc chưa trả tiền

    public Bill() {
    }

    public  Bill(String idBIll, String roomName, String renter, String dayStart, String dayEnd,
                 String paymentTotal,String nameEmployee , Boolean status) {
        this.idBIll = idBIll;
        this.roomName = roomName;
        this.renter = renter;
        this.nameEmployee = nameEmployee;
        this.dayStart = dayStart;
        this.dayEnd = dayEnd;
        this.paymentTotal = paymentTotal;
        this.status = status;
    }

    public String getIdBIll() {
        return idBIll;
    }

    public void setIdBIll(String idBIll) {
        this.idBIll = idBIll;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getRenter() {
        return renter;
    }

    public void setRenter(String renter) {
        this.renter = renter;
    }

    public String getNameEmployee() {
        return nameEmployee;
    }

    public void setNameEmployee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }

    public String getDayStart() {
        return dayStart;
    }

    public void setDayStart(String dayStart) {
        this.dayStart = dayStart;
    }

    public String getDayEnd() {
        return dayEnd;
    }

    public void setDayEnd(String dayEnd) {
        this.dayEnd = dayEnd;
    }

    public String getPaymentTotal() {
        return paymentTotal;
    }

    public void setPaymentTotal(String paymentTotal) {
        this.paymentTotal = paymentTotal;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
