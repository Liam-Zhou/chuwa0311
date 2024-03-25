#Zeyu Cui Homework 3

## 1. What is generic in Java? and type the generic code by yourself.
a. https://github.com/TAIsRich/chuwa-eij-tutorial/tree/main/02-java-cor
e/src/main/java/com/chuwa/tutorial/t01_basic/generic


Generics in Java allow you to define classes, interfaces, and methods with placeholder types that are specified when the class, interface, or method is instantiated or called. 
Generics provide type safety by allowing you to specify the type of objects that a class or method can work with, without sacrificing flexibility.

## 2. Read those codes and type it one by one by yourself. the push the code to your
branch.
https://github.com/TAIsRich/chuwa-eij-tutorial/tree/main/02-java-core/src/mai
n/java/com/chuwa/tutorial/t06_java8

## 3. practice stream API at least 3 times
a. https://blog.devgenius.io/15-practical-exercises-help-you-master-javastream-
api-3f9c86b1cf82

## 4. Practice Optional methods at least 2 times
a. https://github.com/TAIsRich/chuwa-eij-tutorial/blob/main/02-java-cor
e/src/main/java/com/chuwa/tutorial/t06_java8/exercise/ShoppingCartU
til.java

## 5.  Write the Singleton design pattern include eager load and lazy load. 
code in coding file

## 6.  What is Runtime Exception? could you give me some examples?

Runtime exceptions are exceptions that occur during program execution. Unlike checked exceptions, they don't need to be explicitly caught or declared. They're typically caused by programming errors or unexpected conditions. Examples include:

NullPointerException
ArrayIndexOutOfBoundsException
ArithmeticException
ClassCastException
NumberFormatException
IllegalArgumentException
UnsupportedOperationException

These exceptions often indicate issues like accessing null references, invalid array indices, division by zero, incompatible type casts, and illegal method arguments.

## 7. Could you give me one example of NullPointerException?

```
String str = null;
int length = str.length(); // Throws NullPointerException
```

## 8.  What is the Optional class?

The Optional class is a container object that may or may not contain a non-null value. 
It is a part of the Java.util package and was introduced in Java 8 to help reduce NullPointerExceptions in code and handle situations where a value may be absent.

## 9.  What are the advantages of using the Optional class?

Handling Null Values: Optional provides a way to explicitly represent that a value may be absent, rather than using null references. This helps in writing cleaner and more expressive code by making the absence of a value explicit.

Avoiding NullPointerExceptions: Optional provides methods to safely access and manipulate values, helping to avoid NullPointerExceptions. These methods include isPresent(), ifPresent(), orElse(), orElseGet(), and orElseThrow().

Immutable: Optional instances are immutable, meaning once created, their state cannot be changed. This ensures thread safety and prevents accidental modification of the contained value.

Method Chaining: Optional supports method chaining, allowing multiple operations to be performed in a concise and readable manner.

Usage: Optional is commonly used in method return types to indicate that a method may not always produce a result, or in fields to represent optional values.

## 10. What is the @FunctionalInterface?

The @FunctionalInterface annotation is used in Java to indicate that an interface is intended to be a functional interface. 
A functional interface is an interface that contains only one abstract method.

## 11. what is lamda?

A lambda expression in Java is a concise way to represent anonymous functions—functions without a name that can be passed around and executed later. 
Lambda expressions were introduced in Java 8 as a way to enable functional programming features in the language.

## 12. What is Method Reference?

Method reference is a shorthand syntax for writing lambda expressions that directly invoke an existing method. 
It provides a way to refer to methods or constructors without executing them. 
Method references can be used in place of lambda expressions whenever a lambda expression simply calls an existing method.

## 13. What is Java 8 new features?


Java 8 introduced several significant features and enhancements to the Java programming language and platform.

Lambda Expressions: Concise syntax for writing anonymous functions.
Stream API: Fluent API for processing collections of data.
Functional Interfaces: Interfaces with a single abstract method, used with lambda expressions.
Method References: Shorthand syntax for invoking methods with lambda expressions.
Default Methods: Interface methods with default implementations.
Static Methods in Interfaces: Static methods allowed in interfaces.
Optional Class: Container for potentially null values, reducing NullPointerExceptions.
Date and Time API: New API for date and time manipulation (java.time package).
CompletableFuture: Enhanced Future interface for asynchronous programming.
Parallel Array Sorting: Methods for sorting arrays concurrently.

