# 1. What is generic in Java?  and type the generic code by yourself.
Generic is a feature that allows you to write classes, interfaces, and methods with type parameters.
Generics allow you to specify placeholders for types, typically denoted by single uppercase letters like T, E, K, N, V.\
You can define a class or interface to work with a generic type. For example, ArrayList<E> is a generic class where E represents the type of elements it can hold.\
Methods can also be generic with their own type parameters. This allows the method to be flexible in the types of arguments it can accept and return.\
Code is in Coding/Practices

# 2. Read those codes and type it one by one by yourself. the push the code to your branch.

# 3. practice stream API at least 3 times

# 4. Practice Optional methods at least 2 times

# 5. Write the Singleton design pattern include eager load and lazy load. 
```java
//Eager load
public class EagerLoadedSingleton {
	private static final EagerLoadedSingleton instance = new EagerLoadedSingleton();

	private EagerLoadedSingleton() {}

	public static EagerLoadedSingleton getInstance() {
		return instance;
	}
}

//Lazy load
public class LazyLoadedSingleton {
	private static LazyLoadedSingleton instance;

	private LazyLoadedSingleton() {}

	public static synchronized LazyLoadedSingleton getInstance() {
		if (instance == null) {
			instance = new LazyLoadedSingleton();
		}
		return instance;
	}
}
```

# 6. What is Runtime Exception? could you give me some examples?
A RuntimeException in Java is a type of unchecked exception. 
These are exceptions that are not checked at compile-time, 
which means the compiler does not require methods to catch or to specify (using a throws clause) these exceptions.\
This includes: NullPointerException, ArrayIndexOutOfBoundsException, ArithmeticException, etc

# 7. Could you give me one example of NullPointerException?
```java
String str = null;
int length = str.length();
```

# 8. What is the Optional class?
The Optional class in Java, is a container object used to contain not-null objects.
It is a public final class and used to deal with NullPointerException in Java application.

# 9. What are the advantages of using the Optional class?
Optional helps in writing neat code without null checks. By using Optional, you can specify alternate behaviors on cases where no value is present.

# 10. What is the @FunctionalInterface?
A functional interface is an interface that contains exactly one abstract method. They can have any number of default or static methods. Functional interfaces are used as the basis for lambda expressions in functional programming.

# 11. what is lamda?
A lambda expression in Java is a concise and efficient way to represent a method interface using an expression.
Lambda expressions are similar to methods, but they do not need a name and they can be implemented right in the body of a method.

# 12. What is Method Reference?
Method references in Java are a special type of lambda expressions that are used to refer directly to methods by their names.
They act as a shorthand notation in a place where a lambda expression performs a call to a method.

# 13. What is Java 8 new features?
- Lambda Expressions:

  * Enabled functional programming in Java.
  * Provided a clear and concise way to represent single method interfaces using an expression.
  * Improved the readability and simplicity of the code, especially when using functional interfaces.

- Streams API:

  * Introduced a new abstraction called Stream that allows processing sequences of elements (e.g., collections) in a functional style.
  * Supported operations like map, filter, sort, and collect on collections of objects.
  * Enabled more readable and maintainable code for data processing.

- Functional Interfaces:

  * An interface with exactly one abstract method.
  * Facilitates the use of lambda expressions and method references.
  * The @FunctionalInterface annotation was introduced to denote functional interfaces.

- Default Methods:

  * Allowed methods with implementation in interfaces.
  * Helped in extending interfaces without breaking the existing implementations.
  * Useful for providing default behavior for methods.

- Method References:

  * Provided a way to refer to methods by their names rather than invoking them directly.
  * Used to create concise, readable functional programming constructs.

- Optional Class:

  * Introduced to avoid null checks and null-related errors.

# 14. Lambda can use unchanged variable outside of lambda? what is the details?
lambda expressions can capture and use variables from their enclosing environment,
these variables are known as "effectively final" variables.

# 15. Describe the newly added features in Java 8?
See Problem #13

# 16. Can a functional interface extend/inherit another interface?
Yes, a functional interface in Java can extend or inherit another interface

# 17. What is the lambda expression in Java and How does a lambda expression relate to a functional interface?
A lambda expression in Java is a concise and efficient way to represent a method interface using an expression.
Lambda expressions are similar to methods, but they do not need a name and they can be implemented right in the body of a method.\
A lambda expression can be considered as a concise way to provide the implementation of the abstract method of a functional interface.

# 18. In Java 8, what is Method Reference?
Method references in Java are a special type of lambda expressions that are used to refer directly to methods by their names.
They act as a shorthand notation in a place where a lambda expression performs a call to a method.

# 19. What does the String::ValueOf expression mean?
It refers to the valueOf method of the String class

# 20. What are Intermediate and Terminal operations?
Intermediate operations are operations that transform a stream into another stream.\
Terminal operations are operations that produce a result or a side-effect

# 21. What are the most commonly used Intermediate operations?
Filter, and map

# 22. What is the difference between findFirst() and findAny()?
`findFirst()` returns the first element of the stream.\
`findAny()` returns any element from the stream.

# 23. How are Collections different from Stream?
Collections are primarily about storing and accessing data, and Streams are about computations on a set of data.