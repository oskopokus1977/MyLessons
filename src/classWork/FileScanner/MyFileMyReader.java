package classWork.FileScanner;

import java.io.*;

public class MyFileMyReader implements MyReader, Serializable {
    File file;
    BufferedReader bufferedReader;

    public MyFileMyReader(File file) throws FileNotFoundException {
        this.file = file;
        bufferedReader = new BufferedReader(new FileReader(file));
    }

    @Override
    public String read() throws IOException {
        return bufferedReader.readLine();
    }
}
