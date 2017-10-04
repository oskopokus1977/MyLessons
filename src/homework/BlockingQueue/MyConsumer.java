package homework.BlockingQueue;

import java.io.*;

public class MyConsumer implements Runnable {
    private char c;

    MyConsumer(char c) {
        this.c = c;
    }

    @Override
    public void run() {
        int count = 0;
        if (!MyCollections.blockingQueue.isEmpty()) {
            try {
                File file = MyCollections.blockingQueue.take();
                BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
                String s;
                while ((s = reader.readLine()) != null) {
                    char[] arr = s.toCharArray();
                    for (Character d : arr) {
                        if (d == c) {
                            count++;
                        }
                    }
                }
                MyCollections.map.put(file.getName(), count);
                this.run();
            } catch (InterruptedException | IOException e) {
                e.printStackTrace();
            }
        }
    }
}