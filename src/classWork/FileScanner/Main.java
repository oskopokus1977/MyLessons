package classWork.FileScanner;

import org.w3c.dom.NodeList;

import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {



        String patch = "D:\\Files\\";
        File file = new File(patch);
        MyReader reader = new ConsolMyReader();

        ArrayList<String> list = new ArrayList<>();

        while (true) {
            String inputString = reader.read();
            if (inputString.equals("exit")) {
                break;
            } else {
                MyScanners sc = new RecursionFileScanner(new FileScanner(file));
                list.addAll(sc.scanLine(inputString));
            }
        }
        System.out.println(list);
//        String patch1 = "D:\\Files\\serialSuper.ser";
//        File file1 = new File(patch1);
//
//        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(file1));
//        outputStream.writeObject(list);
//        outputStream.close();
//
//        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file1));
//        ArrayList listReturn = (ArrayList) inputStream.readObject();
//        System.out.println(listReturn.toString());
    }
}




