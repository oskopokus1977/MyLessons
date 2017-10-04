package classWork.ControlWork;

import javax.xml.stream.XMLStreamException;
import java.io.*;
import java.util.ArrayList;

public class MyFileScanner {
    static ArrayList<String> upper = new ArrayList<>();
    static ArrayList<String> lower = new ArrayList<>();

    private MyXMLReader reader = new MyXMLReader("C:\\МОИ ДОКУМЕНТЫ\\HILLEL.HOMEWORK\\JavaElementary\\HomeWork\\hillel.homework\\src\\edu\\hillel\\javaElementary\\classWork\\ControlWork\\conf.xml");

    void scanLine() throws IOException, XMLStreamException {

        File file = new File(reader.getPuth());
        for (File c : file.listFiles()) {
           if (!c.isDirectory()) {
                if (fileIsTXT(c)) {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(c)));
                    String s;

                    while ((s = bufferedReader.readLine()) != null) {
                        String[] arr = s.split(" ");
                        for (String a : arr) {
                            if (a.toUpperCase().equals(a)) {
                                upper.add(a);
                            } else {
                                lower.add(a);
                           }
                        }
                    }
                }
            }
        }
    }

    private boolean fileIsTXT(File file) throws FileNotFoundException, XMLStreamException {
        return file.getName().endsWith(reader.getExpansion());
    }
}
