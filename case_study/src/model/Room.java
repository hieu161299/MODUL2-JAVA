package model;

public class Room {
    private String name ;
    private String price;
    private boolean status;
    private String bathRoom;
    private String bedRoom;

    public Room() {
    }

    public Room(String name, String price, boolean status, String bathRoom, String bedRoom) {
        this.name = name;
        this.price = price;
        this.status = status;
        this.bathRoom = bathRoom;
        this.bedRoom = bedRoom;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getBathRoom() {
        return bathRoom;
    }

    public void setBathRoom(String bathRoom) {
        this.bathRoom = bathRoom;
    }

    public String getBedRoom() {
        return bedRoom;
    }

    public void setBedRoom(String bedRoom) {
        this.bedRoom = bedRoom;
    }

    @Override
    public String toString() {
        return "MenuRoom{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", status=" + status +
                ", bathRoom='" + bathRoom + '\'' +
                ", bedRoom='" + bedRoom + '\'' +
                '}';
    }
}
