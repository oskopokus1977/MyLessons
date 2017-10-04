package homework.MyThread;

public class MyThread extends Thread {
    private Increment increment;

    public MyThread(Increment increment){
        this.increment = increment;
    }

    @Override
    public void run() {
        try {
            sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 100; i++) {
            increment.countIncrement();
            System.out.print(increment.getCount()+" ");
        }
    }
}
