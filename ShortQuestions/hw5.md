1.  Read: https://www.interviewbit.com/multithreading-interview-questions/#class-level-lock-vs-object-level-lock
2.  Explain what is volatile in java? (we also use it in Singleton)

In Java, the volatile keyword is used to indicate that a variable's value will be modified by different threads. Declaring a variable as volatile ensures that its value is always read from and written to the main memory, not just from the CPU cache of a particular thread. This guarantees visibility of changes to variables across threads.
3.  How to create a new thread(Please also consider Thread Pool approach)?

Creating a new thread in Java can be done in several ways, including using the Thread class directly or implementing the Runnable interface. Additionally, using a thread pool through the Executor framework is a more efficient way to manage multiple threads, especially in applications that require many threads. Let's look at both approaches:
4.  Difference between Runnable and Callable?

Return Value:

Runnable does not return a result. Its run method has a void return type.
Callable returns a result. The call method returns a value of type V.

Throws Clause:

Runnable's run method cannot throw any checked exceptions.
Callable's call method can throw checked exceptions.
5.  What is the difference between t.start() and t.run()?

t.start(): Invoking start() on a Thread instance causes the JVM to create a new thread and then execute the run() method of that Thread in the newly created thread. This means the run() method executes asynchronously.

t.run(): Directly calling the run() method does not start a new thread. Instead, it executes the run() method in the current thread, synchronously, just like a normal method call.
6.  Which way of creating threads is better: Thread class or Runnable interface?


Implementing the Runnable interface is generally considered better practice than extending the Thread class because:

Java supports implementing multiple interfaces: If your class extends Thread, it cannot extend any other class due to Java's single inheritance feature. Implementing the Runnable interface keeps your class available to extend another class.

Separation of Concerns: Implementing Runnable separates the task to be executed in a thread (the Runnable object) from the mechanism of executing it (Thread class), promoting a cleaner object-oriented design.
7. What are the thread statuses?

New: A thread that has been created but not yet started.
Runnable: A thread that is ready to run and is waiting for CPU allocation.
Blocked: A thread that is blocked waiting for a monitor lock to enter a synchronized block/method.
Waiting: A thread that is waiting indefinitely for another thread to perform a specific action.
Timed Waiting: A thread that is waiting for another thread to perform an action for up to a specified waiting time.
Terminated: A thread that has exited its run method, either because it completed normally or because it threw an uncaught exception.
8.  What is deadlock?

Two or more threads are blocked forever, each waiting for the other to release a resource they need. This occurs when the threads have circular dependencies on a set of synchronized resources, making it impossible for any of them to proceed.
9.  How do threads communicate each other?

Shared Objects: By accessing and modifying objects shared between threads, using synchronized blocks or methods to ensure thread safety.
wait(), notify(), and notifyAll() methods: These methods are used for inter-thread communication, allowing threads to wait for certain conditions to be met or to notify other threads about condition changes, within synchronized blocks or methods.
10. What’s the difference between class lock and object lock?

