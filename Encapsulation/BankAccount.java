package Encapsulation;

public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountNumber, String name) {
        this.accountNumber = accountNumber;
        this.accountHolderName = name;
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456", "Ayush");
        account.deposit(5000);
        account.withdraw(2000);
        System.out.println("Balance: " + account.getBalance());
    }
}
