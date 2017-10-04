package homework;

public class FibonacciRecursionSum {
    private static int[] fibonacciArray;

    public static void main(String[] args) {
        int arrayLength = 20;
        fibonacciArray = new int[arrayLength];
        initFibArray(fibonacciArray);
        printArray(fibonacciArray);
        System.out.println(sumFibonacciArray(6));


    }

    private static int[] initFibArray(int[] fibonacciArray) {
        fibonacciArray[0] = 1;
        fibonacciArray[1] = 1;
        for (int i = 2; i < fibonacciArray.length; i++) {
            fibonacciArray[i] = fibonacciArray[i - 1] + fibonacciArray[i - 2];
        }
        return fibonacciArray;
    }

    private static void printArray(int[] array) {
        for (int anArray : array) {
            System.out.print(anArray + " ");
        }
        System.out.println();
    }

    private static int sumFibonacciArray(int i) {
        int sum = 0;
        if (i != 0) {
            return sumFibonacciArray(--i) + fibonacciArray[i];
        } else {
            return sum;
        }
    }
}
