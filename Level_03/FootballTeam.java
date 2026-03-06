package Level_03;
import java.util.Random;

public class FootballTeam {

    // Generate random heights for 11 players
    public static int[] generateHeights() {
        int[] heights = new int[11];
        Random rand = new Random();
        for (int i = 0; i < 11; i++) {
            heights[i] = 150 + rand.nextInt(101); // 150 to 250
        }
        return heights;
    }

    // Sum of heights
    public static int sumHeights(int[] heights) {
        int sum = 0;
        for (int h : heights) sum += h;
        return sum;
    }

    // Mean height
    public static double meanHeight(int[] heights) {
        return sumHeights(heights) / (double) heights.length;
    }

    // Shortest height
    public static int shortestHeight(int[] heights) {
        int min = heights[0];
        for (int h : heights) min = Math.min(min, h);
        return min;
    }

    // Tallest height
    public static int tallestHeight(int[] heights) {
        int max = heights[0];
        for (int h : heights) max = Math.max(max, h);
        return max;
    }

    public static void main(String[] args) {
        int[] heights = generateHeights();

        System.out.print("Heights of players: ");
        for (int h : heights) System.out.print(h + " ");
        System.out.println();

        System.out.println("Shortest height: " + shortestHeight(heights));
        System.out.println("Tallest height: " + tallestHeight(heights));
        System.out.printf("Mean height: %.2f\n", meanHeight(heights));
    }
}