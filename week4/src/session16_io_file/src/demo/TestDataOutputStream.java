package demo;

import java.io.*;

public class TestDataOutputStream {
    public static void main(String[] args) {
       /* int a[] = {2,3,5,7,11};
        try {
            FileOutputStream fout = new FileOutputStream("Hello.txt");
            DataOutputStream dout = new DataOutputStream(fout);

            for (int i = 0; i < a.length; i++) {
                dout.writeInt(a[i]);
                dout.flush();
            }
        }catch (IOException e){
            e.printStackTrace();
        }*/
        try {
            FileInputStream fin = new FileInputStream("Hello.txt");
            DataInputStream din = new DataInputStream(fin);
            int a;
            while ((a = din.readInt()) != -1) {
                System.out.println(a);
            }
           ;
        }catch (IOException e){
            System.out.println(e);
        }

    }
}
