## HW5
## Mar 26th 2024

### 2.Explain what is volatile in java?
- This keyword cannot be used with classes and methods, instead can be used with variables.
- ``volatile``is used to indicate that variable's value can be modified by multiple threads concurrently.
- changes made to ``volatile``variable by one thread are immediately visible to other thread.
- read and write of ``volatile``variable are **atomic**, meaning that they are indivisible and cannot be interrupted by other threads.
- changes made to the variable are reflected consistently across all threads. 
- ``volatile``variable doesn't incur the overhead of acquiring and releasing locks

```java
public class Singleton {
    private static volatile Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {   // First check (without locking)
            synchronized (Singleton.class) {
                if (instance == null) {   // Second check (with locking)
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
```
By combining volatile with double-checked locking, we ensure that:

The singleton instance is properly initialized in a thread-safe manner.
Performance overhead due to synchronization is minimized, as synchronization is only used when necessary (i.e., during instance creation).

### 3.How to create a new thread(Please also consider Thread Pool approach)?
- Extending the Thread class
```java
class MultithreadingDemo extends Thread {
    public void run() {
        System.out.println("My thread is in running state.");
    }
    
    public static void main(String args[]) {
        MultithreadingDemo obj = new MultithreadingDemo();
        obj.start();
    }
}
```

- Implementing Runnable interface in Java
```java
class MultithreadingDemo implements Runnable {  
   public void run() {  
      System.out.println("My thread is in running state.");  
  }  
   public static void main(String args[]) {  
      MultithreadingDemo obj=new MultithreadingDemo();   
      Threadtobj =new Thread(obj);       
      tobj.start();  
   }   
}
```
- Using Thread Pool
```java
public static void main(String[] args) {
    // Creating a thread pool with a fixed number of threads
    ExecutorService executor = Executors.newFixedThreadPool(5);
    
    // Submitting tasks to the thread pool
    for (int i = 0; i < 10; i++) {
        executor.submit(() -> {
            // Code to be executed in the thread pool
            System.out.println("This is a new thread from the pool.");
        });
    }
    
    // Shutting down the thread pool
    executor.shutdown();
}
```
``Thread pool appproach``is more efficient because it reuses threads from a thread pool, which reduces the overhead of creating and destroying threads.

