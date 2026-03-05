package String_API_05;
import java.util.Scanner;

public class FrequencyNestedLoops {

    // Method to find frequency of characters using nested loops
    public static String[] charFrequency(String text) {
        char[] chars = text.toCharArray();
        int n = chars.length;
        int[] freq = new int[n];

        // Nested loop to count frequency
        for (int i = 0; i < n; i++) {
            if (chars[i] == '0') { // Already counted duplicate
                continue;
            }
            freq[i] = 1; // Initialize frequency
            for (int j = i + 1; j < n; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0'; // Mark duplicate as counted
                }
            }
        }

        // Count how many unique characters
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (chars[i] != '0') {
                count++;
            }
        }

        // Create 1D array to store character and frequency as strings
        String[] result = new String[count];
        int k = 0;
        for (int i = 0; i < n; i++) {
            if (chars[i] != '0') {
                result[k] = chars[i] + " : " + freq[i];
                k++;
            }
        }

        return result;
    }

    // Method to display the result
    public static void displayFrequency(String[] freqArray) {
        System.out.println("Character | Frequency");
        System.out.println("--------------------");
        for (String s : freqArray) {
            String[] parts = s.split(" : ");
            System.out.printf("    %s     |     %s%n", parts[0], parts[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String[] frequency = charFrequency(text);
        displayFrequency(frequency);

        sc.close();
    }
}