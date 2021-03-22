package com.learnings;

import java.util.concurrent.locks.ReentrantLock;


public class ThreadWithLocks extends Thread {
    public static int number = 0;

    private static final ReentrantLock mReentrantLock = new ReentrantLock();

    @Override
    public void run()
    {
        super.run();
        this.incrementNum();
    }

    public void incrementNum()
    {
        mReentrantLock.lock();
        System.out.printf("Thread %s: Number before updating %d\n", Thread.currentThread().getName(), number);
        number++;
        System.out.printf("Thread %s: Number after updating  %d\n", Thread.currentThread().getName(), number);
        mReentrantLock.unlock();
    }

    public static void main(String[] args)
    {
        final ThreadWithLocks threadOne = new ThreadWithLocks();
        final ThreadWithLocks threadTwo = new ThreadWithLocks();
        final ThreadWithLocks threadThree = new ThreadWithLocks();
        final ThreadWithLocks threadFour = new ThreadWithLocks();
        threadOne.start();
        threadTwo.start();
        threadThree.start();
        threadFour.start();
    }
}