### 4.Difference between Runnable and Callable?
- Both Runnable and Callable interfaces used to encapsulate tasks that are needed to be executed by another thread.
  - **Running Interface:** it is used to executed code on a concurrent thread.
  ```java
    public interface Runnable {   
        public abstract void run();
    }
  ```
  - **Callable Interface:** it uses generics to define the return type of object
  ```java
  public interface Callable<V> {    
    V call() throws Exception;  
  }
  ````    
| Runnable Interface                                             | Callable Interface                         |
|----------------------------------------------------------------|--------------------------------------------|
| Doesn't return any result, so cannot throw a checked exception | return a result and can throw an exception |
| cannot be passed to invokeAll method                           | can be passed to invokeAll method.         |
| uses the run() method to define a task.                        | uses the call() method to define a task.   |
| To use this interface, one needs to override the run() method  | To use this interface need to override the call method|

### 5.What is the difference between t.start() and t.run()?
- ``start()``: create a new thread, this newly created thread executes the task (``run()`` method). One can call the start() method only once.

- ``run()``: execute the current thread. One can call the run() method multiple times. 

### 6.Which way of creating threads is better: Thread class or Runnable interface?
- Runnable is better
- When extending the Thread class, we’re not overriding any of its methods. Instead, we override the method of Runnable. 
- Creating an implementation of Runnable and passing it to the Thread class utilizes composition and not inheritance – which is more flexible
- After extending the Thread class, we can’t extend any other class
- From Java 8 onwards, Runnables can be represented as lambda expressions

### 7.What are the thread statuses?
- 1.New Thread:
  - The thread has not yet started to run.
- 2.Runnable State:
  - a thread might actually be running or it might be ready to run at any instant of time. 
  - It is the responsibility of the thread scheduler to give the thread, time to run. 
- 3.Blocked:
  - The thread will be in blocked state when it is trying to acquire a lock but currently the lock is acquired by the other thread. 
  - The thread will move from the blocked state to runnable state when it acquires the lock.
- 4.Waiting state:
  - The thread will be in waiting state when it calls wait() method or join() method. 
  - It will move to the runnable state when other thread will notify or that thread will be terminated.
- 5.Timed Waiting:
  - A thread lies in a timed waiting state when it calls a method with a time-out parameter. 
  - For example, when a thread calls sleep or a conditional wait, it is moved to a timed waiting state.
- 6.Terminated State: 
  - Because it exits normally. This happens when the code of the thread has been entirely executed by the program.
  - Because there occurred some unusual erroneous event, like a segmentation fault or an unhandled exception.

### 8.What is deadlock?
- Deadlock is multiple threads are blocked forever
- it occurs when multiple threads hold locks on different resources and waiting for other resources to complete their task.

### 9.How do threads communicate each other?
- Threads can communicate using three methods: 
  - ``wait()``
    - causes the current thread to wait until another thread invokes the ``notify()`` or ``notifyAll()``
  - ``notify()`` 
    - The ``notify()`` method wakes up a single thread that is waiting on the object's monitor. 
    - If multiple threads are waiting, the JVM arbitrarily selects one of them to be awakened. 
    - The awakened thread does not immediately regain the lock; it must compete with other threads for the lock's ownership.
  - ``notifyAll()``
    - The ``notifyAll()`` method wakes up all threads that are waiting on the object's monitor. 
    - This method is often preferred over notify() because it ensures that all waiting threads are notified. However, it may lead to inefficiencies if not used carefully, as it may cause unnecessary contention for the lock.


### 10.class lock VS object lock
- Class lock: 
  - in java, each and every class has a unique lock usually referred to as a class level lock.
  - These locks are achieved using the keyword `static synchronized` and can be used to make static data thread-safe.
  - It is generally used when one wants to prevent multiple threads from entering a synchronized block.

``` java
public class ClassLevelLockExample {    
    public void classLevelLockMethod() {       
       synchronized (ClassLevelLockExample.class) {         
       //DO your stuff here       
       }    
    }
}
```
- Object Lock:
- In java, each and every object has a unique lock usually referred to as an object-level lock.
- These locks are achieved using the keyword ``synchronized`` and can be used to protect non-static data. 
- It is generally used when one wants to synchronize **a non-static method** or block so that only the thread will be able to execute the code block on a given instance of the class.

```java
public class ObjectLevelLockExample {    
  public void objectLevelLockMethod() {   
     synchronized (this) {     
     //DO your stuff here   
     } 
  }
} 
```

### 11.What is join() method?
- ``join()``is used to pause the execution of a current thread until the specified thread on which join is called is dead/completed.
```java
public class JoinExample {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Task("Thread 1"));
        Thread thread2 = new Thread(new Task("Thread 2"));
        
        // Start both threads
        thread1.start();
        thread2.start();
        
        try {
            // Wait for thread1 to finish
            thread1.join();
            System.out.println("Thread 1 has finished.");
            
            // Wait for thread2 to finish
            thread2.join();
            System.out.println("Thread 2 has finished.");
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }
        
        System.out.println("Main thread exiting.");
    }
}

class Task implements Runnable {
    private String name;

