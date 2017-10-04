package homework;

import java.io.*;

public class BufferFileReaderTime {
    public static void main(String[] args) throws IOException {
        String pathToFile = "C:/МОИ ДОКУМЕНТЫ/HILLEL.HOMEWORK/JavaElementary/Files/textTime.txt";
        File textTime = new File(pathToFile);
        BufferedWriter file = new BufferedWriter(new FileWriter(textTime, false));

        System.out.println();
        for (int i = 0; i < 20; i++) {
            file.append('x');
            file.flush();
        }

        FileReader fileReader = new FileReader(textTime);
        long StartFileReader = System.nanoTime();
        while ((fileReader.read()) != -1) {
        }
        long EndFileReader = System.nanoTime();

        System.out.println();

        BufferedReader bufferedReader = new BufferedReader(new FileReader(textTime));
        long StartBufferedReader = System.nanoTime();
        while ((bufferedReader.read()) != -1) {
        }
        long EndBufferedReader = System.nanoTime();

        System.out.println((EndFileReader - StartFileReader) + "-FileReader\n"
                + (EndBufferedReader - StartBufferedReader) + "-BufferedReader");


    }
}
