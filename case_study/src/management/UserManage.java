package management;

import fileIO.UserFile;
import management.iManagement.Management;
import model.User;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UserManage implements Management<User> {
    List<User> userList = null;
    private UserFile userFile = new UserFile();

    public UserManage() {
        try {
            userList = userFile.readUserFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void add(User user) {
        userList.add(user);
        try {
            userFile.writeUserFile(userList);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void edit(int index, User user) {

    }

    @Override
    public void delete(int index) {

    }
    @Override
    public List<User> getAll() {
        try {
            return this.userFile.readUserFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public int findIndex(String userName) {
        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i).getUserName().equals(userName)) {
                return i;
            }
        }
        return -1;
    }
}
