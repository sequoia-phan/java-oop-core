package org.example.ThreadJava;

public class PeopleJob implements Runnable {
    private BankAccount account;

    public PeopleJob(BankAccount account) {
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            boolean withdrawable = this.makeWithdrawal(10);
            if (!withdrawable) return;
            if (this.account.getBalance() < 0) {
                System.out.println("Overdrawn");
            }
        }
    }

    private synchronized boolean makeWithdrawal(int amount) {
        if (this.account.getBalance() < amount) {
            System.out.println("Sorry, not enough for " + Thread.currentThread().getName());
            return false;
        }
        System.out.println(Thread.currentThread().getName() + " is about to withdraw.");
        try {
            System.out.println(Thread.currentThread().getName() + " is going to sleep.");
            Thread.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " woke up.");
        this.account.withdraw(amount);
        System.out.println(Thread.currentThread().getName() + " completes the withdrawal ");
        return true;
    }

}
