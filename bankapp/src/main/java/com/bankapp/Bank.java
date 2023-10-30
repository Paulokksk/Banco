package bankapp.src.main.java.com.bankapp;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Account> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public Account createAccount(int accountNumber, double initialBalance) {
        Account account = new Account(accountNumber, initialBalance);
        accounts.add(account);
        return account;
    }

    public List<Account> getAllAccounts() {
        return accounts;
    }

    public void deposit(Account account, double amount) {
        if (amount > 0) {
            account.balance += amount;
        } else {
            System.out.println("O valor do depósito deve ser maior que zero.");
        }
    }
}
