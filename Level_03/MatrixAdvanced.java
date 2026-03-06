package Level_03;
import java.util.Random;
import java.util.Arrays;

public class MatrixAdvanced {

    // Generate random matrix
    public static double[][] randomMatrix(int rows, int cols) {
        Random rand = new Random();
        double[][] m = new double[rows][cols];
        for(int i=0;i<rows;i++)
            for(int j=0;j<cols;j++)
                m[i][j] = rand.nextInt(10);
        return m;
    }

    // Transpose
    public static double[][] transpose(double[][] m) {
        int rows = m.length, cols = m[0].length;
        double[][] t = new double[cols][rows];
        for(int i=0;i<rows;i++)
            for(int j=0;j<cols;j++)
                t[j][i] = m[i][j];
        return t;
    }

    // Determinant 2x2
    public static double determinant2x2(double[][] m) {
        return m[0][0]*m[1][1] - m[0][1]*m[1][0];
    }

    // Determinant 3x3
    public static double determinant3x3(double[][] m) {
        return m[0][0]*(m[1][1]*m[2][2]-m[1][2]*m[2][1])
             - m[0][1]*(m[1][0]*m[2][2]-m[1][2]*m[2][0])
             + m[0][2]*(m[1][0]*m[2][1]-m[1][1]*m[2][0]);
    }

    // Inverse 2x2
    public static double[][] inverse2x2(double[][] m) {
        double det = determinant2x2(m);
        if(det==0) return null;
        return new double[][] {
            { m[1][1]/det, -m[0][1]/det },
            { -m[1][0]/det, m[0][0]/det }
        };
    }

    // Display matrix
    public static void displayMatrix(double[][] m) {
        if(m==null){ System.out.println("Inverse doesn't exist"); return; }
        for(double[] row : m) System.out.println(Arrays.toString(row));
        System.out.println();
    }

    public static void main(String[] args) {
        double[][] A = randomMatrix(2,2);
        System.out.println("Matrix A:");
        displayMatrix(A);

        System.out.println("Transpose of A:");
        displayMatrix(transpose(A));

        System.out.println("Determinant of A: " + determinant2x2(A));

        System.out.println("Inverse of A:");
        displayMatrix(inverse2x2(A));

        double[][] B = randomMatrix(3,3);
        System.out.println("Matrix B (3x3):");
        displayMatrix(B);

        System.out.println("Determinant of B: " + determinant3x3(B));
    }
}