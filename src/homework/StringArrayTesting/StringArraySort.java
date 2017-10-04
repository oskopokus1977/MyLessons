package homework.StringArrayTesting;

import java.util.*;

public class StringArraySort {

    public List<String> arraySort(List<String> array) {
        List<String> arrayNew = new ArrayList<>(array);
        Collections.sort(arrayNew, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        return arrayNew;
    }
}
