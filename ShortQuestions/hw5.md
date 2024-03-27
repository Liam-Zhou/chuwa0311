### 1. Read: https://www.interviewbit.com/multithreading-interview-questions/#class-level-lock-vs-object-level-lock
Completed

### 2. Explain what is volatile in java? (we also use it in Singleton)
In Java, the volatile keyword is used to indicate that a variable's value will be modified by different threads. It is a modifier that can be applied to variables of any type, including primitives and objects. When a variable is declared as volatile, JVM is instructed to read directly from main memory and bypass the thread cache that is normally used for performance optimization.

### 3. How to create a new thread(Please also consider Thread Pool approach)?
1. Using `Thread` class or `Runnable` interface
    a. Extending the `Thread` class:
    ```java
    class MyThread extends Thread {
        public void run() {
            System.out.println("Running");
        }
    }

    public class Main {
        public static void main(String[] args) {
            MyThread t = new MyThread();
            t.start();
        }
    }
    ```
    b. Implementing the Runnable interface:
    ```java
    class MyRunnable implements Runnable {
        public void run() {
            System.out.println("Running");
        }
    }

    public class Main {
        public static void main(String[] args) {
            Thread t = new Thread(new MyRunnable());
            t.start();
        }
    }
    ```
2. Using a Thread Pool
```java
public class ThreadPoolExample {
    public static void main(String[] args) {
        // Creates a thread pool with a fixed number of threads
        ExecutorService executor = Executors.newFixedThreadPool(5);

        // Submit tasks to the executor
        for (int i = 0; i < 10; i++) {
            Runnable worker = new WorkerThread("" + i);
            executor.execute(worker);
        }

        // Shutdown the executor
        executor.shutdown();
        while (!executor.isTerminated()) {
            // Wait for all tasks to finish
        }
        System.out.println("Finished all threads");
    }
}

class WorkerThread implements Runnable {
    private String command;
    
    public WorkerThread(String s) {
        this.command = s;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Start. Command = " + command);
        // Simulate work
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " End.");
    }
}
```

### 4. Difference between Runnable and Callable?
The `Runnable` interface requires the implementing class to define a `run()` method. The `Callable` interface requires the implementing class to define a `call()` method. Unlike `run()`, the `call()` method is allowed to return a result and throw a checked exception.

### 5. What is the difference between t.start() and t.run()?
`t.start()` initializes a new thread and has the Java runtime call the `run()` method of the Thread object in this new thread, facilitating concurrent execution. `t.run()` simply executes the `run()` method in the current thread, without starting a new thread, thus behaving like a normal method call.

### 6. Which way of creating threads is better: Thread class or Runnable interface?
If your task is simple and does not require extending another class or accessing shared resources, extending Thread might be sufficient and straightforward. Implementing the Runnable (or Callable for tasks that return a result or throw exceptions) interface is generally preferred due to its flexibility, ability to work with thread pools, and compatibility with best practices in concurrent programming.

### 7. What are the thread statuses?
1. NEW: A thread that has been created but not yet started. 
2. RUNNABLE: A thread that is executing in JVM is in this state.
3. BLOCKED: A thread that is blocked waiting for a monitor lock is in this state.
4. WAITING: A thread that is waiting indefinitely for another thread to perform a particular action is in this state.
5. TIMED_WAITING: A thread that is waiting for another thread to perform a specific action for up to a specified waiting time is in this state.
6. TERMINATED: A thread that has exited is in this state.

### 8. What is deadlock?
A deadlock is a situation in concurrent programming where two or more threads are blocked forever, each waiting for the other to release a resource they need. It is a bug that occurs when multiple threads need the same locks, but obtain them in a different order. If every thread holds a lock and waits for a lock held by another thread, the cycle of dependencies causes a deadlock, and none of the threads can proceed.

### 9. How do threads communicate each other?
1. Shared Objects and Variables: The synchronized keyword, locks from the java.util.concurrent.locks package, or atomic variables from the java.util.concurrent.atomic package can ensure that changes made by one thread are visible to others in a thread-safe manner.
2. Wait/Notify Mechanism:
- wait(): Causes the current thread to wait until another thread invokes the notify() or notifyAll() method for this object.
- notify(): Wakes up a single thread that is waiting on this object's monitor.
- notifyAll(): Wakes up all threads that are waiting on this object's monitor. 
3. Signaling with java.util.concurrent Classes
4. Volatile Variables
5. CompletableFuture and Future: They allow threads to perform operations asynchronously and then retrieve the result or wait for the computation to complete. CompletableFuture also supports a range of operations for composing, combining, executing asynchronous callbacks, and transferring data across threads.

