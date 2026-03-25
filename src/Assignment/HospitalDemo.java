package Assignment;

// Q16: Hospital staff management - hierarchical inheritance

class Staff {
    protected String name;

    public Staff(String name) {
        this.name = name;
    }

    public void work() {
        System.out.println(name + " is a staff member.");
    }
}

class Doctor extends Staff {
    public Doctor(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println("Dr. " + name + " - Diagnoses patients and prescribes treatment.");
    }
}

class Nurse extends Staff {
    public Nurse(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println("Nurse " + name + " - Assists doctors and takes care of patients.");
    }
}

class Receptionist extends Staff {
    public Receptionist(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println("Receptionist " + name + " - Manages appointments and patient records.");
    }
}

public class HospitalDemo {
    public static void main(String[] args) {
        System.out.println("=== Hospital Staff Management ===\n");

        Staff[] staffMembers = {
            new Doctor("Rajesh"),
            new Nurse("Sunita"),
            new Receptionist("Meena"),
            new Doctor("Anjali"),
            new Nurse("Ravi")
        };

        for (Staff s : staffMembers) {
            s.work();
        }
    }
}
