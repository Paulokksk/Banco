package bankapp.src.main.java.com.bankapp;

public class Account {
    private int accountNumber;
    double balance;

    public Account(int accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}
