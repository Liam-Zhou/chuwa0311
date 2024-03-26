# 2. Explain what is volatile in java? (we also use it in Singleton)
volatile is a keyword used to modify the declaration of a variable. It serves as an indicator to the JVM that the variable may be accessed and modified by multiple threads concurrently.\
It's a lighter-weight alternative to synchronized when you just need to ensure that threads see the latest value of a variable.

# 3. How to create a new thread(Please also consider Thread Pool approach)?
```java
//Extending Thread
class MyThread extends Thread {
	public void run() {
		System.out.println("Thread is running.");
	}
}

public class Main {
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		t1.start();
	}
}

//Implementing the Runnable interface
class MyRunnable implements Runnable {
	public void run() {
		System.out.println("Thread is running.");
	}
}

public class Main {
	public static void main(String[] args) {
		MyRunnable myRunnable = new MyRunnable();
		Thread t1 = new Thread(myRunnable);
		t1.start();
	}
}

//Callable and threadpool
class MyCallable implements Callable<String> {
	@Override
	public String call() throws Exception {
		// Task code here
		return "Task result";
	}
}
public class Main {
	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(5);
		Callable<String> callable = new MyCallable();
		Future<String> future = executor.submit(callable);

		try {
			// Getting the result of the callable using future
			String result = future.get();
			System.out.println("Result: " + result);
		} catch (Exception e) {
			e.printStackTrace();
		}

		executor.shutdown();
	}
}
```

# 4. Difference between Runnable and Callable?
Runnable does not return a result; Callable returns a result.\
Runnable cannot throw checked exceptions; Callable can throw checked exceptions.

# 5. What is the difference between t.start() and t.run()?
When you call t.start() on a Thread object t, it initiates a new thread of execution\
Calling t.run() directly simply executes the run() method's code on the current thread, just like a normal method call. No new thread is created, and it's executed synchronously.

# 6. Which way of creating threads is better: Thread class or Runnable interface?
In general, implementing the Runnable interface is often considered better practice due to its flexibility and alignment with Java's object-oriented design principles.

# 7. What are the thread statuses?
NEW: When a thread is created but not yet started.\
RUNNABLE: A thread in this state is either executing in the Java Virtual Machine (JVM) or ready to run but waiting for resource allocation to execute. \
BLOCKED: A thread enters this state when it tries to acquire a monitor lock (typically, entering a synchronized block or method) to enter or reenter a synchronized context, but another thread currently holds that lock. The thread remains in this state until it acquires the lock\
WAITING: A thread is in this state when it waits indefinitely for another thread to perform a specific action. \
TIMED_WAITING: Similar to the WAITING state, but with a specified waiting time. \
TERMINATED: A thread is in this state when it completes its execution, either normally or through an uncaught exception.

# 8. What is deadlock?
two or more threads are blocked forever, waiting for each other

# 9. How do threads communicate each other?
wait(), notify(), and notifyAll() Methods

# 10. What’s the difference between class lock and object lock?
Object Lock: Pertains to an instance of a class; synchronizes access to non-static synchronized methods/blocks within the same object.\
Class Lock: Pertains to the Class object itself; synchronizes access to static synchronized methods/blocks, affecting all instances of the class.

# 11. What is join() method?
The join() method in Java is a mechanism that allows one thread to wait for the completion of another.
It is used in situations where you want to pause the execution of one thread until another thread finishes its task.

# 12. what is yield() method
signal to the thread scheduler that the current thread is willing to relinquish its current use of the processor but is willing to be scheduled again in the future.

# 13. What is ThreadPool? How many types of ThreadPool? What is the TaskQueue in ThreadPool?
A ThreadPool in Java is a group of pre-instantiated, idle threads which stand ready to be given work. These threads are managed by an instance of ExecutorService, which handles their lifecycle, scheduling, and execution.\
FixedThreadPool: A thread pool with a fixed number of threads. \
CachedThreadPool: A thread pool that creates new threads as needed, but reuses previously constructed threads when available. \
SingleThreadExecutor: A single-threaded executor, which guarantees that all tasks are executed sequentially. \
ForkjoinPool: It's specifically designed for tasks that can be broken down into smaller tasks recursively (following the fork/join framework) and is particularly well-suited for tasks that can be executed in parallel, often used in parallel processing of data and recursive algorithms.

