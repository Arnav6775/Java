package Assignment;

// Q10: Bank interface with SBI, HDFC, ICICI implementations

interface Bank {
    double getInterestRate();
}

class SBI implements Bank {
    @Override
    public double getInterestRate() {
        return 7.0;
    }
}

class HDFC implements Bank {
    @Override
    public double getInterestRate() {
        return 7.5;
    }
}

class ICICI implements Bank {
    @Override
    public double getInterestRate() {
        return 6.9;
    }
}

public class BankDemo {
    public static void main(String[] args) {
        Bank sbi  = new SBI();
        Bank hdfc = new HDFC();
        Bank icici = new ICICI();

        System.out.println("======= Bank Interest Rates =======");
        System.out.println("SBI   : " + sbi.getInterestRate() + "%");
        System.out.println("HDFC  : " + hdfc.getInterestRate() + "%");
        System.out.println("ICICI : " + icici.getInterestRate() + "%");
        System.out.println("====================================");
    }
}
