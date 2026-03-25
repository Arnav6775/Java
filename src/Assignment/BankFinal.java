package Assignment;

// Q18: Bank with final interest rate

public class BankFinal {

    private final double interestRate;

    public BankFinal(double interestRate) {
        this.interestRate = interestRate;
    }

    // Calculate interest using the fixed rate
    public double calculateInterest(double amount) {
        return (amount * interestRate) / 100;
    }

    public static void main(String[] args) {
        System.out.println("=== Bank Fixed Interest Rate ===\n");

        BankFinal bank = new BankFinal(7.5);  // fixed rate = 7.5%

        double[] amounts = {50000, 100000, 250000};
        String[] customers = {"Rahul", "Sneha", "Amit"};

        for (int i = 0; i < customers.length; i++) {
            double interest = bank.calculateInterest(amounts[i]);
            System.out.println("Customer  : " + customers[i]);
            System.out.println("Principal : Rs. " + amounts[i]);
            System.out.println("Rate      : 7.5%");
            System.out.println("Interest  : Rs. " + interest);
            System.out.println("---------------------------");
        }
    }
}