### 10. What’s the difference between class lock and object lock?
Object Lock: Synchronizes access to an object's instance methods or blocks, ensuring thread safety for instance variables. Each object has its own lock. Class Lock: Synchronizes access to a class's static methods or blocks, ensuring thread safety for static variables. There is one lock per class, associated with the class's Class object.

### 11. What is join() method?
The join() method in Java is a mechanism that allows one thread to wait for the completion of another thread. When a thread executes the join() method on another thread instance, the calling thread goes into a waiting state. It remains in this state until the referenced thread terminates or until the specified waiting time elapses, if a timeout is provided.


### 12. what is yield() method
The yield() method in Java is a static method of the Thread class that causes the currently executing thread to temporarily pause and allow other threads to execute. Specifically, when a thread calls yield(), it signals to the thread scheduler that it's willing to relinquish its current use of the processor but can be scheduled again to resume execution. The scheduler is free to ignore this hint.

### 13. What is ThreadPool? How many types of ThreadPool? What is the TaskQueue in ThreadPool?
A ThreadPool in Java is a group of pre-instantiated reusable threads that are used to execute tasks. Types of ThreadPool: 
1. Fixed Thread Pool: Creates a pool with a fixed number of threads.
2. Cached Thread Pool: Creates a thread pool that creates new threads as needed, but will reuse previously constructed threads when they are available.
3. Single Thread Executor: A thread pool with only one thread. All submitted tasks are executed sequentially. 
4. Scheduled Thread Pool: Designed to schedule commands to run after a given delay, or to execute periodically. 
5. Work Stealing Pool: Based on a Fork/Join framework, this pool attempts to utilize the CPU as efficiently as possible by allowing idle threads to "steal" tasks from busy threads. 

The TaskQueue is a queue used by the thread pools to store tasks before they are executed. 

### 14. Which Library is used to create ThreadPool? Which Interface provide main functions of thread-pool?
In Java, the creation and management of thread pools are facilitated primarily by the java.util.concurrent package, which introduces a powerful set of concurrency utilities designed to simplify the development of concurrent applications. The main interface that provides the functionality of a thread pool in the java.util.concurrent package is the ExecutorService interface. 

### 15. How to submit a task to ThreadPool?
lambda function to submit a task:
```java
executor.submit(() -> System.out.println("Runnable task is running."));
```

### 16. What is the advantage of ThreadPool?
1. Reduced Overhead: Creating and destroying threads for each task can be expensive in terms of both time and system resources.
2. Improved Resource Management: Thread pools allow for more efficient use of system resources. 
3. Enhanced Scalability: Applications that use thread pools can scale more easily.
4. Simplified Task Submission and Execution Management
5. Improved Application Stability: Using thread pools helps to prevent a common pitfall of creating too many threads, which can lead to OutOfMemoryError and other stability issues. 
6. Task Scheduling and Execution Control: Thread pools in Java's concurrent package (java.util.concurrent) often come with built-in capabilities for scheduling tasks to run at specific times (delayed execution) or at fixed intervals (periodic execution). 
7. Improved Performance on Multi-Core Systems

### 17. Difference between shutdown() and shutdownNow() methods of executor
Shutdown has gradual termination, has no interruption of running tasks while shutdownNow() has an immediate termination with interruption of running tasks. shutdownNow() would return a list of unexecuted tasks. 

### 18. What is Atomic classes? How many types of Atomic classes? Give me some code example of Atomic classes and its main methods. when to use it?
Atomic classes in Java are part of the java.util.concurrent.atomic package, introduced in Java 5 to provide a way to perform atomic (i.e., thread-safe without using synchronization) operations on single variables. These classes are designed for scenarios where threads are competing to change a single variable, ensuring that all operations (such as increment, decrement, and compare-and-set) are atomic. Types of Atomic classes:
1. Atomic Integer Types:
- AtomicInteger
- AtomicLong
- AtomicIntegerArray
- AtomicLongArray
2. Atomic Reference Types:
- AtomicReference<T>
- AtomicReferenceArray<T>
- AtomicMarkableReference<T>
- AtomicStampedReference<T>
3. Atomic Boolean Type:
- AtomicBoolean
4. Atomic Updateable Field and Array Element Types:
- AtomicIntegerFieldUpdater<T>
- AtomicLongFieldUpdater<T>
- AtomicReferenceFieldUpdater<T,V>
Example:
```java
public class AtomicIntegerExample {
    private AtomicInteger count = new AtomicInteger(0);

    public void increment() {
        count.incrementAndGet(); // Atomically increments by one
    }

    public int getCount() {
        return count.get(); // Returns the current value
    }

    public static void main(String[] args) {
        AtomicIntegerExample example = new AtomicIntegerExample();
        example.increment();
        System.out.println(example.getCount()); // Outputs: 1
    }
}
```

