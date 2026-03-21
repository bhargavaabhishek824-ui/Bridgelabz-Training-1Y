package one;
class FullTimeEmployee extends Employee implements Department {
    private String department;
    public FullTimeEmployee(int employeeId, String name, double baseSalary) {
        super(employeeId, name, baseSalary);
    }
    @Override
    public double calculateSalary() {
        return baseSalary;
    }
    @Override
    public void assignDepartment(String deptName) {
        this.department = deptName;
    }
    @Override
    public String getDepartmentDetails() {
        return "Department: " + department;
    }
}