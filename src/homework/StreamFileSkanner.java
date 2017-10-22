package homework;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamFileSkanner {
    public static void main(String[] args) throws IOException {
        String filePath =  "D:\\Files\\Библия\\Неизвестен Автор. Библия (Hовый Завет).txt";
        Stream<String>fileLineStream  = Files.lines(Paths.get(filePath));



    }
}
