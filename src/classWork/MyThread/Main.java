package classWork.MyThread;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Class " + Main.class.getName() + " Thread: " + Thread.currentThread().getName());

        Thread thread = new Thread(new MyRunnable());
        thread.start();

        Thread thread2 = new SleepingThread();
        thread2.start();
        thread2.join();
        Thread thread1 = new MyThread();
        thread1.start();

        Thread thread3 = new JoinThread(thread2);
        thread3.start();

    }
}
