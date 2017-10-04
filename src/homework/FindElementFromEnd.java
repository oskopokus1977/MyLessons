package homework;

import java.util.Iterator;

public class FindElementFromEnd {
    Iterator<Integer> iterator;

    public FindElementFromEnd(Iterator<Integer> iterator) {
        this.iterator = iterator;
    }

    public int getThirdElementFromTheEnd() {
        iterator.next();
        return 0;
    }
}
