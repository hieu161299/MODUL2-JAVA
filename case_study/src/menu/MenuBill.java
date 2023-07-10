package menu;

import management.BillManage;
import management.RoomManage;
import model.Bill;
import validate.CheckNumberInput;
import validate.ValidateBill;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Scanner;

public class MenuBill {
    private Scanner input = new Scanner(System.in);
    private BillManage billManage = new BillManage();
    private CheckNumberInput checkNumberInput = new CheckNumberInput();
    private RoomManage roomManage;
    private ValidateBill validateBill;

    public MenuBill(RoomManage roomManage) {
        this.roomManage = roomManage;
        validateBill = new ValidateBill(billManage, roomManage);
    }

    public void getMenuBill() {
        int choice;
        do {
            System.out.println("===== Quản lý Hóa Đơn =====");
            System.out.println("1. Thêm hóa đơn\n2. Sửa hóa đơn\n3. Danh sách hóa đơm\n" +
                    "4. Thanh toán\n5. Kiếm tra phòng bằng thời gian\n0. Thoát");
            choice = checkNumberInput.checkInput();

            switch (choice) {
                case 1:
                    createBill();
                    break;
                case 2:
                    editBill();
                    break;
                case 3:
                    showBillList();
                    break;
                case 4:
                    payMoney();
                case 5:
                    checkRoomByTime();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ");
            }
        } while (choice != 0);
    }

    public void createBill() {
        System.out.println("===== Thông tin hóa đơn =====");
        Bill bill = inputBill();
        billManage.add(bill);
        roomManage.changeStatusRoom(bill, bill.isStatus());
    }

    public void editBill() {
        System.out.println("=====  Sửa hóa đơn =====");
        System.out.println("Nhập Id của hóa đơn muốn sửa");
        String idBill = checkRoomId();

        Bill bill = inputBill();
        billManage.edit(idBill, bill);
    }

    public String checkRoomId() {
        String id = null;
        while (true) {
            id = validateBill.checkIdEdit();
            int index = billManage.findIndexById(id);
            if (index == -1) {
                System.out.println("ID hóa đơn không tồn tại. Hãy nhập lại");
                showBillList();
            } else {
                break;
            }
        }
        return id;
    }

    public void showBillList() {
        if (billManage.getAll().size() == 0) {
            System.out.println("Chưa có hóa đơn được tạo");
        } else {
            System.out.println("Danh sách Hóa đơn");
            System.out.printf("%-15s%-15s%-15s%-25s%-25s%-25s%-25s%-25s\n",
                    "ID hóa đơn", "Tên phòng", "Người thuê", "Ngày thuê phòng", "Ngày trả phòng", "Tiền thuê phòng",
                    "Nhân viên tạo hóa đơn", "Trạng thái");
            for (Bill bill : billManage.getAll()) {
                String status = changeStatus(bill.isStatus());

                System.out.printf("%-15s%-15s%-15s%-25s%-25s%-25s%-25s%-25s\n", bill.getIdBIll(), bill.getRoomName(),
                        bill.getRenter(), bill.getDayStart(), bill.getDayEnd(), bill.getPaymentTotal(),
                        bill.getNameEmployee(), status);
            }
        }
    }

    public Bill inputBill() {

        System.out.println("Nhập id hóa đơn");
        String idBill = validateBill.checkInputId();

        System.out.println("Nhập tên phòng cho thuê");
        String roomName = validateBill.checkRoomInput();
        int price = getMoneyByName(roomName);

        System.out.println("Nhập tên người thuê");
        String renter = validateBill.checkRenter();

        System.out.println("Nhập ngày bắt đầu thuê");
        String dayStart = validateBill.checkDayStart(roomName);

        System.out.println("Nhập ngày trả phòng");
        String dayEnd = checkDayEnd(dayStart);

        System.out.println("Tổng tiền thuê phòng");
        String paymentTotal = calculateMoney(dayStart, dayEnd, price);
        System.out.println(paymentTotal);

        System.out.println("Tên nhân viên tạo hóa đơn");
        String employee = validateBill.checkRenter();

        System.out.println("Trạng thái hóa đơn\n0. Khách đang thuê\n1. Khách trả phòng");
        int choice = input.nextInt();
        boolean status = changeStatus(choice);

        Bill bill = new Bill(idBill, roomName, renter, dayStart, dayEnd, paymentTotal, employee, status);
        return bill;
    }

    public String checkDayEnd(String str) {
        String[] dayStart = str.split("-");
        String dayEnd = null;
        while (true) {
            dayEnd = validateBill.checkInputDay();

            String[] end = dayEnd.split("-");
            if (Integer.parseInt(dayStart[0]) < Integer.parseInt(end[0]) ||
                    Integer.parseInt(dayStart[1]) < Integer.parseInt(end[1])) {
                break;

            } else {
                System.out.println("Thời gian trả phòng lớn hơn thời gian thuê");
            }
        }
        return dayEnd;
    }