# 14. Which Library is used to create ThreadPool? Which Interface provide main functions of thread-pool?
the primary library used to create and manage thread pools is the java.util.concurrent package.with the ExecutorService interface and its implementing classes like ThreadPoolExecutor and ForkJoinPool providing the main functionalities.

# 15. How to submit a task to ThreadPool?
Submitting a task to a ThreadPool in Java is straightforward and can be accomplished through the use of the ExecutorService interface
```java
ExecutorService executor = Executors.newFixedThreadPool(4); // Creates a pool with 4 threads
Callable<String> task = () -> {
	System.out.println("Executing task");
	// Task code here
	return "Result";
};
Future<String> future = executor.submit(task);
try {
String result = future.get();  // Waits for the task to complete and retrieves the result
    System.out.println("Result: " + result);
} catch (InterruptedException | ExecutionException e) {
    e.printStackTrace();
}
executor.shutdown();
```

# 16. What is the advantage of ThreadPool?
- Resource Management: Creating and destroying threads for each task can be resource-intensive, as each thread consumes system resources (like memory and CPU cycles) for its operation and overhead. A ThreadPool reuses a fixed number of threads to execute multiple tasks, reducing the overhead associated with thread creation and destruction.
- Improved Performance: Since threads are reused, the latency associated with thread creation is eliminated, leading to faster task start times
- Enhanced System Stability: ThreadPools help in maintaining a stable system by limiting the number of simultaneously running threads.
- Workload Management: ThreadPools often come with a queue for tasks waiting to be executed. This can help manage and smooth out bursts of requests by queuing excess tasks, thereby maintaining a more consistent system load.

# 17. Difference between shutdown() and shutdownNow() methods of executor
Gradual Shutdown: shutdown() initiates a graceful shutdown in which previously submitted tasks are executed, but no new tasks will be accepted. It doesn't interrupt currently executing tasks but allows them to complete.
Immediate Shutdown: shutdownNow() attempts to stop all actively executing tasks and halts the processing of waiting tasks.

# 18. What is Atomic classes? How many types of Atomic classes? Give me some code example of Atomic classes and its main methods. when to use it?
They provide a way to perform atomic (i.e., thread-safe, non-interruptible) operations on single variables without using synchronization (like synchronized blocks or methods).\
AtomicInteger, AtomicLong, AtomicBoolean, AtomicReference, AtomicReferenceArray, AtomicMarkableReference, AtomicStampedReference, AtomicIntegerArray, AtomicLongArray
```java

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
When you need to perform thread-safe operations on single variables without the overhead of using synchronized blocks or methods.

# 19. What is the concurrent collections? Can you list some concurrent data structure (Thread-safe)
Concurrent collections are data structures designed for use in multithreading environments. They provide thread-safe operations without the need for external synchronization (like using synchronized blocks or methods). \
ConcurrentHashMap, ConcurrentLinkedQueue, CopyOnWriteArrayList, CopyOnWriteArraySet, LinkedBlockingQueue, ArrayBlockingQueue

# 20. What kind of locks do you know? What is the advantage of each lock?
Reentrant Locks: A reentrant mutual exclusion lock with the same basic behavior as intrinsic locks but with extended capabilities.\
ReadWrite Locks: Separates lock access for read-only and write operations. It allows multiple threads to read a resource concurrently, as long as no thread is writing to it.\
Stamped Locks: A lock with three modes (writing, reading, and optimistic reading). It's a more advanced version of ReadWriteLock.

# 21. What is future and completableFuture? List some main methods of ComplertableFuture.
Future and CompletableFuture are classes in Java that represent the result of an asynchronous computation. They provide a way to handle the outcome of operations that are performed in a separate thread.\
Main Methods of CompletableFuture\
Creation

    completedFuture(value): Returns a new CompletableFuture that is already completed with the given value.
    runAsync(Runnable): Runs a task asynchronously and returns a CompletableFuture that is completed once the task is finished.
    supplyAsync(Supplier): Similar to runAsync, but supplies a value that becomes the result of the returned CompletableFuture.

Transformation and Action

    thenApply(Function): Returns a new CompletableFuture that, when this stage completes normally, is executed with this stage's result as the argument.
    thenAccept(Consumer): Performs an action with the result of the CompletableFuture when it completes.
    thenRun(Runnable): Executes a Runnable after this stage completes.

Combining

    thenCompose(Function): Returns a new CompletableFuture that is completed when a returned CompletableFuture completes.
    thenCombine(CompletableFuture, BiFunction): Combines the results of two CompletableFutures with a provided function.
    allOf(CompletableFuture...): Returns a new CompletableFuture that is completed when all of the given CompletableFutures complete.
    anyOf(CompletableFuture...): Returns a new CompletableFuture that is completed when any of the given CompletableFutures complete.

Exception Handling

    exceptionally(Function): Returns a new CompletableFuture that handles exceptions thrown from this stage.
    handle(BiFunction): Handles both the result and an exception of this stage, returning a new CompletableFuture.

Completion

    complete(value): Completes the CompletableFuture with the given value.
    completeExceptionally(exception): Completes the CompletableFuture exceptionally with the given throwable.

# 23. Write a code to create 2 threads, one thread print 1,3,5,7,9, another thread print 2,4,6,8,10
```java
public class SynchronizedPrinter {
    private final Object lock = new Object();
    private int number = 1;

