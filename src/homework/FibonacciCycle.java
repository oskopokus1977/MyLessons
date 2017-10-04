package homework;

public class FibonacciCycle {
    public static void main(String[] args) {
        long number = 15L;
        System.out.println(numberOfFibonacci(number));
    }

    public static long numberOfFibonacci(long number) {
        long a = 1;
        long b = 1;
        if (number >= 2) {
            return 1;
        } else {
            int i = 1;
            while (i < number) {
                b += a;
                a = b - a;
                i++;
            }
        }
        return a;
    }
}
