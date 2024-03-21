# Home Work 23

**1. What is generic in Java?  and type the generic code by yourself.**

In Java, generics allow you to create classes, interfaces, and methods that operate on a specified type (or types) without being tied to a specific data type.

**5. Write the Singleton design pattern include eager load and lazy load.**

```java
public class EagerSingleton{
    private static final EagerSingleton INSTANCE = new EagerSingleton();
    private EagerSingleton(){}
    public static EagerSingleton getInstance(){
        return INSTANCE;
    }
}
```
In eager loading, the singleton instance is created when the class is loaded, regardless of whether it is needed or not.

```java
public class LazySingleton{
    private static LazySingleton instance;
    private LazySingleton(){}
    public static LazySingleton getInstance(){
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
```
In lazy loading, the singleton is created only when it is first requested.

**6. What is Runtime Exception? could you give me some examples?**

RuntimeException is a type of exception that occurs during the executing of a Java program, typically due to logical errors or unexpected conditions that arise at runtime.
Examples include NullPointerException, ArrayIndexOutOfBoundsException, IllegalArgumentException.

**7. Could you give me one example of NullPointerException?**

```dash
String str = null;
int length = str.length();
```

**8. What is the Optional class?**

The Optional class in Java is a container object that may or may not contain a non-null value.
It is designed to help prevent NullPointerException by providing a way to handle situations where
a value may be absent.

**9. What are the advantages of using the Optional class?**

- Avoidance of NullPointerExceptions
- Forced null checks
- Avoidance of null-checking boilerplate

**10. What is the @FunctionalInterface?**

`@FunctionalInterface` is an annotation introduced in Java 8 that indicates that an interface is intended
to be a functional interface. A functional interface is an iterface that has only one abstract method
(SAM-Single Abstract Method).

**11. what is lamda?**

A lambda expression is a short block of code which takes in parameters and returns a value.
It's primarily used for implementing functional interface, but they do not need a name and can be implemented 
right in the body of a method.

**12. What is Method Reference?**

Method reference is a shorthand syntax allows you to refer to methods or constructors of classes without invoking them.
It provides a way to pass a method as an argument to functional interface.

**13. What is Java 8 new features?**

- Lambda expressions: a concise way to represent anonymous functions.
- Stream API: a new abstraction of processing collections of data in a declarative way, allowing operations such as map, filter, and reduce.
- Default methods: methods that can be defined within an interface with default implementations.
- Optional class: a container object that may or may not contain a non-null value.
- Method references: a shorthand syntax for referring to methods or constructors of classes without invoking them directly.
- Date and time API: a new API for handling date and time in a more comprehensive and flexible manner.

**14. Lambda can use unchanged variable outside of lambda? what is the details?**

If variable is final variable, or non-final variable however never changed, or object veriable, then 
Lambda can use it outside of Lambda.

**16. Can a functional interface extend/inherit another interface?**

Yes, functional interfaces can extend/inherit another interface, regardless of whether those interfaces are functional or not.
It inherits all abstract methods from the parents interface, but must still have only one abstract method to maintain its functional interface status.

**17. What is the lambda expression in Java and How does a lambda expression relate
     to a functional interface?**

A lambda expression is a concise way to represent a method without a name that can be passed as an argument to other methods or stored in variables.
A lambda expression is a way to provide a direct implementation of an abstract method defined by a functional interface.

**19. What does the String::ValueOf expression mean?**

The `String::ValueOf` expression is a method reference, it refers to the static `ValueOf` method of the `String` class.

**20. What are Intermediate and Terminal operations?**

- Intermediate operations are Stream that are applied to transform of filter elements in a Stream, like `map`, `filter`, `sorted`.
- Terminal operations are Stream that produce a final result or side effect, like `collect`, `forEach`, `min`, `max`.

**21. What are the most commonly used Intermediate operations?**

map(), filter(), sorted(), distinct(), flatMap(), limit(), skip()

**22. What is the difference between findFirst() and findAny()?**

- `findFirst()` returns the first element int the stream, it's deterministic
- `findAny()` returns any element in the stream, it's non-deterministic

**23. How are Collections different from Stream?**

- Collections are used to store and manipulate data, eager and hold all elements in memory.
- Streams are used to process data in a functional style manner, lazy and process prcess elements on demand.