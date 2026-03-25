package Assignment;

// Q12: Payment processing system with abstract class

abstract class Payment {
    abstract void pay(double amount);
}

class CreditCardPayment extends Payment {
    @Override
    void pay(double amount) {
        System.out.println("[Credit Card] Payment of Rs. " + amount + " processed.");
        System.out.println("  → Card ending in **** 4521 charged successfully.");
    }
}

class UPIPayment extends Payment {
    @Override
    void pay(double amount) {
        System.out.println("[UPI] Payment of Rs. " + amount + " processed.");
        System.out.println("  → UPI ID: user@oksbi confirmed.");
    }
}

class NetBankingPayment extends Payment {
    @Override
    void pay(double amount) {
        System.out.println("[Net Banking] Payment of Rs. " + amount + " processed.");
        System.out.println("  → Transaction via HDFC Bank completed.");
    }
}

public class PaymentDemo {
    public static void main(String[] args) {
        System.out.println("=== Payment Processing System ===\n");

        Payment p1 = new CreditCardPayment();
        p1.pay(5000);
        System.out.println();

        Payment p2 = new UPIPayment();
        p2.pay(1500);
        System.out.println();

        Payment p3 = new NetBankingPayment();
        p3.pay(25000);
    }
}