Object Lock: An object lock is associated with an instance of a class. When a thread enters a synchronized instance method or a synchronized block that locks on an instance (using synchronized(this) or synchronizing on another instance's lock), it acquires the object lock for that instance. This means no two threads can execute synchronized instance methods (or synchronized blocks) of the same instance simultaneously. However, multiple threads can access synchronized methods of different instances concurrently since each instance has its own object lock.

Class Lock: A class lock is associated with the class's Class object, not class instances. When a thread enters a static synchronized method or a synchronized block that locks on the Class object of the class (using synchronized(MyClass.class)), it acquires the class lock. This ensures that synchronized static methods (or synchronized static blocks) of the class cannot be executed simultaneously by more than one thread, regardless of the instances of the class. Class locks are used to protect static data shared by all class instances.
11. What is join() method?


The join() method in Java is a mechanism that allows one thread to wait for the completion of another. When you call the join() method on a thread, the calling thread goes into a waiting state until the referenced thread terminates or the specified waiting time expires if a timeout is specified.
12. what is yield() method


The yield() method in Java is a static method of the Thread class that signals to the thread scheduler that the current thread is willing to relinquish its current use of the CPU and is willing to wait its turn to be re-executed. The scheduler is free to ignore this hint. If the scheduler takes the hint, it will move the current thread from the Running state back to the Runnable state, allowing other threads of the same priority to get a chance to execute.
13. What is ThreadPool? How many types of ThreadPool? What is the TaskQueue in
    ThreadPool?

Types of ThreadPool
The Java Executor Framework provides several ThreadPool implementations, each designed for different use cases:

FixedThreadPool: A thread pool with a fixed number of threads. If a thread is not available for the task, the task is put into a queue until a thread is free.

CachedThreadPool: A thread pool that creates new threads as needed, but will reuse previously constructed threads when they are available. Unused threads are removed after 60 seconds of inactivity.

SingleThreadExecutor: A thread pool with only one thread to ensure that tasks are executed sequentially.

ScheduledThreadPool: A thread pool that can schedule commands to run after a given delay or to execute periodically.

TaskQueue in ThreadPool

The TaskQueue is a queue used in thread pools to hold tasks before they are executed. This queue is crucial for managing and scheduling tasks efficiently. When all threads are busy, new tasks are placed in the TaskQueue until a thread becomes available. The type of queue (e.g., direct handoffs, unbounded queues, or bounded queues) can affect the behavior of the ThreadPool, including task scheduling, performance, and system stability.

Direct Handoffs: Some ThreadPool configurations use a direct handoff policy without a queue, where tasks are directly handed over to threads without being stored in a queue.

Unbounded Queues: These can lead to resource exhaustion if tasks are submitted more quickly than they can be processed.

Bounded Queues: These help prevent resource exhaustion by limiting the number of tasks that can be queued, but require proper handling of rejected tasks (tasks that cannot be queued because the queue is full).
14. Which Library is used to create ThreadPool? Which Interface provide main
    functions of thread-pool?

In Java, the library used to create and manage thread pools is the java.util.concurrent package.

The main interface that provides the functionality for managing a thread pool is the ExecutorService interface.
15. How to submit a task to ThreadPool?

Create an ExecutorService:

Use Executors.newFixedThreadPool(int nThreads) for a fixed-size pool.
Submit Tasks:

Use execute(Runnable command) for tasks that don't return a result.

Use submit(Callable<T> task) for tasks that return a result, which provides a Future<T> to retrieve the outcome.
Manage Task Results:

For Callable tasks, use Future.get() to obtain the result, blocking until it's available.
Shutdown ExecutorService:

Always call shutdown() to terminate the thread pool and free resources after submitting all tasks.
16. What is the advantage of ThreadPool?

Resource Management: ThreadPools manage a finite set of threads for executing tasks. Creating and destroying threads frequently can be resource-intensive, particularly in applications with a high number of concurrent tasks. ThreadPool reuses threads, minimizing the overhead of thread creation and destruction.

Improved Performance: By reusing existing threads for multiple tasks, ThreadPools can significantly improve the performance of an application, especially one that executes many short-lived asynchronous tasks.

Task Queue Management: ThreadPool can efficiently manage a queue of tasks, executing them as threads become available. This allows for easy management of task execution order and prioritization if needed.

Scalability: Using a ThreadPool allows an application to limit the number of concurrent threads, which helps to ensure that the application does not consume more resources than are available, thereby maintaining stability and performance as the workload increases.

Enhanced Control: ThreadPools offer more control over the execution of tasks, including timing, prioritization, and execution policies. This control is essential for fine-tuning application performance and behavior.

Reduced Complexity: Implementing concurrency without a ThreadPool requires managing each thread's lifecycle manually, which can complicate the application's code and increase the likelihood of errors. ThreadPools abstract away these complexities, making concurrent programming simpler and more maintainable.
17.  Difference between shutdown() and shutdownNow() methods of executor


shutdown() gradually terminates an executor, allowing all submitted tasks to finish but not accepting new ones. shutdownNow() attempts to stop all ongoing tasks immediately and returns a list of tasks that were awaiting execution.
18. What is Atomic classes? How many types of Atomic classes? Give me some code
    example of Atomic classes and its main methods. when to use it?

Basic Types: AtomicBoolean, AtomicInteger, AtomicLong
Array Types: AtomicIntegerArray, AtomicLongArray, AtomicReferenceArray
Reference Type: AtomicReference
Field Updater Types: AtomicIntegerFieldUpdater, AtomicLongFieldUpdater, AtomicReferenceFieldUpdater

```
import java.util.concurrent.atomic.AtomicInteger;

AtomicInteger atomicInt = new AtomicInteger(0);

// Main methods
int incrementedValue = atomicInt.incrementAndGet(); // Increments and gets the new value
atomicInt.set(5); // Sets value
int currentValue = atomicInt.get(); // Gets current value

```

Use atomic classes for thread-safe operations on single variables without the overhead of locks.
19. What is the concurrent collections? Can you list some concurrent data structure
    (Thread-safe)

Concurrent collections are thread-safe variants of standard collections in Java, designed for use in multithreaded environments. They allow concurrent access and modifications by multiple threads without the need for external synchronization. These collections improve performance by using algorithms that reduce contention among threads.

CopyOnWriteArrayList, ConcurrentHashMap, ConcurrentLinkedQueue

20. What kind of locks do you know? What is the advantage of each lock?

reentrant Locks (java.util.concurrent.locks.ReentrantLock)
   
Advantage: Offers advanced features such as the ability to attempt to acquire the lock without waiting forever (tryLock), the ability to interrupt a thread waiting to acquire the lock (lockInterruptibly), and support for fairness policies.
   
Use: Suitable for more complex critical sections where additional flexibility and control over locking are required. 

ReadWrite Locks (java.util.concurrent.locks.ReentrantReadWriteLock)
   
Advantage: Allows multiple threads to read a resource concurrently, as long as there's no thread writing to it. This improves performance and throughput for read-heavy workloads.

Use: Best when you have a high ratio of read operations to write operations. 

Stamped Lock (java.util.concurrent.locks.StampedLock)

Advantage: Provides a capability-based lock with three modes (writing, reading, and optimistic reading). It offers better throughput than ReadWriteLock in scenarios where read operations vastly outnumber write operations.

Use: Ideal for objects with large numbers of read operations and fewer mutations.

21. What is future and completableFuture? List some main methods of
    ComplertableFuture.


In Java, Future and CompletableFuture are frameworks for asynchronous programming, allowing you to write non-blocking code by running a task on a separate thread and using the result once it's available.

supplyAsync(Supplier<U> supplier): Asynchronously executes a supplier function and returns a CompletableFuture holding the result.

thenApply(Function<? super T,? extends U> fn): Transforms the result of a CompletableFuture when it becomes available.

thenAccept(Consumer<? super T> action): Consumes the result of the computation when it's available.

thenRun(Runnable action): Executes a runnable action when the CompletableFuture completes, without using the result of the previous computation.

exceptionally(Function<Throwable, ? extends T> fn): Handles errors that occur during the computation.

combine(CompletionStage<? extends T> other, BiFunction<? super T,? super U,? extends V> fn): Combines two stages using a function when both are complete.

allOf(CompletableFuture<?>... cfs): Returns a new CompletableFuture that is completed when all of the given CompletableFutures complete.

anyOf(CompletableFuture<?>... cfs): Returns a new CompletableFuture that is completed when any of the given CompletableFutures complete.

22-25 see coding hw5