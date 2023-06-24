package demo.interface_manageAnimal.animal;

public class Cat extends Animal{
    private String catType;
    private boolean isSick;

    public Cat() {
    }

    public Cat(int id, String name, int birth, String catType, boolean isSick) {
        super(id, name, birth);
        this.catType = catType;
        this.isSick = isSick;
    }

    public String getCatType() {
        return catType;
    }

    public void setCatType(String catType) {
        this.catType = catType;
    }

    public boolean isSick() {
        return isSick;
    }

    public void setSick(boolean sick) {
        isSick = sick;
    }
    @Override
    public String toString() {
        return "Cat id : " + super.getId()+" tên: "+super.getName() + " loại: " + this.catType +
                " tình tạng : " + this.isSick;
    }
}
