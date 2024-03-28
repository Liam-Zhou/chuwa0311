package org.example;

import java.util.Comparator;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SolutionForReentrantLock implements Runnable{
    private static Lock lock = new ReentrantLock();
    public static Condition oddCondition = lock.newCondition();
    public static Condition evenCondition = lock.newCondition();
    // change made to count are immediately visible to all threads
    private static volatile int count = 1;
    private final boolean isOddThread;

    public SolutionForReentrantLock(boolean isOddThread) {
        this.isOddThread = isOddThread;
    }

    public static void main(String[] args) {
        Thread oddThread = new Thread(new SolutionForReentrantLock(true));
        Thread evenThread = new Thread(new SolutionForReentrantLock(false));

        oddThread.start();
        evenThread.start();
    }

    @Override
    public void run() {
        while (count <= 10) {
            lock.lock();
            try {
                if ((isOddThread && count % 2 == 1) || (!isOddThread && count % 2 == 0)) {
                    System.out.println(Thread.currentThread().getName() + ": " + count++);
                    if (isOddThread) {
                        evenCondition.signal();
                    } else {
                        oddCondition.signal();
                    }
                } else {
                    try {
                        if (isOddThread) {
                            oddCondition.await();
                        } else {
                            evenCondition.await();
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            } finally {
                lock.unlock();
            }
        }
    }
}
