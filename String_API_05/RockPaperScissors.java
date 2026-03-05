package String_API_05;
import java.util.Scanner;

public class RockPaperScissors {

    // Method to get computer choice
    public static String getComputerChoice() {
        int choice = (int) (Math.random() * 3); // 0, 1, or 2
        switch (choice) {
            case 0: return "Rock";
            case 1: return "Paper";
            default: return "Scissors";
        }
    }

    // Method to determine the winner of one game
    public static String findWinner(String user, String computer) {
        if (user.equalsIgnoreCase(computer)) return "Draw";
        if ((user.equalsIgnoreCase("Rock") && computer.equals("Scissors")) ||
            (user.equalsIgnoreCase("Paper") && computer.equals("Rock")) ||
            (user.equalsIgnoreCase("Scissors") && computer.equals("Paper"))) {
            return "User";
        } else {
            return "Computer";
        }
    }

    // Method to calculate stats and percentages
    public static String[][] calculateStats(int userWins, int computerWins, int draws, int totalGames) {
        double userPercent = ((double) userWins / totalGames) * 100;
        double computerPercent = ((double) computerWins / totalGames) * 100;
        double drawPercent = ((double) draws / totalGames) * 100;

        String[][] stats = new String[4][3];
        stats[0] = new String[]{"Player Wins", String.valueOf(userWins), String.format("%.2f%%", userPercent)};
        stats[1] = new String[]{"Computer Wins", String.valueOf(computerWins), String.format("%.2f%%", computerPercent)};
        stats[2] = new String[]{"Draws", String.valueOf(draws), String.format("%.2f%%", drawPercent)};
        stats[3] = new String[]{"Total Games", String.valueOf(totalGames), "100%"};
        return stats;
    }

    // Method to display results
    public static void displayResults(String[][] gameResults, String[][] stats) {
        System.out.println("Game\tPlayer\tComputer\tWinner");
        for (int i = 0; i < gameResults.length; i++) {
            System.out.println((i + 1) + "\t" + gameResults[i][0] + "\t" + gameResults[i][1] + "\t\t" + gameResults[i][2]);
        }

        System.out.println("\nSummary:");
        System.out.println("Category\tCount\tPercentage");
        for (int i = 0; i < stats.length; i++) {
            System.out.println(stats[i][0] + "\t" + stats[i][1] + "\t" + stats[i][2]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of games: ");
        int totalGames = sc.nextInt();
        sc.nextLine(); // Consume newline

        String[][] gameResults = new String[totalGames][3];
        int userWins = 0, computerWins = 0, draws = 0;

        for (int i = 0; i < totalGames; i++) {
            System.out.print("Game " + (i + 1) + " - Enter your choice (Rock/Paper/Scissors): ");
            String userChoice = sc.nextLine();
            String computerChoice = getComputerChoice();
            String winner = findWinner(userChoice, computerChoice);

            if (winner.equals("User")) userWins++;
            else if (winner.equals("Computer")) computerWins++;
            else draws++;

            gameResults[i][0] = userChoice;
            gameResults[i][1] = computerChoice;
            gameResults[i][2] = winner;
        }

        String[][] stats = calculateStats(userWins, computerWins, draws, totalGames);
        displayResults(gameResults, stats);

        sc.close();
    }
}