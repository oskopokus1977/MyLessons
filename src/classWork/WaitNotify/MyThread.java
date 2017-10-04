package classWork.WaitNotify;

import java.util.concurrent.TimeUnit;

public class MyThread extends Thread {
    private String s;
    private static final Object lock = new Object();

    public MyThread(String s) {
        this.s = s;
    }

    @Override
    public void run() {
        synchronized (lock) {
            for (int i = 0; i < 5; i++) {
                try {
                    TimeUnit.SECONDS.sleep(1);
                    System.out.println(s);
                    lock.notify();
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            lock.notifyAll();
        }
    }
}
