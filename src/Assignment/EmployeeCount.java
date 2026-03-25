package Assignment;

// Q17: Employee count using static variable and static method

public class EmployeeCount {

    private String name;
    private int id;
    private static int employeeCount = 0;

    public EmployeeCount(String name, int id) {
        this.name = name;
        this.id = id;
        employeeCount++;
    }

    public void displayDetails() {
        System.out.println("  ID: " + id + " | Name: " + name);
    }

    // Static method to display total count
    public static void displayCount() {
        System.out.println("Total Employees Created: " + employeeCount);
    }

    public static void main(String[] args) {
        System.out.println("=== Employee Tracking System ===\n");

        EmployeeCount e1 = new EmployeeCount("Arjun", 101);
        EmployeeCount e2 = new EmployeeCount("Divya", 102);
        EmployeeCount e3 = new EmployeeCount("Manish", 103);
        EmployeeCount e4 = new EmployeeCount("Pooja", 104);

        e1.displayDetails();
        e2.displayDetails();
        e3.displayDetails();
        e4.displayDetails();

        System.out.println();
        EmployeeCount.displayCount();
    }
}
