1.  What is generic in Java? and type the generic code by yourself.

Generics in Java are a feature that allows type (classes and interfaces) to be parameters when defining classes, interfaces, and methods. They provide a way for you to re-use the same code with different inputs.

2.  Read those codes and type it one by one by yourself. the push the code to your
    branch.

3.  practice stream API at least 3 times

4.  Practice Optional methods at least 2 times

5.  Write the Singleton design pattern include eager load and lazy load.

```
public class SingletonEager {
    private static final SingletonEager INSTANCE = new SingletonEager();

    private SingletonEager() {}

    public static SingletonEager getInstance() {
        return INSTANCE;
    }
}

public class SingletonLazy {
    private static SingletonLazy instance;

    private SingletonLazy() {}

    public static synchronized SingletonLazy getInstance() {
        if (instance == null) {
            instance = new SingletonLazy();
        }
        return instance;
    }
}

```

6.  What is Runtime Exception? could you give me some examples?

A RuntimeException in Java is a type of unchecked exception, which means it does not need to be declared in a method's throws clause. It indicates that the error is due to a programming mistake, such as logic errors or improper use of an API. RuntimeExceptions are automatically propagated up the call stack.

Examples include:

NullPointerException - when attempting to use null where an object is required.
ArrayIndexOutOfBoundsException - when accessing an array with an illegal index.
ArithmeticException - like dividing by zero.
IllegalArgumentException - when a method receives an argument formatted differently than the method expects.

7. Could you give me one example of NullPointerException?

```
public class NullPointerExample {
    public static void main(String[] args) {
        String text = null;
        int length = text.length(); // This line will throw a NullPointerException
        System.out.println("Length of the string: " + length);
    }
}
```

8.  What is the Optional class?

The Optional class in Java is a container object used to contain not-null objects. Introduced in Java 8, Optional is a means for expressing optional values (absent or present). It's used to avoid NullPointerException and to write clean, readable code by providing a more expressive alternative to null.

9.  What are the advantages of using the Optional class?

Null Safety: It explicitly handles the presence or absence of a value, reducing the likelihood of NullPointerExceptions by forcing the caller to deal with the possibility of null explicitly.

Better API Design: When a method returns an Optional, it clearly communicates to the caller that there might not be a value present, encouraging the caller to handle the case of absence.

Fluent APIs and Avoiding Boilerplate: Optional provides a range of methods that allow for expressive, functional-style operations on the contained value, such as map, filter, ifPresent, and orElse, reducing boilerplate code around null checks.

Prevents Misuse of Null: It discourages the widespread use of null and helps to avoid the error-prone practice of returning null or passing null as arguments.

10. What is the @FunctionalInterface?

The @FunctionalInterface annotation in Java is used to indicate that an interface is intended to be a functional interface. A functional interface is an interface that contains exactly one abstract method, though it can contain multiple default or static methods. This single abstract method is called the functional method.

11. what is lamda?

A lambda expression in Java is a concise way to represent an anonymous function that can be passed around as if it were an object. Introduced in Java 8, lambda expressions provide a clear and compact way to implement functional interfaces—interfaces with a single abstract method.

12. What is Method Reference?

A Method Reference in Java is a shorthand notation of a lambda expression to call a method. It's a compact and easy-to-read way to pass a method as an argument to another method. Method references can be used wherever a functional interface is required.

13. What is Java 8 new features?

- Lambda Expressions
- Method References
- Stream API
- Default Methods in Interfaces
- Optional Class

14. Lambda can use unchanged variable outside of lambda? what is the details?

A lambda expression in Java can access and use variables from its surrounding scope, but there are restrictions. These variables must be either final or effectively final:

Final Variable: A variable that is explicitly declared with the final keyword. Once initialized, its value cannot be changed.
Effectively Final Variable: A variable that is not declared as final but whose value is assigned only once and never changed afterwards.
Details:
Local Variables: Lambda expressions can capture and use local variables from their enclosing scope. However, those variables need to be final or effectively final. This requirement exists because the lambda might outlive the scope in which it was defined, and allowing the lambda to change the value of the captured variable could lead to concurrency problems or unpredictable behaviors.

Instance and Static Variables: Lambda expressions can access instance and static variables without the final or effectively final restrictions. These variables can be read and modified within the lambda expression. This difference in behavior is due to how instance and static fields are part of an object's state, which can naturally evolve over time.

15. Describe the newly added features in Java 8?

- see 13

16. Can a functional interface extend/inherit another interface?

Yes, a functional interface can extend another interface, but the child interface must still only have one abstract method, including those inherited from the parent interface. Extending with default or static methods is allowed since they don't count as abstract methods.

17. What is the lambda expression in Java and How does a lambda expression relate to a functional interface?

A lambda expression in Java is a concise way to represent an instance of a functional interface, providing a clear and compact syntax for its single abstract method. Lambda expressions enable you to express instances of single-method interfaces (functional interfaces) more efficiently.

18. In Java 8, what is Method Reference?

- see 12

19. What does the String::ValueOf expression mean?

The String::valueOf expression is a method reference in Java that refers to the valueOf static method of the String class. Method references provide a way to refer to methods directly in contexts where a functional interface is expected.

20. What are Intermediate and Terminal operations?

Intermediate operations in Java Streams are lazy and transform a stream into another stream, such as map() and filter(). Terminal operations trigger the processing of the elements and produce a result or side-effect, ending the stream, such as collect() and forEach().

21. What are the most commonly used Intermediate operations?

filter(predicate): Returns a stream including only elements that match the given predicate.

map(function): Transforms each element of the stream using the given function.

flatMap(function): Similar to map, but flattens streams generated by the function into a single stream.

distinct(): Returns a stream with unique elements (according to Object.equals(Object)).

sorted(): Returns a stream sorted according to the natural order or by a provided Comparator.

peek(consumer): Performs an action for each element of the stream without modifying the stream (mostly for debugging).

22. What is the difference between findFirst() and findAny()?

findFirst(): Returns an Optional describing the first element of the stream, if present. In ordered streams (like those from a list or sorted data), it will return the first element according to the encounter order. It's useful when you need a deterministic result, especially with sequential streams.

findAny(): Returns an Optional describing some element of the stream, if present. It does not guarantee to return the first element in the encounter order, making it more suitable for parallel streams since it allows for more flexibility in performance optimizations.

23. How are Collections different from Stream?

Collections are in-memory data structures to store elements that can be accessed and modified directly. Streams are a sequence of elements supporting sequential and parallel aggregate operations, focusing on computational operations on elements from a source such as collections, without modifying the source itself.
