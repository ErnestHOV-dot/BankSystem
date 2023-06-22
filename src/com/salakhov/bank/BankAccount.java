package com.salakhov.bank;

public class BankAccount {
    private final String accountNumber;
    private double balance;

    /*a constructor ¯\(o_o)/¯*/
    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    /*method for deposit */
    public void deposit(double amount) {
        balance += amount;
    }

    /*method for withdraw*/
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Successful transaction!");
            System.out.println("Your current balance is " + balance);
        } else {
            System.out.println("Transaction decline, insufficient funds!");
        }
    }
}
