## 1. Read link
https://www.interviewbit.com/multithreading-interview-questions/#class-level-lock-vs-object-level-lock
## 2. Explain what is volatile in java?
Volatile is a keyword in java, the volatile keyword indicate a variable may be modified by diffrent thread concurrently.
When a vairable is decleared as `volatile`, it ensures that any thread that reads the variable always see the most recent write. This means that changes made to a volatile variable are immediately visible to other thread.
However, it only guarantees visibility but not provide atomicity, if need atomicity (sync after write) you need to use atomic package

## 3.How to create a new thread(Please also consider Thread Pool approach)?
- Extends thread class
- implements Runnable
- implements callable
- Create thread pool with certain number of threads

## 4. Difference between Runnable and Callable
Callable will return a value, and runnable just execute the task, will not return anything

## 5. What is the difference between t.start() and t.run()
t.start() will start a new thread and run.
t.run() will execute the `run()` method synchronously in the current thread without creating a new thread

## 6. Which way of creating threads is better: Thread class or Runnable interface?

Runnable is more compatible since you can implement multiple interface in the same time. To extend from thread, you can only extend once.

## 7. What are the thread statuses?
- 初始（NEW） 创建了一个线程对象，但是还没有调用start方法
- 运行（RUNNABLE）Java线程中将就绪（ready）和运行（running）两种状态笼统的成为运行。线程对象创建后，其他线程（比如main线程）调用了该对象的start方法。该状态的线程位于可运行线程池中，等待被线程调度选中，获取CPU的使用权，此时处于就绪状态（ready）。就绪状态的线程在获得CPU时间片后变为运行中状态（running）
- 阻塞（BLOCKED）表示线程阻塞于锁
- 等待（WAITING）进入该状态的县城需要等待其他线程做出一些特定动作（通知或者中断）
- 超时等待（TIMED_WAITING）该状态不同于WAITING，它可以在指定的时间后自行返回
- 终止（TERMINATED）表示该线程已经执行完毕

## 8. What is deadlock?
For example, we have two thread A and B, A is holding some resource and waiting for B's resource release; in the meantime, B is holding some resource and waiting for A's resource release. Then both thread are waiting for other side resource and refuse to release their resource.

## 9. How do threads communicate each other?
- Shared memory
- Conditional Variable
- Socket
- Message queue

## 10. What’s the difference between class lock and object lock?
The object lock will associate with the object, you suppose to have an instance to use it.

The class lock will associate with the class, and you can use it by use MyClass.myattribute to use it. This is static since the lock can be used without an instance

## 11. What is join() method?
`join()` method is a method provided by the `Thread` class that allows one thread to wait for the completion of another thread. When a thread calls `join` on another thread, it blocks until the other thread completes it execution

## 12. what is yield() method
`yield` method is a static method provided by the `Thread` class. It suggests to the JVM that the current thread is williong to yield its current execution context to ohter thread of equal priority. However, it is important to note that `yield` is merely a hint to the JVM, and it's up to the JVM's scheduler to decide whether to honor this hint or not.

## 13. What is ThreadPool? How many types of ThreadPool? What is the TaskQueue in ThreadPool?
You can create a ThreadPool and make certain number of Threads in the ThreadPool. For example, you can create a ThreadPool with 4 threads. In This way, you can put your Tasks in to TaskQueue, and everytime you execute a task, you can just use the thread in the ThreadPool, no need to create new threads everytime. The ThreadPool will automatically assign task to threads.

Different Types of Thread Pool:
 - FixedThreadPool: fixed number of thread
 - CatchedThreadPool: dynamically adjust the number of threads
 - SingleThreadPool: only one thread, useful when tasks must execute in certain order
 - ScheduledThreadPool: can schedule task to run after a specific delay
 - WorkStealingPool: steal tasks from other thread to balance the workload
 - Custom Thread Pool: you can design your own thread pool by using ThreadPoolExecutor
   
## 14. Which Library is used to create ThreadPool? Which Interface provide main functions of thread-pool
java.util.concurrent
ExecutorService provide main function of thread-pool

## 15. How to submit a task to ThreadPool?
```
ExecutorService executor = Executors.newFixedThreadPool(4);
executor.submit(task1);
```

## 16. What is the advantage of ThreadPool?
- Reusability of Threads
- Resource managements
- Improve responsiveness
- Load Balancing
- Simplified Thread management

## 17. Difference between shutdown() and shutdownNow() methods of executor
- `shutdown()` will initiate shutdown, and `ExecutorService` will stops accepting new task, but it waits for existing tasks to complete
- `shutdownNow()` attemps to stop the `ExecutorService` immediately. It interrupt all actively executing tasks and prevents pending task from start.

## 18. What is Atomic classes? How many types of Atomic classes? Give me some code example of Atomic classes and its main methods. when to use it?
Atomic class provide the concurrent version of the primitive types.
There are many types, depends on the primitive types
```

public class AtomicExample {
    public static void main(String[] args) {
        AtomicInteger atomicInt = new AtomicInteger(0);

        // Increment and get the value atomically
        int incrementedValue = atomicInt.incrementAndGet();
        System.out.println("Incremented value: " + incrementedValue);

        // Decrement and get the value atomically
        int decrementedValue = atomicInt.decrementAndGet();
        System.out.println("Decremented value: " + decrementedValue);

        // Add and get the value atomically
        int addedValue = atomicInt.addAndGet(5);
        System.out.println("Added value: " + addedValue);

        // Compare and set atomically
        boolean compareAndSetResult = atomicInt.compareAndSet(5, 10);
        System.out.println("Compare and set result: " + compareAndSetResult);
        System.out.println("Current value: " + atomicInt.get());
    }
```

## 19. What is the concurrent collections? Can you list some concurrent data structure (Thread-safe)
Its Java package that provide concurrent version of collection, so it support multi-threading.
Examples:
- CopyOnWriteArrayList
- ConcurrentHashTable
- CopyOnWriteArraySet
- ArrayBlockingQueue/LinkedBlockingQueue
- LinkedBlockingQueue

## 20. What kind of locks do you know? What is the advantage of each lock?
- ReentrantLock
