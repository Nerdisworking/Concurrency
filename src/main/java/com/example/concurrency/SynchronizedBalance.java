package com.example.concurrency;

public class SynchronizedBalance {

    private int balance;

    public synchronized int getBalance() {
        return balance;
    }

    public synchronized void addToBalance (int amount) {
        balance +=amount;
    }
}
