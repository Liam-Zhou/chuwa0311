1.  Practice  collection

2.  What is the checked exception and unchecked exception in Java, could you give one example?

Checked Exceptions: These are exceptions that are checked at compile time. It means if a method might throw a checked exception, then the method must either handle the exception with a try-catch block or declare it using the throws keyword. Programmers are forced to anticipate these exceptions, which are outside the application's control.
```
public class Example {
    public void readFile(String fileName) throws IOException {
        FileInputStream file = new FileInputStream(fileName);
        int i;
        while ((i = file.read()) != -1) {
            System.out.print((char) i);
        }
        file.close();
    }
}
```
Unchecked Exceptions: These are exceptions that are not checked at compile time. In other words, the compiler does not require methods to catch or to specify (with a throws keyword) these exceptions. Unchecked exceptions are the subclasses of RuntimeException, and they usually indicate programming errors, such as logic errors or improper use of an API.
```
public class Example {
    public static void main(String[] args) {
        int result = 10 / 0; 
        System.out.println(result);
    }
}
```
3.  Can there be multiple finally blocks?

No, in Java, a try block can be followed by either a catch block or a finally block or both, but you cannot have multiple finally blocks directly associated with a single try block. However, you can have nested try-catch-finally blocks, each with its own finally block.

4.  When both catch and finally return values, what will be the final result?

If both catch and finally blocks contain return statements, the value returned by the finally block will be the final result, overriding any value returned by the catch block.

5.  What is Runtime/unchecked exception? what is Compile/Checked Exception?

See 2

6. What is the difference between throw and throws?

throw is a keyword used to explicitly throw an exception from a method or any block of code.
throws is a keyword used in the method signature to declare that the method might throw exceptions, indicating to the caller of the method that these exceptions need to be handled or declared to be thrown.
7.  Run the below three pieces codes, Noticed the printed exceptions. why do we put the Null/Runtime
    exception before Exception ?

Catching specific exceptions before the general Exception ensures tailored handling for specific cases and prevents the Exception catch block from overshadowing more specific exception types.

7.  What is optional? why do you use it? write an optional example.

Optional in Java is a container object used to contain not-null objects. Optional is used to represent optional values that are either present or absent, helping to avoid NullPointerExceptions and improve code readability by providing a clear way to handle the presence or absence of a value.
```
public class OptionalExample {
    public static void main(String[] args) {
        Optional<String> optionalValue = getOptionalValue("Hello");

        // If the value is present, print it; otherwise, print "Value not found"
        String value = optionalValue.orElse("Value not found");
        System.out.println(value);
    }

    public static Optional<String> getOptionalValue(String input) {
        // Returns an Optional containing the input string if it is not null
        return Optional.ofNullable(input);
    }
}
```
8.  Why finally always be executed ?

The finally block is designed to be executed after a try block and any associated catch blocks, regardless of whether an exception was thrown or caught, to ensure that necessary cleanup operations (like closing file streams or releasing resources) are always performed. It provides a reliable way to execute important code such as releasing resources, regardless of whether an exception occurs or not.
9.  Practice collection problems here: https://github.com/TAIsRich/chuwa-eij-tutorial/tree/main/02-java-core/
    src/main/java/com/chuwa/exercise/collection

10.  What are the types of design patterns in Java ?

Creational Patterns: Focus on class instantiation or object creation mechanisms. Examples include Singleton, Factory Method, Abstract Factory, Builder, and Prototype.

Structural Patterns: Deal with object composition or the structure of classes. Examples include Adapter, Composite, Proxy, Flyweight, Facade, Bridge, and Decorator.

Behavioral Patterns: Focus on object interaction and responsibility assignment. Examples include Observer, Strategy, Command, State, Visitor, Mediator, Iterator, Memento, and Chain of Responsibility.

11.  What are the SOLID Principles ?

Single Responsibility Principle (SRP): A class should have only one reason to change, meaning it should have only one job or responsibility.

Open/Closed Principle (OCP): Software entities (classes, modules, functions, etc.) should be open for extension, but closed for modification. This means you can add new functionality without changing the existing code.

Liskov Substitution Principle (LSP): Objects of a superclass should be replaceable with objects of a subclass without affecting the correctness of the program. This principle enforces the notion that a subclass should extend the base class without changing its behavior.

Interface Segregation Principle (ISP): No client should be forced to depend on methods it does not use. This principle suggests splitting large interfaces into smaller and more specific ones so that clients only need to know about the methods that are of interest to them.

Dependency Inversion Principle (DIP): High-level modules should not depend on low-level modules. Both should depend on abstractions. Additionally, abstractions should not depend on details; details should depend on abstractions. This principle aims to reduce the direct coupling between different components of a software, making it easier to change and maintain.

12.  How can you achieve thread-safe singleton patterns in Java ?

Eager Initialization: Instantiate the singleton instance at class loading time. This approach is thread-safe without requiring synchronization, but it doesn't provide lazy initialization.
```
public class Singleton {
    private static final Singleton INSTANCE = new Singleton();
    private Singleton() {}
    public static Singleton getInstance() {
        return INSTANCE;
    }
}
```
Static Block Initialization: Similar to eager initialization, but allows for exception handling.
```
public class Singleton {
    private static final Singleton INSTANCE;
    static {
        try {
            INSTANCE = new Singleton();
        } catch (Exception e) {
            throw new RuntimeException("Exception occurred in creating singleton instance");
        }
    }
    private Singleton() {}
    public static Singleton getInstance() {
        return INSTANCE;
    }
}
```
Synchronized Accessor Method: Ensure that the method used to get the instance is synchronized so that only one thread can execute it at a time.
```
public class Singleton {
    private static Singleton instance;
    private Singleton() {}
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
```
13. What do you understand by the Open-Closed Principle (OCP) ?


The Open-Closed Principle (OCP) is one of the five SOLID principles of object-oriented design and programming. It states that software entities (such as classes, modules, functions, etc.) should be open for extension but closed for modification. This means that the behavior of a module can be extended without modifying its source code. Implementing OCP effectively allows for adding new functionality to existing code without changing the existing code, thereby reducing the risk of introducing errors into the existing system.

14.  Liskov’s substitution principle states that if class B is a subtype of class A, then object of type A may be
     substituted with any object of type B. What does this actually mean? (from OA ) choose your answer.

1.It mean that if the object of type A can do something, the object of type B could also be able tp
    perform the same thing

2.It means that all the objects of type A could execute all the methods present in its subtype B

3.It means if a method is present in class A, it should also be present in class B so that the object of  type B could substitute object of type A.

4.It means that for the class B to inherit class A, objects of type B and objects of type A must be same.

choice 1. This statement reflects the essence of Liskov's Substitution Principle (LSP) by emphasizing that objects of a superclass should be replaceable with objects of a subclass without affecting the correctness of the program.
15.  Watch the design pattern video, and type the code, submit it to MavenProject folder


