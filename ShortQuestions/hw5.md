#### 1. Read: https://www.interviewbit.com/multithreading-interview-questions/#class-level-lock-vs-object-level-lock



#### 2. Explain what is volatile in java? (we also use it in Singleton)

- The `volatile` keyword in Java is used to indicate that a variable's value will be modified by different threads.
- Declaring a variable as `volatile` ensures that any thread that reads the field will see the most recently written value by any thread. 
- The `volatile` keyword is a means of ensuring memory visibility and ordering for variables accessed from multiple threads, without the need for synchronization.

#### 3. How to create a new thread(Please also consider Thread Pool approach)?

1. `class MyThread extends Thread`

2. `class MyRunnable implements Runnable`

3. Using a thread pool

   ```Java
   public class ThreadPoolExample {
       public static void main(String[] args) {
           // Create a thread pool with a fixed number of threads
           ExecutorService executor = Executors.newFixedThreadPool(4);
   
           // Submit tasks to the executor
           for (int i = 0; i < 10; i++) {
               executor.submit(() -> {
                   System.out.println("Task executed by " + Thread.currentThread().getName());
               });
           }
   
           // Shutdown the executor once we are done
           executor.shutdown();
       }
   }
   ```

   

#### 4. Difference between Runnable and Callable?

1. Return Value

- **Runnable**: The `Runnable` interface does not return a result. Its `run` method has a `void` return type, making it suitable for tasks that do not need to return information to the caller.

  ```java
  javaCopy code
  @FunctionalInterface
  public interface Runnable {
      void run();
  }
  ```

- **Callable**: The `Callable` interface can return a result. The `call` method returns a value of type `V`, allowing tasks to return a computation result or other information back to the caller.

  ```java
  javaCopy code
  @FunctionalInterface
  public interface Callable<V> {
      V call() throws Exception;
  }
  ```

2. Exception Handling

- **Runnable**: The `run` method in the `Runnable` interface cannot throw any checked exceptions. Any exceptions that occur within a `Runnable` task must be handled inside the `run` method itself.
- **Callable**: The `call` method in the `Callable` interface can throw checked exceptions, making it easier to handle exceptions that occur during task execution. The caller of the `Callable` can catch and handle these exceptions.

3. Usage with Executor Framework

- **Runnable**: Instances of `Runnable` can be submitted for execution to an `ExecutorService` using methods like `execute(Runnable)`. However, since `Runnable` does not return a result, you cannot obtain the outcome of the execution directly if you submit a `Runnable` task.
- **Callable**: Instances of `Callable` can be submitted to an `ExecutorService` using methods like `submit(Callable<V>)`. Submitting a `Callable` task allows you to receive a `Future<V>` object, through which you can obtain the task's result, check if the task is complete, or cancel the task.



#### 5. What is the difference between t.start() and t.run()?

t.start()

- **Functionality**: Invokes the Java Virtual Machine to start a new thread of execution. The new thread calls the `run()` method of the `Thread` object. This is the correct way to start a new thread and execute code concurrently in that new thread.
- **Concurrency**: When `t.start()` is called, the code inside the `Thread` object's `run()` method is executed in parallel to the main thread and any other threads that are running concurrently.
- **Usage**: You use `t.start()` when you want to execute the `run()` method in a new, separate thread of execution.

t.run()

- **Functionality**: Directly calls the `run()` method on the current thread, without starting a new thread of execution. It behaves just like a normal method call and is executed by the thread that called `t.run()`.
- **Concurrency**: There is no concurrency when `t.run()` is used because no new thread is created. The `run()` method's code is executed synchronously in the caller's thread.
- **Usage**: Directly calling `t.run()` is essentially bypassing the threading capabilities of the `Thread` class and should generally be avoided unless you specifically want to execute the `run()` method's code in the current thread for some reason.



#### 6. Which way of creating threads is better: Thread class or Runnable interface?

Runnable interface is better

