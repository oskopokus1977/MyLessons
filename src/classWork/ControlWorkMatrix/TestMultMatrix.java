package classWork.ControlWorkMatrix;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;


public class TestMultMatrix {


    @Test
    public void matrixMultRezult() {
        Main.matrixSize = 3;
        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix2 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
        int[][] rezult = {{30, 24, 18}, {84, 69, 54}, {138, 114, 90}};

        int[][] rezultTest =new MatrixMult(matrix1, matrix2).matrixMultiplication();

        Assert.assertArrayEquals(rezultTest, rezult);
    }

    @Test
    public void matrixMultRezultThread() throws InterruptedException {
        Main.matrixSize = 3;
        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix2 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
        int[][] rezult = {{30, 24, 18}, {84, 69, 54}, {138, 114, 90}};

        Thread thread = new MatrixMultThread(matrix1, matrix2, 0, 2);
        thread.start();
        thread.join();
        int[][] rezultTest = MyMatrix.threadMatrix;
        thread.interrupt();

        Assert.assertArrayEquals(rezultTest, rezult);
    }

    @Test
    public void compareMatrix() throws InterruptedException{
        Main.matrixSize = 3;
        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix2 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};

        int[][] rezultMatrixMult =new MatrixMult(matrix1, matrix2).matrixMultiplication();

        Thread thread = new MatrixMultThread(matrix1, matrix2, 0, 2);
        thread.start();
        thread.join();

        int[][] rezultMatrixMultThread = MyMatrix.threadMatrix;
        thread.interrupt();

        Assert.assertTrue(Arrays.deepEquals(rezultMatrixMult,rezultMatrixMultThread));
    }

    @Test
    public void compareMultTime() throws  InterruptedException{

        Main.matrixSize = 600;
        int[][] matrix1 = new MatrixInit(Main.matrixSize).initMatrix();
        int[][] matrix2 = new MatrixInit(Main.matrixSize).initMatrix();

        long start = System.currentTimeMillis();
        int[][] rezultMatrixMult = new MatrixMult(matrix1, matrix2).matrixMultiplication();
        long end = System.currentTimeMillis();
        System.out.println(end-start);
        //TimeUnit.SECONDS.sleep(1);
        long startThread = System.currentTimeMillis();
        Thread thread1 = new MatrixMultThread(matrix1, matrix2, 0, 199);
        Thread thread2 = new MatrixMultThread(matrix1, matrix2, 200, 399);
        Thread thread3 = new MatrixMultThread(matrix1, matrix2, 400, 599);
        thread1.start();
        thread2.start();
        thread3.start();
        thread1.join();
        thread2.join();
        thread3.join();
        long endThread = System.currentTimeMillis();
        System.out.println(endThread - startThread);

        Assert.assertTrue((end-start)>(endThread - startThread));
    }
}
