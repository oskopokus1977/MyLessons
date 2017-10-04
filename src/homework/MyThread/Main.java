package homework.MyThread;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Increment increment = new Increment();

        Thread t1 = new MyThread(increment);
        Thread t2 = new MyThread(increment);
        t1.start();
        t2.start();
        Thread.sleep(4000);



    }
}
