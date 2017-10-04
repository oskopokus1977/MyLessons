package classWork.WaitNotify;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        MyThread thread = new MyThread("TIK");
        thread.start();
       // TimeUnit.SECONDS.sleep(1);
        MyThread thread1 = new MyThread("TAK");
        thread1.start();
    }
}
