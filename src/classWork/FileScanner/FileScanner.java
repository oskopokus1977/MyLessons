package classWork.FileScanner;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class FileScanner implements MyScanners, Serializable {
    File file;

    public FileScanner(File file) {
        this.file = file;
        ArrayList<String> list = new ArrayList<>();
    }

    @Override
    public int scan(String word) throws FileNotFoundException {
        int count = 0;
        for (File c : file.listFiles()) {
            if (fileIsTXT(c)) {
                if (!c.isDirectory()) {
                    Scanner scanner = new Scanner(c);
                    while (scanner.hasNextLine()) {
                        if (scanner.nextLine().contains(word)) {
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }

    @Override
    public ArrayList<String> scanLine(String word) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        for (File c : file.listFiles()) {
            if (!c.isDirectory()) {
                if (fileIsTXT(c)) {
                    BufferedReader rd = new BufferedReader(new InputStreamReader(new FileInputStream(c)));
                    String s;
                    while ((s = rd.readLine()) != null) {
                        if (s.contains(word)) {
                            list.add(s);
                        }
                    }
                }
            }
        }
        return list;
    }

    public boolean fileIsTXT(File file) {
        return file.getName().endsWith(".txt");
    }
}
