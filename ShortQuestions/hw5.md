## 1. Read: https://www.interviewbit.com/multithreading-interview-questions/#class-level-lock-vs-object-level-lock

## 2. Explain what is volatile in java? (we also use it in Singleton)
Volatile is a keyword in java, that can be applied only to variables. Applying volatile to a shared variable that is accessed in a multithreaded environment ensures that threads will read this variable from the main memory instead of their own local cache.

## 3. How to create a new thread(Please also consider Thread Pool approach)?
- Extends Thread Class
- Implements Runnable
- Implements Callable
- Executors.newFixedThreadPool(n) or new ThreadPoolExecutor(...)

## 4. Difference between Runnable and Callable?
Runnable: no return; cannot throw any checked exceptions;
Callable: has return; can throw checked exceptions.

## 5. What is the difference between t.start() and t.run()?
- t.start starts a new thread to excute the task（run()）
- t.run() excute the task in the current thread.

## 6. Which way of creating threads is better: Thread class or Runnable interface?
For most applications, implementing the Runnable interface is recommended, because it can have return.
Extending the Thread class might be considered for simple tasks or when you need to modify or extend the behavior of the Thread class itself.

## 7. What are the thread statuses?
- NEW: A thread that has been created but not yet started. At this point, the thread has been allocated memory and has been initialized, but its start() method has not been called, so it has not yet begun execution.

- RUNNABLE: A thread that is executing in the Java virtual machine (JVM) is in the runnable state. It may be running or ready to run at any moment. It's important to note that threads in this state are considered to be executing their tasks, but they might be waiting for CPU allocation.

- BLOCKED: A thread that is blocked waiting for a monitor lock is in this state. A thread becomes blocked when it tries to access a synchronized block/method while another thread already holds the lock for that block/method.

- WAITING: A thread that is waiting indefinitely for another thread to perform a particular action is in this state. Threads enter this state by calling Object.wait() without a timeout, Thread.join() without a timeout, or LockSupport.park(). A thread in this state is waiting for another thread to perform a specific action, such as notification or interruption.

- TIMED_WAITING: A thread that is waiting for another thread to perform an action for up to a specified waiting time is in this state. This can happen when a thread is in the waiting state but with a specified amount of time, such as when calling Thread.sleep(milliseconds), Object.wait(milliseconds), Thread.join(milliseconds), or LockSupport.parkNanos()/parkUntil().

- TERMINATED: A thread that has exited is in this state. This occurs when the run() method has completed or after the thread has been explicitly terminated by an exception or error.

## 8. What is deadlock?
When multiple threads wait for the same lock, and the program then stopped infinitely.

## 9. How do threads communicate each other?
- Threads can directly communicate by reading from and writing to shared objects and variables. Access to these shared resources must be synchronized to prevent data inconsistency and thread interference, typically using synchronized blocks or methods.
- Wait/Notify Mechanism：
  a. wait(): Causes the current thread to wait until another thread invokes notify() or notifyAll() on the same object, or until a specified amount of time has passed. 
  b. notify(): Wakes up a single thread that is waiting on the object's monitor (if any).
  c. notifyAll(): Wakes up all threads waiting on the object's monitor.

## 10. What’s the difference between class lock and object lock?
Class Lock: In java, each and every class has a unique lock usually referred to as a class level lock. These locks are achieved using the keyword static synchronized and can be used to make static data thread-safe. It is generally used when one wants to prevent multiple threads from entering a synchronized block. 

Object Lock: In java, each and every object has a unique lock usually referred to as an object-level lock. These locks are achieved using the keyword synchronized and can be used to protect non-static data. It is generally used when one wants to synchronize a non-static method or block so that only the thread will be able to execute the code block on a given instance of the class.  

## 11. What is join() method?
join() method is generally used to pause the execution of a current thread unless and until the specified thread on which join is called is dead or completed. To stop a thread from running until another thread gets ended, this method can be used. It joins the start of a thread execution to the end of another thread’s execution. It is considered the final method of a thread class
```
class NewThread extends Thread {
    public void run() {
        System.out.println("New Thread is running");
        // Perform some operations
    }
}

public class Main {
    public static void main(String[] args) {
        NewThread t = new NewThread();
        t.start();
        try {
            t.join(); // Main thread waits for t to finish
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
        System.out.println("Main thread resumes after New Thread completes");
    }
}
```

