package homework;

public class LongElement {
    public static void main(String[] args) {

        int maxValueLength = 0;
        int maxValueIndex = 0;

        for (int i = 0; i < args.length; i++) {
            if (args[i].length() > maxValueLength) {
                maxValueLength = args[i].length();
                maxValueIndex = i;
            }
        }

        String maxValue = args[maxValueIndex];
        System.out.println(maxValue);

    }
}
