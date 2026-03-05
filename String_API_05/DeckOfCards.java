package String_API_05;
import java.util.Scanner;

public class DeckOfCards {

    // Suits and Ranks
    private static final String[] SUITS = {"Hearts", "Diamonds", "Clubs", "Spades"};
    private static final String[] RANKS = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
            "Jack", "Queen", "King", "Ace"};

    // Initialize deck
    public static String[] initializeDeck() {
        int numOfCards = SUITS.length * RANKS.length;
        String[] deck = new String[numOfCards];
        int index = 0;
        for (String suit : SUITS) {
            for (String rank : RANKS) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    // Shuffle deck
    public static void shuffleDeck(String[] deck) {
        int n = deck.length;
        for (int i = 0; i < n; i++) {
            int randomCardNumber = i + (int) (Math.random() * (n - i));
            // Swap cards
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
    }

    // Distribute cards to players
    public static String[][] distributeCards(String[] deck, int numCards, int numPlayers) {
        if (numCards > deck.length) {
            System.out.println("Cannot distribute more cards than available in deck.");
            return null;
        }
        if (numCards < numPlayers) {
            System.out.println("Cannot distribute fewer cards than number of players.");
            return null;
        }

        String[][] players = new String[numPlayers][numCards / numPlayers];
        int index = 0;

        for (int i = 0; i < numPlayers; i++) {
            for (int j = 0; j < numCards / numPlayers; j++) {
                players[i][j] = deck[index++];
            }
        }
        return players;
    }

    // Print players' cards
    public static void printPlayersCards(String[][] players) {
        if (players == null) return;
        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + (i + 1) + "'s cards:");
            for (String card : players[i]) {
                System.out.print(card + " | ");
            }
            System.out.println("\n");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Initialize deck
        String[] deck = initializeDeck();

        // Shuffle deck
        shuffleDeck(deck);

        // Input number of players and cards to distribute
        System.out.print("Enter number of players: ");
        int numPlayers = sc.nextInt();
        System.out.print("Enter number of cards to distribute: ");
        int numCards = sc.nextInt();

        // Distribute cards
        String[][] players = distributeCards(deck, numCards, numPlayers);

        // Print players' cards
        printPlayersCards(players);

        sc.close();
    }
}