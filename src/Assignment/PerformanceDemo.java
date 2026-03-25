package Assignment;

// Q13: Employee performance evaluation with abstract class and runtime polymorphism

abstract class EmployeePerformance {
    protected String name;
    protected int id;
    protected double salary;

    public EmployeePerformance(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    abstract double calculateBonus();

    public void displayDetails() {
        System.out.println("ID     : " + id);
        System.out.println("Name   : " + name);
        System.out.println("Salary : Rs. " + salary);
        System.out.println("Bonus  : Rs. " + String.format("%.2f", calculateBonus()));
        System.out.println("---------------------------");
    }
}

class Manager extends EmployeePerformance {
    public Manager(String name, int id, double salary) {
        super(name, id, salary);
    }

    @Override
    double calculateBonus() {
        return salary * 0.20; // 20% of salary
    }
}

class Developer extends EmployeePerformance {
    private double projectIncentive;

    public Developer(String name, int id, double salary, double projectIncentive) {
        super(name, id, salary);
        this.projectIncentive = projectIncentive;
    }

    @Override
    double calculateBonus() {
        return (salary * 0.10) + projectIncentive; // 10% + project incentive
    }
}

public class PerformanceDemo {
    public static void main(String[] args) {
        System.out.println("=== Employee Performance Evaluation ===\n");

        // Runtime polymorphism: Employee reference holding different object types
        EmployeePerformance emp1 = new Manager("Anita Desai", 101, 80000);
        EmployeePerformance emp2 = new Developer("Karan Mehta", 102, 60000, 5000);
        EmployeePerformance emp3 = new Manager("Priya Singh", 103, 90000);
        EmployeePerformance emp4 = new Developer("Rohit Sharma", 104, 55000, 8000);

        EmployeePerformance[] employees = {emp1, emp2, emp3, emp4};

        for (EmployeePerformance emp : employees) {
            emp.displayDetails();
        }
    }
}
