### Question2:  Explain what is volatile in java? (we also use it in Singleton)
```
In Java, the volatile keyword is used to indicate that a 
variable's value may be modified by different threads.
```
### Question3:  How to create a new thread(Please also consider Thread Pool approach)?
```
1. Extending the Thread class
2. Implementing the Runnable interface
3. Java provides the ExecutorService framework for managing threads and executing tasks asynchronously. 
```
### Question4:  Difference between Runnable and Callable?
```
Runnable: not return result
Callable: have return value

```
### Question5:  What is the difference between t.start() and t.run()?
```
When t.start() is called, it creates a new thread and invokes the 
run() method of the Thread object in that new thread.
t.run() simply calls the run() method of the 
Thread object t in the current thread, without starting a new thread of execution.
```
### Question6:  Which way of creating threads is better: Thread class or Runnable interface?
```
Runnable interface is better because it promotes better code design, flexibility and reusability. 
The runnable interface follows the composition over inheritance principle, allowing the class to extend other classes
```
### Question7: What are the thread statuses?
```
new: A thread is in the NEW state if it has been created but has not yet started.
runnable: A thread is in the RUNNABLE state if it is ready to run, waiting for processor time.
blocked: A thread is in the BLOCKED state if it is waiting for a monitor lock to enter or re-enter a synchronized block/method.
waiting: A thread is in the WAITING state if it is waiting indefinitely for another thread to perform a particular action.
time waiting: TIMED_WAITING state if it is waiting for another thread to perform a specific action, but for a specified waiting time.
terminated: completed its execution or terminated due to an uncaught exception.
```
### Question8:  What is deadlock?
```
A deadlock is a situation in concurrent programming where two or more threads are blocked forever, 
waiting for each other to release resources that they need to proceed. 
```
### Question9:  How do threads communicate each other?
```
Shared Memory:  threads share common data structures (such as variables, arrays, or objects) to exchange information.
Message Passing:  threads communicate by sending messages to each other through predefined channels or message queues.
```
### Question10: What’s the difference between class lock and object lock?
```
class lock: Each class in Java also has an associated lock, known as a class lock.When a synchronized static method or block is invoked on a class, the thread acquires the lock associated with the class itself. 
Only one thread can hold the lock on a class at a time.
object lock: Every object in Java has an associated lock, also known as an intrinsic lock or monitor lock.
When a synchronized method or block is invoked on an object, the thread acquires the lock associated with that object. 
Only one thread can hold the lock on an object at a time.

```

### Question11: What is join() method?
```
The join() method asks a thread to wait for another thread finish. 
The thread called join() will wait until the referenced thread thread terminated.
```
### Question12: what is yield() method
```
the yield() method is a static method defined in the Thread class. When a thread calls yield(), 
it temporarily pauses its execution and gives a hint to the scheduler 
that it is willing to yield its current use of the processor.
```
### Question13: What is ThreadPool? How many types of ThreadPool? What is the TaskQueue in ThreadPool?
```
A thread pool is a collection of pre-initialized threads that are available for performing tasks. 
Instead of creating a new thread for each task, a thread pool allows for the reuse of existing threads, 
which can improve performance and reduce overhead associated with thread creation and destruction.
Types of Thread Pools: Fixed Thread Pool, Cached Thread Pool, Scheduled Thread Pool, Single Thread Executor
The task queue is a data structure used to hold tasks that are waiting to be executed by the worker threads in the thread pool.
```
### Question14: Which Library is used to create ThreadPool? Which Interface provide main functions of thread-pool?
```
java.util.concurrent package provides support for creating and managing thread pools. 
The main interfaces and classes related to thread pools in this package are:
Executor Interface, ExecutorService Interface
```
### Question15: How to submit a task to ThreadPool?
```java
//To submit a task to a ThreadPool in Java, we can use the submit() method provided by the ExecutorService interface.
//1. Create a ThreadPool
//2. Create a Task
//3. Submit the Task

public class Main {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            Runnable task = new MyTask(i);
            executor.submit(task);
        }
        executor.shutdown();
    }
}
```
### Question16: What is the advantage of ThreadPool?
```
 thread pools provide a robust and efficient mechanism for managing concurrent execution of tasks in multithreaded applications,
 leading to improved performance, resource utilization, and scalability.
```
### Question17: Difference between shutdown() and shutdownNow() methods of executor
```
shutdown() method initiates an orderly shutdown of the ThreadPool.
shutdownNow() method attempts to stop all actively executing tasks, halts the processing of waiting tasks, and returns a list of tasks that were awaiting execution.
```
### Question18: What is Atomic classes? How many types of Atomic classes? Give me some code example of Atomic classes and its main methods. when to use it?
```java
//Atomic classes are used to perform atomic operations on single variables without the need for explicit synchronization.
//AtomicInteger: Provides atomic operations on integer variables.
//AtomicLong: Provides atomic operations on long variables.
//AtomicBoolean: Provides atomic operations on boolean variables.
//AtomicReference: Provides atomic operations on object reference variables.
//AtomicIntegerArray: Provides atomic operations on arrays of integers.
//AtomicLongArray: Provides atomic operations on arrays of longs.

public class AtomicExample {
    public static void main(String[] args) {
        AtomicInteger atomicInt = new AtomicInteger(0);
        int newValue = atomicInt.incrementAndGet();
        boolean updated = atomicInt.compareAndSet(1, 10);
        int originalValue = atomicInt.getAndIncrement();
    }
}
```
### Question19: What is the concurrent collections? Can you list some concurrent data structure(Thread-safe)
```
concurrent collections are designed to be thread-safe and support 
concurrent access from multiple threads without the need for external synchronization.

ConcurrentHashMap, ConcurrentSkipListMap, ConcurrentSkipListSet, CopyOnWriteArrayList, CopyOnWriteArraySet:
```
### Question20: What kind of locks do you know? What is the advantage of each lock?
```
ReentrantLock:More flexible than implicit monitor locks, allowing for more sophisticated locking strategies.
ReadWriteLock:Allows multiple readers to access the shared resource concurrently, improving concurrency and performance in read-heavy scenarios.
StampedLock: Optimistic locking mode allows for low-contention scenarios where the cost of acquiring a read lock is high.
Semaphore:Allows for fine-grained control over the number of concurrent threads accessing a resource, providing throttling capabilities.
```
### Question21: What is future and completableFuture? List some main methods of ComplertableFuture.
```
Future and CompletableFuture are classes that represent the result of an asynchronous computation or task. 
They allow you to perform operations asynchronously and retrieve the result at a later time.
supplyAsync():
thenApply():
thenCompose():
thenAccept():
exceptionally():
```