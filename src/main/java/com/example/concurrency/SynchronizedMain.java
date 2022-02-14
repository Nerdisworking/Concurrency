package com.example.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SynchronizedMain {

    private static final int NUM_ITERATIONS = 1000;
    private static final int NUM_THREADS = 20;

    public static void main (String[] args) throws InterruptedException{
        SynchronizedBalance synchBalance = new SynchronizedBalance();
        ExecutorService executor = Executors.newFixedThreadPool(NUM_THREADS);

        for (int i = 0; i< NUM_ITERATIONS; i++){
            executor.submit(()-> synchBalance.addToBalance(5));
        }
executor.shutdown();
        executor.awaitTermination(1, TimeUnit.MINUTES);

        System.out.println("Balance: " + synchBalance.getBalance());
    }
}
