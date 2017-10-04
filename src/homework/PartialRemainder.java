package homework;

//Найти частное и остаток от деления двух чисел используя только сложение и вычитание.
public class PartialRemainder {
    public static void main(String args[]) {
        int numberOne = 7;
        int numberTwo = 23;
        partialRemainder(numberOne, numberTwo);
    }

    static void partialRemainder(int x, int y) {
        x = Math.abs(x);
        y = Math.abs(y);
        int partial = 0;
        if (x > y) {
            while (x >= y) {
                x -= y;
                partial++;
            }
            System.out.println(partial + " " + x);
        } else if (y > x) {
            while (y >= x) {
                y -= x;
                partial++;
            }
            System.out.println(partial + " " + y);
        }
    }
}
