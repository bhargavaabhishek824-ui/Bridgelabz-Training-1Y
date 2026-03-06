package Level_03;
import java.util.Scanner;

public class PointUtils {

    // Euclidean distance between two points
    public static double euclideanDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // Equation of a line: y = m*x + b
    public static double[] lineEquation(int x1, int y1, int x2, int y2) {
        double m = (x2 - x1) != 0 ? (double)(y2 - y1) / (x2 - x1) : Double.POSITIVE_INFINITY;
        double b = (m != Double.POSITIVE_INFINITY) ? y1 - m * x1 : Double.NaN;
        return new double[]{m, b};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter coordinates of first point (x1 y1):");
        int x1 = sc.nextInt(), y1 = sc.nextInt();

        System.out.println("Enter coordinates of second point (x2 y2):");
        int x2 = sc.nextInt(), y2 = sc.nextInt();

        double distance = euclideanDistance(x1, y1, x2, y2);
        double[] equation = lineEquation(x1, y1, x2, y2);

        System.out.println("Euclidean distance: " + distance);
        if (Double.isInfinite(equation[0]))
            System.out.println("Line is vertical: x = " + x1);
        else
            System.out.println("Equation of line: y = " + equation[0] + "x + " + equation[1]);

        sc.close();
    }
}