import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class OddEvenPrinter {
    private static final Object monitor = new Object();
    private static final ReentrantLock lock = new ReentrantLock();
    private static final Condition condition = lock.newCondition();

    private static int value = 1;

    public static void main(String[] args) {
        PrintRunnable2 runnable = new PrintRunnable2();
        new Thread(runnable).start();
        new Thread(runnable).start();

    }
    static class PrintRunnable2 implements Runnable{
        @Override
        public void run() {
            try{
                lock.lock();
                while (value < 11){
                    System.out.println(Thread.currentThread().getName() + ": " + value++);
                    condition.signalAll();
                    if (value < 11) {
                        condition.await();
                    }
                }
            }
            catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }
    }

    static class PrintRunnable implements Runnable {
        @Override
        public void run() {
            synchronized (monitor) {
                while (value <= 10) {
                    System.out.println(Thread.currentThread().getName() + ": " + value++);
                    monitor.notify();
                    try {
                        if (value < 11) {
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
