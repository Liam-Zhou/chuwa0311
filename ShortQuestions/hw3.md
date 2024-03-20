1. What is generic in Java?  and type the generic code by yourself.

   $Ans. $ In Java, generics allow you to create classes, interfaces, and methods that operate with type parameters. Generics provide a way to specify types (classes and interfaces) as parameters when defining classes, interfaces, and methods. 

   ```java
   List<Integer> list = new ArrayList<>();
   ```

   

2. Read those codes and type it one by one by yourself. the push the code to your branch.  

   https://github.com/TAIsRich/chuwa-eij-tutorial/tree/main/02-java-core/src/main/java/com/chuwa/tutorial/t06_java8

3. practice stream API at least 3 times

   a. https://blog.devgenius.io/15-practical-exercises-help-you-master-java-stream-api-3f9c86b1cf82

4. Practice Optional methods at least 2 times

   a. https://github.com/TAIsRich/chuwa-eij-tutorial/blob/main/02-java-core/src/main/java/com/chuwa/tutorial/t06_java8/exercise/ShoppingCartUtil.java

5. Write the Singleton design pattern include eager load and lazy load. 

   - eager load

     ```java
     public class Singleton {
     	private statci Singleton instance = new Singleton();
     	
     	private Singleton() {
     	}
     	
     	public static Singleton getInstance() {
     		return instance;
     	}
     }
     ```

   - lazy load

     ```java
     public class Singleton {
     	private Singleton() {
     	}
     	
     	static{
     	
     	}
     	
     	private static class SingletonHolder {
     		private static final Singleton INSTANCE = new Singleton();
     	}
     	
     	public static Singleton getInstance() {
     		return SingletonHolder.INSTANCE;
     	}
     }
     ```

     

6. What is Runtime Exception? could you give me some examples?

   $Ans.$ A runtime exception in Java is an exception that occurs during the execution of a program. Unlike checked exceptions, runtime exceptions do not need to be explicitly caught or declared in a method's throws clause. Runtime exceptions are typically the result of programming errors, such as logical errors, improper use of APIs, or unexpected conditions at runtime e.g. **NullPointerException**, **ArithmeticException**, **ArrayIndexOutOfBoundException** etc.

7. Could you give me one example of NullPointerException?

   $Ans.$ Occurs when you try to access or call a method on an object reference that points to `null`.

   ```java
   String str = null;
   int length = str.length(); // This will throw a NullPointerException
   ```

8. What is the Optional class?

   $Ans.$​ The `Optional` is designed to provide a more expressive way of handling situations where a value may or may not be present, instead of using null references.

   `Optional` is a container object that may or may not contain a non-null value. It provides methods for dealing with the presence or absence of a value without the need for explicit null checks, which can help reduce `NullPointerExceptions` in codes.

9. What are the advantages of using the Optional class?

   - **Avoiding NullPointerExceptions**: One of the primary purposes of `Optional` is to help prevent NullPointerExceptions by providing a way to explicitly indicate when a value may be absent.
   - **Encouraging Better Coding Practices**: `Optional` encourages developers to handle the absence of a value explicitly, rather than relying on null checks. This can lead to cleaner and more readable code.
   - **Immutable**: Instances of `Optional` are immutable, meaning once created, their value cannot be changed. This ensures thread safety and prevents unintended modification of the contained value.
   - **Functional Style**: `Optional` supports functional-style operations such as mapping, filtering, and chaining, which can make code more concise and expressive.
   - **Method Return Types**: `Optional` is commonly used as a return type for methods that may or may not produce a result. This makes it clear to callers that the method might not always return a value.

10. What is the @FunctionalInterface?

    $Ans.$ It is an annotation introduced in Java 8. It is used to indicate that an interface is intended to be a functional interface. A functional interface is an interface that has exactly one abstract method.

11. what is lamda?

    $Ans.$ Lambda is the implementation of the abstract method

12. What is Method Reference?

    $Ans.$ A method reference in Java is a shorthand syntax that allows you to refer to methods or constructors without invoking them directly, particularly useful when working with lambda expressions or functional interfaces. 

