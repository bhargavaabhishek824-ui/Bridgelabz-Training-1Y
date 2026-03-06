	package Level_01;
	import java.util.Scanner;

	public class TriangularRun {

	    // Method to calculate number of rounds for 5 km
	    public static double calculateRounds(double side1, double side2, double side3, double targetDistance) {
	        double perimeter = side1 + side2 + side3; // Perimeter of the triangular park
	        return targetDistance / perimeter;        // Number of rounds needed
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter side 1 of the triangle (meters): ");
	        double side1 = sc.nextDouble();

	        System.out.print("Enter side 2 of the triangle (meters): ");
	        double side2 = sc.nextDouble();

	        System.out.print("Enter side 3 of the triangle (meters): ");
	        double side3 = sc.nextDouble();

	        double targetDistance = 5000; // 5 km in meters

	        double rounds = calculateRounds(side1, side2, side3, targetDistance);

	        System.out.println("To complete a 5 km run, the athlete must run approximately " 
	            + Math.ceil(rounds) + " rounds around the triangular park.");

	        sc.close();
	    }
	}