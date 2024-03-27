#### 2. Explain what is volatile in Java?

The `volatile` keyword is used to indicate that a variable's value may be modified by multiple threads that are executing concurrently. It ensures that any thread reading the variable will see the most recently written value by any other thread.

#### 3. How to create a new thread (Also consider Thread Pool approach)

- Extend the Thread class
- Implement the `Runnable` interface
- Implement the `Callable` interface
- Use `ExecutorService` class to create a thread pool

#### 4. Difference between Runnable and Callable?

Runnable cannot return a result or throw a checked exception.

#### 5. What is the difference between t.start() and t.run()?

- `t.start()` is used to start a new thread of execution for the `Thread` object `t`. The JVM creates a new thread and executes the `run()` method of the `Thread` object in that new thread concurrently with other threads in the program.

- `t.run()` simply invokes the `run()` method of the `Thread` object `t` in the current thread. It does not start a new thread.

#### 6. Which way of creating threads is better: Thread class or Runnable interface?

Using the `Runnable` interface is generally better because it allows you to extend another class. Java does not support extending multiple inheritance. If you extend the Thread class, you cannot extend other class.

#### 7. What are the thread statuses?

- **NEW**: A thread that has been created but has not yet started is in **NEW** state.

- **RUNNABLE**: A thread that is ready to run is in the **RUNNABLE** state.
- **BLOCKED**: A thread that is blocked waiting for a monitor lock is in the **BLOCKED** state.
- **WAITING**: A thread that is waiting indefinitely for another thread to perform a particular action is in the **WAITING** state.

- **TIMED_WAITING**: A thread that is waiting for another thread to perform a specific action for up to a specified waiting time is in the **TIMED_WAITING** state.
- **TERMINATED**: A thread that has exited is in the **TERMINATED** state.

#### 8. What is deadlock?

Deadlock is a situation in multi-threading where two or more threads are blocked forever, waiting for each other to release a resource they need.

#### 9. How do threads communicate with each other?

- Shared memory
- `wait()` , `notify()` , `notifyAll()` methods

- Message passing mechanisms: `BlockingQueue`, `SynchronousQueue`

#### 10. What is the difference between class lock and object lock?

- Object lock: Synchronized instance methods or synchronized block on `this` lock the current instance of the object

  ```java
  public class MyClass {
      public synchronized void synchronizedMethod() {
          // This method is synchronized using the object lock of 'this'
      }
  
      public void anotherMethod() {
          synchronized(this) {
              // This block is synchronized using the object lock of 'this'
          }
      }
  }
  ```

- Class lock: Synchronized static methods or synchronized block on ClassName.class lock the Class object associated with the class.

  ```java
  public class MyClass {
      public static synchronized void staticSynchronizedMethod() {
          // This method is synchronized using the class lock of 'MyClass'
      }
  
      public static void anotherMethod() {
          synchronized(MyClass.class) {
              // This block is synchronized using the class lock of 'MyClass'
          }
      }
  }
  ```

#### 11. What is join() method?

The `join()` method is a method provided by the `Thread` class that allows one thread to wait for the completion of another thread before proceeding further. When a thread invokes the `join()` method on another thread, it blocks until the specified thread terminates.

```java
Thread t1 = new Thread(() -> {
    // Perform some computation
});

Thread t2 = new Thread(() -> {
    // Perform some computation
});

t1.start();
t2.start();

try {
    t1.join(); // Wait for t1 to complete
    t2.join(); // Wait for t2 to complete
} catch (InterruptedException e) {
    // Handle interrupted exception
}

// Continue execution after t1 and t2 have completed

```

In this example, the main thread starts `t1` and `t2`, then calls `join()` on each thread to wait for their completion. The main thread will block until both `t1` and `t2` have finished executing.

#### 12. What is yield() method?

The `yield()` method is a static method of the `Thread` class that is used to hint to the scheduler that the current thread is willing to yield its current execution in favor of other threads.

