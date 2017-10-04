package classWork.FileScanner;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public interface MyScanners {
    int scan(String string) throws FileNotFoundException;
    ArrayList<String> scanLine(String string) throws IOException;

}