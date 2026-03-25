package Assignment;

// Q20: Employee using 'this' keyword in constructor

public class EmployeeThis {

    private String name;
    private double salary;

    // Constructor using 'this' keyword to distinguish parameters from instance variables
    public EmployeeThis(String name, double salary) {
        this.name = name;       // 'this.name' refers to the instance variable
        this.salary = salary;   // 'this.salary' refers to the instance variable
    }

    public void displayDetails() {
        System.out.println("Name   : " + this.name);
        System.out.println("Salary : Rs. " + this.salary);
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {
        System.out.println("=== Employee Details (using 'this' keyword) ===\n");

        EmployeeThis e1 = new EmployeeThis("Nikhil Verma", 45000);
        EmployeeThis e2 = new EmployeeThis("Ritu Sharma", 52000);
        EmployeeThis e3 = new EmployeeThis("Deepak Joshi", 38000);

        e1.displayDetails();
        e2.displayDetails();
        e3.displayDetails();
    }
}
