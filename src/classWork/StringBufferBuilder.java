package classWork;

import javax.xml.crypto.Data;

public class StringBufferBuilder {
    public static void main(String[] args) {
        String x = "X";
        System.out.println();

        long start2 = System.currentTimeMillis();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 100_000; i++) {
            builder.append(x);
        }
        long end2 = System.currentTimeMillis();
        System.out.println(end2 - start2);
        long start1 = System.currentTimeMillis();
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < 100_000; i++) {
            buffer.append(x);

        }
        long end1 = System.currentTimeMillis();
        System.out.println(end1 - start1);



    }
}
