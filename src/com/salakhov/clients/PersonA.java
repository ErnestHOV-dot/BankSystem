package com.salakhov.clients;

import com.salakhov.bank.Bank;
import com.salakhov.bank.BankAccount;

public class PersonA {
    private final String name;
    private final String surname;
    public BankAccount bankAccount;

    /*creating a constructor with a first name, last name, and bankAccount*/
    public PersonA(String name, String surname, BankAccount bankAccount) {
        this.name = name;
        this.surname = surname;
        this.bankAccount = bankAccount;
    }

    /*method for deposit money on current bankAccount*/
    public void depositToBankAccount(double amount) {
        Bank.deposit(bankAccount, amount);
    }

    /*method for withdraw money from current bankAccount*/
    public void withdrawFromBankAccount(double amount) {
        Bank.withdraw(bankAccount, amount);
    }

    /*method for transfer money from current bankAccount to receiver bankAccount*/
    public void transferToBankAccount(BankAccount receiverAccount, double amount) {
        Bank.transfer(bankAccount, receiverAccount, amount);
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }


    public double getBalance() {
        return bankAccount.getBalance();
    }

    /*method for getting an invoice bankAccount*/
    public String getPersonAccount() {
        return bankAccount.getAccountNumber();
    }

}
