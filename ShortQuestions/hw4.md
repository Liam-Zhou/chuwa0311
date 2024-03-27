#HW4

#2. What is the checked exception and unchecked exception in Java, could you give one example?
    Checked exceptions are exceptions that must be either caught or declared in the method signature
    using the throws keyword. These exceptions are checked at compile-time, meaning that the compiler
    requires that you handle these exceptions, either with a try-catch block or by declaring them 
    with throws. They represent conditions that a well-written application should anticipate and 
    recover from.

    Example: FileNotFoundException
    This exception is thrown when an attempt to open the file denoted by a specified pathname has failed.
```java
public class CheckedExceptionExample {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("nonexistentfile.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
```
    Unchecked Exceptions
    Unchecked exceptions include runtime exceptions (RuntimeException and its subclasses) and errors
    (Error and its subclasses). They are not checked at compile-time, meaning the compiler does not 
    require you to catch or declare them. Unchecked exceptions generally represent programming 
    errors, such as logical errors or improper use of an API.

    Example: ArithmeticException
    This is a common unchecked exception that occurs when an illegal arithmetic operation is 
    performed, such as dividing by zero.
```java
public class UncheckedExceptionExample {
    public static void main(String[] args) {
        int result = 10 / 0; // This will throw ArithmeticException
        System.out.println(result);
    }
}
```
#3. Can there be multiple finally blocks?
    In Java, you cannot have multiple finally blocks directly associated with a single try block. 
    Each try block can be followed by zero or one finally block. The finally block always executes 
    when the try block exits, regardless of whether an exception was thrown or caught, making it the
    perfect place to perform cleanup activities, such as releasing resources like closing file 
    streams or database connections.
#4. When both catch and finally return values, what will be the final result?
    In Java, if both catch and finally blocks contain return statements, the return statement in the
    finally block will be executed last, and its value will be the one actually returned by the 
    method. This means that even if the catch block executes a return statement, the method will not
    immediately return at that point; instead, it will first execute the finally block before 
    returning the value specified in the finally block. This behavior underlines the fact that the 
    finally block is generally used for cleanup activities and should be used carefully, especially 
    with respect to return statements, as it can lead to unexpected outcomes.
#5. What is Runtime/unchecked exception? what is Compile/Checked Exception?
    Exceptions are divided into two main categories: checked exceptions and unchecked exceptions. 
    This classification is based on how the compiler and the runtime system handle these exceptions.
    Checked Exceptions (Compile-time Exceptions)
    Checked exceptions are exceptions that are checked at compile time. This means that if a method 
    could throw a checked exception, the method must either handle the exception with a try-catch 
    block or declare it using the throws keyword in the method's signature. Failure to do either 
    results in a compile-time error. Checked exceptions are used to represent conditions that a 
    well-written application should anticipate and recover from.
    Unchecked Exceptions (Runtime Exceptions)
    Unchecked exceptions are the exceptions that are not checked at compile time. In other words, 
    the compiler does not require methods to catch or to declare them. Unchecked exceptions are 
    subclasses of RuntimeException, and they are usually used to indicate programming errors, such 
    as logic mistakes or improper API usage.

#6. What is the difference between throw and throws?
    Throw and throws are both mechanisms to handle exceptions, but they serve different purposes and
    are used in different contexts.

    throw
    Usage: The throw keyword is used within a method. It is used to actually throw an exception, 
    either a newly instantiated exception or an exception that was caught in a catch block. When an 
    exception is thrown using the throw keyword, the flow of execution of the program is interrupted, 
    and the exception is propagated up the call stack until it is caught by a suitable catch block. 
    If no such block exists, the program terminates.
    Purpose: To manually throw an exception. This can be done for several reasons, such as validating
    arguments, enforcing certain conditions, or re-throwing an exception caught in a catch block with
    additional handling.
    throws
    Usage: The throws keyword is used in the method signature. It declares that a method might throw
    one or more exceptions during its execution. These exceptions could be checked exceptions, which
    require explicit handling either by a try-catch block or by declaring them with throws in the 
    method signature. It informs the caller of the method that they need to handle these exceptions, 
    either by catching them or by declaring them in their own method signature with throws.
    Purpose: To declare that a method might throw exceptions, making it the responsibility of the 
    calling method to handle or declare these exceptions. This is particularly important for checked 
    exceptions, which the Java compiler requires to be handled or declared.
#7. What is optional? why do you use it? write an optional example.
    Optional is a container object which may or may not contain a non-null value. Introduced in 
    Java 8, it is part of the java.util package. Optional provides a way to express optional values 
    without using null. This approach can help avoid NullPointerException, making the code more 
    readable and easier to understand.
    Why Use Optional?
    To Clearly Express Optionality: It indicates that the method might not return a value, making 
    the API more readable and self-documenting.

    To Avoid NullPointerException: It provides methods to check the presence of a value explicitly 
    and to handle the absence of a value gracefully, reducing the risk of runtime exceptions.

    To Encourage Functional Programming Style: Optional supports various methods for conditional 
    actions and transformations, which promotes a functional programming approach.

