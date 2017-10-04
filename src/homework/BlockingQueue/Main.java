package homework.BlockingQueue;

import java.io.File;
import java.util.Map;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        String path1 = "D:\\Files";
        File file1 = new File(path1);
        char c = 'х';

        ExecutorService producerService = Executors.newFixedThreadPool(3);
        producerService.submit(new MyProducer(file1));
        producerService.shutdown();

        TimeUnit.SECONDS.sleep(1);

        ExecutorService consumerService = Executors.newFixedThreadPool(3);
        consumerService.submit(new MyConsumer(c));
        consumerService.shutdown();

        TimeUnit.SECONDS.sleep(1);

        for (Map.Entry<String, Integer> pair : MyCollections.map.entrySet()) {
            System.out.println("В " + pair.getKey() + " буква '" + c + "' повторяется " + pair.getValue() + " раз.");
        }
    }
}
