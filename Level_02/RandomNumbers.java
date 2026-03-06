package Level_02;
import java.util.Scanner;

public class RandomNumbers {

    // Method to generate array of 4-digit random numbers
    public static int[] generate4DigitRandomArray(int size) {
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = 1000 + (int)(Math.random() * 9000); // 1000 to 9999
        }
        return numbers;
    }

    // Method to find average, min, max
    public static double[] findAverageMinMax(int[] numbers) {
        int sum = 0;
        int min = numbers[0];
        int max = numbers[0];

        for (int num : numbers) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        double avg = sum / (double) numbers.length;
        return new double[]{avg, min, max};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = 5; // Generate 5 numbers
        int[] randomNumbers = generate4DigitRandomArray(size);

        System.out.print("Generated numbers: ");
        for (int num : randomNumbers) System.out.print(num + " ");
        System.out.println();

        double[] stats = findAverageMinMax(randomNumbers);
        System.out.printf("Average: %.2f, Min: %.0f, Max: %.0f\n", stats[0], stats[1], stats[2]);

        sc.close();
    }
}