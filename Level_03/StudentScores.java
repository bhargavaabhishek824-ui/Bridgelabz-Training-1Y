package Level_03;
import java.util.Random;

public class StudentScores {

    // Generate random scores for n students in PCM
    public static int[][] generateScores(int n) {
        Random rand = new Random();
        int[][] scores = new int[n][3]; // Columns: Physics, Chemistry, Maths
        for (int i = 0; i < n; i++) {
            scores[i][0] = rand.nextInt(101); // 0-100
            scores[i][1] = rand.nextInt(101);
            scores[i][2] = rand.nextInt(101);
        }
        return scores;
    }

    // Calculate total, average, percentage
    public static double[][] calculateResults(int[][] scores) {
        double[][] results = new double[scores.length][3]; // Columns: Total, Avg, %age
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double perc = (total / 300.0) * 100;
            results[i][0] = Math.round(total * 100.0) / 100.0;
            results[i][1] = Math.round(avg * 100.0) / 100.0;
            results[i][2] = Math.round(perc * 100.0) / 100.0;
        }
        return results;
    }

    // Display scorecard
    public static void displayScoreCard(int[][] scores, double[][] results) {
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%d\t%d\t%d\t\t%d\t%.2f\t%.2f\t%.2f\n",
                    i+1, scores[i][0], scores[i][1], scores[i][2],
                    results[i][0], results[i][1], results[i][2]);
        }
    }

    public static void main(String[] args) {
        int n = 5; // Example number of students
        int[][] scores = generateScores(n);
        double[][] results = calculateResults(scores);
        displayScoreCard(scores, results);
    }
}