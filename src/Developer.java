//child class
public class Developer extends Employee {

    //private attributes
    private String programmingLanguage;
    private int projectsCompleted;

    //Constructor
    public Developer(String name, int employeeId, double baseSalary, String department, String programmingLanguage, int projectsCompleted) {
        super(name, employeeId, baseSalary, department);
        this.programmingLanguage = programmingLanguage;
        this.projectsCompleted = projectsCompleted;
        System.out.println(name + " joined as a " + programmingLanguage + " Developer");
    }

    //Override Methods
    @Override
    public double calculateSalary() {
        return baseSalary + (projectsCompleted * 1000);
    }
    @Override
    public void work() {
        System.out.println(name + " is coding in " + programmingLanguage);
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Programming Language: " + programmingLanguage);
        System.out.println("Projects Completed: " + projectsCompleted);
    }
}
