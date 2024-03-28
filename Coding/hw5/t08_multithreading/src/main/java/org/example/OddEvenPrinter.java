package org.example;

public class OddEvenPrinter {
    private static final Object monitor = new Object();
    private static int val = 1;
    public static void main(String[] args) {
        Thread oddThread = new Thread(new PrintRunnable());
        Thread evenThread = new Thread(new PrintRunnable());

        oddThread.start();
        evenThread.start();
    }

    static class PrintRunnable implements Runnable {
        @Override
        public void run() {
            synchronized (monitor) { // Acquire the monitor lock
                while (val <= 10) {
                    System.out.println(Thread.currentThread().getName() + ": "+ val++);
                    // Notify the waiting thread that it can wake up
                    monitor.notify();
                    try {
                        if (val < 11) {
                            // Release the lock and wait for next notice
                            monitor.wait();
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }





}
