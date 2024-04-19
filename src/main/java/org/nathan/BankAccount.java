package org.nathan;

public class BankAccount {

    private double balance = 0;

    public double debitBalance(double amount) {
        this.balance = balance - amount;
        return balance;
    }

    public double creditBalance(double amount) {
        this.balance = balance + amount;
        return balance;
    }
}