## 12. what is yield() method
The yield() method in Java is a static method of the Thread class that hints to the thread scheduler that the current thread is willing to yield its current use of a processor. The thread scheduler is free to ignore this hint. If the hint is taken, it allows other threads of the same priority to run. 

## 13. What is ThreadPool? How many types of ThreadPool? What is the TaskQueue in ThreadPool?
A Thread pool is simply a collection of pre-initialized or worker threads at the start-up that can be used to execute tasks and put back in the pool when completed. It is referred to as pool threads in which a group of fixed-size threads is created.  By reducing the number of application threads and managing their lifecycle, one can mitigate the issue of performance using a thread pool. 

Types of thread pool:
- Fixed ThreadPool: Created using Executors.newFixedThreadPool(int nThreads), this pool uses a fixed number of threads to execute tasks. If all threads are active when a new task is submitted, the task is placed in a queue until a thread becomes available. This type of pool is useful for handling a known set of tasks.

- Cached ThreadPool: Created using Executors.newCachedThreadPool(), this pool creates new threads as needed, but will reuse previously constructed threads when they are available. If a thread has not been used for a certain amount of time (60 seconds by default), it is terminated and removed from the cache. This type of pool is suitable for applications that have short-lived asynchronous tasks.

- Single Thread Executor: Created using Executors.newSingleThreadExecutor(), this pool ensures that only a single thread is used to execute tasks. Tasks are executed sequentially according to the order imposed by the task queue. This type of pool is useful for serializing the execution of tasks without dealing with synchronization.

- Scheduled ThreadPool: Created using Executors.newScheduledThreadPool(int corePoolSize), this pool can schedule commands to run after a given delay or to execute periodically. It's particularly useful for tasks that require repeated execution at regular intervals.

- Single Thread Scheduled Executor: Similar to the Scheduled ThreadPool but with a single thread, created using Executors.newSingleThreadScheduledExecutor(). This ensures tasks are executed sequentially at scheduled intervals.

The TaskQueue holds tasks that are waiting to be executed by worker threads. When all worker threads in the pool are active, new tasks submitted to the pool are placed in the TaskQueue.

## 14. Which Library is used to create ThreadPool? Which Interface provide main functions of thread-pool?
In Java, the primary library used for creating and managing thread pools is the java.util.concurrent package. 
The main interface that provides the core functionality of a thread pool in the java.util.concurrent package is the ExecutorService interface. 

## 15. How to submit a task to ThreadPool?
Using the .submit function.

## 16. What is the advantage of ThreadPool?
- Creating and destroying threads for each task can be expensive in terms of both time and system resources. ThreadPool mitigates this by reusing a fixed set of threads to execute multiple tasks.
- ThreadPool allows you to control the number of threads running in parallel, optimizing the use of system resources like CPU and memory.
- Using a ThreadPool abstracts away the complexities of thread management, making it easier to implement concurrent processing.

## 17. Difference between shutdown() and shutdownNow() methods of executor
- shutdown() waits for currently executing tasks to complete, whereas shutdownNow() attempts to stop all currently executing tasks immediately.
- shutdown() allows pending tasks (those not yet started) to execute, while shutdownNow() tries to halt pending tasks and returns a list of those not executed.
- shutdownNow() attempts to interrupt the currently executing tasks to stop them as quickly as possible, which can lead to tasks being abruptly terminated. In contrast, shutdown() allows tasks to complete normally.

## 18. What is Atomic classes? How many types of Atomic classes? Give me some code example of Atomic classes and its main methods. when to use it?
Atomic classes provide a way for performing atomic (i.e., thread-safe without using synchronization) operations on single variables.

Types:
- Atomic Integer Types
- Atomic Reference Types
- Atomic Boolean Type
- Atomic Updater Classes

Code Example:
```
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerExample {
    private AtomicInteger counter = new AtomicInteger(0);

    public void increment() {
        counter.incrementAndGet(); // Atomically increments by one
    }

    public int getCounter() {
        return counter.get(); // Returns the current value
    }

    public static void main(String[] args) {
        AtomicIntegerExample example = new AtomicIntegerExample();
        example.increment();
        System.out.println("Counter value: " + example.getCounter());
    }
}
```

When to use:
Use atomic classes in concurrent applications where you need to perform thread-safe operations on single variables without the overhead of synchronization.