#### 13. What is ThreadPool? How many types of ThreadPool? What is the TaskQueue in ThreadPool?

A thread pool is a collection of threads that are created and managed together to efficiently execute multiple tasks concurrently. It reduces expensive overhead of thread creation and management.

Types of ThreadPool: FixedThreadPool, CachedThreadPool, ScheduledThreadPool, SingleThreadExecutor

TaskQueue is where tasks are typically stored until a thread becomes available to execute them. The task queue holds the tasks that have been submitted to the thread pool but have not yet been executed.

#### 14. Which Library is used to create ThreadPool? Which Interface provide main functions of ThreadPool?

The `Executor` framework (java.util.concurrent) is used to create ThreadPool in Java. The `ExecutorService` interface provides the main functions of the thread pool.

#### 15. How to submit a task to ThreadPool?

`executorService.submit()`

#### 16. What is the advantage of ThreadPool?

- **Improved Performance**: minimize the overhead associated with thread creation, destruction, and context switching

- **Resource Management**: provide better resource management by limiting the number of concurrent threads
- **Task Queue**: use task queues to manage pending tasks that have not yet been executed

#### 17. Difference between shutdown() and shutdownNow() methods of executor?

- `shutdown()` is used to initiate an orderly shutdown of the executor service. When `shutdown()` is called, the executor service stops accepting new tasks, but it allows the already submitted tasks (those that are in the task queue or being processed) to complete execution.

- `shutdownNow()` is used to initiate an abrupt shutdown of the executor service. When `shutdownNow()` is called, the executor service attempts to stop all actively executing tasks and interrupts any waiting tasks that have not yet started execution.

#### 18. What is Atomic classes? How many types of Atomic classes? Give me some code example of Atomic classes and its main methods. When to use it?

Atomic classes provide a thread-safe way to perform atomic operations on single variables without using synchronization.

Some of the common atomic classes in Java include `AtomicInteger`, `AtomicLong`, `AtomicBoolean`, `AtomicReference`, and their array counterparts (`AtomicIntegerArray`, `AtomicLongArray`, etc.).

```java
AtomicInteger atomicInt = new AtomicInteger(0);
atomicInt.incrementAndGet(); // Increments by one
int value = atomicInt.get(); // Retrieves the current value
```

Atomic classes are useful in scenarios where multiple threads concurrently access and update shared variables. They provide a simple and efficient way to perform atomic operations without the need for explicit synchronization using locks or other mechanisms. 

#### 19. What is concurrent collections? Can you list some concurrent data structure (Thread-safe)?

Concurrent collections are a set of data structures provided by the Java Collections Framework that are designed to be thread-safe and support concurrent access by multiple threads without the need for external synchronization.

`ConcurrentHashMap`, `CopyOnWriteArrayList`, `BlockingQueue`, `ConcurrentLinkedHashMap`

#### 20. What kind of locks do you know? What is the advantage of each lock?

- Reentrant Lock: Allows locking and unlocking multiple times by the same thread. It offers the same basic behavior and semantics as the implicit monitors accessed using synchronized methods and statements but with extended capabilities
- ReadWriteLock: Allows multiple threads to read a resource concurrently as long as no thread is writing to it. Wrire locks are exclusive.
- Stamped Lock: Procvide a capability-based lock with three modes for controlling Read/Write access. It might offer better performance than ReadWriteLock in certain scenarios.

#### 21. What is Future and CompletableFuture? List some main methods of CompletableFuture.

`Future` and `CompletableFuture` are classes used for asynchronous programming and representing the result of an asynchronous computation. They allow you to perform computations asynchronously and obtain the result at a later time, potentially from a different thread.

`Future` provides methods to check if the computation is complete, retrieve the result (blocking if necessary) and cancel the computation.

