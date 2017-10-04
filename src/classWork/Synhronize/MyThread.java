package classWork.Synhronize;

import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread extends Thread {
    private String s;
    private Set set;
    private final Object lock = new Object();
    //ReentrantLock lock = new ReentrantLock();

    public MyThread(String s, Set set) {
        this.s = s;
        this.set = set;
    }

    @Override
    public void run() {
        synchronized (this.lock) {
            String[] arr = s.split(" ");
            set.addAll(Arrays.asList(arr));
        }
    }
}

//    @Override
//    public  void run() {
//        this.lock.lock();
//        try {
//            String[] arr = s.split(" ");
//            set.addAll(Arrays.asList(arr));
//        }
//        finally {
//            this.lock.unlock();
//        }
//  }