```java
import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        Optional<String> optionalWithContent = Optional.of("Hello, Optional!");

        Optional<String> emptyOptional = Optional.empty();

        if (optionalWithContent.isPresent()) {
            System.out.println("Optional contains: " + optionalWithContent.get());
        }

        emptyOptional.ifPresent(value -> System.out.println("This won't be executed: " + value));

        String valueOrDefault = emptyOptional.orElse("Default Value");
        System.out.println("Value or Default: " + valueOrDefault);
        
        Optional<Integer> stringLength = optionalWithContent.map(String::length);
        System.out.println("Length of string in Optional: " + stringLength.orElse(-1));
    }
}

```

#8.  Why finally always be executed ?
    The finally block in Java is designed to be executed after the try block has completed and after 
    any catch blocks that might be executed due to exceptions thrown within the try block. The 
    purpose of the finally block is to ensure that necessary cleanup operations are always performed,
    regardless of whether an exception was thrown or caught, or even if the try or catch blocks 
    contain return, continue, or break statements that alter the flow of execution.

    Reasons why finally is always executed:
    Guaranteed Cleanup: It guarantees the execution of important cleanup code, such as closing 
    resources (files, network connections, etc.), releasing locks, or restoring state, which is 
    crucial for avoiding resource leaks and maintaining the integrity of the system.

    Unconditional Execution: The design of Java exception handling ensures that the finally block 
    executes even if an exception occurs in the try or catch blocks. This design helps in writing 
    robust code where certain actions need to be ensured regardless of the outcome.

    Exceptions: If an exception is thrown in the try block and not caught (or rethrown) in any 
    corresponding catch block, the finally block will still execute before the exception is 
    propagated up the call stack.

    Flow Control Commands: The finally block will execute even if the try or catch block contains 
    control flow commands like return, continue, break, or throw that would normally transfer 
    control out of the block.
#10. What are the types of design patterns in Java ?
    Creational Patterns, Structural Patterns, Behavioral Patterns

#11. What are the SOLID Principles ?
    The SOLID principles are a set of five design principles intended to make software designs more 
    understandable, flexible, and maintainable. The acronym SOLID stands for:

    Single Responsibility Principle (SRP)
    Definition: A class should have only one reason to change, meaning it should have only one job 
    or responsibility.
    Purpose: This principle aims to reduce the complexity of the system by ensuring that each class 
    is focused on a single functionality. It facilitates easier maintenance and a lower chance of 
    bugs since changes to one responsibility affect only one class.
    Open/Closed Principle (OCP)
    Definition: Software entities (classes, modules, functions, etc.) should be open for extension 
    but closed for modification.
    Purpose: The idea is to allow systems to be extended with new functionalities without modifying 
    existing code, which can introduce errors in existing functionalities. This is typically achieved
    by using interfaces or abstract classes allowing the implementation details to change without 
    changing the interface.
    Liskov Substitution Principle (LSP)
    Definition: Objects of a superclass shall be replaceable with objects of a subclass without 
    affecting the correctness of the program.
    Purpose: This principle ensures that a subclass can stand in for its superclass without errors. 
    If the code finds that it needs to check the type of a class before using it, it may violate LSP.
    Interface Segregation Principle (ISP)
    Definition: No client should be forced to depend on methods it does not use.
    Purpose: This principle suggests that it is better to have many specific interfaces rather than 
    a single, general-purpose interface. This way, classes don't implement interfaces they don't use,
    which leads to a cleaner, more understandable design.
    Dependency Inversion Principle (DIP)
    Definition: High-level modules should not depend on low-level modules. Both should depend on 
    abstractions. Also, abstractions should not depend on details; details should depend on abstractions.
    Purpose: This principle aims to reduce the dependency between high-level modules and low-level 
    modules by introducing an abstraction layer between them. This makes the system easier to refactor
    , modify, and test.
#12. How can you achieve thread-safe singleton patterns in Java ?
    Achieving a thread-safe singleton pattern in Java is crucial for ensuring that only one instance
    of a singleton class is created, even in multi-threaded environments. There are several ways to 
    implement thread-safe singleton patterns, each with its own advantages.
#13. What do you understand by the Open-Closed Principle (OCP) ?
    Open for Extension: This part of the principle suggests that the behavior of a software module 
    can be extended as the requirements of the application change or grow. In practical terms, it 
    means that we should be able to add new features or components to the application without 
    altering the existing code.
    Closed for Modification: This part implies that extending the behavior of a module shouldn't 
    require changing the existing source code. The existing functionality of the system remains 
    unchanged and works as before, ensuring that changes do not introduce new bugs to existing features.
#14. Liskov’s substitution principle states that if class B is a subtype of class A, then object of type A may besubstituted with any object of type B. What does this actually mean? (from OA ) choose your answer.
- It mean that if the object of type A can do something, the object of type B could also be able tp
    perform the same thing
- It means that all the objects of type A could execute all the methods present in its subtype B
- It means if a method is present in class A, it should also be present in class B so that the object of
    type B could substitute object of type A.
- It means that for the class B to inherit class A, objects of type B and objects of type A must be same


    It means that if the object of type A can do something, the object of type B could also be able 
    to perform the same thing.
    Liskov's Substitution Principle (LSP), one of the SOLID principles of object-oriented design, 
    emphasizes that objects of a superclass should be replaceable with objects of a subclass without
    affecting the correctness of the program. In other words, a subclass should override the 
    superclass methods in a way that does not break functionality from a client's point of view. The
    principle is about ensuring that a subclass can stand in for its superclass without the need for
    clients to know about the difference, thus promoting interoperability and substitutability in 
    object-oriented programs.

