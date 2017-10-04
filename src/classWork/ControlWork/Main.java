package classWork.ControlWork;

import javax.xml.stream.XMLStreamException;
import java.io.IOException;

public class Main {
    public static void main(String[] args)  {
        MyJSONWriter writer = new MyJSONWriter();
        try {
            writer.myJSONWriter();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XMLStreamException e) {
            e.printStackTrace();
        }


    }
}