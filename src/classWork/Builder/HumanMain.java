package classWork.Builder;

import java.io.*;

public class HumanMain {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Human human = new Human.Builder()
                .withFirstName("Yurii")
                .withLastName("Kozlov")
                .withSex('m')
                .withAge(40)
                .withCountry("Ukraine")
                .build();




        String patch1 = "C:\\Files\\serial1.ser";
        File file1 = new File(patch1);
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(file1));
        human.writeExternal(outputStream);

        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file1));
        human.readExternal(inputStream);















    }
}
