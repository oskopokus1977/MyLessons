package classWork.ControlWork;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import javax.xml.stream.XMLStreamException;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


class MyJSONWriter {

    private MyFileScanner scanner = new MyFileScanner();

    void myJSONWriter() throws IOException, XMLStreamException {
        String path = "C:\\МОИ ДОКУМЕНТЫ\\HILLEL.HOMEWORK\\JavaElementary\\HomeWork\\hillel.homework\\src\\edu\\hillel\\javaElementary\\classWork\\ControlWork\\JSONFile.json";
        FileWriter writer = new FileWriter(new File(path));
        scanner.scanLine();
        JSONObject object = new JSONObject();
        JSONArray uppercaseArr = new JSONArray();
        JSONArray lowercaseArr = new JSONArray();

        uppercaseArr.addAll(MyFileScanner.upper);
        lowercaseArr.addAll(MyFileScanner.lower);
        object.put("uppercase", uppercaseArr);
        object.put("lowercase", lowercaseArr);
        writer.write(String.valueOf(object));
        writer.close();
    }
}