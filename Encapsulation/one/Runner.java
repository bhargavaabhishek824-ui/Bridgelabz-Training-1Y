package one;
import java.util.*;
public class Runner {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        FullTimeEmployee emp1 = new FullTimeEmployee(1, "Namrita", 50000);
        emp1.assignDepartment("HR");
        PartTimeEmployee emp2 = new PartTimeEmployee(2, "Mohit", 500, 40);
        emp2.assignDepartment("IT");
        employees.add(emp1);
        employees.add(emp2);
        for (Employee emp : employees) {
            emp.displayDetails();
            System.out.println("Salary: " + emp.calculateSalary());
            if (emp instanceof Department) {
                Department dept = (Department) emp;
                System.out.println(dept.getDepartmentDetails());
            }
            System.out.println("----------------------");
        }
    }
}