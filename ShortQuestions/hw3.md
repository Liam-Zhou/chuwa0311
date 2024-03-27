#### 1. What is generic in Java? and type the generic code by yourself.

https://github.com/TAIsRich/chuwa-eij-tutorial/tree/main/02-java-core/src/main/java/com/chuwa/tutorial/t01_basic/generic

Generics in Java are a feature that allows you to write classes, interfaces, and methods with type parameters. Introduced in Java 5, generics enable types (classes and interfaces) to be parameters when defining classes, interfaces, and methods. This feature provides stronger type checks at compile time and eliminates the need for casting, which can make code safer and easier to read.



#### 2. Read those codes and type it one by one by yourself then push the code to your branch.

https://github.com/TAIsRich/chuwa-eij-tutorial/tree/main/02-java-core/src/main/java/com/chuwa/tutorial/t06_java8



#### 3. Practice stream API at least 3 times

https://blog.devgenius.io/15-practical-exercises-help-you-master-javastream-api-3f9c86b1cf82



#### 4. Practice Optional methods at least 2 times

https://github.com/TAIsRich/chuwa-eij-tutorial/blob/main/02-java-core/src/main/java/com/chuwa/tutorial/t06_java8/exercise/ShoppingCartUtil.java



#### 5. Write the Singleton design pattern include eager load and lazy load.

##### Eager Initialization

```java
public class SingletonEager {
    // Private constructor to prevent instantiation from other classes
    private SingletonEager() {}

    // The single instance is created at the time of class loading
    private static final SingletonEager instance = new SingletonEager();

    // Public static method that returns the instance of the class
    public static SingletonEager getInstance() {
        return instance;
    }
}

```

##### Lazy Initialization

``` Java
public class SingletonLazy {
    // Private constructor to prevent instantiation from other classes
    private SingletonLazy() {}

    // The single instance is declared but not initialized
    private static SingletonLazy instance;

    // Public static method that returns the instance of the class, creating it if it doesn't exist
    public static SingletonLazy getInstance() {
        if (instance == null) {
            instance = new SingletonLazy();
        }
        return instance;
    }
}

```





#### 6. What is Runtime Exception? could you give me some examples?

A `RuntimeException` in Java is a subclass of `Exception` that represents exceptions that can occur during the execution of a program and that the Java programming language does not require to be caught or declared in the `throws` clause of a method. `RuntimeExceptions` are unchecked exceptions, meaning the compiler does not enforce handling of these exceptions, as it does with checked exceptions.

Some Runtime Exception:

- `NullPointerException`
- `ArrayIndexOutOfBoundsException`
- `ArithmetricException`
- `IllegalArgumentException`



#### 7. Could you give me one example of NullPointerException?

```java
Map<String, Integer> map = new HashMap<>();
map.get("someKeyDoesnotexist");
```



#### 8. What is the Optional class?

Introduced in Java 8, `Optional` is a public final class and is used to deal with `NullPointerException` in Java application. It provides a way to express optional values (values that are either present or absent) without using `null`. This approach can help prevent `NullPointerException` errors, which are common in Java programming, by offering a more explicit and readable way to handle the presence or absence of a value.



#### 9. What are the advantages of using the Optional class?

- Improves code readability
- Avoid `NullPointerException`
- Provides a Rich API for Handling Optional Values



#### 10. What is the @FunctionalInterface?

A functional interface is an interface that has exactly one abstract method, and thus can be used as the assignment target for a lambda expression or method reference.



#### 11. what is lamda?

A lambda expression is a concise way to represent an anonymous function that can be used to implement a mehod defined by a functional interface.

A lambda expression consists of three parts:

1. **Parameters**: A list of parameters enclosed in parentheses. If there are no parameters, you still need to use empty parentheses.
2. **Arrow token**: The arrow token `->` separates the parameters from the body of the lambda.
3. **Body**: The body can be a single expression or a statement block. If it's a statement block, it's enclosed in curly braces `{}`.



#### 12. What is Method Reference?

Method references in Java are a shorthand notation of a lambda expression to call a method. Introduced in Java 8, method references enhance code readability and conciseness by removing the boilerplate code required to call methods in lambda expressions. They serve as a way to directly reference methods (static methods, instance methods, or constructors) of existing classes or objects.

