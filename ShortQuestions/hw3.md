# Homework3

1. What is generic in Java? and type the generic code by yourself.

   Generics in Java are a feature that allows programmers to write classes, interfaces, and methods where the type of data they operate on is specified as a parameter. Using generics, you can create flexible and reusable code that works with different data types while providing compile-time type safety.

   ```java
   public class Generic<T> {
     private T t;
     public void set(T t) {
       this.t = t;
     }
     public T get(){
       return t;
     }
   }
   ```

   

2. Read those codes and type it one by one by yourself. Then push the code to your branch.

3. Practice stream API at least **3** times

4. Practice Optional methods at least 2 times

5. Write the Singleton design pattern include eager load and lazy load.

   Eager Load

   ```java
   public class Singleton {
     private static Singleton instance = new Singleton();
     private Singleton(){}
     public static Singleton getInstance() {
       return instance;
     }
   }
   ```

   Lazy Load

   ```java
   public class Singleton {
     private Singleton() {}
     private static class SingletonHolder {
       private static final Singleton INSTANCE = new Singleton();
     }
     public static Singleton getInstance() {
       return SingletonHolder.INSTANCE;
     }
   }
   ```

   

6. What is Runtime Exception? Could you give me some examples?

   A RuntimeException in Java is a type of unchecked exception. These are exceptions that are not checked at compile time, meaning the compiler does not require methods to catch or declare them. RuntimeExceptions are subclasses of `java.lang.RuntimeException`, which itself is a subclass of `java.lang.Exception`. 

   - NullPointerException

     ```java
     String str = null;
     int length = str.length();
     ```

   - ArrayIndexOutOfBoundsException

     ```java
     int[] numbers = {1, 2, 3};
     int number = numbers[5];
     ```

   - IllegalArgumentException

     ```java
     Thread t = new Thread();
     t.setPriority(11);
     ```

     

7. Could you give me one example of NullPointerException?

   ```java
   String str = null;
   int length = str.length();
   ```

   

8. What is the Optional class?

   The `Optional` class in Java is a container object which may or may not contain a non-null value. It's a part of the `java.util` package, introduced in Java 8. The purpose of this class is to provide a type-level solution for representing optional values instead of using `null` references. By using `Optional`, you can avoid `NullPointerException` and write more readable, clean, and bug-free code.

   

9. What are the advantages of using the Optional class?

   - **Prevents `NullPointerException`**: It provides methods to check the presence of a value explicitly and handles its absence gracefully, reducing the likelihood of `NullPointerException`.

   - **No More `null` Checks**: It reduces boilerplate code by eliminating the need for null checks.

   - **Expressive Code**: It makes your code more expressive, making it clearer whether you expect a value to be present or if it can be absent.

     

10. What is the @FunctionalInterface?

    The `@FunctionalInterface` annotation in Java is used to indicate that an interface is intended to be a functional interface. A functional interface is an interface that contains exactly one abstract method, although it can contain multiple default or static methods. These types of interfaces are used as the basis for lambda expressions in Java 8 and later.

    

11. What is lamda?

    A lambda expression in Java is a short block of code which takes in parameters and returns a value. Lambda expressions are similar to methods, but they do not need a name and can be implemented right in the body of a method. 

    Lambda expressions are often used to provide the implementation of an interface that has a functional interface as its type. 

    

12. What is Method Reference?

    A Method Reference in Java is a shorthand notation of a lambda expression to call a method. In other words, if a lambda expression is doing nothing but calling an existing method, the method reference can replace the lambda expression. 

    

13. What is Java 8 new features?

    - **Lambda Expressions**: Lambda expressions provide a clear and concise way to represent one method interface using an expression. 

    - **Streams**:  `Stream` API allows for functional-style operations on streams of elements, such as map-reduce transformations. Streams support sequential and parallel aggregate operations and can be used for filtering, mapping, and iterating over data in a declarative way.

    - **Method References**: These are shorthand notations for lambda expressions that call existing methods. 

    - **Optional**: This is a new utility class introduced in Java 8 to avoid `NullPointerException`. 

    - **Default Methods**: Java 8 allows interfaces to have concrete methods, which are known as default methods. 
    - **Interface Changes**: Apart from default methods, interfaces can now have static methods as well.

    

