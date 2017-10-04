package homework;

public class ChessBoardArray {
    public static void main(String[] args) {
        int arrayLength =100;
        char[][] array = new char[arrayLength][arrayLength];
        long start = System.currentTimeMillis();
        initChessArray(array);
        printChessArray(array);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    public static void initChessArray(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < array.length; j++) {
                    if (j % 2 == 0) {
                        array[i][j] = '*';
                    }
                    else {
                        array[i][j] = ' ';
                    }
                }
            }
            else {
                for (int j = 0; j < array.length; j++) {
                    if (j % 2 == 0) {
                        array[i][j] = ' ';
                    }
                    else {
                        array[i][j] = '*';
                    }
                }
            }
        }
    }

    public static void printChessArray(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}