- **Flexibility with Inheritance**: Implementing the `Runnable` interface allows your class to extend another class, preserving the ability to inherit from another class while still being able to run code in a separate thread.
- **Separation of Concerns**: Implementing `Runnable` separates the task to be executed in a thread (`Runnable` object) from the mechanism of executing the task (`Thread` object). This separation adheres to the principle of single responsibility and can lead to a cleaner, more modular design.
- **Reusability and Composition**: A `Runnable` can be executed by different executors or threads, making it more versatile. You can pass the same `Runnable` instance to multiple `Thread` objects or use it with Executor Services, enhancing reusability and flexibility.



#### 7. What are the thread statuses?

1. **_NEW –_** a newly created thread that has not yet started the execution
2. **_RUNNABLE –_** either running or ready for execution but it’s waiting for resource allocation
3. **_BLOCKED –_** waiting to acquire a monitor lock to enter or re-enter a synchronized block/method
4. **_WAITING –_** waiting for some other thread to perform a particular action without any time limit
5. **_TIMED_WAITING –_** waiting for some other thread to perform a specific action for a specified period
6. **_TERMINATED –_** has completed its execution



#### 8. What is deadlock?

Deadlock describes a situation where two or more threads are blocked forever, waiting for each other to release the lock.



#### 9. How do threads communicate each other?

- Shared Objects
- `wait()` and `notify()`
- Concurrent Data Structures



#### 10. What’s the difference between class lock and object lock?

Object Lock

- **Scope**: An object lock is associated with an instance of a class (an object). It is used to synchronize access to an object's instance methods or blocks.
- **Usage**: When a non-static synchronized method or a synchronized block synchronized on `this` (or some other instance) is accessed, the thread acquires the object lock for that particular instance. Other threads attempting to enter any of the synchronized instance methods or blocks of the same instance will be blocked until the lock is released.
- **Purpose**: Object locks are used when you want to protect non-static data of an individual instance from concurrent access by multiple threads.

Class Lock

- **Scope**: A class lock is associated with the class's `Class` object. It is used to synchronize access to static methods or blocks of a class.
- **Usage**: When a static synchronized method or a synchronized block synchronized on the class's `Class` object (e.g., `synchronized(MyClass.class)`) is accessed, the thread acquires the class lock for that class. Other threads attempting to enter any of the synchronized static methods or blocks of that class will be blocked until the lock is released.
- **Purpose**: Class locks are used to protect static data of a class or to implement global synchronization that affects all instances of the class.



#### 11. What is join() method?

The `join()` method in Java is a mechanism that allows one thread to wait for the completion of another thread. When you call the `join()` method on a thread instance, the calling thread goes into a waiting state. It remains in this state until the referenced thread terminates or until the specified waiting time elapses, if a timeout is provided.



#### 12. what is yield() method

The `yield()` method in Java is a static method of the `Thread` class that signals to the thread scheduler that the current thread is willing to yield its current use of the CPU. The scheduler is free to ignore this hint. When a thread calls `yield()`, it gives the scheduler a hint that it's an appropriate point to pause its execution, allowing other threads of the same or higher priority to run. If there are no other threads needing to run, or all other threads are of lower priority, the same thread may continue execution without interruption.



#### 13. What is ThreadPool? How many types of ThreadPool? What is the TaskQueue in ThreadPool?

A ThreadPool in Java is a group of pre-instantiated reusable threads that are available to perform a set of arbitrary tasks. This concept is part of Java's concurrent programming utilities and helps manage and optimize the execution of multiple threads by minimizing the overhead associated with thread creation and destruction. Using a thread pool, tasks are executed concurrently by a finite number of threads; once a thread completes a task, it becomes available for new tasks, improving overall application performance and resource utilization.

Types of ThreadPool

Java's `java.util.concurrent` package provides several ThreadPool implementations via the `ExecutorService` interface and the `Executors` utility class. The primary types include:

