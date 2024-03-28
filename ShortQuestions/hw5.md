## 1. Read link

https://www.interviewbit.com/multithreading-interview-questions/#class-level-lock-vs-object-level-lock

## 2. Explain what is volatile in java?

Volatile is a keyword in java, that can be applied only to variables. You cannot apply volatile keyword to classes and methods. Applying volatile to a shared variable that is accessed in a multi-threaded environment ensures that threads will read this variable from the main memory instead of their own local cache.
```Java
public class Test{
	static int x = 10;
}
```

Suppose 2 threads are working on this class and both threads are running on different processors having their own local copy of variable x. if any thread modifies its value, the change will not be reflected back in the original variable x in the main memory leading to data inconsistency because the other thread is not aware of the modification.
So, to prevent data inconsistency, we can make variable x as volatile:
```Java
public class Test{
	static volatile int x = 10;
}
```
All the threads will read and write the variable x from/to the main memory. Using volatile, also prevents compiler from doing any reordering or any optimization to the code.

## 3.How to create a new thread(Please also consider Thread Pool approach)?

- Extends thread class
- Implements Runnable
- Implements callable
- Create thread pool with certain number of threads
## 4. Difference between Runnable and Callable

Runnable doesn't return any result, so cannot throw a checked exception, while callable will return a result and can throw an exception

## 5. What is the difference between t.start() and t.run()

- ``start()``: create a new thread, this newly created thread executes the task. One can call the start() method only once.
- ``run()``: execute the `run()` method synchronously in the current thread without creating a new thread.

## 6. Which way of creating threads is better: Thread class or Runnable interface?
Runnable is better since you can implement multiple interface in the same time. To extend from thread, you can only extend once. From Java 8, Runnable can be represented as lambda expressions

## 7. What are the thread statuses?

1. `New Thread`: The thread has not yet started to run.
2. `Runnable State`: a thread might actually be running or it might be ready to run at any instant of time.
3. `Blocked`: The thread will be in blocked state when it is trying to acquire a lock but currently the lock is acquired by the other thread. The thread will move from the blocked state to runnable state when it acquires the lock.
4. `Waiting state`: The thread will be in waiting state when it calls wait() method or join() method.
5. `Timed Waiting`: A thread lies in a timed waiting state when it calls a method with a time-out parameter.
6. `Terminated State`.

## 8. What is deadlock?

Deadlock is multiple threads are blocked forever. It occurs when multiple threads hold locks on different resources and waiting for other resources to complete their task.

## 9. How do threads communicate each other?
- ``wait()``: causes the current thread to wait until another thread invokes the ``notify()`` or ``notifyAll()``

- ``notify()``:wakes up a single thread that is waiting on the object's monitor. If multiple threads are waiting, the JVM arbitrarily selects one of them to be awakened.

- ``notifyAll()``: wakes up all threads that are waiting on the object's monitor. 

## 10. What’s the difference between class lock and object lock?

- `Object Lock`: Synchronized instance methods or synchronized block on 'this' lock the current instance of the object.
- `Class Lock`: Synchronized static methods or synchronized block on ClassName.class lock the Class object associated with the class.
## 11. What is join() method?

The `join()` method is a method provided by the `Thread` class that allows one thread to wait for the completion of another thread. When a thread calls `join` on another thread, it blocks until the other thread completes it execution.
## 12. what is yield() method

The` yield() `method causes the currently executing thread object to temporarily pause and allow other threads to execute.
## 13. What is ThreadPool? How many types of ThreadPool? What is the TaskQueue in ThreadPool?
- A ThreadPool is a collection of threads that are available to perform tasks. It represents a pool of worker threads that are created once and reused for executing multiple tasks, rather than creating a new thread for each task.
- There are different types of ThreadPools like `FixedThreadPool`, `CachedThreadPool`, and `ScheduledThreadPool`.
- The `TaskQueue` in the context of a thread pool is a queue that holds tasks which are waiting to be executed by worker threads. When a task is submitted to the thread pool, it is placed into the TaskQueue if all worker threads are busy. As soon as a thread becomes available, it picks up a task from the queue and executes it.
## 14. Which Library is used to create ThreadPool? Which Interface provide main functions of thread-pool

