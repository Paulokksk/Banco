package bankapp.src.main.java.com.bankapp;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Account account1 = bank.createAccount(1, 1000.0);
        Account account2 = bank.createAccount(2, 2000.0);

        System.out.println("Account 1 - Number: " + account1.getAccountNumber() + ", Balance: $" + account1.getBalance());
        System.out.println("Account 2 - Number: " + account2.getAccountNumber() + ", Balance: $" + account2.getBalance());
    }
}
