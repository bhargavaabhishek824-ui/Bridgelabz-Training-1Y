package Level_03;
import java.util.Scanner;

public class CollinearPoints {

    // Check collinear using slope method
    public static boolean areCollinearSlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        // Calculate slopes (handle vertical line cases to avoid division by zero)
        double slopeAB = (x2 - x1) != 0 ? (double)(y2 - y1) / (x2 - x1) : Double.POSITIVE_INFINITY;
        double slopeBC = (x3 - x2) != 0 ? (double)(y3 - y2) / (x3 - x2) : Double.POSITIVE_INFINITY;
        double slopeAC = (x3 - x1) != 0 ? (double)(y3 - y1) / (x3 - x1) : Double.POSITIVE_INFINITY;

        return slopeAB == slopeBC && slopeBC == slopeAC;
    }

    // Check collinear using area of triangle method
    public static boolean areCollinearArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        double area = 0.5 * (x1*(y2 - y3) + x2*(y3 - y1) + x3*(y1 - y2));
        return area == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter coordinates of point A (x1 y1):");
        int x1 = sc.nextInt(), y1 = sc.nextInt();

        System.out.println("Enter coordinates of point B (x2 y2):");
        int x2 = sc.nextInt(), y2 = sc.nextInt();

        System.out.println("Enter coordinates of point C (x3 y3):");
        int x3 = sc.nextInt(), y3 = sc.nextInt();

        boolean collinearSlope = areCollinearSlope(x1, y1, x2, y2, x3, y3);
        boolean collinearArea = areCollinearArea(x1, y1, x2, y2, x3, y3);

        System.out.println("Collinear (Slope Method)? " + collinearSlope);
        System.out.println("Collinear (Area Method)? " + collinearArea);

        sc.close();
    }
}