    public int getMoneyByName(String str) {
        int index = roomManage.findIndexByName(str);
        int price = Integer.valueOf(roomManage.getAll().get(index).getPrice());
        return price;
    }

    public String calculateMoney(String dayStart, String dayEnd, int price) {
        String dayBegin[] = dayStart.split("-");
        String dayFinish[] = dayEnd.split("-");

        LocalDate beginDay = LocalDate.of(Integer.valueOf(dayBegin[2]), Integer.valueOf(dayBegin[1]),
                Integer.valueOf(dayBegin[0]));
        LocalDate finishDay = LocalDate.of(Integer.valueOf(dayFinish[2]), Integer.valueOf(dayFinish[1]),
                Integer.valueOf(dayFinish[0]));
        Period period = Period.between(beginDay, finishDay);

        int dayBetween = period.getDays();

        double amountPaid = dayBetween * price;
        String data = amountPaid + "";
        return data;
    }

    public boolean changeStatus(int number) {
        if (number == 0) {
            return true;
        }
        return false;
    }

    public String changeStatus(boolean status) {
        String data = null;
        if (status) {
            data = "Khách thuê phòng";

        } else if (!status) {
            data = "Khách trả phòng";
        }
        return data;
    }


    public void payMoney() {
        System.out.println("Nhập tên khách");
        String renter = validateBill.checkRenter();
        System.out.println("Nhập ngày thuê");
        String day = validateBill.checkInputDay();

        Bill bill = null;
        String id = null;
        for (int i = 0; i < billManage.getAll().size(); i++) {
            bill = billManage.getAll().get(i);
            if (bill.getRenter().equalsIgnoreCase(renter) && bill.getDayStart().equalsIgnoreCase(day)) {
                System.out.println("===== Thông tin hóa đơn =====");
                System.out.printf("%-15s%-15s%-15s%-25s%-25s%-25s%-25s%-25s\n",
                        "ID hóa đơn", "Tên phòng", "Người thuê", "Ngày thuê phòng", "Ngày trả phòng", "Tiền thuê phòng",
                        "Nhân viên tạo hóa đơn", "Trạng thái");
                bill.setStatus(!bill.isStatus());
                String status = "Đã thanh toán";

                System.out.printf("%-15s%-15s%-15s%-25s%-25s%-25s%-25s%-25s\n", bill.getIdBIll(), bill.getRoomName(),
                        bill.getRenter(), bill.getDayStart(), bill.getDayEnd(), bill.getPaymentTotal(),
                        bill.getNameEmployee(), status);
                /*editStatus(i,bill);*/
                id = bill.getIdBIll();
            }
            billManage.edit(id, bill);
            roomManage.changeStatusRoom(bill, bill.isStatus());
        }
    }

    public void checkRoomByTime(){
        System.out.println("Tên phòng muốn kiểm tra");
        String roomName = validateBill.checkRoomInput();

        System.out.println("Nhập ngày để kiểm tra");
        String dayCheck1 = validateBill.checkInputDay();
        String[] dayCheck2 = dayCheck1.split("-");

        int size = billManage.getAll().size();
        for (int i = 0; i < size ; i++) {
            Bill bill = billManage.getAll().get(i);
            String dayStart = bill.getDayStart();
            String[] dayStart1 = dayStart.split("-");

            String dayEnd = bill.getDayEnd();
            String[] dayEnd1 = dayEnd.split("-");

            if (bill.getRoomName().equalsIgnoreCase(roomName)){
                if (Integer.parseInt(dayCheck2[0]) >= Integer.parseInt(dayStart1[0]) &&
                        Integer.parseInt(dayCheck2[0]) <= Integer.parseInt(dayEnd1[0]) &&
                        Integer.parseInt(dayCheck2[1]) == Integer.parseInt(dayEnd1[1]) &&
                        Integer.parseInt(dayCheck2[2]) == Integer.parseInt(dayEnd1[2]) ){

                    System.out.printf("%-15s%-15s%-15s\n", "Tên phòng", "Ngày", "Trạng thái");
                    String status = "Có khách thuê";

                    System.out.printf("%-15s%-15s%-15s\n", bill.getRoomName(), dayCheck1, status);

                }
            }else {
                System.out.printf("%-15s%-15s%-15s\n", "Tên phòng", "Ngày", "Trạng thái");
                String status = "Chưa có khách thuê";

                System.out.printf("%-15s%-15s%-15s\n",roomName, dayCheck1, status);
            }
        }

    }

}
