package homework.BlockingQueue;

import java.io.File;
import java.util.HashMap;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;


public class MyCollections {
   static BlockingQueue<File> blockingQueue = new ArrayBlockingQueue<File>(6);
   static HashMap<String, Integer> map = new HashMap<>();
}