1. **Fixed ThreadPool**: Created with `Executors.newFixedThreadPool(int nThreads)`, it consists of a fixed number of threads. If all threads are active when a new task is submitted, the task waits in the queue until a thread becomes available.
2. **Cached ThreadPool**: Created with `Executors.newCachedThreadPool()`, it has a flexible number of threads. New threads are created as needed, but if a thread is idle for 60 seconds, it is terminated and removed from the pool.
3. **Single Thread Executor**: Created with `Executors.newSingleThreadExecutor()`, it uses a single worker thread to execute tasks, ensuring that all tasks are executed sequentially in the order they are submitted.
4. **Scheduled ThreadPool**: Created with `Executors.newScheduledThreadPool(int corePoolSize)`, it can schedule commands to run after a given delay or to execute periodically.
5. **Work Stealing Pool**: Introduced in Java 8 with `Executors.newWorkStealingPool()`, it utilizes all available processors to execute tasks asynchronously, employing a work-stealing algorithm for load balancing across multiple queues.

What is the TaskQueue in ThreadPool?

The TaskQueue, typically implemented as a BlockingQueue, is a key component of a ThreadPool. It is used to store tasks that are waiting to be executed by worker threads in the pool. When all threads in the pool are actively executing tasks, any new tasks submitted to the pool are placed in the TaskQueue. Worker threads check the TaskQueue for new tasks when they become idle, pulling tasks from the queue and executing them.



#### 14. Which Library is used to create ThreadPool? Which Interface provide main functions of thread-pool?

The primary library used to create and manage thread pools in Java is the `java.util.concurrent` package. Within this package, the `Executors` class is commonly used to create different types of thread pools through its static factory methods.

Interface Providing Main Functions of ThreadPool

The main interface that provides the functionality for managing a thread pool in Java is the `ExecutorService` interface. This interface extends the `Executor` interface and offers a more complete set of tools for task execution, including methods for task submission, thread pool shutdown, and tracking the progress of tasks.

#### Key Methods of `ExecutorService`:

- **`execute(Runnable command)`**: Submits a `Runnable` task for execution.
- **`submit(Callable<T> task)`**: Submits a value-returning task for execution and returns a `Future<T>` representing the pending result of the task.
- **`submit(Runnable task, T result)`**: Submits a `Runnable` task for execution and returns a `Future<T>` representing the given result upon completion.
- **`invokeAll(Collection<? extends Callable<T>> tasks)`**: Executes the given collection of tasks.
- **`invokeAny(Collection<? extends Callable<T>> tasks)`**: Executes the given collection of tasks and returns the result of one that has completed successfully.
- **`shutdown()`**: Initiates an orderly shutdown in which previously submitted tasks are executed, but no new tasks will be accepted.
- **`shutdownNow()`**: Attempts to stop all actively executing tasks, halts the processing of waiting tasks, and returns a list of the tasks that were awaiting execution.



#### 15. How to submit a task to ThreadPool?

```java
ExecutorService executor = Executors.newFixedThreadPool(4);
Future<String> future = executor.submit(() -> {
    return "Callable task executed by " + Thread.currentThread().getName();
});

// Later, you can retrieve the result
try {
    String result = future.get(); // Blocks until the result is available
    System.out.println(result);
} catch (InterruptedException | ExecutionException e) {
    e.printStackTrace();
}

```



#### 16. What is the advantage of ThreadPool?

- Reduced overhead for thread creation and destruction
- Improved system resource management
- Enhanced Application Performance
- Task Queue Management
- Easier Thread Lifecycle and exception handling



#### 17. Difference between shutdown() and shutdownNow() methods of executor

```java
ExecutorService executor = Executors.newFixedThreadPool(5);
// ... submit tasks ...
executor.shutdown(); // Disallow new tasks; wait for running tasks to finish
```



- **Approach to Running Tasks**: `shutdown()` waits for running tasks to complete, whereas `shutdownNow()` attempts to stop these tasks immediately.
- **Handling of Queued Tasks**: `shutdown()` allows queued tasks to execute after shutdown is initiated, but `shutdownNow()` clears the queue of pending tasks and returns them.
- **Interruption**: `shutdownNow()` attempts to interrupt currently executing tasks by sending an `InterruptedException`, while `shutdown()` does not.



