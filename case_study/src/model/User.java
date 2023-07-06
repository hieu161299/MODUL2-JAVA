package model;

public class User {
    private String userName;  // tên đăng nhập
    private String pwd; // mật khẩu
    private String phone;
    private String address;
    private String email;
    private String name; // tên người sử dụng tài khoản
    private String age;

    public User(String userName, String pwd) {
        this.userName = userName;
        this.pwd = pwd;
    }

    public User(String userName, String pwd, String phone, String address, String email, String name, String age) {
        this.userName = userName;
        this.pwd = pwd;
        this.phone = phone;
        this.address = address;
        this.email = email;
        this.name = name;
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "name " + name + "\n" +
                "userName " + userName + "\n" +
                "age " + age + "\n" +
                "phone " + phone ;
    }
}
