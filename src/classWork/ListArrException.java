package classWork;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListArrException<T> {

    ArrayList<T> list = new ArrayList<T>(5);

    public ListArrException() {
    }

    public void add(T x) {
        if (list.size() < 5) {
            list.add(x);
        } else {
            list.remove(0);
            list.add(x);
        }
    }

    public ArrayList<T> get() throws ArrListIsEmptyException {
        if (list.isEmpty()) throw new ArrListIsEmptyException("List is empty");
        return list;
    }


    public static class ArrListIsEmptyException extends Exception {

        public ArrListIsEmptyException(String massage) {
            super(massage);
        }
    }

    public static class Main {

        public static void main(String[] args) throws Exception {
            ListArrException<Integer> s = new ListArrException<>();
//            for (int i = 0; i < 100; i++){
//                s.add(i);
//            }
            try {
                System.out.println(s.get());
            } catch (ArrListIsEmptyException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
