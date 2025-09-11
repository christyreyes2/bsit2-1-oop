public class Employee {

    //protected attributes
    protected String name;
    protected int employeeId;
    protected double baseSalary;
    protected String department;

    //Constructor
    public Employee(String name, int employeeId, double baseSalary, String department) {
        this.name = name;
        this.employeeId = employeeId;
        this.baseSalary = baseSalary;
        this.department = department;
        System.out.println("Employee " + name + " has been hired in " + department + " department");
    }

    //Method for details
    public void displayInfo() {
        System.out.println("--- Employee Details ---");
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Base Salary: $" + baseSalary);
        System.out.println("Department: " + department);
    }
    //Method
    public double calculateSalary() {
        return baseSalary;
    }
    //Method
    public void work() {
        System.out.println(name + " is working on general tasks");
    }
}
