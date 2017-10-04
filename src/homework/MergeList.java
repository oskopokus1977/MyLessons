package edu.hillel.javaElementary.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//написать метод слияния двух списков по следующему правилу:
// 1й элемент первого списка
// 1й эемент второго списка
// 2й элемент первого списка
// 2й эемент второго списка
public class MergeList {

    public static void main(String[] args) {

        List<Integer> listOne = Arrays.asList(0, 2, 4, 6, 8, 10, 12, 14, 16, 18);
        List<Integer> listTwo = Arrays.asList(1, 3, 5, 7, 9);

        System.out.println(mergeList(listOne, listTwo));
    }

    public static List<Integer> mergeList(List<Integer> a, List<Integer> b) {

        List<Integer> list = new ArrayList<>();

        int i = 0;
        while (i < a.size() && i < b.size()) {
            list.add(a.get(i));
            list.add(b.get(i));
            i++;
        }

        if (a.size() < b.size()) {
            while (i < b.size()) {
                list.add(b.get(i));
                i++;
            }
        } else {
            while (i < a.size()) {
                list.add(a.get(i));
                i++;
            }
        }
        return list;
    }
}