#### 18. What is Atomic classes? How many types of Atomic classes? Give me some code example of Atomic classes and its main methods. when to use it?

Atomic classes in Java are part of the `java.util.concurrent.atomic` package and provide a thread-safe way to perform atomic operations on single variables without using synchronization. An atomic operation is executed in a single step relative to other threads. When you use atomic classes, operations like reading, writing, and updating variables are atomic, ensuring data consistency and thread safety without the overhead of `synchronized` blocks or methods.

- `AtomicInteger`
- `AtomicLong`
- `AtomicBoolean`

Use atomic classes when you need to perform thread-safe operations on single variables without the synchronization overhead, and when you're dealing with simple operations like incrementing a counter, updating a flag, or setting a value based on its current state. They are particularly useful in lock-free and highly concurrent applications where you want to minimize blocking and ensure data consistency across threads.



#### 19. What is the concurrent collections? Can you list some concurrent data structure (Thread-safe)

Concurrent collections in Java are part of the `java.util.concurrent` package, introduced in Java 5 to address the need for thread-safe data structures that can be used effectively in multithreaded environments. Unlike the traditional Collections framework, which requires explicit synchronization to achieve thread safety (e.g., using `Collections.synchronizedList()`), concurrent collections are designed to allow concurrent access to their elements with higher concurrency and performance.

- **`ConcurrentHashMap`**
- **`ConcurrentLinkedQueue`**
- **`CopyOnWriteArrayList`**
- **`CopyOnWriteArraySet`**



#### 20. What kind of locks do you know? What is the advantage of each lock?

##### 1. Intrinsic Locks (Synchronized Blocks)

- **Mechanism**: In Java, every object has an intrinsic lock associated with it. You can synchronize methods or blocks of code by using the `synchronized` keyword, which requires a thread to acquire the object's lock before executing the synchronized code.
- **Advantages**:
  - Simplicity: Using intrinsic locks is straightforward, requiring minimal code changes to achieve thread safety.
  - Automatic lock management: The JVM ensures that locks are automatically acquired and released when a thread enters and exits a synchronized block or method.

##### 2. Reentrant Locks (`java.util.concurrent.locks.ReentrantLock`)

- **Mechanism**: A reentrant mutual exclusion `Lock` with the same basic behavior and semantics as the implicit monitor lock accessed using `synchronized` methods and statements, but with extended capabilities.
- **Advantages**:
  - Flexibility: Allows locking and unlocking in different scopes, and the ability to try to acquire the lock without being blocked using `tryLock()`.
  - Interruptibility: Supports the ability to interrupt thread waiting for the lock.
  - Fairness: Can be configured to ensure a first-come, first-served order in which threads acquire the lock.

##### 3. Read/Write Locks (`java.util.concurrent.locks.ReentrantReadWriteLock`)

- **Mechanism**: A pair of associated locks, one for read-only operations and one for writing. The read lock can be held simultaneously by multiple reader threads, so long as there are no writers. The write lock is exclusive.
- **Advantages**:
  - Improved concurrency in data structures where read operations are more frequent than write operations, as multiple threads can read concurrently.
  - Performance benefits in read-heavy workloads by allowing simultaneous reads.

##### 4. Stamped Lock (`java.util.concurrent.locks.StampedLock`)

- **Mechanism**: A capability-based lock with three modes for controlling read/write access (writing, reading, and optimistic reading). It is not reentrant.
- **Advantages**:
  - Versatility: Supports read and write locks, and also optimistic reads which can potentially reduce contention.
  - Scalability: Tends to scale better under high contention for read-heavy workloads compared to `ReentrantReadWriteLock`.

#### 21. What is future and completableFuture? List some main methods of ComplertableFuture.

##### What is Future?

