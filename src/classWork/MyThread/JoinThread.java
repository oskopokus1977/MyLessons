package classWork.MyThread;

public class JoinThread extends Thread{
    Thread thread;

    public JoinThread(Thread thread){
        this.thread = thread;
    }
    @Override
    public void run(){
        try {
            this.thread.join();
            System.out.println("Class " + this.getClass().getName() + " Thread: " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
