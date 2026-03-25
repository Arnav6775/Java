package Assignment;

// Q14: Multilevel inheritance - Person → Employee → Manager with runtime polymorphism

class PersonBase {
    protected String name;

    public PersonBase(String name) {
        this.name = name;
    }

    public String role() {
        return name + " is a Person.";
    }
}

class EmployeeLevel extends PersonBase {
    protected int empId;

    public EmployeeLevel(String name, int empId) {
        super(name);
        this.empId = empId;
    }

    @Override
    public String role() {
        return name + " (ID: " + empId + ") is an Employee.";
    }
}

class ManagerLevel extends EmployeeLevel {
    private String department;

    public ManagerLevel(String name, int empId, String department) {
        super(name, empId);
        this.department = department;
    }

    @Override
    public String role() {
        return name + " (ID: " + empId + ") is a Manager of " + department + " department.";
    }
}

public class MultilevelDemo {
    public static void main(String[] args) {
        System.out.println("=== Multilevel Inheritance Demo ===\n");

        // Runtime polymorphism with Person reference
        PersonBase p1 = new PersonBase("Amit");
        PersonBase p2 = new EmployeeLevel("Neha", 1001);
        PersonBase p3 = new ManagerLevel("Vijay", 1002, "IT");

        System.out.println(p1.role());
        System.out.println(p2.role());
        System.out.println(p3.role());
    }
}
