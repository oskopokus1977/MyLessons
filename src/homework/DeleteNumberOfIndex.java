package homework;

import java.util.Arrays;

// Дан массив чисел. Написать метод, который удаляет число с конкретным индексом и возвращает новый массив без этого числа.

public class DeleteNumberOfIndex {

    public static void main(String[] args) {
        int[] array = {1, 0, 9, 2, 8, 3, 7, 4, 7, 5};
        System.out.println(Arrays.toString(arrayDelNumber(array, 6)));
    }

    static int[] arrayDelNumber(int[] array, int index) {
        int[] arrayTwo = new int[array.length - 1];
        if (index >= 0 && index <= array.length - 1) {
            System.arraycopy(array, 0, arrayTwo, 0, index);
            System.arraycopy(array, index + 1, arrayTwo, index, array.length - index - 1);
        } else {
            System.out.println("Non-existent index!");
        }
        return arrayTwo;
    }
}
