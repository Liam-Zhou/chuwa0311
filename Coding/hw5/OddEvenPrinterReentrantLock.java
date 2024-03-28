package com.elaine.getStarted;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class OddEvenPrinterReentrantLock {
    private static final Lock lock = new ReentrantLock();
    private static Condition condition = lock.newCondition();
    private static int value = 1;

    public void printNumber() {
        lock.lock();
        try {
            while (value <= 10) {
                System.out.println(Thread.currentThread().getName() + ": " + value++);
                condition.signalAll();
                if (value <= 10) {
                    condition.await();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        OddEvenPrinterReentrantLock printer = new OddEvenPrinterReentrantLock();
        Thread t1 = new Thread(printer::printNumber);
        Thread t2 = new Thread(printer::printNumber);
        t1.start();
        t2.start();
    }

}
