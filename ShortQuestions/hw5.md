## HW5
## Mar 26th 2024

2.Explain what is volatile in java?
- This keyword cannot be used with classes and methods, instead can be used with variables.
- ``volatile``is used to indicate that variable's value can be modified by multiple threads concurrently.
- changes made to ``volatile``variable by one thread are immediately visible to other thread.
- read and write of ``volatile``variable are **atomic**, meaning that they are indivisible and cannot be interrupted by other threads.
- changes made to the variable are reflected consistently across all threads. 
- ``volatile``variable doesn't incur the overhead of acquiring and releasing locks

```
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

3.How to create a new thread(Please also consider Thread Pool approach)?
- Extending the Thread class
```
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
```
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
```
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

4.Difference between Runnable and Callable?
- Both Runnable and Callable interfaces used to encapsulate tasks that are needed to be executed by another thread.
  - **Running Interface:** it is used to executed code on a concurrent thread.
  ```
    public interface Runnable {   
        public abstract void run();
    }
  ```
  - **Callable Interface:** it uses generics to define the return type of object
  ```
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

5.What is the difference between t.start() and t.run()?
- ``start()``: create a new thread, this newly created thread executes the task (``run()`` method). One can call the start() method only once.

- ``run()``: execute the current thread. One can call the run() method multiple times. 

6.Which way of creating threads is better: Thread class or Runnable interface?
- Runnable is better
- When extending the Thread class, we’re not overriding any of its methods. Instead, we override the method of Runnable. 
- Creating an implementation of Runnable and passing it to the Thread class utilizes composition and not inheritance – which is more flexible
- After extending the Thread class, we can’t extend any other class
- From Java 8 onwards, Runnables can be represented as lambda expressions

7.What are the thread statuses?
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

8.What is deadlock?
- Deadlock is multiple threads are blocked forever
- it occurs when multiple threads hold locks on different resources and waiting for other resources to complete their task.

9.How do threads communicate each other?
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


10.class lock VS object lock
- Class lock: 
  - in java, each and every class has a unique lock usually referred to as a class level lock.
  - These locks are achieved using the keyword `static synchronized` and can be used to make static data thread-safe.
  - It is generally used when one wants to prevent multiple threads from entering a synchronized block.

```  
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

```
public class ObjectLevelLockExample {    
  public void objectLevelLockMethod() {   
     synchronized (this) {     
     //DO your stuff here   
     } 
  }
} 
```

11.What is join() method?
- ``join()``is used to pause the execution of a current thread until the specified thread on which join is called is dead/completed.
```
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

12.What is yield() method?
- A yield() method is a static method of Thread class and it can stop the currently executing thread and will give a chance to other waiting threads of the same priority.
- If in case there are no waiting threads or if all the waiting threads have low priority then the same thread will continue its execution.
- Advantage of yield() is to get a change to execute other waiting threads, if current thread takes more time to execute and allocate processor to other threads
```
class MyThread extends Thread {
   public void run() {
      for (int i = 0; i < 5; ++i) {
         Thread.yield(); // By calling this method, MyThread stop its execution and giving a chance to a main thread
         System.out.println("Thread started:" + Thread.currentThread().getName());
      }
      System.out.println("Thread ended:" + Thread.currentThread().getName());
   }
}
public class YieldMethodTest {
   public static void main(String[] args) {
      MyThread thread = new MyThread();
      thread.start();
      for (int i = 0; i < 5; ++i) {
         System.out.println("Thread started:" + Thread.currentThread().getName());
      }
      System.out.println("Thread ended:" + Thread.currentThread().getName());
   }
}
```

13.What is ThreadPool? How many types of ThreadPool? What is the TaskQueue in
ThreadPool?
- ThreadPool is simply a collection of pre-initialized oor worker threads at the start-up that can be used to execute tasks and put back in the pool when completed.
- 