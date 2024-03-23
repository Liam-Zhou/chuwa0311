# Home Work 4

**2. What is the checked exception and unchecked exception in Java, could you give one example?**

Checked exceptions are exceptions that the compiler requires you to handle explicitly using try-catch
blocks or declare them using throws clause in the method signature.

Example: IOException

Unchecked exceptions, also known as runtime exceptions, are exceptions that do not require you to handle them explicitly. 
They are not checked at compile-time and can occur at runtime.

Example:NullPointerException

**3. Can there be multiple finally blocks?**

No, each try block can only have one finally block.

**4. When both catch and finally return values, what will be the final result?**

When both `catch` and  `finally` blocks return values, the value returned by the `finally` block
will override the value returned by the `catch` block.

**5. What is Runtime/unchecked exception? what is Compile/Checked Exception?**

Runtime exceptions occur at runtime and are not checked by the compiler, example: NullPointerException

Compile-time exceptions are checked by the compiler and must be handled explicitly, example: FileNotFoundException

**6. What is the difference between throw and throws?**

`throw` is used to throw an exception within a method

`throws` is used to declare that a method may throw certain types of exceptions, leaving the responsibility of handling them 
to the caller of the method.

**7. Run the below three pieces codes, Noticed the printed exceptions. why do we put the Null/Runtime
    exception before Exception ?**

This is because the catch blocks are evaluated in the order they appear, once a matching catch block is found, 
the subsequent catch blocks are skipped. So when catching exceptions in a try-catch block, it's important to catch
more specific exceptions before catching more general.

**8. What is optional? why do you use it? write an optional example.**

`Optional` is a container object that may or may not contain a non-null value. It is used to represent
an optional value, meaning that it may or may not be present.
`Optional` provides methods to handle the presence or absence of a value without explicitly checking for null.

We use `Optional` to avoid NullPointerExceptions.

```java
import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        String nullStr = null;
        Optional<String> optional = Optional.ofNullable(nullStr);
        optional.ifPresentOrElse(
                value -> System.out.println("value is: " + value),
                () -> System.out.println("value is absent")
        );
    }
}
```

**9. Why finally always be executed ?**

`finally` is always executed, regardless of whether an exception is thrown or caught. 
It ensures that certain cleanup or resource release operations are performed, even if an exception occurs.

**11. What are the types of design patterns in Java ?**

- Creational Patterns: These patterns deal with object creation mechanisms, trying to create objects in a manner suitable for the situation. Example: Singleton
- Structural Patterns: These patterns deal with object composition or structure and focus on how classes and objects are composed to form larger structures. Example: Bridge, Composite
- Behavioral Patterns: These patterns focus on communication between objects, how objects interact and fulfill individual responsibilities. Example: Visitor patterns, Iterator

**12. What are the SOLID Principles ?**

1. SingleResponsibility Principle: A class should have only one reason to change, meaning it should have only one responsibility or job.
2. Open/Closed Principle: Software entities should be open for extension but closed for modification.
3. Liskov Substitution Principle: Objects of a superclass should be replaceable with Objects of a subclass without affecting the correctness of the program.
4. Interface jSegregation Principle: Clients should not be forced to depend on interfaces they don't use.
5. Dependency Inversion Principle: High level modules should not depend on low-level modules, both should depend on abstractions. Abstractions should not depend on details, details should depend on abstractions.

**13. How can you achieve thread-safe singleton patterns in Java ?**

We can use eager initialization, the instance of the singleton class is created eagerly when the class is loaded.
This ensures that the instance is created before any threads can access it, making it thread-safe.

```java
public  class Singleton{
    private static final Singleton instance = new Singleton();
    private Singleton(){}
    public static Singleton getInstance(){
        return instance;
    }
}
```

**14. What do you understand by the Open-Closed Principle (OCP) ?**

The Open Closed Principle is states that software entities should be open for extension bu closed for modification.
This means that you should be able you extend the behavior of a module without modifying its source code.

**15. Liskov¡¯s substitution principle states that if class B is a subtype of class A, then object of type A may be
     substituted with any object of type B. What does this actually mean?**

It means that if the object of type A can do something, the object of type B could also be able to perform the same thing.