Use atomic classes when you need to perform thread-safe operations on single variables without the overhead of synchronization (using synchronized keyword or locks). They are particularly useful in high-concurrency environments where the contention for variables is high, and operations on those variables are simple enough to be handled atomically.

### 19. What is the concurrent collections? Can you list some concurrent data structure (Thread-safe)
Concurrent collections in Java are part of the java.util.concurrent package and are designed to provide thread-safe versions of standard collections with improved performance in concurrent environments. Unlike the synchronized wrappers obtained via Collections.synchronizedList, Collections.synchronizedMap, etc., concurrent collections achieve thread-safety through fine-grained locking or lock-free algorithms, reducing the contention and improving scalability when accessed by multiple threads. List of concurrent data structures:
- ConcurrentHashMap
- ConcurrentLinkedQueue
- ConcurrentLinkedDeque
- CopyOnWriteArrayList
- CopyOnWriteArraySet
- BlockingQueue
- BlockingDeque
- ConcurrentSkipListMap

### 20. What kind of locks do you know? What is the advantage of each lock?
1. Reentrant Lock (ReentrantLock)
- A reentrant mutual exclusion lock with the same basic behavior as the implicit monitors accessed using the synchronized keyword but with extended capabilities. 
- Advantages: Lock Interruption, Try Lock, Fairness
2. ReadWrite Lock (ReentrantReadWriteLock)
- A lock that has one pair of lock for read and write operations. 
- Advantages: Improved Throughput for Read-Intensive Operations, Read-Write Separation
3. Stamped Lock (StampedLock)
- Introduced in Java 8, StampedLock supports both read and write locks. Unlike ReentrantReadWriteLock, it also offers a third locking mode called optimistic locking.
- Advantages: Lightweight and High Throughput, Optimistic Locking, Conversion Capability
4. Condition (Condition)
- More of a mechanism for coordinating thread access based on certain conditions rather than a lock itself.
- Advantages: Fine-grained Synchronization, Multiple Wait Sets

### 21. What is future and completableFuture? List some main methods of ComplertableFuture.
The Future interface represents the result of an asynchronous computation. When a task that implements the Runnable or Callable interface is submitted to an executor service, a Future object is returned. This Future object can be used to check if the computation is complete, wait for its completion, and retrieve the computation's result.
1. Creation:
- supplyAsync(Supplier<U> supplier): Asynchronously executes a supplier function.
- runAsync(Runnable runnable): Asynchronously executes a runnable task.
Transformation and Action:
- thenApply(Function<? super T,? extends U> fn): Transforms the result of this future.
- thenAccept(Consumer<? super T> action): Consumes the result of the future.
- thenRun(Runnable action): Executes a runnable after the completion of this future.
2. Combining Futures:
- thenCombine(CompletionStage<? extends U> other, BiFunction<? super T,? super U,? extends V> fn): Combines this future with another.
- thenCompose(Function<? super T, ? extends CompletionStage<U>> fn): Chains another future using the result of this future.
3. Exception Handling:
- exceptionally(Function<Throwable, ? extends T> fn): Handles exceptions that occur during the future's execution.
- handle(BiFunction<? super T, Throwable, ? extends U> fn): Handles the result or the exception of the future.
4. Utilities:
- allOf(CompletableFuture<?>... cfs): Returns a new CompletableFuture that is completed when all of the given CompletableFutures complete.
- anyOf(CompletableFuture<?>... cfs): Returns a new CompletableFuture that is completed when any of the given CompletableFutures complete.
5. Completion:
- complete(T value): Manually completes the CompletableFuture with a given value.
- completeExceptionally(Throwable ex): Completes the future exceptionally with a Throwable.

### 22. Type the code by your self and try to understand it. (package com.chuwa.tutorial.t08_multithreading)
Please check `/Coding/MuliThread`

### 23. Write a code to create 2 threads, one thread print 1,3,5,7,9, another thread print 2,4,6,8,10. (solution is in com.chuwa.tutorial.t08_multithreading.c05_waitNotify.OddEventPrinter)
a. One solution use synchronized and wait notify
b. One solution use ReentrantLock and await, signal

```java
public class OddEventPrinter {
    private static final Object monitor = new Object();
    private static int value = 1;

    public static void main(String[] args) {
        PrintRunnable runnable = new PrintRunnable();
        new Thread(runnable).start();
        new Thread(runnable).start();
    }

    static class PrintRunnable implements Runnable {
        @Override
        public void run() {
            synchronized(monitor) {
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

```

