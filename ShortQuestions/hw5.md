## Home Work 5

1. **Read: https://www.interviewbit.com/multithreading-interview-questions/#class-level-lock-vs-object-level-lockd**
2. **Explain what is volatile in java? (we also use it in Singleton)**
   
   `Volatile` keyword is used as a modifier for instance variables. It indicates to the Java Virtual Machine (JVM) that the variable can be changed unexpectedly by other parts of the program or by concurrent threads. The primary purpose of volatile is to ensure visibility and prevent reordering optimizations of variables between threads, without the need for synchronization.
3. **How to create a new thread(Please also consider Thread Pool approach)?**
    1. Extending the Thread Class: extending the Thread class and overriding its run method. Then, we can start the thread by calling the start method on the instance of the newly created thread class.
    2. Implementing the Runnable Interface: we need to implement the run method of the Runnable interface, then pass an instance of Runnable implementation to the constructor of the Thread class, and start the thread using the start method of the Thread instance.
    3. Using a Thread Pool (Executor Framework): A thread pool is a resource management concept based on pooling. It can efficiently manage the creation and destruction of threads, enhancing performance and reducing resource consumption. 
4. **Difference between Runnable and Callable?**
   1. Return Value: Runnable's run() method does not return any value, while Callable's call() method returns a value.
   2. Exceptions: Runnable's run() method cannot throw checked exceptions, whereas Callable's call() method can throw checked exceptions.

5. **What is the difference between t.start() and t.run()?**
   
   t.start() creates a new thread and executes the run() method in the new thread, while t.run() executes in the current thread, not creating any new thread.

6. **Which way of creating threads is better: Thread class or Runnable interface?**
   
   Implementing the Runnable interface is generally considered a better practice for creating threads, mainly because of its flexibility, the ability to share resources more easily, and better compatibility with thread pools for managing multiple threads efficiently. 
 
7. **What are the thread statuses?**
   1. NEW :  The thread has been created but has not yet started. At this point, the thread is considered not alive.
   2. RUNNABLE : The thread is ready to run and might be running already. This state includes both running and ready-to-run threads. In this state, a thread might be executing in the JVM or waiting for CPU resources to proceed.
   3. BLOCKED: The thread is blocked and waiting for a monitor lock. This state occurs when a thread tries to access a synchronized block/method while another thread currently holds the lock on the object.
   4. WAITING: The thread is waiting indefinitely for another thread to perform a specific action.
   5. TIMED_WAITING: Similar to the WAITING state, but the thread waits for another thread to perform an action for a specified waiting time.
   6. TERMINATED: The thread has completed its execution and has exited. This state indicates that the thread has finished its run() method or has encountered an uncaught exception that caused it to end.

8. **What is deadlock?**
   
    A deadlock is a situation in multi-threaded programming where two or more threads are blocked forever, waiting for each other to release resources they need. In a deadlock, each thread holds a lock on a resource and waits for a lock on another resource that is held by another thread. 
  
9.  **How do threads communicate each other?**
    1. Shared Variables: Threads can access shared variables. To ensure thread safety, these shared variables should be accessed through synchronized blocks or methods, or by using volatile variables when appropriate.
    2. wait(), notify(), and notifyAll() Methods
    3. Locks and Condition Variables: The java.util.concurrent.locks package provides a framework for locking and waiting for conditions that are more flexible than the intrinsic locks and monitors provided by the synchronized keyword and Object methods.

10. **What’s the difference between class lock and object lock?**
    
    1. Scope of Lock:
        - Object lock: Locks an instance, allowing synchronization on a per-instance basis.
        - Class lock: Locks the class, allowing synchronization across all instances.
    2. Synchronization Target:
        - Object lock: Synchronizes instance methods or blocks synchronized on an instance.
        - Class lock: Synchronizes static methods or blocks synchronized on the class itself.

11.  **What is join() method?**
    
        In Java, the join() method is a mechanism in the Thread class that allows one thread to wait for the completion of another thread. When you call the join() method of a thread from a different thread, the calling thread will block until the thread on which join() was called finishes its execution.

12.  **what is yield() method**
    
        The yield() method in Java is a static method of the Thread class that hints to the thread scheduler that the current thread is willing to yield its current use of a processor.
  
13. **What is ThreadPool? How many types of ThreadPool? What is the TaskQueue in ThreadPool?**
    
    - A ThreadPool is a concept in concurrent programming that refers to a collection of idle threads which are managed by a thread pool manager. These threads are waiting for tasks to execute. Instead of creating a new thread for each task and destroying it after completion, a thread pool reuses existing threads by assigning them new tasks, which significantly improves the performance and efficiency of resource usage.
    - Fixed Thread Pool, Cached Thread Pool, Single Thread Executor
    - The TaskQueue is a queue used by thread pools to hold tasks before they are executed. This queue is typically a blocking queue that allows tasks to be added and removed. When the thread pool has more tasks than it can immediately execute, additional tasks are placed in this queue until a thread becomes available to execute them. The nature of the queue depends on the type of thread pool.
    
14. **Which Library is used to create ThreadPool? Which Interface provide main functions of thread-pool?**
    
     The `java.util.concurrent` package, particularly the `ExecutorService` interface and the `Executors` utility class, provides the main functionalities for creating and managing thread pools in Java.
    
15. **How to submit a task to ThreadPool?**
    
     ExecutorService interface from the java.util.concurrent package. The ExecutorService provides several methods for task submission, including submit().
