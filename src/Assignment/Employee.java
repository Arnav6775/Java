package Assignment;

// Q5: Employee class with basic, hra, da, netpay
public class Employee {

    private int empNo;
    private String eName;
    private float basic;
    private float hra;
    private float da;
    private float netPay;

    // Calculate() - return basic + hra + da
    public float calculate() {
        return basic + hra + da;
    }

    // havedata() - accept values and invoke calculate()
    public void haveData(int empNo, String eName, float basic, float hra, float da) {
        this.empNo = empNo;
        this.eName = eName;
        this.basic = basic;
        this.hra = hra;
        this.da = da;
        this.netPay = calculate();
    }

    // dispdata() - display all data members
    public void dispData() {
        System.out.println("Employee No : " + empNo);
        System.out.println("Name        : " + eName);
        System.out.println("Basic       : Rs. " + basic);
        System.out.println("HRA         : Rs. " + hra);
        System.out.println("DA          : Rs. " + da);
        System.out.println("Net Pay     : Rs. " + netPay);
        System.out.println("----------------------------------");
    }

    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.haveData(1001, "Ravi Kumar", 25000, 5000, 3000);
        e1.dispData();

        Employee e2 = new Employee();
        e2.haveData(1002, "Sneha Patel", 30000, 6000, 4000);
        e2.dispData();
    }
}
