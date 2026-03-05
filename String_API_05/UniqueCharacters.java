package String_API_05;
import java.util.Scanner;

public class UniqueCharacters {

    // Method to find the length of a string without using length()
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            // end of string reached
        }
        return count;
    }

    // Method to find unique characters in a string
    public static char[] findUniqueChars(String text) {
        int len = findLength(text);
        char[] temp = new char[len]; // temporary array to store unique characters
        int uniqueIndex = 0;

        for (int i = 0; i < len; i++) {
            char current = text.charAt(i);
            boolean isUnique = true;

            // check if current character appeared before
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == current) {
                    isUnique = false;
                    break;
                }
            }

            // if unique, store in temp array
            if (isUnique) {
                temp[uniqueIndex] = current;
                uniqueIndex++;
            }
        }

        // create array of exact size to return
        char[] uniqueChars = new char[uniqueIndex];
        for (int i = 0; i < uniqueIndex; i++) {
            uniqueChars[i] = temp[i];
        }

        return uniqueChars;
    }

    // Method to display character array
    public static void displayChars(char[] chars) {
        System.out.print("Unique characters in the string are: ");
        for (char c : chars) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        char[] uniqueChars = findUniqueChars(text);
        displayChars(uniqueChars);

        sc.close();
    }
}