16. **What is the advantage of ThreadPool?**

    1. Resource Reuse: Thread pools reuse existing threads to execute tasks, avoiding the overhead associated with thread creation and destruction. 
    2. Controlling Thread Numbers: Thread pools allow programs to control the level of concurrency at runtime, i.e., the number of threads running simultaneously. 
    3. Improved Response Time: Since threads in a thread pool are reused, the delay caused by thread creation is reduced. 
    4. More Flexible Thread Management:  Thread pools provide rich APIs for managing the lifecycle of threads, including creation, execution, destruction, and monitoring. 

17. **Difference between shutdown() and shutdownNow() methods of executor**
   
    Interruption of Current Tasks: shutdown() allows currently executing tasks to complete without interruption, while shutdownNow() attempts to stop these tasks by interrupting them.


18. **What is Atomic classes? How many types of Atomic classes? Give me some code example of Atomic classes and its main methods. when to use it?**
    1. Atomic classes in Java provide a way to perform atomic (i.e., thread-safe without using synchronization) operations on single variables. 
    2.  - AtomicInteger: Provides atomic operations on an int value.
        - AtomicLong: Similar to AtomicInteger but operates on a long value.
        - AtomicBoolean: Provides atomic operations on a boolean value.
        - AtomicReference: Provides atomic operations on references to objects.
        - AtomicIntegerArray, AtomicLongArray, AtomicReferenceArray: Provide atomic operations on arrays of integers, longs, and object references, respectively. 
    3. 
    ```java
    import java.util.concurrent.atomic.AtomicInteger;

    public class AtomicIntegerExample {
        private static AtomicInteger counter = new AtomicInteger(0);

        public static void main(String[] args) throws InterruptedException {
            Thread thread1 = new Thread(() -> {
                for (int i = 0; i < 1000; i++) {
                    counter.incrementAndGet(); 
                }
            });

            Thread thread2 = new Thread(() -> {
                for (int i = 0; i < 1000; i++) {
                    counter.decrementAndGet(); 
                }
            });

            thread1.start();
            thread2.start();

            thread1.join();
            thread2.join();

            System.out.println("Final counter value: " + counter.get());
        }
    }
    ```
    4. Atomic classes should be used when you need to perform thread-safe operations on single variables without using synchronized blocks or methods, especially for simple atomic operations like incrementing a counter, updating a boolean flag, or setting a reference to a new object. 

19. **What is the concurrent collections? Can you list some concurrent data structure (Thread-safe)**

    1. In Java, concurrent collections are data structures designed for multi-threaded environments, offering thread-safe operations without requiring external synchronization. These collections are found in the java.util.concurrent package.
    2. 
       - ConcurrentHashMap
       - ConcurrentLinkedQueue
       - ConcurrentSkipListMap 
       - ConcurrentSkipListSet
       - CopyOnWriteArrayList 
       - CopyOnWriteArraySet 

20. **What kind of locks do you know? What is the advantage of each lock?**
    1. Reentrant Locks: extended capabilities such as timed lock waits, interruptible lock waits, and fairness policies compared to  Intrinsic locks.
    2. Read/Write Locks: ReadWriteLock (implemented by ReentrantReadWriteLock) is a lock that allows multiple threads to read a shared resource concurrently as long as no thread is writing to it. Write operations are exclusive.
    3. Intrinsic Locks:  Intrinsic locks are built into every Java object (including class objects). When a method or block of code is marked with the synchronized keyword, it requires a thread to obtain the intrinsic lock before executing.
    4. Stamped Locks: Introduced in Java 8, StampedLock supports both read and write locks, similar to ReadWriteLock. However, it also offers a third mode called "optimistic locking" and does not implement reentrant characteristics.

21. **What is future and completableFuture? List some main methods of ComplertableFuture.**
    
    `Future`: 
    
    A Future represents the result of an asynchronous computation. It provides methods to check if the computation is complete, to wait for its completion, and to retrieve the result of the computation. 
    - boolean cancel(boolean mayInterruptIfRunning): Attempts to cancel execution of this task.
    - boolean isCancelled(): Returns true if the task was cancelled before it completed.
    - boolean isDone(): Returns true if the task has completed.

    `CompletableFuture`:
    CompletableFuture is an enhancement of Future that provides a lot of capabilities in a non-blocking way. It can manually complete and it supports the completion of stages. 

22. **Type the code by your self and try to understand it.(package com.chuwa.tutorial.t08_multithreading)**

23. **Write a code to create 2 threads, one thread print 1,3,5,7,9, another thread print 2,4,6,8,10. (solution is in com.chuwa.tutorial.t08_multithreading.c05_waitNotify.OddEventPrinter)a. One solution use synchronized and wait notify b. One solution use ReentrantLock and await, signal**
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
24. **create 3 threads, one thread ouput 1-10, one thread output 11-20, one thread output 21-22. threads run sequence is random. (solution is in com.chuwa.exercise.t08_multithreading.PrintNumber1)**
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
25. **completable future:a. Homework 1: Write a simple program that uses CompletableFuture to asynchronously get the sum and product of two integers, and print the results.  b. Homework 2: Assume there is an online store that needs to fetch data from three APIs: products, reviews, and inventory. Use CompletableFuture to implement this scenario and merge the fetched data for further processing. (需要找public api去模拟，)i. Sign In to Developer.BestBuy.comii. Best Buy Developer API Documentation (bestbuyapis.github.io) iii. 可以⽤fake api https://jsonplaceholder.typicode.com/ c. Homework 3: For Homework 2, implement exception handling. If an exception occurs during any API call, return a default value and log the exception information.**

