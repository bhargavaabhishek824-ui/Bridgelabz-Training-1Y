package Level_02;
import java.util.Scanner;

public class UnitConverterDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter kilometers to convert to miles: ");
        double km = sc.nextDouble();
        System.out.println(km + " km = " + UnitConverter.convertKmToMiles(km) + " miles");

        System.out.print("Enter miles to convert to kilometers: ");
        double miles = sc.nextDouble();
        System.out.println(miles + " miles = " + UnitConverter.convertMilesToKm(miles) + " km");

        System.out.print("Enter meters to convert to feet: ");
        double meters = sc.nextDouble();
        System.out.println(meters + " meters = " + UnitConverter.convertMetersToFeet(meters) + " feet");

        System.out.print("Enter feet to convert to meters: ");
        double feet = sc.nextDouble();
        System.out.println(feet + " feet = " + UnitConverter.convertFeetToMeters(feet) + " meters");

        System.out.print("Enter yards to convert to feet: ");
        double yards = sc.nextDouble();
        System.out.println(yards + " yards = " + UnitConverter.convertYardsToFeet(yards) + " feet");

        System.out.print("Enter feet to convert to yards: ");
        feet = sc.nextDouble();
        System.out.println(feet + " feet = " + UnitConverter.convertFeetToYards(feet) + " yards");

        System.out.print("Enter meters to convert to inches: ");
        meters = sc.nextDouble();
        System.out.println(meters + " meters = " + UnitConverter.convertMetersToInches(meters) + " inches");

        System.out.print("Enter inches to convert to meters: ");
        double inches = sc.nextDouble();
        System.out.println(inches + " inches = " + UnitConverter.convertInchesToMeters(inches) + " meters");

        System.out.print("Enter inches to convert to centimeters: ");
        inches = sc.nextDouble();
        System.out.println(inches + " inches = " + UnitConverter.convertInchesToCm(inches) + " cm");

        sc.close();
    }
}