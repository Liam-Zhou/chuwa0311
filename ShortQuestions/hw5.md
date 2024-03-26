2.  Explain what is volatile in java? (we also use it in Singleton)

the volatile keyword is used to indicate that a variable's value will be modified by different threads. 
Using volatile ensures that the value of the variable is always read from the main memory, not from a thread's cache memory. 
This guarantees visibility of changes to variables across threads.

3.  How to create a new thread(Please also consider Thread Pool approach)?

    * extend the Thread class 
    * implement the Runnable interface
    * implement  the Callable interface
    * For a thread pool approach, we use the Executor framework 


4.  Difference between Runnable and Callable?

Runnable cannot return a result or throw a checked exception.

Callable can return a result and throw a checked exception. 
It returns a Future object to retrieve the result asynchronously.

5.  What is the difference between t.start() and t.run()?

t.start() starts a new thread and calls the run() method to execute in that new thread.
t.run() simply calls the run() method in the current thread, without starting a new thread.

6.  Which way of creating threads is better: Thread class or Runnable interface?

Using the Runnable interface is generally better because it allows you to extend another class. 
Java does not support multiple inheritance, so if you extend Thread, you can't extend any other class.

7. What are the thread statuses?

The main thread statuses are New, Runnable, Blocked, Waiting, Timed Waiting, and Terminated.

8.  What is deadlock?

Deadlock is a situation in multithreading where two or more threads are blocked forever, waiting for each other to release a resource they need.

9.  How do threads communicate each other?

Threads can communicate with each other through shared objects. Wait, notify, and notifyAll methods are used for communication purposes.

10. What’s the difference between class lock and object lock?

Object Lock: Synchronized instance methods or synchronized block on 'this' lock the current instance of the object.

Class Lock: Synchronized static methods or synchronized block on ClassName.class lock the Class object associated with the class.

11. What is join() method?

The join() method allows one thread to wait for the completion of another. 
If t is a Thread instance, t.join() causes the current thread to pause execution until t's thread terminates.

12. what is yield() method

The yield() method causes the currently executing thread object to temporarily pause and allow other threads to execute.

13. What is ThreadPool? How many types of ThreadPool? What is the TaskQueue in ThreadPool?

A ThreadPool is a collection of threads that are available to perform tasks. It reduces the overhead of thread creation. 
Tasks are submitted to the pool, and threads in the pool execute these tasks. 
There are different types of ThreadPools like FixedThreadPool, CachedThreadPool, and ScheduledThreadPool. 
The TaskQueue is a queue of tasks that are waiting to be executed by threads in the pool.

14. Which Library is used to create ThreadPool? Which Interface provide main functions of thread-pool?

The Executor framework (java.util.concurrent) is used to create ThreadPool in Java. 
The ExecutorService interface provides the main functions of the thread pool.

15. How to submit a task to ThreadPool?

executor.submit()

16. What is the advantage of ThreadPool?

ThreadPool improves performance by reducing the overhead of thread creation, especially in applications that execute many short-lived asynchronous tasks.

17.  Difference between shutdown() and shutdownNow() methods of executor

shutdown() initiates a graceful shutdown; it doesn't accept new tasks but finishes the queued tasks.
shutdownNow() tries to stop all actively executing tasks and halts the processing of waiting tasks.

18. What is Atomic classes? How many types of Atomic classes? Give me some code example of Atomic classes and its main methods. when to use it?

Atomic classes provide a thread-safe way to perform atomic operations on single variables without using synchronization.
Types include AtomicInteger, AtomicLong, AtomicBoolean, etc.
```java
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicExample {
    private static AtomicInteger counter = new AtomicInteger(0);

    public static void increment() {
        counter.incrementAndGet();
    }

    public static void main(String[] args) {
        increment();
        System.out.println(counter);
    }
}
```

Use atomic classes when you need to perform thread-safe operations on single variables without using synchronized keyword.

19. What is the concurrent collections? Can you list some concurrent data structure (Thread-safe)

Concurrent collections are designed to allow concurrent access to different parts of the collection.

