package Level_03;
import java.util.Random;
import java.util.Arrays;

public class MatrixOperations {

    // Generate random matrix
    public static int[][] randomMatrix(int rows, int cols) {
        Random rand = new Random();
        int[][] matrix = new int[rows][cols];
        for(int i=0;i<rows;i++)
            for(int j=0;j<cols;j++)
                matrix[i][j] = rand.nextInt(10); // 0-9
        return matrix;
    }

    // Add two matrices
    public static int[][] addMatrices(int[][] a, int[][] b) {
        int rows = a.length, cols = a[0].length;
        int[][] res = new int[rows][cols];
        for(int i=0;i<rows;i++)
            for(int j=0;j<cols;j++)
                res[i][j] = a[i][j] + b[i][j];
        return res;
    }

    // Subtract two matrices
    public static int[][] subtractMatrices(int[][] a, int[][] b) {
        int rows = a.length, cols = a[0].length;
        int[][] res = new int[rows][cols];
        for(int i=0;i<rows;i++)
            for(int j=0;j<cols;j++)
                res[i][j] = a[i][j] - b[i][j];
        return res;
    }

    // Multiply two matrices
    public static int[][] multiplyMatrices(int[][] a, int[][] b) {
        int rows = a.length, cols = b[0].length, common = b.length;
        int[][] res = new int[rows][cols];
        for(int i=0;i<rows;i++)
            for(int j=0;j<cols;j++)
                for(int k=0;k<common;k++)
                    res[i][j] += a[i][k]*b[k][j];
        return res;
    }

    // Display matrix
    public static void displayMatrix(int[][] m) {
        for(int[] row : m) System.out.println(Arrays.toString(row));
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] A = randomMatrix(2,2);
        int[][] B = randomMatrix(2,2);

        System.out.println("Matrix A:");
        displayMatrix(A);

        System.out.println("Matrix B:");
        displayMatrix(B);

        System.out.println("A + B:");
        displayMatrix(addMatrices(A,B));

        System.out.println("A - B:");
        displayMatrix(subtractMatrices(A,B));

        System.out.println("A * B:");
        displayMatrix(multiplyMatrices(A,B));
    }
}