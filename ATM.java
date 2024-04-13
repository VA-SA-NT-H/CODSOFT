package com.mycompany.atm_machine;

public class ATM {
    private BankAccount account;

    public ATM(BankAccount account) {
        this.account = account;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > account.getBalance()) {
            throw new InsufficientFundsException();
        }
        account.setBalance(account.getBalance() - amount);
    }

    public void deposit(double amount) {
        account.setBalance(account.getBalance() + amount);
    }

    public double checkBalance() {
        return account.getBalance();
    }
}

class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

class InsufficientFundsException extends Exception {
    // Custom exception for insufficient funds
}

