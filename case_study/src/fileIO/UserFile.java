package fileIO;

import model.User;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UserFile {
    public void writeUserFile(List<User> userList) throws IOException {

        String data = "";
        for (User user: userList) {
            data += user.getUserName() + "," + user.getPwd() + "," + user.getPhone() + "," + user.getAddress() + ","
                    + user.getEmail() + "," + user.getName() + "," + user.getAge() + "\n" ;
        }

        FileWriter fileWriter = new FileWriter("G:\\MODULE2 - JAVA\\case_study\\src\\model_file\\user.csv");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        bufferedWriter.write(data);
        bufferedWriter.close();

    }
    public List<User> readUserFile() throws IOException {
        List<User> userArrayList = new ArrayList<>();
        FileReader fileReader = new FileReader("G:\\MODULE2 - JAVA\\case_study\\src\\model_file\\user.csv");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line = null;
        while ((line = bufferedReader.readLine()) != null){
            String[] data = line.split(",");
            userArrayList.add(new User(data[0],data[1],data[2],data[3],data[4],data[5],data[6]));
        }
        return userArrayList;
    }

}
