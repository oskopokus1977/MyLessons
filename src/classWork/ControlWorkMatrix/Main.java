package classWork.ControlWorkMatrix;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    static int matrixSize = 1000;

    public static void main(String[] args) throws InterruptedException {
        int[][] matrix1 = new MatrixInit(matrixSize).initMatrix();
        int[][] matrix2 = new MatrixInit(matrixSize).initMatrix();


        long timeStart = System.nanoTime();
        int[][] newMatrix = new MatrixMult(matrix1, matrix2).matrixMultiplication();
        long timeStop = System.nanoTime();


        long timeThreadStart = System.nanoTime();
        Thread thread1 = new MatrixMultThread(matrix1, matrix2,0,249);
        Thread thread2 = new MatrixMultThread(matrix1, matrix2,250,499);
        Thread thread3 = new MatrixMultThread(matrix1, matrix2,500,749);
        Thread thread4 = new MatrixMultThread(matrix1, matrix2,750,999);
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread1.join();
        thread2.join();
        thread3.join();
        thread4.join();
        long timeThreadStop =  System.nanoTime();


       Thread.sleep(100);
//        printMatrix(newMatrix);
//        System.out.println();
//        printMatrix(MyMatrix.threadMatrix);
        System.out.println("SynglThread - "+(timeStop-timeStart)+"\nMultyThread - "+(timeThreadStop-timeThreadStart));

    }
        public static void printMatrix( int[][] matrix) {
            System.out.println();
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix.length; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }

    }







