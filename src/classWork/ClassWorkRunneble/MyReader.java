package classWork.ClassWorkRunneble;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyReader {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

     String mYreadLine() throws IOException {
       return reader.readLine();
    }
     void mYreadLineClose() throws IOException {
         reader.close();
     }

}
