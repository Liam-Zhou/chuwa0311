package org.example;

import java.util.Random;
import java.util.concurrent.*;

public class ThreeThreadPrint {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        executorService.submit(new PrintNumbersTask(1,10));
        executorService.submit(new PrintNumbersTask(11,20));
        executorService.submit(new PrintNumbersTask(21,30));
        executorService.shutdown();
    }
    static class PrintNumbersTask implements Callable<Void> {
        private final int start, end;
        private final Random random;
        public PrintNumbersTask(int start, int end) {
            this.start = start;
            this.end = end;
            this.random = new Random();
        }
        @Override
        public Void call() {
            Thread currentThread = Thread.currentThread();
            try {
                Thread.sleep(random.nextInt(1000));
                for (int i = start; i <= end; i++) {
                    System.out.println(currentThread.getName() + ": " + i);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return null;
        }
    }

}
