package classWork.JSON;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.FileReader;
import java.io.IOException;


public class JSParser {
    public static void main(String[] args) {
        String path = "D:\\MyLessons\\src\\classWork\\JSON\\studentWrit.json";
        try (FileReader reader = new FileReader(path)) {
            JSONParser parser = new JSONParser();
            JSONObject object = (JSONObject) parser.parse(reader);
            System.out.println(object.toString());
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }


}
