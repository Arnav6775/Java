package Assignment;

// Q4: Resort class
public class Resort {

    private int rNo;
    private String name;
    private double charges;
    private int days;

    // Compute() - calculate and return amount
    public double compute() {
        double amount = days * charges;
        if (amount > 11000) {
            amount = 1.02 * days * charges;
        }
        return amount;
    }

    // Getinfo() - enter content
    public void getInfo(int rNo, String name, double charges, int days) {
        this.rNo = rNo;
        this.name = name;
        this.charges = charges;
        this.days = days;
    }

    // DispInfo() - display content including computed amount
    public void dispInfo() {
        double amount = compute();
        System.out.println("Room No     : " + rNo);
        System.out.println("Customer    : " + name);
        System.out.println("Charges/Day : Rs. " + charges);
        System.out.println("Days        : " + days);
        System.out.println("Total Amount: Rs. " + amount);
        System.out.println("----------------------------------");
    }

    public static void main(String[] args) {
        Resort r1 = new Resort();
        r1.getInfo(101, "Rahul Sharma", 2000, 5);
        r1.dispInfo();

        Resort r2 = new Resort();
        r2.getInfo(102, "Priya Singh", 3000, 4);
        r2.dispInfo();

        Resort r3 = new Resort();
        r3.getInfo(103, "Amit Verma", 1500, 3);
        r3.dispInfo();
    }
}
