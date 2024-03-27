package org.example;

public class Q_24 implements Runnable{
    private final int start;
    private final int end;

    public Q_24(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            System.out.println(Thread.currentThread().getName() + " outputs: " + i);
        }
    }

    public static void main(String[] args) {
        // Create three threads with different ranges
        Thread t1 = new Thread(new Q_24(1, 10), "Thread 1");
        Thread t2 = new Thread(new Q_24(11, 20), "Thread 2");
        Thread t3 = new Thread(new Q_24(21, 30), "Thread 3");

        // Start the threads
        t1.start();
        t2.start();
        t3.start();
    }

}
