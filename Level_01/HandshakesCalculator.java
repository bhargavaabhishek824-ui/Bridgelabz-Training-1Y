package Level_01;
import java.util.Scanner;

public class HandshakesCalculator {

    // Method to calculate maximum handshakes using combination formula
    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = sc.nextInt();

        int maxHandshakes = calculateHandshakes(numberOfStudents);

        System.out.println("The maximum number of handshakes among " 
            + numberOfStudents + " students is " + maxHandshakes);

        sc.close();
    }
}