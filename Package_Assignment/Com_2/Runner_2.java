package Package_Assignment;
import com.company.hr.Employee;   // Single import
import com.company.payrol.*;     // On-demand import

public class Runner_2 {

    public static void main(String[] args) {

        Employee emp = new Employee();

        emp.setId(101);
        emp.setName("Rahul");
        emp.setDepartment("IT");
        emp.setSalary(50000);

        Payroll p = new Payroll();
        double finalSalary = p.calculateBonus(emp);

        System.out.println("Employee ID: " + emp.getId());
        System.out.println("Name: " + emp.getName());
        System.out.println("Department: " + emp.getDepartment());
        System.out.println("Salary: " + emp.getSalary());
        System.out.println("Salary After Bonus: " + finalSalary);

    }

}