``` Java
List<String> strings = Arrays.asList("Beta", "Alpha", "Gamma");
strings.sort(String::compareToIgnoreCase);
```



#### 13. What are Java 8 new features?

- Lambda expressions
- Streams API
- Default methods
- Method references
- Optional Class
- New Date-Time API



#### 14. Lambda can use unchanged variable outside of lambda? what is the details?

Lambda expressions in Java can access variables from their enclosing scope, but there are restrictions. The variables accessed from within a lambda expression must be either final or effectively final. An effectively final variable is one whose value does not change after it is initialized.

- **Final Variables**: A variable explicitly declared as `final`.
- **Effectively Final Variables**: A variable that is not declared as `final` but is only assigned once.



#### 15. Describe the newly added features in Java 8?

1. **Lambda Expressions**: Perhaps the most notable feature, lambda expressions brought a concise way to represent functional interfaces (interfaces with a single abstract method), making it easier to write code that can be parallelized.
2. **Streams API**: The Streams API introduced a new abstraction for processing sequences of elements, including a large set of methods for manipulating data. It supports functional-style operations on streams of elements, such as map-reduce transformations on collections.
3. **Optional Class**: The `Optional<T>` class was introduced to avoid `null` related bugs by providing a container object which may or may not contain a non-null value.
4. **New Date-Time API**: Inspired by Joda-Time, the new Date-Time API (`java.time`) was introduced for handling date and time in a more natural and cleaner way, addressing the shortcomings of the old `java.util.Date` and `java.util.Calendar`.
5. **Default Methods**: Interfaces were extended to support default methods, allowing the addition of new methods to interfaces without breaking the existing implementation of these interfaces.
6. **Method References**: Method references provide a way to refer directly to methods by their names. Method reference is a shorthand notation of a lambda expression to call a method.



#### 16. Can a functional interface extend/inherit another interface?

Yes, a functional interface can extend another interface in Java as long as the resulting interface has exactly one abstract method.



#### 17. What is the lambda expression in Java and How does a lambda expression relate to a functional interface?

Lambda expressions are closely related to functional interfaces in that:

- A lambda expression can be used anywhere a functional interface is expected.
- The type of a lambda expression is determined by the context in which it is used. The target type must be a functional interface.
- The lambda provides the implementation of the abstract method defined by the functional interface.



#### 18. In Java 8, what is Method Reference?

Method references in Java are a shorthand notation of a lambda expression to call a method. Introduced in Java 8, method references enhance code readability and conciseness by removing the boilerplate code required to call methods in lambda expressions. They serve as a way to directly reference methods (static methods, instance methods, or constructors) of existing classes or objects.

``` Java
List<String> strings = Arrays.asList("Beta", "Alpha", "Gamma");
strings.sort(String::compareToIgnoreCase);
```



#### 19. What does the String::ValueOf expression mean?

The expression `String::valueOf` is an example of a method reference in Java. Method references provide a way to refer directly to a method without executing it. In this specific case, `String::valueOf` refers to the `valueOf` static method of the `String` class.



#### 20. What are Intermediate and Terminal operations?

##### Intermediate Operations

Intermediate operations are operations that transform a stream into another stream. They are lazy, meaning that executing an intermediate operation does not actually perform any filtering, mapping, or any other transformation on the data immediately. These operations are executed only when a terminal operation is invoked. Intermediate operations are usually used to set up a pipeline of transformations that will be applied to the items in the stream.

**Key Characteristics:**

- **Laziness**: They do not perform any processing until a terminal operation is invoked.
- **Chainable**: One intermediate operation can be followed by another intermediate operation. This allows you to build up complex transformation pipelines.
- **Statelessness**: Most intermediate operations are stateless, meaning they do not maintain state from previously seen elements when processing new elements. However, some operations like `sorted()` are stateful, needing to process the entire input before producing an output.

**Examples of Intermediate Operations:**

- `map`: Transforms each element in the stream using a provided function.
- `filter`: Excludes elements that do not match a given condition.
- `sorted`: Sorts the elements of the stream.
- `distinct`: Removes duplicate elements according to their `equals()` method.

