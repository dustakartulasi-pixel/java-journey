package Week08;

import java.util.Scanner;

class BankAccount {
    private double balance;

    BankAccount(double balance) {
        if (balance > 0) {
            this.balance = balance;
        } else {
            balance = 0;
        }
    }
    // Store opening balance

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance = balance + amount;
        }
    }
    // Add only a positive amount

    public double getBalance() {
        // Return balance
        return this.balance;

    }
}

public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the opening balance");
        double balance = sc.nextDouble();
        System.out.println("Enter the amount to deposit");
        double amount = sc.nextDouble();
        BankAccount b = new BankAccount(balance);
        System.out.println("Initial Balance: " + b.getBalance());
        b.deposit(amount);
        System.out.println("Balance after deposit: " + b.getBalance());
        sc.close();
    }
}
