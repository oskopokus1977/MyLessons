package homework.BlockingQueue;

import java.io.File;

public class MyProducer implements Runnable {

    private File file;

    MyProducer(File file) {
        this.file = file;
    }

    @Override
    public void run() {
        for (File f : file.listFiles()) {
            if (f.isDirectory()) {
                file = new File(f.getPath());
                this.run();
            } else {
                if (f.getName().endsWith(".txt")) {
                    try {
                        MyCollections.blockingQueue.put(f);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
