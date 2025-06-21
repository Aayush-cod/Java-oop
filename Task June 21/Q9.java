class Account {
    double balance = 10000;
    double calculateInterest() {
        return balance * 0.03;
    }
}

class SavingsAccount extends Account {
    @Override
    double calculateInterest() {
        return balance * 0.04;
    }
}

class FixedDepositAccount extends Account {
    @Override
    double calculateInterest() {
        return balance * 0.06;
    }
}

public class Q9 {
    public static void main(String[] args) {
        Account a1 = new SavingsAccount();
        Account a2 = new FixedDepositAccount();
        System.out.println("Savings Interest: " + a1.calculateInterest());
        System.out.println("FD Interest: " + a2.calculateInterest());
    }
}
