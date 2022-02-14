package com.example.concurrency;

public class Balance {

    private int balance;

    public int getBalance() {
        return balance;
    }

    public void addToBalance(int amount){
        balance += amount;
    }
}
