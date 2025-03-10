package org.example.ThreadJava;

public class BankAccount {
    private int balance;

    public BankAccount(int initBalance) {
        this.balance = initBalance;
    }

    public int getBalance() {
        return this.balance;
    }

    public void withdraw(int amount) {
        this.balance = this.balance - amount;
    }

}
