package classWork;

import java.io.*;

public class InputStreamFile  {
     public static void main(String[] args) throws IOException {
        String pathToFile = "C:/МОИ ДОКУМЕНТЫ/HILLEL.HOMEWORK/JavaElementary/Files/text.txt";
        File text = new File(pathToFile);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter file = new BufferedWriter(new FileWriter(text));

         while (true) {
             String s = reader.readLine();
             if (s.equals(" ")) {
                 file.close();
                 break;
             } else {
                file.write(s+"\r\n");
                file.flush();
             }
         }
     }
}
