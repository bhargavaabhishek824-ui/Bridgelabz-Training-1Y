package String_API_05;
import java.util.Random;

public class StudentMarks {

    // Method to generate random marks for n students in Physics, Chemistry, Maths
    public static int[][] generateMarks(int n) {
        Random rand = new Random();
        int[][] marks = new int[n][3]; // 3 subjects: Physics, Chemistry, Maths
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                marks[i][j] = rand.nextInt(101); // Marks between 0-100
            }
        }
        return marks;
    }

    // Method to calculate total, average, and percentage for each student
    public static double[][] calculateStats(int[][] marks) {
        int n = marks.length;
        double[][] stats = new double[n][3]; // total, average, percentage
        for (int i = 0; i < n; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double average = total / 3.0;
            double percentage = average; // Since each subject is out of 100
            stats[i][0] = total;
            stats[i][1] = Math.round(average * 100.0) / 100.0; // round to 2 decimals
            stats[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return stats;
    }

    // Method to calculate grade based on percentage
    public static String[] calculateGrade(double[][] stats) {
        int n = stats.length;
        String[] grades = new String[n];
        for (int i = 0; i < n; i++) {
            double perc = stats[i][2];
            if (perc >= 90) grades[i] = "A+";
            else if (perc >= 80) grades[i] = "A";
            else if (perc >= 70) grades[i] = "B+";
            else if (perc >= 60) grades[i] = "B";
            else if (perc >= 50) grades[i] = "C";
            else grades[i] = "F";
        }
        return grades;
    }

    // Method to display scorecard
    public static void displayScorecard(int[][] marks, double[][] stats, String[] grades) {
        System.out.println("Stu#\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage\tGrade");
        System.out.println("--------------------------------------------------------------------------");
        for (int i = 0; i < marks.length; i++) {
            System.out.printf("%d\t%d\t%d\t\t%d\t%d\t%.2f\t%.2f\t\t%s\n", 
                              (i + 1), marks[i][0], marks[i][1], marks[i][2],
                              (int) stats[i][0], stats[i][1], stats[i][2], grades[i]);
        }
    }

    public static void main(String[] args) {
        int n = 10; // Number of students

        int[][] marks = generateMarks(n);
        double[][] stats = calculateStats(marks);
        String[] grades = calculateGrade(stats);

        displayScorecard(marks, stats, grades);
    }
}