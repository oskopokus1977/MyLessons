package classWork.ClassWorkRunneble;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws InterruptedException, IOException {
        System.out.print("Hello ");

        Thread myThread = new MyThread();
        myThread.start();
        try {
            myThread.join(3000);
            if (myThread.isAlive()) {
                myThread.interrupt();
                System.out.println("Time is out");
            } else {
                System.out.println("Good Day!!!");
            }
        } catch (InterruptedException e) {
        }
    }
}
