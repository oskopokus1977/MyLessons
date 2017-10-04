package homework;

public class FibonacciRecursion {
    public static void main(String[] args) {
        int number = 50;
        System.out.println(fibonacciNumber(number));
    }

    static int fibonacciNumber(int number) {
        if (number == 1 | number == 2) {
            return 1;
        } else {
            return (fibonacciNumber(number - 1) + fibonacciNumber(number - 2));
        }
    }
}
