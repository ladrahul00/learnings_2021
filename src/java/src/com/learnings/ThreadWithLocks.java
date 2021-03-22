
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

/*
Output:

Thread Thread-0: Number before updating 0
Thread Thread-0: Number after updating  1
Thread Thread-1: Number before updating 1
Thread Thread-1: Number after updating  2
Thread Thread-2: Number before updating 2
Thread Thread-2: Number after updating  3
Thread Thread-3: Number before updating 3
Thread Thread-3: Number after updating  4
 */