A `Future` in Java represents the result of an asynchronous computation. When a task that returns a result is executed asynchronously, you receive a `Future` object. Through this `Future` object, you can check if the asynchronous operation is complete, wait for its completion, and retrieve the result of the computation once it's done. The `Future` interface provides a basic framework for managing the lifecycle and result of asynchronous tasks, but it has limitations, such as not being able to manually complete the computation or chain multiple `Future`s together without blocking.

##### What is CompletableFuture?

`CompletableFuture`, introduced in Java 8, is an enhancement of `Future` that implements the `Future` and `CompletionStage` interfaces. It provides a rich, fluent API for composing asynchronous logic in a declarative manner. `CompletableFuture` can be manually completed and used to build complex asynchronous pipelines. It supports applying functions, consuming results, and triggering actions upon the completion of the asynchronous operation, all without blocking. `CompletableFuture` makes it easier to write non-blocking, asynchronous code that is both readable and maintainable.

##### Main Methods of CompletableFuture

`CompletableFuture` includes a wide array of methods for creating, manipulating, and consuming future results. Here are some of the key methods:

- **Factory Methods**:
  - `completedFuture(T value)`: Returns a new `CompletableFuture` that is already completed with the given value.
  - `runAsync(Runnable runnable)`: Runs a task asynchronously and returns a `CompletableFuture` that is completed once the task is finished.
  - `supplyAsync(Supplier<U> supplier)`: Runs a task asynchronously that supplies a value, returning a `CompletableFuture` holding the result.
- **Transformation and Action Methods**:
  - `thenApply(Function<? super T,? extends U> fn)`: Applies a function to the result of this future when completed.
  - `thenAccept(Consumer<? super T> action)`: Consumes the result of the future when completed.
  - `thenRun(Runnable action)`: Runs an action when the future completes, without using the result of the future.
- **Combining Futures**:
  - `thenCombine(CompletionStage<? extends V> other, BiFunction<? super T,? super V,? extends U> fn)`: Combines this future with another and applies a function to their results.
  - `thenCompose(Function<? super T, ? extends CompletionStage<U>> fn)`: Chains this future to another asynchronous computation and returns a `CompletableFuture` that holds the result of that computation.
- **Exception Handling**:
  - `exceptionally(Function<Throwable, ? extends T> fn)`: Handles exceptions that occur during the future's computation, allowing you to return a default value or throw a custom exception.
  - `handle(BiFunction<? super T, Throwable, ? extends U> fn)`: Allows you to handle both the result and any exception of the asynchronous operation.
- **Waiting for Completion**:
  - `join()`: Waits for completion without throwing a checked exception, unlike `get()` from the `Future` interface.
  - `getNow(T valueIfAbsent)`: Retrieves the result if available; otherwise, returns the given value.



#### 22. Type the code by your self and try to understand it. (package com.chuwa.tutorial.t08_multithreading)

#### 23. Write a code to create 2 threads, one thread print 1,3,5,7,9, another thread print 2,4,6,8,10. (solution is in com.chuwa.tutorial.t08_multithreading.c05_waitNotify.OddEventPrinter)

a. One solution use synchronized and wait notify

b. One solution use ReentrantLock and await, signal

``` Java
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



#### 24. create 3 threads, one thread ouput 1-10, one thread output 11-20, one thread output 21-22. threads run sequence is random. (solution is in com.chuwa.exercise.t08_multithreading.PrintNumber1)

#### 25. completable future:

a. Homework 1: Write a simple program that uses CompletableFuture to asynchronously get the sum and product of two integers, and print the results.

b. Homework 2: Assume there is an online store that needs to fetch data from three APIs: products, reviews, and inventory. Use CompletableFuture to implement this scenario and merge the fetched data for further processing. (需要找public api去模拟，)

i. Sign In to Developer.BestBuy.com

ii. Best Buy Developer API Documentation (bestbuyapis.github.io)

iii. 可以⽤fake api *https://jsonplaceholder.typicode.com/*

c. Homework 3: For Homework 2, implement exception handling. If an exception occurs during any API call, return a default value and log the exception information.