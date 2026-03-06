package Level_03;
import java.util.Scanner;

public class CalendarDisplay {

    private static String[] months = { "January","February","March","April","May","June",
                                       "July","August","September","October","November","December"};
    private static int[] daysInMonth = {31,28,31,30,31,30,31,31,30,31,30,31};

    // Check leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Get first day of month using Zeller's Congruence
    public static int firstDay(int month, int year) {
        if (month < 3) {
            month += 12;
            year--;
        }
        int q = 1;
        int m = month;
        int k = year % 100;
        int j = year / 100;
        int h = (q + (13*(m+1))/5 + k + k/4 + j/4 + 5*j) % 7;
        int day = ((h + 6) % 7); // 0=Sunday
        return day;
    }

    public static void displayCalendar(int month, int year) {
        int days = daysInMonth[month-1];
        if (month == 2 && isLeapYear(year)) days = 29;

        System.out.println("     " + months[month-1] + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        int start = firstDay(month, year);
        for (int i = 0; i < start; i++) System.out.print("    ");
        for (int day = 1; day <= days; day++) {
            System.out.printf("%3d ", day);
            if ((day + start) % 7 == 0) System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        displayCalendar(month, year);
        sc.close();
    }
}