* ConcurrentHashMap: A thread-safe version of HashMap.
* ConcurrentLinkedQueue: A thread-safe version of Queue based on linked nodes.
* CopyOnWriteArrayList: A thread-safe variant of ArrayList.

20. What kind of locks do you know? What is the advantage of each lock?

Reentrant Lock: Allows locking and unlocking multiple times by the same thread. It offers the same basic behavior and semantics as the implicit monitors accessed using synchronized methods and statements but with extended capabilities.

Read/Write Locks: Allow multiple threads to read a resource concurrently as long as no thread is writing to it. Write locks are exclusive.

Stamped Lock: Provides a capability-based lock with three modes for controlling read/write access. It might offer better performance than ReadWriteLock in certain scenarios.


21. What is future and completableFuture? List some main methods of
    ComplertableFuture.

Future: Represents the result of an asynchronous computation. Methods are provided to check if the computation is complete, to wait for its completion, and to retrieve the result of the computation.

CompletableFuture: An enhancement over Future that may be explicitly completed (setting its value and status), and can be used as a Future, supporting methods like thenApply, thenAccept, and thenCompose to chain operations sequentially or run them in parallel.

Main methods of CompletableFuture:

thenApply(Function): Returns a new CompletableFuture that, when this stage completes normally, is executed with this stage's result as the argument to the supplied function.

thenAccept(Consumer): Performs an action with the result of the CompletableFuture.

thenCompose(Function): Returns a new CompletableFuture that is completed when a stage returned by the supplied function completes.

complete(T value): Completes the CompletableFuture with the given value.

exceptionally(Function): Returns a new CompletableFuture that, when this stage completes exceptionally, is executed with this stage's exception as the argument to the supplied function.

23. Write a code to create 2 threads, one thread print 1,3,5,7,9, another thread print
    2,4,6,8,10. (solution is in
    com.chuwa.tutorial.t08_multithreading.c05_waitNotify.OddEventPrinter)
    a. One solution use synchronized and wait notify
    b. One solution use ReentrantLock and await, signal

```java
public class SequentialPrinter {
    private final Object lock = new Object();
    private int count = 1;
    private final int MAX = 10;

    public void printNumber() {
        synchronized (lock) {
            while (count <= MAX) {
                System.out.println(Thread.currentThread().getName() + ": " + count++);
                lock.notifyAll(); // Notify the other thread
                if (count <= MAX) {
                    try {
                        lock.wait(); // Wait for the other thread
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        System.out.println("Thread interrupted");
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        SequentialPrinter printer = new SequentialPrinter();
        Thread t1 = new Thread(printer::printNumber, "Thread-0");
        Thread t2 = new Thread(printer::printNumber, "Thread-1");
        t1.start();
        t2.start();
    }
}
```

```java
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SequentialPrinterLock {
    private final Lock lock = new ReentrantLock();
    private final Condition condition = lock.newCondition();
    private int count = 1;
    private final int MAX = 10;

    public void printNumber() {
        lock.lock();
        try {
            while (count <= MAX) {
                System.out.println(Thread.currentThread().getName() + ": " + count++);
                condition.signalAll(); // Signal the other thread
                if (count <= MAX) {
                    condition.await(); // Wait for the signal
                }
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Thread interrupted");
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        SequentialPrinterLock printer = new SequentialPrinterLock();
        Thread t1 = new Thread(printer::printNumber, "Thread-0");
        Thread t2 = new Thread(printer::printNumber, "Thread-1");
        t1.start();
        t2.start();
    }
}

```

24. create 3 threads, one thread ouput 1-10, one thread output 11-20, one thread
    output 21-22. threads run sequence is random. (solution is in
    com.chuwa.exercise.t08_multithreading.PrintNumber1)

```java
public class PrintNumber1 {
    private static int n = 1;

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> printNumber());
        Thread t2 = new Thread(() -> printNumber());
        Thread t3 = new Thread(() -> printNumber());

        t1.start();
        t2.start();
        t3.start();
    }

    private static synchronized void printNumber() {
        int count = 10;
        while (count-- > 0) {
            System.out.println(Thread.currentThread().getName() + ": " + n++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        PrintNumber1.class.notifyAll();
    }
}
```

25. completable future:

see Coding/hw5