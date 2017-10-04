package homework;

import java.io.File;

public class FileSystem {
    public static void main(String[] args) {
        File file = new File("C:\\Files\\");
        getCatalog(file);

    }

    static void getCatalog(File file) {
               for (File c : file.listFiles()) {
                if (c.isDirectory()) {
                    System.out.println("" + c.getName());
                    getCatalog(c);
                } else {
                    System.out.println("          " + c.getName());
                }
            }
        }
//        else {
//            System.out.println(file.getName());
//        }

}
