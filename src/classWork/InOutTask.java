package classWork;

import java.io.*;
import java.util.ArrayList;
import java.util.Stack;

public class InOutTask {
    public static void main(String[] args) throws IOException {
        String patchToFile = "C:/МОИ ДОКУМЕНТЫ/HILLEL.HOMEWORK/JavaElementary/Files/stack.txt";
        File stack = new File(patchToFile);
        BufferedWriter file = new BufferedWriter(new FileWriter(stack));
        file.write("Tinker, Tailor,\r\n");
        file.write("Solider, Sailor,\r\n");
        file.write("Rich Man, Por Man,\r\n");
        file.write("Begger Man, Thief,\r\n");
        file.close();

        BufferedReader reader = new BufferedReader(new FileReader(stack));
        ArrayList<String> list = new ArrayList<>();
        String c;
        while ((c = reader.readLine()) != null) {
            list.add(c);
        }
        list.add(2, "XXXXXXXXXXXXXXXXXXXXXXXXXXX");

        BufferedWriter file1 = new BufferedWriter(new FileWriter(stack));
        for (String aList : list) {
            file1.write(aList);
            file1.newLine();
        }
        file1.close();



//        Stack<String> st = new Stack<>();
//        String c;
//        while ((c = reader.readLine()) != null) {
//            st.push(c);
//        }
//
//        while (!st.empty()) {
//            System.out.println(st.pop());
//        }
    }
}