## 19. What is the concurrent collections? Can you list some concurrent data structure (Thread-safe)
Concurrent collections are data structures designed specifically for use in multithreaded environments. They support concurrent access and modifications by multiple threads without the need for external synchronization.

- ConcurrentHashMap<K,V>
- ConcurrentLinkedQueue<E>
- ConcurrentLinkedDeque<E>
- CopyOnWriteArrayList<E>
- ConcurrentSkipListSet<E>

## 20. What kind of locks do you know? What is the advantage of each lock?
- Read/Write Locks: A pair of locks for read and write access. The read lock can be held simultaneously by multiple reader threads, so long as there are no writers. The write lock is exclusive. Advantage:  Increases performance and throughput in scenarios where reads are more frequent than writes by allowing concurrent read operations.
- Reentrant Locks: A reentrant mutual exclusion lock with the same basic behavior as the implicit monitor lock accessed using synchronized methods and statements but with extended capabilities. Advantage: Simple and efficient.
-  Condition: Works with ReentrantLock to allow threads to wait for specific conditions to become true. Advantages: Allows finer-grained control over inter-thread communication compared to intrinsic condition queues provided by synchronized blocks and methods.
-  Stamped Locks: offers a capability-based lock with three modes (writing, reading, and optimistic reading). Advantage: The optimistic read mode allows for lock-free reading of the resource while checking for write operations, which can significantly improve performance in read-heavy scenarios. 

## 21. What is future and completableFuture? List some main methods of ComplertableFuture.
A Future represents the result of an asynchronous computation. It provides methods to check if the computation is complete, to wait for its completion, and to retrieve the result of the computation. 

CompletableFuture is an extension of Future to overcome the limitations of the traditional Future. It supports lambda expressions and provides a rich, fluent API for composing asynchronous logic in a declarative manner.

- thenApply(Function<? super T,? extends U> fn)
- thenAccept(Consumer<? super T> action)
- thenRun(Runnable action)
- anyOf(CompletableFuture<?>... cfs)
- exceptionally(Function<Throwable, ? extends T> fn)
- handle(BiFunction<? super T, Throwable, ? extends U> fn)

## 22. Type the code by your self and try to understand it. (package com.chuwa.tutorial.t08_multithreading)
Uploaded in Coding folder.

## 23. Write a code to create 2 threads, one thread print 1,3,5,7,9, another thread print 2,4,6,8,10. 
## (solution is in com.chuwa.tutorial.t08_multithreading.c05_waitNotify.OddEventPrinter)
- a. One solution use synchronized and wait notify 
- b. One solution use ReentrantLock and await, signal
```
Thread-0: 1
Thread-1: 2
Thread-0: 3
Thread-1: 4
Thread-0: 5
Thread-1: 6
Thread-0: 7
Thread-1: 8
Thread-0: 9
Thread-1: 10
Process finished with exit code 0
```
Uploaded in Coding folder

## 24. create 3 threads, one thread ouput 1-10, one thread output 11-20, one thread output 21-22. threads run sequence is random. (solution is in com.chuwa.exercise.t08_multithreading.PrintNumber1)
```
Thread-0: 1
Thread-0: 2
Thread-0: 3
Thread-0: 4
Thread-0: 5
Thread-0: 6
Thread-0: 7
Thread-0: 8
Thread-0: 9
Thread-0: 10
Thread-2: 11
Thread-2: 12
Thread-2: 13
Thread-2: 14
Thread-2: 15
Thread-2: 16
Thread-2: 17
Thread-2: 18
Thread-2: 19
Thread-2: 20
Thread-1: 21
Thread-1: 22
Thread-1: 23
Thread-1: 24
Thread-1: 25
Thread-1: 26
Thread-1: 27
Thread-1: 28
Thread-1: 29
Thread-1: 30
```
Uploaded in Coding folder

## 25. completable future:
a. Homework 1: Write a simple program that uses CompletableFuture to asynchronously get the sum and product of two integers, and print the results.

b. Homework 2: Assume there is an online store that needs to fetch data from three APIs: products, reviews, and inventory. Use CompletableFuture to implement this scenario and merge the fetched data for further processing. (需要找public api去模拟，)

i. Sign In to Developer.BestBuy.com

ii. Best Buy Developer API Documentation (bestbuyapis.github.io)

iii. 可以⽤fake api https://jsonplaceholder.typicode.com/

c. Homework 3: For Homework 2, implement exception handling. If an exception occurs during any API call, return a default value and log the exception information.
