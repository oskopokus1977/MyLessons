package homework.MyThread;

import java.util.concurrent.locks.ReentrantLock;

public class Increment {

    private int count;
   // private final Object lock = new Object();
    private ReentrantLock lock = new ReentrantLock();

    public  void countIncrement() {

        //synchronized (this.lock) {
            //this.count++;
            //System.out.print(this.count + " ");
        //}

        this.lock.lock();
        try {
            this.count++;
        } finally {
            this.lock.unlock();
        }
    }

    public int getCount() {
        return this.count;
    }
}
