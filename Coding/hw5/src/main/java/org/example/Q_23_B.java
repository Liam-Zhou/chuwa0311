package org.example;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Q_23_B {

    private final Lock lock = new ReentrantLock();
    private final Condition turn = lock.newCondition();
    private int count = 1;
    private final int limit = 10;

    // Method to print numbers
    public void printNumbers(boolean isOdd) {
        try {
            lock.lock();
            while (count <= limit) {
                if ((count % 2 == 0) != isOdd) { // If it's not this thread's turn
                    turn.await();
                } else {
                    System.out.println(Thread.currentThread().getName() + ": " + count);
                    count++;
                    turn.signalAll(); // Notify the other thread it's their turn
                }
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        Q_23_B printer = new Q_23_B();

        Thread oddPrinter = new Thread(() -> printer.printNumbers(true), "Odd Printer");
        Thread evenPrinter = new Thread(() -> printer.printNumbers(false), "Even Printer");

        oddPrinter.start();
        evenPrinter.start();
    }


}