### 24. create 3 threads, one thread ouput 1-10, one thread output 11-20, one thread output 21-22. threads run sequence is random. (solution is in com.chuwa.exercise.t08_multithreading.PrintNumber1)
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

### 25. completable future:
a. Homework 1: Write a simple program that uses CompletableFuture to asynchronously get the sum and product of two integers, and print the results.
```java
public class AsyncCalc {
    public static void main(String[] args) {
        int number1 = 2;
        int number2 = 3;

        CompletableFuture<Integer> sumFuture = CompletableFuture.supplyAsync(() -> {
            System.out.println("Calculating sum:");
            return number1 + number2;
        });

        CompletableFuture<Integer> productFuture = CompletableFuture.supplyAsync(() -> {
            System.out.println("Calculating product:");
            return number1 * number2;
        });

        sumFuture.thenAcceptBoth(productFuture, (sum, product) -> {
            System.out.println("Sum: " + sum);
            System.out.println("Product: " + product);
        });

        CompletableFuture.allOf(sumFuture, productFuture).join();
    }
}
```

b. Homework 2: Assume there is an online store that needs to fetch data from three APIs: products, reviews, and inventory. Use CompletableFuture to implement this scenario and merge the fetched data for further processing. (需要找public api去模拟，)
i. Sign In to Developer.BestBuy.com
ii. Best Buy Developer API Documentation
(bestbuyapis.github.io)
iii. 可以用fake api https://jsonplaceholder.typicode.com/
```java
public class FetchDataExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<String> productsFuture = CompletableFuture.supplyAsync(() -> {
            // this could be an HTTP GET request to the products API
            return "Product data from API";
        });

        CompletableFuture<String> reviewsFuture = CompletableFuture.supplyAsync(() -> {
            // this could be an HTTP GET request to the reviews API
            return "Reviews data from API";
        });

        CompletableFuture<String> inventoryFuture = CompletableFuture.supplyAsync(() -> {
            // this could be an HTTP GET request to the inventory API
            return "Inventory data from API";
        });

        CompletableFuture<Void> allFutures = CompletableFuture.allOf(productsFuture, reviewsFuture, inventoryFuture)
                .thenRun(() -> {
                    try {
                        // Once all futures are complete, process the fetched data
                        String productsData = productsFuture.get();
                        String reviewsData = reviewsFuture.get();
                        String inventoryData = inventoryFuture.get();

                        // Merge and process the data
                        System.out.println("Merged Data: ");
                        System.out.println(productsData);
                        System.out.println(reviewsData);
                        System.out.println(inventoryData);

                    } catch (InterruptedException | ExecutionException e) {
                        e.printStackTrace();
                    }
                });

        // Ensure all operations complete by joining the last CompletableFuture
        allFutures.join();
    }
}
```

c. Homework 3: For Homework 2, implement exception handling. If an exception occurs during any API call, return a default value and log the exception information.
```java
public class FetchDataWithExceptionHandlingExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<String> productsFuture = CompletableFuture.supplyAsync(() -> {
            try {
                throw new RuntimeException("Failed to fetch products data");
            } catch (RuntimeException e) {
                throw new IllegalStateException(e);
            }
        }).exceptionally(ex -> {
            System.out.println("Error fetching products: " + ex.getMessage());
            return "Default product data";
        });

        CompletableFuture<String> reviewsFuture = CompletableFuture.supplyAsync(() -> {
            return "Reviews data from API";
        }).exceptionally(ex -> {
            System.out.println("Error fetching reviews: " + ex.getMessage());
            return "Default reviews data";
        });

        CompletableFuture<String> inventoryFuture = CompletableFuture.supplyAsync(() -> {
            return "Inventory data from API";
        }).exceptionally(ex -> {
            System.out.println("Error fetching inventory: " + ex.getMessage());
            return "Default inventory data";
        });

        CompletableFuture<Void> allFutures = CompletableFuture.allOf(productsFuture, reviewsFuture, inventoryFuture)
                .thenRun(() -> {
                    try {
                        String productsData = productsFuture.get();
                        String reviewsData = reviewsFuture.get();
                        String inventoryData = inventoryFuture.get();

                        System.out.println("Merged Data: ");
                        System.out.println(productsData);
                        System.out.println(reviewsData);
                        System.out.println(inventoryData);
                    } catch (InterruptedException | ExecutionException e) {
                        e.printStackTrace();
                    }
                });
        allFutures.join();
    }
}
```