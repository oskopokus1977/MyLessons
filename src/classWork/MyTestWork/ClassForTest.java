package classWork.MyTestWork;

import java.util.ArrayList;
import java.util.List;

public class ClassForTest {
    public List<Integer> lengthList(List<String> list) {
        List<Integer> length = new ArrayList<>();

        for (String s : list) {
            length.add(s.length());
        }
        return length;
    }
}
