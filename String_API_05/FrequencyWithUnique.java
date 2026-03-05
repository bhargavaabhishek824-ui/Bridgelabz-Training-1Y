package String_API_05;
import java.util.Scanner;

public class FrequencyWithUnique {

    // Method to find unique characters in a string
    public static char[] uniqueCharacters(String text) {
        int n = text.length();
        char[] temp = new char[n];
        int index = 0;

        for (int i = 0; i < n; i++) {
            char c = text.charAt(i);
            boolean isUnique = true;

            // Check if character is already in temp array
            for (int j = 0; j < index; j++) {
                if (temp[j] == c) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                temp[index] = c;
                index++;
            }
        }

        // Copy only the filled part of temp array
        char[] uniqueChars = new char[index];
        for (int i = 0; i < index; i++) {
            uniqueChars[i] = temp[i];
        }

        return uniqueChars;
    }

    // Method to find frequency using unique characters
    public static String[][] charFrequencyUsingUnique(String text) {
        int[] freq = new int[256]; // Frequency array for ASCII characters

        // Count frequency of each character
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        char[] uniqueChars = uniqueCharacters(text);
        String[][] result = new String[uniqueChars.length][2];

        // Fill the 2D array with unique character and its frequency
        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = String.valueOf(uniqueChars[i]);
            result[i][1] = String.valueOf(freq[uniqueChars[i]]);
        }

        return result;
    }

    // Method to display the 2D array in tabular format
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

        String[][] frequency = charFrequencyUsingUnique(text);
        displayFrequency(frequency);

        sc.close();
    }
}