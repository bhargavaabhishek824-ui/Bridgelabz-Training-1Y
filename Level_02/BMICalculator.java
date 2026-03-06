package Level_02;
import java.util.Scanner;

public class BMICalculator {

    // Calculate BMI
    public static double calculateBMI(double weightKg, double heightCm) {
        double heightM = heightCm / 100;
        return weightKg / (heightM * heightM);
    }

    // Determine BMI status
    public static String bmiStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 24.9) return "Normal";
        else if (bmi < 29.9) return "Overweight";
        else return "Obese";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] teamData = new double[10][3]; // weight, height, BMI

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
            teamData[i][0] = sc.nextDouble();
            System.out.print("Enter height (cm) of person " + (i + 1) + ": ");
            teamData[i][1] = sc.nextDouble();
            teamData[i][2] = calculateBMI(teamData[i][0], teamData[i][1]);
        }

        System.out.println("\nWeight(kg)\tHeight(cm)\tBMI\tStatus");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%.2f\t\t%.2f\t\t%.2f\t%s\n",
                teamData[i][0], teamData[i][1], teamData[i][2], bmiStatus(teamData[i][2]));
        }

        sc.close();
    }
}