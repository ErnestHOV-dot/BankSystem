package com.salakhov;

import com.salakhov.bank.Bank;
import com.salakhov.bank.BankAccount;
import com.salakhov.clients.PersonA;
import com.salakhov.clients.PersonB;

public class Main {
    public static void main(String[] args) {
        BankAccount accountA = Bank.createAccount();
        BankAccount accountB = Bank.createAccount();
        PersonA personA = new PersonA("John", "Ma", accountA);
        PersonB personB = new PersonB("Li", "Sin", accountB);
        personA.depositToBankAccount(400.0);
       // personA.withdrawFromBankAccount(50.0);
        personA.transferToBankAccount(personB.getBankAccount(), 100.0);
        //System.out.println(personA.getBalance() + " " + personB.getBalance());
        System.out.println(personA.getPersonAccount());
        System.out.println(personB.getPersonAccount());
    }
}