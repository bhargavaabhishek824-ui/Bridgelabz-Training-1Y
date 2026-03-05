package String_API_05;
import java.util.Scanner;

public class BMICalculator {

    // Method to calculate BMI and status given weight and height
    public static String[][] calculateBMI(double[][] personData) {
        int numPersons = personData.length;
        String[][] result = new String[numPersons][4]; // height, weight, BMI, status

        for (int i = 0; i < numPersons; i++) {
            double weight = personData[i][0];
            double heightCm = personData[i][1];
            double heightM = heightCm / 100.0;

            double bmi = weight / (heightM * heightM);
            bmi = Math.round(bmi * 100.0) / 100.0; // round to 2 decimal places

            String status;
            if (bmi < 18.5) status = "Underweight";
            else if (bmi < 25) status = "Normal";
            else if (bmi < 30) status = "Overweight";
            else status = "Obese";

            result[i][0] = String.valueOf(heightCm);
            result[i][1] = String.valueOf(weight);
            result[i][2] = String.valueOf(bmi);
            result[i][3] = status;
        }
        return result;
    }

    // Method to display the 2D array in tabular format
    public static void displayBMI(String[][] bmiData) {
        System.out.println("Person\tHeight(cm)\tWeight(kg)\tBMI\tStatus");
        System.out.println("-------------------------------------------------------------");
        for (int i = 0; i < bmiData.length; i++) {
            System.out.printf("%d\t%s\t\t%s\t\t%s\t%s\n",
                    (i + 1),
                    bmiData[i][0],
                    bmiData[i][1],
                    bmiData[i][2],
                    bmiData[i][3]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numPersons = 10;
        double[][] personData = new double[numPersons][2]; // column 0 = weight, column 1 = height

        System.out.println("Enter weight (kg) and height (cm) of 10 persons:");

        for (int i = 0; i < numPersons; i++) {
            System.out.print("Person " + (i + 1) + " weight (kg): ");
            personData[i][0] = sc.nextDouble();
            System.out.print("Person " + (i + 1) + " height (cm): ");
            personData[i][1] = sc.nextDouble();
        }

        String[][] bmiData = calculateBMI(personData);
        displayBMI(bmiData);

        sc.close();
    }
}