##### Terminal Operations

Terminal operations are operations that produce a result or side-effect from a stream. When a terminal operation is called on a stream, the stream pipeline is executed (all intermediate operations that were set up are performed), and the stream is consumed, meaning it cannot be used anymore.

**Key Characteristics:**

- **Eagerness**: They trigger the execution of the stream pipeline and process the elements according to the pipeline of intermediate operations.
- **Non-chainable**: After a terminal operation is applied, the stream has been consumed, so no further operations can be applied to it.
- **Result or Side-effect**: They always produce a non-stream result, such as a primitive value, a collection, or they can produce a side-effect (e.g., printing each element).

**Examples of Terminal Operations:**

- `forEach`: Performs an action for each element of the stream.
- `collect`: Gathers the elements of the stream into a collection or another form of result.
- `count`: Returns the count of elements in the stream.
- `anyMatch`, `allMatch`, `noneMatch`: Return a boolean based on a predicate applied to the elements of the stream.
- `findFirst`, `findAny`: Return an `Optional` describing an element of the stream, if present.



#### 21. What are the most commonly used Intermediate operations?

- `forEach`: Performs an action for each element of the stream.
- `collect`: Gathers the elements of the stream into a collection or another form of result.
- `count`: Returns the count of elements in the stream.
- `anyMatch`, `allMatch`, `noneMatch`: Return a boolean based on a predicate applied to the elements of the stream.
- `findFirst`, `findAny`: Return an `Optional` describing an element of the stream, if present.



#### 22. What is the difference between findFirst() and findAny()?

##### findFirst()

- **Definition**: Returns an `Optional` describing the first element of the stream, or an empty `Optional` if the stream is empty.
- **Behavior in Sequential Streams**: In sequential streams, `findFirst()` will return the first element as encountered in the stream's encounter order.
- **Behavior in Parallel Streams**: In parallel streams, `findFirst()` maintains an ordering constraint. It will return the first element in the stream's encounter order, even if it requires additional coordination overhead. This can make it less efficient in parallel operations compared to `findAny()`.

##### findAny()

- **Definition**: Returns an `Optional` describing some element of the stream, or an empty `Optional` if the stream is empty. It does not guarantee to return the first element of the stream.
- **Behavior in Sequential Streams**: In sequential streams, `findAny()` typically returns the first element, but this is not guaranteed.
- **Behavior in Parallel Streams**: `findAny()` is designed to be more performant in parallel operations, as it allows more flexibility in choosing which element to return. It can return any element from the stream that satisfies the stream's operations, without the overhead of maintaining the encounter order.



#### 23. How are Collections different from Stream?

##### Collections

1. **Nature**: Collections are in-memory data structures that hold elements. They are primarily concerned with efficient management and access to data (elements), such as searching, insertion, manipulation, and deletion.
2. **Storage**: Collections are used to store data. A Collection is about data access and storage - you can add to a collection, remove from it, or iterate over it.
3. **Iteration**: In collections, iteration is explicitly controlled by the programmer. You use loops (for, while) to iterate over the collections.
4. **Eager Computation**: Collections operations are performed eagerly, meaning operations like adding or removing elements happen immediately when a method is called.
5. **Mutability**: Collections can be mutable, allowing their elements to be added, removed, or changed after the collection is created.

##### Streams

1. **Nature**: Streams represent a sequence of elements supporting sequential and parallel aggregate operations. They are more about computations on the data rather than storing data.
2. **Data Processing**: Streams facilitate a high-level abstraction for Java collections by providing a powerful model for processing sequences of elements, including operations like filter, map, reduce, find, match, sort, etc.
3. **Iteration**: With streams, iteration over the data is handled by the Java runtime, abstracting away the details from the programmer. This allows for more readable code and eliminates boilerplate.
4. **Lazy Computation**: Stream operations are lazy when possible, meaning computation on the source data is only performed when necessary for the result.
5. **Immutability**: Streams themselves do not provide a means to directly modify the original data source they are operating on. Operations on a stream produce a new stream without altering the original data.