package homework;//Вывести все цифры числа (не менее 6-значного) не используя строки и циклы (только рекурсия и арифметика)

public class RecursionNumeralNumber {
    public static void main(String[] args) {
        int left = -10000000;
        int right = 10000000;
        int number = (int) (Math.random() * (right - left) + left);
        System.out.println(number);
        printNumeralOfNumber(number);
    }

    static void printNumeralOfNumber(int number) {
        if (number != 0) {
            System.out.print((number % 10) + ", ");
            printNumeralOfNumber(number / 10);
        }
    }
}
