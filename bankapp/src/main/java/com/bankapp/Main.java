package bankapp.src.main.java.com.bankapp;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Account account1 = bank.createAccount(1, 1000.0);
        Account account2 = bank.createAccount(2, 2000.0);

        System.out.println("Conta 1 - Número: " + account1.getAccountNumber() + ", Saldo: $" + account1.getBalance());
        System.out.println("Conta 2 - Número: " + account2.getAccountNumber() + ", Saldo: $" + account2.getBalance());

        // Realize um depósito na conta 1
        bank.deposit(account1, 500.0);
        System.out.println("Depósito de $500 realizado na conta 1.");

        System.out.println("Conta 1 - Novo Saldo: $" + account1.getBalance());
    }
}

