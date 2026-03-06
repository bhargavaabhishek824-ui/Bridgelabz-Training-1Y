package ClassAndObject;
class Employee {

    String name;
    int id;
    double salary;

    // Method to display employee details
    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Salary: " + salary);
    }

    public static void main(String[] args) {

        // Creating object of Employee class
        Employee emp = new Employee();

        // Assigning values
        emp.name = "Abhishek";
        emp.id = 101;
        emp.salary = 50000;

        // Calling method
        emp.displayDetails();
    }
}