    public Task(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + " started.");
        try {
            // Simulate some task execution
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(name + " interrupted.");
        }
        System.out.println(name + " completed.");
    }
}
```

### 12.What is yield() method?
- A yield() method is a static method of Thread class and it can stop the currently executing thread and will give a chance to other waiting threads of the same priority.
- If in case there are no waiting threads or if all the waiting threads have low priority then the same thread will continue its execution.
- Advantage of yield() is to get a change to execute other waiting threads, if current thread takes more time to execute and allocate processor to other threads
```java
public class ThreadYield {
  public static void main(String[] args) {
    Runnable r = () -> {
      int counter = 0;
      while (counter < 2) {
        System.out.println(Thread.currentThread()
                .getName());
        counter++;
        Thread.yield();
      }
    };
    new Thread(r).start();
    new Thread(r).start();
  }
}
```
-
  | output Run 1: | output  Run 2: |
  |---------------|----------------|
  | Thread-0      | Thread-0       |
  | Thread-1      | Thread-0       |
  | Thread-1      | Thread-1       |
  | Thread-0      | Thread-1       |

- so you can see yield() is non-deterministic

### 13.What is ThreadPool? How many types of ThreadPool? What is the TaskQueue in ThreadPool?
- A thread pool is a collection of threads that are managed by a thread pool manager.
- When a task is submitted to the thread pool, it assigns the task to an available thread from the pool
- Thread Pool executor separates the task of creating and maintaining the thread task, so developer doesn't need to focus on maintaining the task executor.

- **Fixed Thread Pool:**
  - A thread pool with a fixed number of threads. 
  - If a thread is not available for the task, the task is put in queue waiting for another task to ends. 
  - Method : ``Executors.newFixedThreadPool()``
  
- **Scheduled Thread Pool:**
  - A thread pool made to schedule future task. 
  - Method : ``Executors.newScheduledThreadPool()``
  
- **Single Thread Executor:**
  - A thread pool with only one thread. 
  - So all the submitted tasks will be executed sequentially. 
  - Method : ``Executors.newSingleThreadExecutor()``

- **Cached Thread Pool:**
  - A thread pool creates threads as needed to execute the task in parallel.
  - A thread pool reuses threads when they become available.
  - It doesn't have a fixed number of threads and create new threads as needed.
  - If a thread is not used during 60 seconds, it will be terminated and removed from the pool.
  - Method : ``Executors.newCachedThreadPool()``

-**What is the TaskQueue in ThreadPool?**
  - holding tasks that are submitted to the pool for execution.
  - task submitters -> task queue -> thread pool

### 14.Which Library is used to create ThreadPool? Which Interface provide main functions of thread-pool?
- The java.util.concurrent package provides the framework for creating and managing thread pools. 
- The ExecutorService interface is the main interface that provides the main functions for working with thread pools.

### 15.How to submit a task to ThreadPool?
- submitting a task to thread pool can be accomplished through the use of the ExecutorService interface.
``` java
import java.util.concurrent.*;
public class ThreadPoolExample {
    public static void main(String[] args) {
        // Create a thread pool with fixed-size pool of 5 threads
        ExecutorService executor = Executors.newFixedThreadPool(5);

        // Define the task
        Runnable task = () -> {
            System.out.println("Task executed by thread: " + Thread.currentThread().getName());
        };

        // Submit the task to the thread pool
        executor.submit(task);

        // Shutdown the executor service when no longer needed
        executor.shutdown();
    }
}
```

### 16.What is the advantage of ThreadPool?
- Resource Management: 
  - Creating and destroying threads for each task can be resource-intensive, as each thread consumes system resources (like memory and CPU cycles) for its operation and overhead. 
  - A ThreadPool reuses a fixed number of threads to execute multiple tasks, reducing the overhead associated with thread creation and destruction.
Improved Performance: 
  - Since threads are reused, the latency associated with thread creation is eliminated, leading to faster task start times
Enhanced System Stability: 
  - ThreadPools help in maintaining a stable system by limiting the number of simultaneously running threads.
Workload Management: 
  - ThreadPools often come with a queue for tasks waiting to be executed. 
  - This can help manage and smooth out bursts of requests by queuing excess tasks, thereby maintaining a more consistent system load.

### 17.Difference between shutdown() and shutdownNow() methods of executor
- ``shutdown()``
  - previously submitted tasks are executed, but no new tasks will be accepted.
  - It doesn't interrupt currently executing tasks but allows them to complete.
- ``shutdownNow()``
  -  stop all actively executing tasks and halts the processing of waiting tasks.

### 18.What is Atomic classes? How many types of Atomic classes? Give me some code example of Atomic classes and its main methods. when to use it?
- Atomic classes provide operations that are atomic (performed as a single, indivisible unit of operation). 
- These classes are part of the java.util.concurrent.atomic package. 

- **Types of atomic classes in Java, including:**
  - **AtomicBoolean:** Provides atomic operations on boolean values.
  - **AtomicInteger:** Provides atomic operations on integer values.
  - **AtomicLong:** Provides atomic operations on long values.
  - **AtomicReference:** Provides atomic operations on reference values.
  - **AtomicIntegerArray:** Provides atomic operations on arrays of integer values.
  - **AtomicLongArray:** Provides atomic operations on arrays of long values.
  - **AtomicReferenceArray:** Provides atomic operations on arrays of reference values.


``` java
public class AtomicExample {
    private AtomicInteger count = new AtomicInteger(0);

    public void increment() {
        count.incrementAndGet(); // Atomically increments by one
    }

    public void decrement() {
        count.decrementAndGet(); // Atomically decrements by one
    }

    public int getCount() {
        return count.get(); // Returns the current value
    }

