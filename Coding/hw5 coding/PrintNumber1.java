public class PrintNumberWithMonitor {
    private static final Object monitor = new Object();
    private static int n = 1;
    private static int totalNumbers = 30;
    private static int numbersPerThread = totalNumbers / 3;

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> printNumber(numbersPerThread));
        Thread t2 = new Thread(() -> printNumber(numbersPerThread));
        Thread t3 = new Thread(() -> printNumber(totalNumbers - 2 * numbersPerThread));
        t1.start();
        t2.start();
        t3.start();
    }

    private static void printNumber(int count) {
        synchronized (monitor) {
            while (count-- > 0) {
                System.out.println(Thread.currentThread().getName() + ": " + n++);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}