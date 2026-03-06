package Level_03;
import java.util.Random;
import java.util.Locale;

public class EmployeeBonus {

    // Generate random salaries and years of service for 10 employees
    public static double[][] generateEmployeeData(int n) {
        Random rand = new Random();
        double[][] data = new double[n][2]; // Column 0: Salary, Column 1: Years of Service
        for (int i = 0; i < n; i++) {
            data[i][0] = 10000 + rand.nextInt(90000); // 5-digit salary 10000-99999
            data[i][1] = 1 + rand.nextInt(10); // Years of service 1-10
        }
        return data;
    }

    // Calculate bonus and new salary
    public static double[][] calculateBonus(double[][] data) {
        double[][] result = new double[data.length][3]; // Column 0: Old Salary, 1: Bonus, 2: New Salary
        for (int i = 0; i < data.length; i++) {
            double salary = data[i][0];
            double years = data[i][1];
            double bonus = years > 5 ? salary * 0.05 : salary * 0.02;
            double newSalary = salary + bonus;
            result[i][0] = salary;
            result[i][1] = bonus;
            result[i][2] = newSalary;
        }
        return result;
    }

    // Display table and totals
    public static void displayBonusTable(double[][] result) {
        double totalOld = 0, totalBonus = 0, totalNew = 0;
        System.out.printf("%-10s %-12s %-10s %-10s\n", "Employee", "Old Salary", "Bonus", "New Salary");
        for (int i = 0; i < result.length; i++) {
            System.out.printf(Locale.US, "%-10d %-12.2f %-10.2f %-10.2f\n",
                              i+1, result[i][0], result[i][1], result[i][2]);
            totalOld += result[i][0];
            totalBonus += result[i][1];
            totalNew += result[i][2];
        }
        System.out.printf(Locale.US, "Total      %-12.2f %-10.2f %-10.2f\n", totalOld, totalBonus, totalNew);
    }

    public static void main(String[] args) {
        int n = 10; // 10 employees
        double[][] employeeData = generateEmployeeData(n);
        double[][] bonusData = calculateBonus(employeeData);
        displayBonusTable(bonusData);
    }
}