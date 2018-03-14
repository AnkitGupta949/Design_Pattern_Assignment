package q3;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class MythreadX extends Thread {

    public void run() {

MyFileReader.getInstance().performCalculateInFile();

    }
}





class MythreadY extends Thread{

    public void run(){
          MyFileReader.getInstance().performCalculateInFile();
       }

}


class check{
    public static void main(String[] args) {
        MythreadX thread1=new MythreadX();
        thread1.start();
        thread1.setName("first");

        MythreadY thread2=new MythreadY();
        thread2.start();
        thread2.setName("second");
    }
}
