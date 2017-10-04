package homework;

import java.util.ArrayList;

// Найти в коллекции все пары чисел, сумма которых равна заданному числу
public class SumPairNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        addRandomNumbers(list);
        printList(list);
        sumPairNumbers(list, 10);
        String s = new String("Yura");
        System.out.println(s.substring(0,2));

    }

    public static void addRandomNumbers(ArrayList<Integer> list) {//заплняем сл.числами
        for (int i = 0; i < 10; i++) {
            list.add(i, (int) (Math.random() * 10));
        }
    }

    public static void printList(ArrayList<Integer> list) {//принт для наглядности
        for (Integer aList : list) {
            System.out.print(aList + " ");
        }
        System.out.println();
    }

    public static void sumPairNumbers(ArrayList<Integer> list, int sumValue) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if ((i != j) && (list.get(i) + list.get(j)) == sumValue) {
                    System.out.println(list.get(i) + " + " + list.get(j) + " = " + sumValue);
                    list.set(i, sumValue+1);
                    list.set(j, sumValue+1);//меняем элементы которые уже выпадали - только при положительных числах
                }
            }
        }
    }
}
