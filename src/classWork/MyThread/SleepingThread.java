package classWork.MyThread;

public class SleepingThread extends Thread{
    @Override
   public void run(){
        try {
            sleep(5000);
            System.out.println("Class " + this.getClass().getName() + " Thread: " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
