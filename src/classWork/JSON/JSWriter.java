package classWork.JSON;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.*;

public class JSWriter {
    public static void main(String[] args) {
        String patch = "C:\\МОИ ДОКУМЕНТЫ\\HILLEL.HOMEWORK\\JavaElementary\\HomeWork\\hillel.homework\\src\\edu\\hillel\\javaElementary\\classWork\\JSON\\studentWrit.json";
        try (FileWriter writer = new FileWriter(new File(patch))) {

            JSONObject student = new JSONObject();
            student.put("id", 55);
            student.put("firstName", "Vasiliy");
            student.put("lastName", "Zaycev");
            student.put("data", "1988 08 31");

            JSONObject object = new JSONObject();
            object.put("student", student);
            writer.write(String.valueOf(object));

        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileReader reader = new FileReader(patch)) {
            JSONParser parser = new JSONParser();
            JSONObject object = (JSONObject) parser.parse(reader);
            System.out.println(object.toString());

        } catch (ParseException | IOException e) {
            e.printStackTrace();
        }
    }


}