    public void printOdd() {
        synchronized (lock) {
            while (number <= 9) {
                if (number % 2 != 0) {
                    System.out.print(number);
                    number++;
                    lock.notify();
                } else {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public void printEven() {
        synchronized (lock) {
            while (number <= 10) {
                if (number % 2 == 0) {
                    System.out.print(number);
                    number++;
                    lock.notify();
                } else {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        SynchronizedPrinter printer = new SynchronizedPrinter();
        new Thread(printer::printOdd).start();
        new Thread(printer::printEven).start();
    }
}

public class ReentrantLockPrinter {
	private final Lock lock = new ReentrantLock();
	private final Condition condition = lock.newCondition();
	private int number = 1;

	public void printOdd() {
		lock.lock();
		try {
			while (number <= 9) {
				if (number % 2 != 0) {
					System.out.print(number);
					number++;
					condition.signal();
				} else {
					condition.await();
				}
			}
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}

	public void printEven() {
		lock.lock();
		try {
			while (number <= 10) {
				if (number % 2 == 0) {
					System.out.print(number);
					number++;
					condition.signal();
				} else {
					condition.await();
				}
			}
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}

	public static void main(String[] args) {
		ReentrantLockPrinter printer = new ReentrantLockPrinter();
		new Thread(printer::printOdd).start();
		new Thread(printer::printEven).start();
	}
}
```

# 24. create 3 threads, one thread ouput 1-10, one thread output 11-20, one thread output 21-22. threads run sequence is random
```java
public class SynchronizedThreeThreadPrinter {
    private final Object lock = new Object();
    private int number = 1;

    private void printRange(int start, int end) {
        synchronized (lock) {
            while (number < start) {
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    e.printStackTrace();
                }
            }

            while (number <= end) {
                System.out.print(number++);
                lock.notifyAll();
            }
        }
    }

    public static void main(String[] args) {
        SynchronizedThreeThreadPrinter printer = new SynchronizedThreeThreadPrinter();
        new Thread(() -> printer.printRange(1, 10)).start();
        new Thread(() -> printer.printRange(11, 20)).start();
        new Thread(() -> printer.printRange(21, 30)).start();
    }
}

public class ReentrantLockThreeThreadPrinter {
	private final Lock lock = new ReentrantLock();
	private final Condition condition = lock.newCondition();
	private int number = 1;

	private void printRange(int start, int end) {
		lock.lock();
		try {
			while (number < start) {
				condition.await();
			}

			while (number <= end) {
				System.out.print(number++);
				condition.signalAll();
			}
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}

	public static void main(String[] args) {
		ReentrantLockThreeThreadPrinter printer = new ReentrantLockThreeThreadPrinter();
		new Thread(() -> printer.printRange(1, 10)).start();
		new Thread(() -> printer.printRange(11, 20)).start();
		new Thread(() -> printer.printRange(21, 30)).start();
	}
}
```
# 25. Write a simple program that uses CompletableFuture to asynchronously get the sum and product of two integers, and print the results
```java
public class CompletableFutureExample {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        CompletableFuture<Integer> sumFuture = CompletableFuture.supplyAsync(() -> {
            return a + b;
        });

        CompletableFuture<Integer> productFuture = CompletableFuture.supplyAsync(() -> {
            return a * b;
        });

        try {
            int sum = sumFuture.get(); // waits for the asynchronous task to complete
            int product = productFuture.get(); // waits for the asynchronous task to complete

            System.out.println("Sum: " + sum);
            System.out.println("Product: " + product);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}
```