13. What is Java 8 new features?

    $Ans$ Java 8 introduced several significant features and enhancements to the Java programming language. 

14. Lambda can use unchanged variable outside of lambda? what is the details?

    $Ans.$ If and only if using final or Effectively Final variables outside of lambda

15. Describe the newly added features in Java 8?

    1. **Lambda Expressions**: Lambda expressions allow you to express instances of single-method interfaces (functional interfaces) more concisely. They provide a way to represent anonymous functions as objects and can be used in conjunction with functional interfaces to enable functional-style programming in Java.
    2. **Stream API**: The Stream API provides a fluent and functional approach to processing collections of data. Streams enable you to perform complex data processing operations, such as filtering, mapping, sorting, and aggregating, in a declarative and parallelizable manner.
    3. **Functional Interfaces**: Java 8 introduced the `@FunctionalInterface` annotation, which indicates that an interface is intended to be a functional interface— an interface with a single abstract method. Functional interfaces enable lambda expressions and method references to be used as instances of these interfaces.
    4. **Default Methods in Interfaces**: Default methods allow you to add new methods to interfaces without breaking existing implementations. They provide a way to provide default implementations for methods in interfaces, allowing interface evolution without breaking backward compatibility.
    5. **Method References**: Method references provide a shorthand syntax for referring to methods or constructors without invoking them directly. They allow you to pass behavior as arguments more concisely, especially when working with lambda expressions and functional interfaces.
    6. **Optional Class**: The `Optional` class provides a way to express the absence of a value without using null references. It helps prevent NullPointerExceptions and encourages more explicit handling of null values in Java code.
    7. **Date and Time API (java.time)**: Java 8 introduced a new Date and Time API (`java.time`) to address the limitations of the existing `java.util.Date` and `java.util.Calendar` classes. The new API provides improved functionality for date and time manipulation, including support for time zones and date formatting.
    8. **CompletableFuture**: CompletableFuture is an extension of the Future interface that provides support for asynchronous and concurrent programming. It allows you to define asynchronous tasks and compose them using fluent API methods, enabling more flexible and efficient concurrency in Java applications.

16. Can a functional interface extend/inherit another interface?

    $Ans.$  Yes, as long as the extended interface satisfies the criteria of being a functional interface.

17. What is the lambda expression in Java and How does a lambda expression relate to a functional interface?

    $Ans.$ A lambda expression in Java is a concise way to represent an instance of a functional interface—a single-method interface—by providing a short block of code that can be used in place of a traditional anonymous class instance. 

    A functional interface is an interface that contains exactly one abstract method. Lambda expressions are used to provide implementations of the single abstract method defined by a functional interface.

18. In Java 8, what is Method Reference?

    $Ans.$ A method reference in Java is a shorthand syntax that allows you to refer to methods or constructors without invoking them directly, particularly useful when working with lambda expressions or functional interfaces. 

19. What does the String::ValueOf expression mean?

    $Ans.$ `(nums) -> String.valueOf(nums);`

20. What are Intermediate and Terminal operations?

    $Ans.$ Intermediate operations are operations that transform or filter the elements of a stream and produce another stream as a result.

    Terminal operations are operations that consume the elements of a stream and produce a result or a side effect.

21. What are the most commonly used Intermediate operations?

    $Ans.$ `filter()` and `map()`

22. What is the difference between findFirst() and findAny()?

    - Use `findFirst()` when you need to retrieve the first element from an ordered stream or when the encounter order is significant.
    - Use `findAny()` when you need to retrieve any element from the stream that matches the specified criteria, especially in parallel streams or when the encounter order is not significant.

23. How are Collections different from Stream?

    $Ans.$ Collections are concrete data structures that store elements in memory and provide random access to elements, while streams are a functional abstraction for processing collections or other data sources in a lazy and potentially parallel manner. Streams are more focused on processing data in a declarative and functional style, while collections are focused on storing and manipulating data in memory.