- `boolean isDone()`: Returns true if the computation is complete, false otherwise.
- `T get() throws InterruptedException, ExecutionException`: Retrieves the result of the computation, blocking until it is available.
- `boolean cancel(boolean mayInterruptIfRunning)`: Attempts to cancel the computation.

`CompletableFuture` is an advanced implementation of `Future`. It provides a more flexible and powerful API for asynchronous programming, supporting chaining, combining and composing asynchronous operations.

- `static CompletableFuture<Void> runAsync(Runnable runnable)`: Asynchronously runs the given runnable in the default executor.
- `static CompletableFuture<Void> runAsync(Runnable runnable, Executor executor)`: Asynchronously runs the given runnable in the specified executor.
- `static <U> CompletableFuture<U> supplyAsync(Supplier<U> supplier)`: Asynchronously computes a value using the given supplier in the default executor.
- `static <U> CompletableFuture<U> supplyAsync(Supplier<U> supplier, Executor executor)`: Asynchronously computes a value using the given supplier in the specified executor.
- `CompletableFuture<T> thenApply(Function<? super T,? extends U> fn)`: Applies the given function to the result of the current stage, returning a new CompletableFuture with the result of the function.
- `CompletableFuture<Void> thenAccept(Consumer<? super T> action)`: Performs the given action with the result of the current stage, returning a new CompletableFuture<Void>.
- `CompletableFuture<T> exceptionally(Function<Throwable, ? extends T> fn)`: Returns a new CompletableFuture that is completed with the result of the current stage, but if the current stage completes exceptionally, then it is completed with the result of the function applied to the throwable.
- `CompletableFuture<T> handle(BiFunction<? super T, Throwable, ? extends U> fn)`: Returns a new CompletableFuture that is completed with the result of the function applied to the result and the exception of the current stage.

#### 23. Write a code to create 2 threads, one thread print 1,3,5,7,9, another thread print 2, 4, 6, 8,10.

```java
public class OddEventPrinterCopy {
    private static final Object monitor = new Object();
    private static int value = 1;

    public static void main(String[] args) {
        PrintRunnable printRunnable = new PrintRunnable();
        new Thread(printRunnable).start();
        new Thread(printRunnable).start();
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
```

```java
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class OddEventPrinterCopy {
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
        OddEventPrinterCopy printer = new OddEventPrinterCopy();
        Thread t1 = new Thread(printer::printNumber);
        Thread t2 = new Thread(printer::printNumber);
        t1.start();
        t2.start();
    }
}
```

#### 24. Create 3 threads, one thread ouput 1-10, one thread output 11-20, one thread output 21-22. threads run sequence is random.

```java
public class PrintNumber1 {
    private static int num = 1;

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> printNumber());
        Thread t2 = new Thread(() -> printNumber());
        Thread t3 = new Thread(() -> printNumber());

        t1.start();
        t2.start();
        t3.start();
    }

    public static synchronized void printNumber() {
        int count = 10;
        while (count > 0) {
            count--;
            System.out.println(Thread.currentThread().getName() + ": " + num++);
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

#### 25a. Write a simple program that uses CompletableFuture to asynchronously get the sum and product of two integers, and print the results.

```java
import java.util.concurrent.CompletableFuture;

public class Compute {
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 6;

        CompletableFuture<Integer> sumFuture = getSum(num1, num2);
        CompletableFuture<Integer> productFuture = getProduct(num1, num2);

        sumFuture.thenCombine(productFuture, (sum, product) -> {
            System.out.println("Calculated sum is: " + sum);
            System.out.println("Calculated product is: " + product);
            return null;
        }).join();
    }

    private static CompletableFuture<Integer> getSum(int a, int b) {
        return CompletableFuture.supplyAsync(() -> {
            System.out.println("Calculating sum");
            return a + b;
        });
    }

    private static CompletableFuture<Integer> getProduct(int a, int b) {
        return CompletableFuture.supplyAsync(() -> {
            System.out.println("Calculating product");
            return a * b;
        });
    }
}
```

