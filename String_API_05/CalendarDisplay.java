package String_API_05;
import java.util.Scanner;

public class CalendarDisplay {

    // Array of month names
    private static final String[] MONTH_NAMES = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
    };

    // Array of days in each month (non-leap year)
    private static final int[] DAYS_IN_MONTH = {
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
    };

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Method to get the number of days in a month
    public static int getDaysInMonth(int month, int year) {
        if (month == 2) { // February
            return isLeapYear(year) ? 29 : 28;
        } else {
            return DAYS_IN_MONTH[month - 1];
        }
    }

    // Method to get the first day of the month (0=Sunday, 1=Monday,...6=Saturday)
    public static int getFirstDayOfMonth(int month, int year) {
        int y = year;
        int m = month;
        if (m < 3) {
            m += 12;
            y -= 1;
        }
        int k = y % 100;
        int j = y / 100;
        int d = 1; // First day of month
        int f = d + 13 * (m + 1) / 5 + k + k / 4 + j / 4 + 5 * j;
        int dayOfWeek = f % 7; // 0=Saturday, 1=Sunday,... so adjust
        dayOfWeek = (dayOfWeek + 6) % 7; // shift so 0=Sunday, 1=Monday,...
        return dayOfWeek;
    }

    // Method to display the calendar
    public static void displayCalendar(int month, int year) {
        System.out.println("\n   " + MONTH_NAMES[month - 1] + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        int firstDay = getFirstDayOfMonth(month, year);
        int days = getDaysInMonth(month, year);

        // First loop for spacing before the first day
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    "); // 4 spaces for alignment
        }

        // Second loop to display days
        for (int day = 1; day <= days; day++) {
            System.out.printf("%3d ", day);
            if ((day + firstDay) % 7 == 0) { // Next line after Saturday
                System.out.println();
            }
        }
        System.out.println(); // Final newline
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter year: ");
        int year = sc.nextInt();

        if (month < 1 || month > 12) {
            System.out.println("Invalid month. Please enter a value between 1 and 12.");
        } else {
            displayCalendar(month, year);
        }

        sc.close();
    }
}