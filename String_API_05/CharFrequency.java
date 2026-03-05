package String_API_05;
import java.util.Scanner;

public class CharFrequency {

    // Method to find frequency of characters and return as 2D array
    public static String[][] findCharFrequency(String text) {
        int[] freq = new int[256]; // Frequency array for ASCII characters

        // Count frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            freq[c]++;
        }

        // Count number of unique characters for sizing the 2D array
        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                uniqueCount++;
            }
        }

        // Create 2D array to store character and its frequency
        String[][] result = new String[uniqueCount][2];
        int index = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (freq[c] != 0) { // if character has not been added yet
                result[index][0] = String.valueOf(c);
                result[index][1] = String.valueOf(freq[c]);
                freq[c] = 0; // mark as processed
                index++;
            }
        }

        return result;
    }

    // Method to display 2D array in tabular format
    public static void displayFrequency(String[][] freqArray) {
        System.out.println("Character | Frequency");
        System.out.println("--------------------");
        for (int i = 0; i < freqArray.length; i++) {
            System.out.printf("    %s     |     %s%n", freqArray[i][0], freqArray[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String[][] frequency = findCharFrequency(text);
        displayFrequency(frequency);

        sc.close();
    }
}