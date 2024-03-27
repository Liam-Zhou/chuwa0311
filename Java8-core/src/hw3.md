#HW3

# 5. Write the Singleton design pattern include eager load and lazy load.
```java
public class EagerLoadedSingleton {
    
    private static final EagerLoadedSingleton INSTANCE = new EagerLoadedSingleton();

    private EagerLoadedSingleton() {}

    public static EagerLoadedSingleton getInstance() {
        return INSTANCE;
    }
}
```
```java
public class LazyLoadedSingleton {
    private static LazyLoadedSingleton instance;
    
    private LazyLoadedSingleton() {}
    
    public static LazyLoadedSingleton getInstance() {
        if (instance == null) {
            instance = new LazyLoadedSingleton();
        }
        return instance;
    }
}
```
# 6. What is Runtime Exception? could you give me some examples?

    A RuntimeException in Java is a subclass of the Exception class that indicates exceptions that
    might occur during the execution of a program but are not checked by the compiler.

    example: NPE and ArrayIndexOutOfBoundsException
### 7. Could you give me one example of NullPointerException?
```java
class test {
  String str = null;
  System.out.println(str.length());
}

```

### 8. What is the Optional class?
    The Optional class in Java is a container object used to contain not-null objects.
    Optional is a public final class and is used to deal with NullPointerException in Java 
    application. It provides a means for expressing optional values (values that are either present
    or absent) without using null. Using Optional, you can represent a non-existent value by an 
    empty instance of Optional rather than null, thus avoiding many common pitfalls related to null
    references.
### 9. What are the advantages of using the Optional class?

    1. Improved Code Readability
    Optional makes it clear when a method might not return a value. This explicitness can make the 
    code more readable and understandable, as it signals to the developers that they should handle 
    the case where a value might be absent.
    
    2. Null Safety
    By using Optional, you can avoid NullPointerException, a common issue in Java applications. 
    Optional forces you to actively think about the case where a value might be missing, leading to
    more robust and error-free code.

    3. Better API Design
    Optional can lead to a better API design by clearly indicating that a method might not always 
    return a value. This can make APIs more predictable and easier to use correctly, reducing the 
    chance of errors.
### 10. What is the @FunctionalInterface?
    The @FunctionalInterface annotation in Java is used to indicate that an interface is intended 
    to be a functional interface. A functional interface is an interface that has exactly one 
    abstract method, although it can have multiple default or static methods. This concept is 
    crucial for lambda expressions introduced in Java 8, as it allows for instances of functional 
    interfaces to be created with lambda expressions, method references, or constructor references.

### 11. what is lamda?

    allows you to write more concise and readable code, particularly when using functional 
    interfaces. A lambda expression is essentially a short block of code which takes in parameters 
    and returns a value. Lambda expressions are similar to methods, but they do not need a name and
    can be implemented right in the body of a method.
### 12. What is Method Reference?
    Method references in Java are a special type of lambda expressions. They're used to refer 
    directly to methods of existing classes or objects (instance methods or static methods). Method
    references help make your code more readable and concise by removing the boilerplate code that 
    is usually associated with using anonymous classes or lambda expressions for defining functional
    interfaces.

    A method reference is denoted by the :: symbol. The left side specifies the class or instance 
    containing the method, while the right side specifies the name of the method. Note that you 
    don't provide method arguments when using method references.

### 13. What is Java 8 new features?
    lambda, method references, stream api, optional class, default and tatic method in interfaces,
    new date and time api

### 14. Lambda can use unchanged variable outside of lambda? what is the details?
    when you use variables from the enclosing scope in a lambda expression, those variables need 
    to be either explicitly declared as final or effectively final. An effectively final variable is
    one whose value doesn't change after it's initialized. 
```java
class test {
    int num = 10; // This variable is effectively final

// Lambda expression uses the "num" variable
    Runnable r = () -> System.out.println(num);

// This would cause a compile-time error if uncommented, as it changes the value of "num"
// num = 20;
    }

```
### 15. Describe the newly added features in Java 8?
    1. Lambda Expressions
    Lambda expressions were a major addition, bringing a way to express instances of single-method 
    interfaces (functional interfaces) more concisely. They facilitated functional programming and 
    simplified the development of APIs by treating functionality as a method argument, or code as 
    data.

    2. Stream API
    The Stream API was introduced to bring a functional programming approach to processing 
    collections of objects. It supports operations like map, filter, reduce, find, match, sort, 
    and so on. Streams can be sequential or parallel, providing an easy way to leverage multi-core 
    architectures.

    3. Optional
    Optional is a container object which may or may not contain a non-null value. It provides a way 
    to deal with NullPointerException in a more clean and readable way, especially when working with
    Stream operations that may not return a value.

    4. Default and Static Methods in Interfaces
    Java 8 introduced the ability to define default and static methods in interfaces. Default 
    methods allow the developers to add new methods to the interfaces without breaking the existing 
    implementation of these interfaces. Static methods in interfaces help in providing utility 
    methods within interfaces.

### 16. Can a functional interface extend/inherit another interface?
    Yes, A functional interface is defined as an interface with exactly one abstract method. This 
    definition allows for default and static methods, as they do not count towards the interface's 
    abstract method count.
    Rules for Extending Interfaces
    Extending a Non-Functional Interface: If a functional interface extends a non-functional 
    interface (an interface with more than one abstract method or no abstract methods), the child 
    interface must either not add any abstract methods or it must implement abstract methods from 
    the parent interface, ensuring that there is exactly one abstract method in total.

    Extending Another Functional Interface: If a functional interface extends another functional 
    interface, it cannot declare any new abstract methods. However, it can redeclare the same 
    abstract method from the parent interface (though this is often redundant) or provide default 
    implementations.

    Multiple Inheritance of Interfaces: If a functional interface extends multiple interfaces, the 
    combination of all inherited interfaces must result in exactly one abstract method, making sure 
    it qualifies as a functional interface.

