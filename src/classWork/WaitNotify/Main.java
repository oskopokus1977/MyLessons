package classWork.WaitNotify;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        MyThread thread = new MyThread("TIK");
        thread.start();

        MyThread thread1 = new MyThread("TAK");
        thread1.start();
    }
}
