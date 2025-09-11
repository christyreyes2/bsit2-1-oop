//child class from Employee
public class Intern extends Employee {

    //private attributes
    private String university;
    private boolean fullTime;

    //Constructor
    public Intern(String name, int employeeId, double baseSalary, String department, String university, boolean fullTime) {
        super(name, employeeId, baseSalary, department);
        this.university = university;
        this.fullTime = fullTime;
        System.out.println("Intern " + name + " from " + university + " has started");
    }


    //Override Methods
    @Override
    public double calculateSalary() {
        // Assuming interns earn half the base salary
        return baseSalary / 2;
    }
    @Override
    public void work() {
        System.out.println(name + " is learning and assisting with tasks");
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("University: " + university);
        System.out.println("Full-time: " + fullTime);
    }
}
