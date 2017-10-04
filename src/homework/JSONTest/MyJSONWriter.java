package homework.JSONTest;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;

public class MyJSONWriter {
    public static void main(String[] args) {
        String path = "D:\\Юра\\МОИ ДОКУМЕНТЫ\\HILLEL.HOMEWORK\\JavaElementary\\HomeWork\\hillel.homework\\src\\edu\\hillel\\javaElementary\\homework\\JSONTest\\JSONFile.json";
        try (FileWriter writer = new FileWriter(new File(path))) {

            JSONObject people = new JSONObject();
            JSONObject human = new JSONObject();
            JSONArray nameMArr = new JSONArray();
            JSONArray nameWArr = new JSONArray();

            nameMArr.add("Angus Young");
            nameMArr.add("Slash");
            nameMArr.add("Keith Richards");

            nameWArr.add("Brigitte Bardot");
            nameWArr.add("Sophia Loren");
            nameWArr.add("Audrey Hepburn");

            human.put("human Man", nameMArr);
            human.put("human Woman", nameWArr);

            people.put("people", human);
            writer.write(String.valueOf(people));
            writer.close();
            System.out.println(people);

        } catch (IOException e) {
            e.printStackTrace();
        }
        try (FileReader reader = new FileReader(path)) {
            JSONParser parser = new JSONParser();
            JSONObject object = (JSONObject) parser.parse(reader);
            System.out.println(object);

        } catch (ParseException | IOException e) {
            e.printStackTrace();
        }
    }
}
