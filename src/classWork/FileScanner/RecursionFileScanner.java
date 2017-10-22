package classWork.FileScanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

public class RecursionFileScanner implements MyScanners, Serializable {

    FileScanner scanner;
    int count;
    ArrayList<String> list;

    public RecursionFileScanner(FileScanner scanner) {
        this.scanner = scanner;
        count = 0;
        list = new ArrayList<>();
    }

    @Override
    public int scan(String word) throws FileNotFoundException {
        this.count += scanner.scan(word);
        for (File c : scanner.file.listFiles()) {
            if (c.isDirectory()) {
                scanner.file = new File(c.getPath());
                scan(word);
            }
        }
        return this.count;
    }

//    @Override
//    public ArrayList<String> scanLine(String word) throws IOException {
//        this.list.addAll(scanner.scanLine(word));
//        for (File c : scanner.file.listFiles()) {
//            if (c.isDirectory()) {
//                scanner.file = new File(c.getPath());
//                scanLine(word);
//            }
//        }
//        return this.list;
//    }

    @Override
    public ArrayList<String> scanLine(String word) throws IOException {
        this.list.addAll(scanner.scanLine(word));
        for (File c : scanner.file.listFiles()) {
            if (c.isDirectory()) {
                scanner.file = new File(c.getPath());
                scanLine(word);
            }
        }
        return this.list;
    }
}
