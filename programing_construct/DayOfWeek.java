package programing_construct;

class DayOfWeek {
    public static void main(String[] args) {
        // Check if 3 arguments are provided
        if (args.length != 3) {
            System.out.println("Usage: java DayOfWeek <month> <day> <year>");
            return;
        }

        // Parse command-line arguments
        int m = Integer.parseInt(args[0]); // month
        int d = Integer.parseInt(args[1]); // day
        int y = Integer.parseInt(args[2]); // year

        // Adjust month and year for January and Februar
        if (m < 3) {
            m += 12;
            y -= 1;
        }

        int k = y % 100;  // year of the century
        int j = y / 100;  // zero-based century

        // Zeller's Congruence formula
        int h = (d + (13 * (m + 1)) / 5 + k + (k / 4) + (j / 4) + 5 * j) % 7;

        // Convert result to 0 = Sunday, 1 = Monday, ..., 6 = Saturday
        int dayOfWeek = ((h + 6) % 7);

        System.out.println("Day of the week (0=Sunday,...6=Saturday): " + dayOfWeek);
    }
}
