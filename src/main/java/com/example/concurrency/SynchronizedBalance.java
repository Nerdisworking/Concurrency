package com.example.concurrency;

public class SynchronizedBalance {

    private int balance;

    public synchronized int getBalance() {
        return balance;
    }

    /**
     * public synchronized int getBalance() { return balance; }
     * public int getBalance() {synchronized(this){ return balance; } }
     *     Both are Same
     * **/

    public synchronized void addToBalance (int amount) {
        balance +=amount;
    }

    /**
     * public synchronized void addToBalance (int amount) { balance +=amount;}
     *
     * public void addToBalance (int amount) synchronized(this){{ balance +=amount;}}
     *
     * Both are same
     *
     * synchronized (this){}
     * **/
}
