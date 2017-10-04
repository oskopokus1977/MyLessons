package homework;

import java.util.ArrayList;
import java.util.List;

public class ReversList {
    public static void main(String[] args) {

        List<Integer> original = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            original.add(i);
        }
        System.out.println(original);

        ReversList reversList = new ReversList();
        List<Integer> reversed = reversList.reverse(original);
        System.out.println(reversed);

    }

    public List<Integer> reverse(List<Integer> original) {
        List<Integer> arr = new ArrayList<>(original.size());
        for (int i = 0, y = original.size() - 1; i < original.size(); i++, y--) {
            arr.add(i, original.get(y));
        }
        return arr;
    }
}