## 14. Lambda can use unchanged variable outside of lambda? what is the details?


Yes, lambda expressions in Java can access variables from the enclosing scope, including local variables, instance variables, static variables, and effectively final variables. 
An effectively final variable is a variable whose value is not modified after it is initialized, even though it is not declared as final explicitly.

Lambda expressions can access such variables from the enclosing scope because they are effectively treated as if they were declared as final. 
This allows lambda expressions to capture and use the values of these variables even if they are defined outside the lambda expression.

## 15. Describe the newly added features in Java 8?
Stream API: The Stream API provides a fluent and declarative way to process collections of data. It enables functional-style programming by allowing operations such as map, filter, reduce, and collect to be performed on streams of data.

## 16. Can a functional interface extend/inherit another interface?


Yes, a functional interface can extend or inherit another interface in Java. However, there are certain rules and considerations to keep in mind:

Single Abstract Method (SAM) Restriction: A functional interface must contain exactly one abstract method. If an interface extends another interface with one or more abstract methods, it cannot be considered a functional interface.

Inheritance of Default Methods: When a functional interface extends another interface, it inherits any default methods from the parent interface. These default methods do not count toward the single abstract method requirement of a functional interface.

Inheritance of Abstract Methods: If the parent interface contains abstract methods in addition to default methods, the child interface must provide implementations for these abstract methods to be considered a functional interface.

## 17.  What is the lambda expression in Java and How does a lambda expression relate 
to a functional interface?

Lambda expressions are primarily used in conjunction with functional interfaces in Java. A functional interface is an interface that contains exactly one abstract method. Lambda expressions can be used to provide implementations for the abstract method of a functional interface. This relationship is key to understanding the role of lambda expressions in Java.

Since lambda expressions represent anonymous functions, they can be used wherever an instance of a functional interface is expected. The compiler automatically infers the target type based on the context in which the lambda expression is used, allowing lambda expressions to seamlessly integrate with existing code that expects functional interfaces.

For example, consider the following functional interface:

```
@FunctionalInterface
interface MyFunctionalInterface {
    void myMethod();
}
```

A lambda expression can be used to provide an implementation for the myMethod() abstract method of MyFunctionalInterface:

```
MyFunctionalInterface funcInterface = () -> System.out.println("Executing myMethod");
```

In this example, the lambda expression ( ) -> System.out.println("Executing myMethod") represents an anonymous function that takes no arguments and prints "Executing myMethod" when executed. This lambda expression is compatible with MyFunctionalInterface because it provides an implementation for its single abstract method (myMethod()).

## 18. In Java 8, what is Method Reference?

Method reference is a shorthand syntax for writing lambda expressions that directly invoke an existing method. 
It provides a way to refer to methods or constructors without executing them. 
Method references can be used in place of lambda expressions whenever a lambda expression simply calls an existing method.

## 19. What does the String::ValueOf expression mean?

The String::valueOf expression is an example of a method reference in Java. It refers to the static method valueOf() in the String class.

## 20. What are Intermediate and Terminal operations?

**Intermediate Operations**: These operations are used to transform or filter the elements of a stream. They're like steps in a pipeline where each step modifies the stream in some way. Examples include filtering elements, mapping them to a different value, sorting them, etc. Intermediate operations are lazy and don't produce a final result until a terminal operation is called.

**Terminal Operations**: These operations are used to produce a final result or perform an action on the elements of a stream. They're like the endpoint of the pipeline where the stream processing is triggered. Examples include collecting the elements into a collection, counting them, finding the maximum or minimum, iterating over them, etc. Terminal operations are eager and trigger the execution of intermediate operations.

## 21. What are the most commonly used Intermediate operations?

map, filter, sorted, distinct, flatMap, limit, and skip

## 22. What is the difference between findFirst() and findAny()?

findFirst() returns the first element of an ordered stream or any consistent element of a parallel stream, while findAny() returns any element of the stream. 
The choice between them depends on whether you need a specific element from an ordered stream or any element from the stream, respectively.

## 23. How are Collections different from Stream?
Collections are used for storing and manipulating data in memory, while Streams are used for processing and transforming data in a functional and declarative manner. Streams offer lazy evaluation, functional operations, and support for parallel processing, making them powerful tools for working with data in Java.
