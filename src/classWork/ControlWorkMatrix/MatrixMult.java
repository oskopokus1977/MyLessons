package classWork.ControlWorkMatrix;

public class MatrixMult {
    private int[][] matrix1;
    private int[][] matrix2;


    public MatrixMult(int[][] matrix1, int[][] matrix2) {
        this.matrix1 = matrix1;
        this.matrix2 = matrix2;
    }

    public int[][] matrixMultiplication() {
        int[][]newMatrix = new int[Main.matrixSize][Main.matrixSize];
        for (int i = 0; i < MyMatrix.matrix.length; i++) {
            for (int j = 0; j < MyMatrix.matrix.length; j++) {
                for (int y = 0; y < MyMatrix.matrix.length; y++) {
                   newMatrix[i][j] += matrix1[i][y] * matrix2[y][j];
                }
            }
        }
        return newMatrix;
    }
}
