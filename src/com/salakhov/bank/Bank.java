package com.salakhov.bank;

import java.util.Random;

public class Bank {
    /*method for creating a new account*/
    public static BankAccount createAccount() {
        String accountNumber = generateAccountNumber();
        return new BankAccount(accountNumber);
    }

    /*deposit method*/
    public static void deposit(BankAccount account, double amount) {
        account.deposit(amount);
    }

    /*withdraw money method*/
    public static void withdraw(BankAccount account, double amount) {
        account.withdraw(amount);
    }

    /*transfer method*/
    public static void transfer(BankAccount senderAccount, BankAccount receiverAccount, double amount) {
        int limit = 100000;
        if (amount < limit) {
            senderAccount.withdraw(amount);
            receiverAccount.deposit(amount);
        } else {
            System.out.println("Transaction decline, limit is " + limit);
        }
    }

    /*this method are generates a new accountNumber for bankAccount*/
    private static String generateAccountNumber() {
        Random random = new Random();
        int randomNumber = random.nextInt(Integer.MAX_VALUE);
        return String.valueOf(randomNumber);
    }
}