- `java.util.concurrent`
- `ExecutorService` provide main function of thread-pool
## 15. How to submit a task to ThreadPool?
`executor.submit()`

## 16. What is the advantage of ThreadPool?

`ThreadPool` significantly improves performance by reducing the overhead associated with thread creation and destruction, particularly in applications that execute many short-lived asynchronous tasks.

## 17. Difference between shutdown() and shutdownNow() methods of executor

An executor will not shut down automatically even when there is no task to process. It will stay alive and wait for new work. It will keep the JVM running.
When `shutdown()` method is called on an executor, then the executor will not accept new tasks and it will wait for the currently executing tasks to finish.
When `shutdownNow()` is called, it tries to interrupt the running threads and shutdown the executor immediately. However, there is no guarantee that all the running threads will be stopped at the same time.

## 18. What is Atomic classes? How many types of Atomic classes? Give me some code example of Atomic classes and its main methods. when to use it?

Atomic classes enable lock-free, thread-safe operations on single variables.There are several types of atomic classes in Java, designed to work with different primitive types and arrays, as well as more complex field updater classes. Types include AtomicInteger, AtomicLong, AtomicBoolean, etc.
```Java
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicExample {
    private AtomicInteger count = new AtomicInteger(0);

    public void increment() {
        count.incrementAndGet(); 
    }

    public int getCount() {
        return count.get(); 
    }

    public static void main(String[] args) {
        AtomicExample example = new AtomicExample();
        example.increment();
        System.out.println(example.getCount()); // Outputs: 1
    }
}

```
## 19. What is the concurrent collections? Can you list some concurrent data structure (Thread-safe)

Concurrent collections are data structures designed specifically for use in concurrent or multi-threaded environments.
- `ConcurrentHashMap`
- `ConcurrentLinkedQueue`
- `CopyOnWriteArrayList`

## 20. What kind of locks do you know? What is the advantage of each lock?

- `Reentrant Lock`: Allows locking and unlocking multiple times by the same thread. It offers the same basic behavior and semantics as the implicit monitors accessed using synchronized methods and statements but with extended capabilities.
- `Read/Write Locks`: Allow multiple threads to read a resource concurrently as long as no thread is writing to it. Write locks are exclusive.
- `Stamped Lock`: Provides a capability-based lock with three modes for controlling read/write access. It might offer better performance than ReadWriteLock in certain scenarios.

## 21. What is future and completableFuture? List some main methods of CompletableFuture.

`Future`: Represents the result of an asynchronous computation. Methods are provided to check if the computation is complete, to wait for its completion, and to retrieve the result of the computation.

`CompletableFuture`: An enhancement over Future that may be explicitly completed, and can be used as a Future, supporting methods like thenApply, thenAccept, and thenCompose to chain operations sequentially or run them in parallel.

Main methods of `CompletableFuture`:

- `thenApply(Function)`: Returns a new CompletableFuture that, when this stage completes normally, is executed with this stage's result as the argument to the supplied function.
- `thenAccept(Consumer)`: Performs an action with the result of the CompletableFuture.
- `thenCompose(Function)`: Returns a new CompletableFuture that is completed when a stage returned by the supplied function completes.
- `complete(T value)`: Completes the CompletableFuture with the given value.
- `exceptionally(Function)`: Returns a new CompletableFuture that, when this stage completes exceptionally, is executed with this stage's exception as the argument to the supplied function.

## 22. Type the code by yourself and try to understand it. (package com.chuwa.tutorial.t08_multithreading)

## 23. Write a code to create 2 threads, one thread print 1, 3, 5, 7, 9, and another thread print 2, 4, 6, 8, 10
Refer to the coding file.
## 24.create 3 threads, one thread ouput 1-10, one thread output 11-20, one thread output 21-22. threads run sequence is random. (solution is in com.chuwa.exercise.t08_multithreading.PrintNumber1)

Refer to the coding file.

## 25. completable future
a. Homework 1: Write a simple program that uses CompletableFuture to asynchronously get the sum and product of two integers, and print the results.

b. Homework 2: Assume there is an online store that needs to fetch data from three APIs: products, reviews, and inventory. Use CompletableFuture to implement this scenario and merge the fetched data for further processing. 

c. Homework 3: For Homework 2, implement exception handling. If an exception occurs during any API call, return a default value and log the exception information.