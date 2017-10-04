package classWork.ClassWorkRunneble;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class MyThread extends Thread {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    @Override
    public void run() {
        try {
            System.out.println(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
