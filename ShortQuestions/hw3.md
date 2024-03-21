#### 1. What is generic in Java?

In Java, a generic class is a class that can operate on a variety of data types while providing type safety at compile time. Generics enable you to define classes, interfaces, and methods that can work with any data type, allowing for increased code reuse and type safety with our sacrificing flexibility.

#### 5. Write the Singleton design pattern include eager load and lazy load.

Eager load

```java
public class Utility {
    
    private static Utility utility = new Utility();
    
    private Utility() {
        
    }
    
    public static Utility getInstance() {
        return utility;
    }
    
    
    // Utility methods...
    public static int add(int a, int b) {
        return a + b;
    }
}
```

Lazy load

```java
public class Utility {
    private Utility() {

    }

    private static class UtilityHolder {
        private static final Utility INSTANCE = new Utility();
    }

    public static Utility getInstance() {
        return UtilityHolder.INSTANCE;
    }

}
```

#### 6. What is Runtime Exception? Could you give me some examples?

Runtime exception, a.k.a unchecked expiation is an exception that occurs during the execution of a program due to an error that could not be detected by the compiler at compile time.

For example, NullPointerException, ArrayIndexOutOfBoundException, IllegalArgumentException

#### 7. Could you give me one example of NullPointerException?

NullPointerException occurs when de-reference a null variable.

```java
String s = null;
int length = s.length();
```

#### 8. What is the Optional class? 9. What are the advantages of using the Optional class?

Optional class is a container object that may or may not contain a non-null object. It is used to avoid null checks and runtime NPE. It makes the codes more concise and readable.

#### 10. What is the @FunctionalInterface?

A functional interface is a interface class that has the following features:

1. Has one and only one abstract method
2. Can have multiple default methods
3. Use @FunctionalInterface annotation for sanity check

#### 11. What is Lambda?

Lambda is the implementation of the abstract method in functional interface. It replaces anonymous inner class. It enables us to write more concise and expressive code when working with functional interface (SAM, single abstract method).

#### 12. What is Method Reference?

Method reference is a shorthand notation for representing lambda expressions that call a single method. It allows us to refer to a method without invoking it and it is often used in functional programming context such as streams, functional interfaces, and method chaining.

#### 13. What is Java 8 new features?

Newly added features in Java 8 version to enhance Java programming

#### 14. Lambda can use unchanged variable outside of lambda? What is the details?

Lambda can access variable from their enclosing scope. 

Local variables must be final or effectively final to be used.

#### 15. Describe the newly added features in Java 8.

Default methods in Interfaces, Lambda Expression, Method Reference, Optional, Streams API

#### 16. Can a functional interface extend/inherit another interface?

A functional interface cannot extend another interface which has an abstract method, because it violates the rule that a functional interface can have one and only one abstract method. However, it can inherit another interface if that interface contains only default and static methods.

#### 17. What is lambda expression in Java and How does a lambda expression relate to a functional interface?

Lambda is the implementation of SAM (single abstract method) in a functional interface. It replaces anonymous inner class. 

For example, consider the `Runnable` interface, which is a functional interface with a single method `run()`.

```java
// Using anonymous inner class (prior to Java 8)
Runnable runnable = new Runnable() {
    @Override
    public void run() {
        System.out.println("Hello, world!");
    }
};

// Using lambda expression (Java 8 and later)
Runnable runnable = () -> {
    System.out.println("Hello, world!");
};

```

#### 18. In Java 8, what is Method Reference?

Refer to 12.

#### 19. What does String::ValueOf expression mean?

This is the method reference of `String.valueOf()`

It simplifies lambda expression. It is equivalent to `(s) -> String.valueOf(s)`

#### 20. What are Intermediate and Terminal operations?

In Streams API, Intermediate operations are operations that transform a stream into another stream.

Terminal operations are operations that produce a result or a side-effect. For example, collect the result from stream to a list or set.

#### 21. What are the most commonly used Intermediate operations?

`.filter()`

`.distinct()`

`.limit()`

`.map()/.flatMap()` 

`.sort()`

#### 22. What is the difference between findFirst() and findAny()?

`findFirst()` is used to return the first element in Stream

`findAny()` is used to return any element in a Stream

#### 23. How are Collections different from Stream?

1. Mutability
   - Collections are typically mutable.
   - Streams are immutable. Stream operations produce new streams with modified elements

2. Data processing paradigm
   - Collections follow the imperative programming paradigm, where you explicitly specify the steps to process elements.
   - Streams follow the declarative or functional programming paradigm, where you specify what you want to achieve rather than how to achieve it.

3. Eager vs. Lazy Evaluation
   - Collections perform eager evaluation, meaning operations are executed immediately when invoked.
   - Streams perform lazy evaluation, meaning intermediate operations are not executed until a terminal operation is called. This allows for more efficient processing, as only the necessary elements are processed as needed.

4. Parallelism
   - Collections do not inherently support parallelism.
   - Streams provide built-in support for parallelism through parallel streams.