package homework;

//Написать программу, которая будет считать n-ный элемент последовательности Трибоначчи (каждый следующий элемент - сумма трех предыдущих).
// И циклом, и рекурсивно. Сравнить быстродействие.
public class TribonacciTime {
    public static void main(String[] args) {
      // System.out.print("");
        int number = 25;

        long startCycle = System.currentTimeMillis();
        System.out.println(tribonacciCycle(number));
        long finishCycle = System.currentTimeMillis();
        System.out.println("tribonacciCycle time = " + (finishCycle - startCycle));

        long startRecursion = System.currentTimeMillis();
        System.out.println(tribonacciRecursion(number));
        long finishRecursion = System.currentTimeMillis();
        System.out.println("tribonacciRecursion time = " + (finishRecursion - startRecursion));


    }

    static long tribonacciCycle(int number) {
        if (number <= 3) {
            return number;
        } else {
            long a = 1L, b = 2L, c = 3L;
            while (number != 1) {
                c += a + b;
                b = c - a - b;
                a = c - b - a;
                number--;
            }
            return a;
        }
    }

    static long tribonacciRecursion(int number) {
        if (number <= 3) {
            return number;
        } else {
            return tribonacciRecursion(number - 1) + tribonacciRecursion(number - 2) + tribonacciRecursion(number - 3);
        }
    }
}
