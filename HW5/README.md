1. Read: https://www.interviewbit.com/multithreading-interview-questions/#class-level-lock-vs-object-level-lock

2. Explain what is volatile in java? (we also use it in Singleton)

    Volatile keyword is used to indicate that a variable can be immdiately changed and visible to all threads

3. How to create a new thread(Please also consider Thread Pool approach)?

    1. Extending Thread class
    2. Implementing Runnable interface
    3. Implementing Callable interface
    4. Using ExecutorService and ThreadPoolExecutor
    
4. Difference between Runnable and Callable?

    Runnable interface is used to create a thread and return nothing. Callable interface is used to create a thread and return a result.
  
5. What is the difference between t.start() and t.run()?

    t.start() will create a new thread and execute the run() method in that thread. t.run() will execute the run() method in the current thread.

6. Which way of creating threads is better: Thread class or Runnable interface?

    Runnable interface is better because it allows the class to extend another class.

7. What are the thread statuses?

    New, Runnable, Running, Blocked, Waiting, Timed Waiting, Terminated

8. What is deadlock?

    Deadlock is a situation where two or more threads are waiting for each other to release the lock and none of the threads are able to release the lock.

9. How do threads communicate each other?

    1. Using wait() and notify() methods
    2. Synchronizing the methods
    3. Locks
    4. Using BlockingQueue
    5. Concurrent collections
    6. Using volatile keyword
    7. Future and CompletableFuture
    8. Using join() and yield() methods
    
10. What’s the difference between class lock and object lock?

    Class lock is used to synchronize the static methods and object lock is used to synchronize the instance methods.

11. What is join() method?

    join() method is used to wait for a thread to complete its execution.

12. what is yield() method?

    yield() method is used to pause the current thread and give a chance to other threads of the same priority.

13. What is ThreadPool? How many types of ThreadPool? What is the TaskQueue in ThreadPool?

    ThreadPool is a pool of threads that can be reused to execute tasks. There are two types of ThreadPool: FixedThreadPool and CachedThreadPool. TaskQueue is a queue that holds the tasks that need to be executed by the ThreadPool.

14. Which Library is used to create ThreadPool? Which Interface provide main functions of thread-pool?

    java.util.concurrent.Executors library is used to create ThreadPool. ExecutorService interface provides the main functions of thread-pool.

15. How to submit a task to ThreadPool?

    Using the submit() method of the ExecutorService interface.

16. What is the advantage of ThreadPool?

    ThreadPool provides the following advantages:
    1. Reuse of threads
    2. Better performance
    3. Better resource management
    4. Better control over the threads

17. Difference between shutdown() and shutdownNow() methods of executor

    shutdown() method will allow the threads to complete their execution and then shut down the ThreadPool. shutdownNow() method will immediately shut down the ThreadPool and interrupt the running threads.

18. What is Atomic classes? How many types of Atomic classes? Give me some code example of Atomic classes and its main methods. when to use it?

    Atomic classes are used to perform atomic operations on the variables. There are three types of Atomic classes: AtomicInteger, AtomicLong, and AtomicBoolean. Atomic classes are used when we need to perform atomic operations on the variables.

19. What is the concurrent collections? Can you list some concurrent data structure (Thread-safe)

    Concurrent collections are thread-safe collections that can be used in a multi-threaded environment. Some of the concurrent data structures are:
    1. ConcurrentHashMap
    2. CopyOnWriteArrayList
    3. CopyOnWriteArraySet
    4. ConcurrentLinkedQueue
    5. ConcurrentSkipListMap
    6. ConcurrentSkipListSet

20. What kind of locks do you know? What is the advantage of each lock?

    1. ReentrantLock: Allows the lock to be acquired multiple times by the same thread.
    2. ReadWriteLock: Allows multiple threads to read the data simultaneously but only one thread can write the data.
    3. StampedLock: Provides optimistic locking mechanism.

21. What is future and completableFuture? List some main methods of ComplertableFuture.
  
      Future is used to represent the result of an asynchronous computation. CompletableFuture is an extension of Future that provides more flexibility and control over the asynchronous computation. Some of the main methods of CompletableFuture are:
      1. thenApply()
      2. thenAccept()
      3. thenRun()
      4. thenCombine()
      5. thenCompose()
      6. exceptionally()
      7. handle()


