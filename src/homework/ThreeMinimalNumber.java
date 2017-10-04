package homework;

import java.util.Arrays;

// Дан массив целых чисел (несортированный, с повторами).
// Найти три наименьших числа в нем. Возвращать массив размером 3 с этими числами.
public class ThreeMinimalNumber {

    public static void main(String[] args) {

        int[] arrayNumber = {1, 9, 4, -5, 0, 23, -4, 11, 0, -9, 9, 4, -9};
        System.out.println(Arrays.toString(arrMinNum(arrayNumber)));
    }

    static int[] arrMinNum(int[] arrayNumber) {

        int[] arrayNumberClone = arrayNumber.clone();
        Arrays.sort(arrayNumberClone);
        int[] arrayMinNumber = new int[3];
        for (int i = 0; i < arrayMinNumber.length; i++) {
            arrayMinNumber[i] = arrayNumberClone[i];
        }
        return arrayMinNumber;
    }
}
