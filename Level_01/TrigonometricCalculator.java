package Level_01;
import java.util.Scanner;

public class TrigonometricCalculator {

    // Method to calculate sine, cosine, and tangent
    public static double[] calculateTrigonometricFunctions(double angleInDegrees) {
        double angleInRadians = Math.toRadians(angleInDegrees); // Convert degrees to radians

        double sine = Math.sin(angleInRadians);
        double cosine = Math.cos(angleInRadians);
        double tangent = Math.tan(angleInRadians);

        return new double[]{sine, cosine, tangent};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an angle in degrees: ");
        double angle = sc.nextDouble();

        double[] results = calculateTrigonometricFunctions(angle);

        System.out.printf("Sine(%.2f°) = %.4f\n", angle, results[0]);
        System.out.printf("Cosine(%.2f°) = %.4f\n", angle, results[1]);
        System.out.printf("Tangent(%.2f°) = %.4f\n", angle, results[2]);

        sc.close();
    }
}