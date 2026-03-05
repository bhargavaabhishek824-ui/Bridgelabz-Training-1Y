package String_API_05;
import java.util.Scanner;

public class ShortestLongestString {

    // Method to find string length without using length()
    public static int getStringLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
        }
        return count;
    }

    // Method to split text into words using charAt()
    public static String[] splitText(String text) {
        int length = getStringLength(text);
        int wordCount = 1;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') wordCount++;
        }

        int[] spaceIndexes = new int[wordCount - 1];
        int idx = 0;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') spaceIndexes[idx++] = i;
        }

        String[] words = new String[wordCount];
        int start = 0;
        for (int i = 0; i < wordCount; i++) {
            int end = (i < spaceIndexes.length) ? spaceIndexes[i] : length;
            String word = "";
            for (int j = start; j < end; j++) word += text.charAt(j);
            words[i] = word;
            start = end + 1;
        }
        return words;
    }

    // Method to create 2D array with word and its length
    public static String[][] wordsWithLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getStringLength(words[i]));
        }
        return result;
    }

    // Method to find shortest and longest word lengths in 2D array
    public static int[] findShortestLongest(String[][] wordData) {
        int minLen = Integer.parseInt(wordData[0][1]);
        int maxLen = Integer.parseInt(wordData[0][1]);
        for (int i = 1; i < wordData.length; i++) {
            int len = Integer.parseInt(wordData[i][1]);
            if (len < minLen) minLen = len;
            if (len > maxLen) maxLen = len;
        }
        return new int[]{minLen, maxLen};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] words = splitText(text);
        String[][] wordData = wordsWithLengths(words);
        int[] shortestLongest = findShortestLongest(wordData);

        System.out.println("\nWord\tLength");
        for (int i = 0; i < wordData.length; i++) {
            System.out.println(wordData[i][0] + "\t" + Integer.parseInt(wordData[i][1]));
        }

        System.out.println("\nShortest word length: " + shortestLongest[0]);
        System.out.println("Longest word length: " + shortestLongest[1]);

        sc.close();
    }
}