    public static void main(String[] args) {
        AtomicExample example = new AtomicExample();
        example.increment();
        example.decrement();
        System.out.println("Count: " + example.getCount());
    }
}
```
- use ``AtomicInteger`` for thread safety, we don't need to use ``synchronized`` blocks or locks.
- Atomic operations provided by AtomicInteger guarantee that each operation (e.g., increment, decrement) is performed atomically

### 19. What is the concurrent collections? Can you list some concurrent data structure (Thread-safe)
- Concurrent collections in Java are thread-safe implementations of collection interfaces provided by the java.util.concurrent package.
- They are designed to be used in concurrent or multi-thread environments, where multiple threads may access and modify the collection concurrently without synchronization.
- commonly used concurrent collections in java:
  - ConcurrentHashMap
  - ConcurrentLinkedQueue
  - CopyOnWriteArrayList
  
### 20. What kind of locks do you know? What is the advantage of each lock?
- There are several types of locks used in concurrent programming:
  - **Synchronized Blocks:**
    - Using the synchronized keyword, you can mark code blocks or methods as synchronized, ensuring that only one thread can access the synchronized code block at a time.
    -  Compared to ReentrantLock, the synchronized keyword is simpler and easier to use but less flexible.
  - **Stamped Locks:**
    - designed to improve performance in scenarios with high concurrency read operations
    - has 3 modes:
      - optimistic read: 
        - non-blocking state
        - allow multiple threads to read simultaneously
      - pessimistic read:  
        - prevent other threads from acquiring write lock while it is held
        - if a thread holds a write lock, attempts to acquire a read lock will be blocked until the write lock is released.
      - write lock:
        - preventing other threads from acquiring read or write locks while held
        - used to protect shared resources, ensuring atomicity and consistency of write operations.
    - ``StampedLock ``is more complex to use and requires manual management of lock states.
    - Advantage: The optimistic read mode allows for lock-free reading of the resource while checking for write operations, which can significantly improve performance in read-heavy scenarios.
  - **ReentrantLock:**
   - ReentrantLock guarantees mutual exclusive access to shared resources.
   - located in the java.util.concurrent.locks package.
   - allowing a thread to enter a synchronized block multiple times without being blocked by itself, thus preventing deadlocks.
   - Advantage: Simple and efficient.
``` java
public void some_method() {
      reentrantlock.lock();
      try{
         //Do some work
      }
      catch(Exception e){
          e.printStackTrace();
      }
      finally{
          reentrantlock.unlock();
      }
}
```
  - **ReentrantReadWriteLock** 
    -`` ReentrantReadWriteLock.ReadLock`` shared locks
      - ``Purpose: ``Enable multiple threads to read shared data concurrently.
      - ``Behavior:`` If no thread has the write lock, multiple threads can acquire the read lock.
      - ``Use Case:`` Ideal when there are more read operations. 
    - ``ReentrantReadWriteLock.WriteLock`` Exclusive locks
      - ``Purpose:`` Ensure that only one thread can write to shared data at a time.
      - ``Behavior:`` If a write lock is requested, it will be granted only when no threads are holding any read or write locks.
      - ``Use Case:`` Necessary when writing to shared resources to prevent data corruption.

  - **Condition:**
    - Works with ``ReentrantLock`` or`` ReentrantReadWriteLock`` to allow threads to wait for specific conditions to become true
    - using methods such as await() and signal().
  
### 21. What is future and completableFuture? List some main methods of ComplertableFuture.
- ``Future``
  - represents the result of an asynchronous computation. 
  - Methods are provided to check if the computation is complete, to wait for its completion, and to retrieve the result of the computation.
- ``CompletableFuture``
  - an extension of Future to overcome the limitations of the traditional Future
  - It supports lambda expressions and provides a rich, fluent API for composing asynchronous logic in a declarative manner.
  - examples:
    - thenApply(Function<? super T,? extends U> fn)
    - thenAccept(Consumer<? super T> action)
    - thenRun(Runnable action)
    - anyOf(CompletableFuture<?>... cfs)
    - exceptionally(Function<Throwable, ? extends T> fn)
    - handle(BiFunction<? super T, Throwable, ? extends U> fn)

### 23.Write a code to create 2 threads, one thread print 1,3,5,7,9, another thread print 2,4,6,8,10.
-a. One solution use synchronized and wait notify
-b. One solution use ReentrantLock and await, signal