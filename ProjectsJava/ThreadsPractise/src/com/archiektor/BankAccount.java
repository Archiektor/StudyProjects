package com.archiektor;

/**
 * Created by Archiektor on 04.04.2017.
 */
public class BankAccount {

    public BankAccount(int balance) {
        this.balance = balance;
    }

    private int balance;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void display() {
        System.out.println("Balance = " + balance);
    }

    public void withdraw(int sum) {
        balance -= sum;
    }
}
