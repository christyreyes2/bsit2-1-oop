//child class from Employee
public class Manager extends Employee {

    //private attributes
    private double bonus;
    private int teamSize;

    //Constructor
    public Manager(String name, int employeeId, double baseSalary, String department, double bonus, int teamSize) {
        super(name, employeeId, baseSalary, department);
        this.bonus = bonus;
        this.teamSize = teamSize;
        System.out.println(name + " has been promoted to Manager");
    }

    //Override Methods
    @Override
    public double calculateSalary() {
        return baseSalary + bonus;
    }
    @Override
    public void work() {
        super.work();
        System.out.println(name + " is managing a team of " + teamSize + " employees");
    }
    @Override

    public void displayInfo() {
        //using super to call parent displayInfo
        super.displayInfo();
        System.out.println("Bonus: $" + bonus);
        System.out.println("Team Size: " + teamSize + " employees");
    }
}
