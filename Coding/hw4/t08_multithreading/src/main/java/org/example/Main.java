package org.example;

public class Main {
    public static void main(String[] args) {
        MyRunnable runnable1 = new MyRunnable("Thread 1");
        MyRunnable runnable2 = new MyRunnable("Thread 2");

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);

        thread1.start(); // Start the first thread
        thread2.start(); // Start the second thread
    }
}