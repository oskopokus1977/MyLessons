package classWork.MyThread;

public class MyThread extends Thread{

    @Override
    public void run(){
        System.out.println("Class " + this.getClass().getName() + " Thread: " + Thread.currentThread().getName());
    }
}
