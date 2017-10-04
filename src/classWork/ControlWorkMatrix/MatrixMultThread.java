package classWork.ControlWorkMatrix;

public class MatrixMultThread extends Thread {
    private int[][] matrix1;
    private int[][] matrix2;
    int start;
    int stop;


    public MatrixMultThread(int[][] matrix1, int[][] matrix2, int start, int stop) {
        this.matrix1 = matrix1;
        this.matrix2 = matrix2;
        this.start = start;
        this.stop = stop;
    }

    @Override
    public void run() {
        for (int i = start; i <= stop; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                int rezult = 0;
                for (int y = 0; y < matrix2.length; y++) {
                    rezult += matrix1[i][y] * matrix2[y][j];
                }
                MyMatrix.threadMatrix[i][j] = rezult;
            }
        }
    }
}