### 17.  What is the lambda expression in Java and How does a lambda expression relate to a functional interface?
    allow you to treat functionality as a method argument, or code as data. They provide a clear and
    concise way to represent one method interface using an expression. Lambda expressions are often 
    used to create anonymous methods that can be passed to methods expecting a functional interface 
    as an argument.

    Lambda expressions are closely related to functional interfaces. A functional interface is any 
    interface that contains only one abstract method (excluding default methods and static methods).
    This definition allows the functional interface to be used as the assignment target for a lambda    
    expression or method reference.
    When a lambda expression is used, it implements the single abstract method of a functional 
    interface. The type of the lambda expression is deduced from the context in which the lambda is
    used, often a target functional interface.

### 18. In Java 8, what is Method Reference?
    Method references in Java 8 are a shorthand notation of a lambda expression to call a method. 
    They are part of the functional programming features introduced to make Java code more concise 
    and readable, especially when a lambda expression does nothing more than call an existing 
    method. Method references can be seen as a way to point to methods directly using their names 
    rather than invoking them explicitly.


### 19. What does the String::ValueOf expression mean?
    The expression String::valueOf is a method reference in Java that refers to the valueOf method 
    of the String class. Method references provide a way to refer to methods directly by their names
    for use with functional interfaces, making the code more concise and readable.

    The String.valueOf method is overloaded within the String class to accept different types of 
    arguments (e.g., Object, char, boolean, char[], int, long, float, double), converting these 
    arguments to their corresponding string representations. When you use String::valueOf as a 
    method reference, you are essentially providing a reference to one of these valueOf methods, 
    depending on the context in which it's used.


### 20. What are Intermediate and Terminal operations?
    Intermediate operations are operations that transform a stream into another stream. They are 
    lazy, meaning that executing an intermediate operation doesn't actually perform any filtering, 
    mapping, or any other transformation on the data. Instead, these operations create a new stream
    on which further processing can be done. The operations are executed only when a terminal 
    operation is invoked on the stream pipeline.
    Terminal operations are operations that close the stream. After a terminal operation has been 
    applied to a stream, it can no longer be used. Terminal operations trigger the processing of the
    data in the stream pipeline; they produce a result or a side-effect. Once a terminal operation 
    is performed, the stream pipeline is considered consumed, and can no longer be used.
    
### 21. What are the most commonly used Intermediate operations?
    filter(Predicate<T>), map(Function<T,R>), flatMap(Function<T,Stream<R>>), distinct(), sorted()
    peek(Consumer<T>), limit(long maxSize), skip(long n)

### 22. What is the difference between findFirst() and findAny()?
    findFirst()    
    Purpose: Returns the first element of the stream.
    Behavior: In a sequential stream, findFirst() will return the first element according to the 
    encounter order of the stream. The encounter order is the order in which elements are provided 
    to the stream operations.
    Use Case: findFirst() is useful when you need a deterministic result, meaning you want the same 
    element every time from a stream with a defined order.

    findAny()
    Purpose: Returns any element from the stream.
    Behavior: In a sequential stream, findAny() typically returns the first element, similar to 
    findFirst(), but there is no guarantee. In a parallel stream, findAny() is free to return any 
    element from the stream that matches the given criteria, which allows for more efficient 
    operations since the operation can return immediately when any matching element is found without
    processing the entire stream.
    Use Case: findAny() is preferable when working with parallel streams or when the order of 
    elements is not important. It can provide better performance by leveraging the nature of 
    parallel processing.

### 23. How are Collections different from Stream?

    Collections
    Nature: Collections are in-memory data structures which hold elements within a single unit, such
    as Lists, Sets, and Maps. They are primarily focused on efficient management and access to data
    (storage and retrieval), and they actively store elements.

    Iteration: Collections support iterative operations over the elements they contain. The 
    iteration is explicit, meaning you can use loops such as for, forEach, or iterator patterns to
    iterate over the elements.

    Mutability: Many collections allow you to add, remove, or modify elements directly. This means
    they support operations that change the structure or contents of the collection.

    Concurrency: Handling concurrency (multiple threads accessing/modifying the collection at the
    same time) requires external synchronization or using concurrent collection implementations 
    provided by Java.

    Usage: Collections are used when you need to access individual elements frequently, modify the
    collection, or have precise control over when and how iteration occurs.

    Streams
    Nature: Streams represent a sequence of elements supporting sequential and parallel aggregate
    operations. They do not store data themselves but instead provide a high-level abstraction for
    manipulating the source data through a pipeline of operations.

    Iteration: Streams handle iteration internally and abstractly. Operations on streams do not 
    directly modify the underlying data source; they return a new stream that, when traversed, 
    contains the elements resulting from the operations.

    Mutability: Stream operations are stateless and do not mutate the source collection. They can, 
    however, output a new collection or other value as a result of 'terminal operations' like 
    collect, reduce, etc.

    Concurrency: Streams support parallel execution implicitly without needing explicit 
    synchronization for aggregate operations, making use of the ForkJoin framework under the 
    hood for parallelism.

    Usage: Streams are used for functional-style operations on collections of data (or other 
    data sources), especially for bulk operations or complex transformations and aggregations. They
    are particularly useful for processing large datasets that wouldn't fit in memory, as they can 
    work with potentially infinite sequences and use chaining operations.