14. Lambda can use unchanged variable outside of lambda? what is the details?

    In Java, lambda expressions can capture and use variables from the surrounding context where they are defined. This feature is known as "variable capture" or "closure".

     A lambda expression can use **instance and static variables** without restrictions. These variables can be changed after they are used by the lambda without causing issues.

     A lambda can also use **local variables**. However, these local variables must be **effectively final**. A local variable or parameter whose value is never changed after it is initialized is considered effectively final. 

    

15. Describe the newly added features in Java 8?

    - **Lambda Expressions**: Lambda expressions provide a clear and concise way to represent one method interface using an expression. 

    - **Streams**:  `Stream` API allows for functional-style operations on streams of elements, such as map-reduce transformations. Streams support sequential and parallel aggregate operations and can be used for filtering, mapping, and iterating over data in a declarative way.

    - **Method References**: These are shorthand notations for lambda expressions that call existing methods. 

    - **Optional**: This is a new utility class introduced in Java 8 to avoid `NullPointerException`. 

    - **Default Methods**: Java 8 allows interfaces to have concrete methods, which are known as default methods. 

    - **Interface Changes**: Apart from default methods, interfaces can now have static methods as well.

      

16. Can a functional interface extend/inherit another interface?

    Yes, a functional interface in Java can extend another interface. The key condition is that the functional interface must still have exactly one abstract method, even after taking into account the abstract methods from the extended interface(s).

    

17. What is the lambda expression in Java and How does a lambda expression relate to a functional interface?

    A lambda expression in Java is a short block of code which takes in parameters and returns a value. Lambda expressions are similar to methods, but they do not need a name and can be implemented right in the body of a method. 

    Lambda expressions are often used to provide the implementation of an interface that has a functional interface as its type. 

    

18. In Java 8, what is Method Reference?

    A Method Reference in Java is a shorthand notation of a lambda expression to call a method. In other words, if a lambda expression is doing nothing but calling an existing method, the method reference can replace the lambda expression. 

    

19. What does the String::ValueOf expression mean?

    The expression `String::valueOf` is an example of a method reference in Java. It refers to the `valueOf` static method of the `String` class.

    

20. What are Intermediate and Terminal operations?

    Intermediate operations are those operations on a stream that return a new stream. They are kind of transformations applied to an initial stream that result in a new stream whose elements reflect the changes made by this operation. 

    Terminal operations, on the other hand, are those operations that close the stream. Once a terminal operation has been performed, the stream can no longer be used. Terminal operations either produce a result (such as a List, a sum, a maximum, etc.) or a side-effect (such as printing to the console). 

    

21. What are the most commonly used Intermediate operations?

    `filter(Predicate<T>)`

    `limit()`

    `skip()`

    `distinct()`

    `map(Function<T, R>)`

    `flatMap(Function<T, Stream<R>)`

    `sorted()`

    

22. What is the difference between findFirst() and findAny()?

    The `findFirst()` and `findAny()` methods are both terminal operations in the Java Stream API and are used to retrieve elements from a stream. `findFirst()` returns the first element in the stream's order. Best for ordered streams. `findAny()` returns any element from the stream, useful for parallel streams for better performance.

    

23. How are Collections different from Stream?

    Collections and Streams in Java serve different purposes. Collections are primarily data structures that store elements and are all about storage and access, with in-place, manual iteration to retrieve or modify data. Streams, on the other hand, represent a sequence of elements supporting aggregate operations, focusing on computation rather than storage, and use internal iteration to perform operations like filter, map, and reduce efficiently, especially with large datasets. While Collections are mutable and can be modified, Streams are not; they are designed for one-time use and do not change the original data source, making them particularly suitable for functional-style operations where the dataset doesn't change.