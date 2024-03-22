#### 1. [Practice collection](https://github.com/CTYue/chuwa-eij-tutorial/tree/main/02-java-core/src/main/java/com/chuwa/exercise/collection)



#### 2. What is the checked exception and unchecked exception in Java, could you give one example?

##### Checked Exceptions

Checked exceptions are exceptions that must be either caught or declared in the method's `throws` clause. These are conditions that a reasonable application might want to catch. Checked exceptions are checked at compile-time, meaning that the compiler requires that you handle these exceptions in some way, either by catching them or by declaring them in your method signature with the `throws` keyword.

`IOEceptions`

``` Java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileExample {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("somefile.txt"));
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

```

##### Unchecked Exceptions

Unchecked exceptions include runtime exceptions (`RuntimeException` and its subclasses) and errors (`Error` and its subclasses). These exceptions are not checked at compile-time, which means you're not required to explicitly handle them (though you can if you want to). Unchecked exceptions generally indicate programming errors, such as bugs or incorrect use of an API.

``` Java
public class NullPointerExceptionExample {
    public static void main(String[] args) {
        String str = null;
        System.out.println(str.length()); // This will throw a NullPointerException
    }
}

```



#### 3. Can there be multiple finally blocks?

In Java, you can't have multiple `finally` blocks within a single try-catch block.



#### 4. When both catch and finally return values, what will be the final result?

In Java, if both `catch` and `finally` blocks contain `return` statements, the value returned by the `finally` block will be the final result, overriding any value returned by the `catch` block. 



#### 5. What is Runtime/unchecked exception? what is Compile/Checked Exception?

##### Runtime/Unchecked Exceptions

- **Definition**: Runtime exceptions are exceptions that are not checked at compile time. In other words, the compiler does not require methods to catch or declare these exceptions. Runtime exceptions extend `java.lang.RuntimeException`.
- Characteristics
  - They usually indicate programming errors, such as logic mistakes or improper use of an API.
  - Programmers are not forced to handle these exceptions explicitly.
- Examples
  - `NullPointerException` occurs when an application attempts to use an object reference that has the null value.
  - `ArrayIndexOutOfBoundsException` is thrown when an array has been accessed with an illegal index.
- **Handling**: While not required, runtime exceptions can and should be handled when it makes sense for the application logic to do so.

##### Compile-time/Checked Exceptions

- **Definition**: Checked exceptions are exceptions that the compiler requires to be either caught in a try-catch block or declared in the method's `throws` clause. These exceptions extend `java.lang.Exception` but do not extend `java.lang.RuntimeException`.
- Characteristics
  - They represent conditions that a reasonable application might want to catch and handle, often outside the control of the program (e.g., I/O operations).
  - Enforcing these exceptions at compile-time helps ensure robust error handling by making the developer deal with these potential issues explicitly.
- Examples
  - `IOException` is thrown when an I/O operation fails or is interrupted.
  - `SQLException` is thrown when accessing databases yields errors.
- **Handling**: Methods that might throw a checked exception must declare the exception using the `throws` keyword, or catch the exception using a try-catch block.



#### 6. What is the difference between throw and throws?

##### throw

- **Usage**: The `throw` keyword is used within a method. It is used to explicitly throw an exception, either a newly instantiated exception or an exception that was caught by a `catch` block.
- **Purpose**: To indicate that an error or unexpected situation has occurred in the program. By using `throw`, you can signal the occurrence of an exception that needs to be handled by a method further up the call stack.
- **Details**: When an exception is thrown using the `throw` keyword, the normal flow of execution stops immediately, and the runtime system looks for the nearest `catch` block that can handle the thrown exception type.

```Java
public void myMethod() {
    if (someCondition) {
        throw new IllegalArgumentException("Explanation of the cause");
    }
}
```

##### throws

- **Usage**: The `throws` keyword is used in a method signature. It declares that a method can potentially throw exceptions of specified types.
- **Purpose**: To inform the caller of the method that this method might throw one of these exceptions, and that they should be prepared to handle these exceptions, either by catching them or by declaring them in their own `throws` clause.
- **Details**: When a method declares one or more exceptions using the `throws` keyword, it does not handle the exceptions itself. Instead, it passes the responsibility of handling these exceptions to the method that calls it.

```java
public void myMethod() throws IOException, SQLException {
    // Method implementation that might throw IOException or SQLException
}
```



#### 7. Run the below three pieces codes, Noticed the printed exceptions. why do we put the Null/Runtime exception before Exception ?

``` Java
public class Main {
    public static void main(String[] args) {
        int a = 0;
        int b = 3;
        String s = null;
        try {
            System.out.println(b / a);
            System.out.println(s.equals("aa"));
            throw new RuntimeException();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (RuntimeException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.getMessage();
        }
        System.out.println("End ...");
    }
}
public class Main {
    public static void main(String[] args) {
        int a = 0;
        int b = 3
        String s = null;
        try {
// System.out.println(b / a);
            System.out.println(s.equals("aa"));
            throw new RuntimeException();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (RuntimeException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.getMessage();
        }
        System.out.println("End ...");
    }
}
public class Main {
    public static void main(String[] args) {
        int a = 0;
        int b = 3
        String s = null;
        try {
// System.out.println(b / a);
// System.out.println(s.equals("aa"));
            throw new RuntimeException();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (RuntimeException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.getMessage();
        }
        System.out.println("End ...");
    }
}
```

In a sequence of `catch` blocks, more specific exceptions (subclasses) should be caught before more general exceptions (superclasses). This ordering ensures that each specific type of exception can be caught and handled appropriately.

If you place a `catch` block for a more general exception (`Exception`) before a more specific exception (`NullPointerException`), the more general catch block will intercept all exceptions, including `NullPointerException`. As a result, the more specific catch block for `NullPointerException` will never be reached if it is placed after the general `Exception` catch block. This is because the catch block for `Exception` will catch exceptions of any type that is a subclass of `Exception`, effectively preventing any subsequent, more specific `catch` blocks from being evaluated.



#### 7. What is optional? why do you use it? write an optional example.

`Optional` is a container object used to contain not-null objects. Introduced in Java 8, `Optional` is a means for providing a clear and explicit way to convey the concept of optionality, meaning a value can be present or absent. Its primary purpose is to avoid `NullPointerException` that can occur when accessing an object reference that has the potential to be null.



#### 8. Why finally always be executed ?

This design ensures that the `finally` block is the ideal place to perform cleanup actions that must occur regardless of the outcome of the try-catch blocks. such as releasing resources like file handles, network connections or database connections.



#### 9. Practice collection problems here: *https://github.com/TAIsRich/chuwa-eij-tutorial/tree/main/02-java-core/src/main/java/com/chuwa/exercise/collection*



#### 10. What are the types of design patterns in Java ?

Creational Patterns

- Singleton
- Factory Method
- Abstract Factory
- Builder
- Prototype

Structural Patterns

- Adapter
- Bridge
- Composite
- Proxy
- Facade

Behavioral Patterns

- Chain of responsibility
- Command
- Tterator
- State
- Observer



#### 11. What are the SOLID Principles ?

##### 1. **Single Responsibility Principle (SRP)**

- **Definition**: A class should have only one reason to change, meaning it should have only one job or responsibility.
- **Purpose**: This principle aims to reduce complexity by ensuring that a class is only focused on one aspect of the system. If a class assumes multiple responsibilities, changes to one responsibility may impact the others, making the class harder to understand and maintain.

##### 2. **Open/Closed Principle (OCP)**

- **Definition**: Software entities (classes, modules, functions, etc.) should be open for extension but closed for modification.
- **Purpose**: The idea is to allow classes to be easily extended to incorporate new behavior without changing existing code. This facilitates managing changes and additions without affecting existing functionality, leading to a more robust and less error-prone system.

##### 3. **Liskov Substitution Principle (LSP)**

- **Definition**: Objects of a superclass should be replaceable with objects of a subclass without affecting the correctness of the program.
- **Purpose**: This principle ensures that a subclass can stand in for its superclass. It is aimed at ensuring inheritance is used correctly, such that subclasses do not override or change the expected behavior of the superclass.

##### 4. **Interface Segregation Principle (ISP)**

- **Definition**: No client should be forced to depend on methods it does not use.
- **Purpose**: This principle suggests that rather than having one large interface, multiple smaller interfaces are better when they cater to specific client needs. This way, clients will only have to know about the methods that are of interest to them, leading to a cleaner, decoupled design.

##### 5. **Dependency Inversion Principle (DIP)**

- **Definition**: High-level modules should not depend on low-level modules. Both should depend on abstractions. Additionally, abstractions should not depend on details. Details should depend on abstractions.
- **Purpose**: The goal is to reduce the dependency between high-level components and low-level components or modules by introducing an abstraction layer between them. This helps in decoupling the system's components, making it easier to refactor, change, and test the system.



#### 12. How can you achieve thread-safe singleton patterns in Java ?

##### Eager Initialization

Java guarantees that static initializer blocks are thread-safe. By leveraging this, you can create the singleton instance at the time of class loading.

```Java
public class Singleton {
    private static final Singleton INSTANCE = new Singleton();

    private Singleton() {}

    public static Singleton getInstance() {
        return INSTANCE;
    }
}

```

##### Synchronized Accessor Method

You can make the `getInstance` method synchronized, ensuring that only one thread can execute it at a time. However, this approach might lead to performance issues due to the overhead of synchronization.

```Java
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

#### Double-checked Locking (DCL)

Double-checked locking is an optimization over the synchronized method to reduce the overhead of acquiring a lock. It first checks if an instance is created, and if not, it synchronizes. This way, synchronization happens only during the first creation.

```java
public class Singleton {
    private static volatile Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}

```



##### Enum Type

The enum approach is the simplest way to create a singleton and is inherently thread-safe. The JVM guarantees that the instance will be created exactly once.

```java
public enum Singleton {
    INSTANCE;
}
```



#### 13. What do you understand by the Open-Closed Principle (OCP) ?

- **Open for Extension**: You should be able to add new functionality or extend existing behavior without changing the existing code of the module. This is typically achieved through the use of interfaces, abstract classes, or design patterns such as Strategy, Decorator, or Observer.
- **Closed for Modification**: Once a module has been developed and tested, its source code should not be modified to add new behavior. Instead, its behavior should be extended through the creation of new code.

Benefits:

- Minimizes regression risks
- Enhances maintainability
- Promotes Reusability
- Facilitates Scalability



#### 14. Liskov’s substitution principle states that if class B is a subtype of class A, then object of type A may be substituted with any object of type B. What does this actually mean?  choose your answer.

- [x] It mean that if the object of type A can do something, the object of type B could also be able to perform the same thing

2. It means that all the objects of type A could execute all the methods present in its subtype B

3. It means if a method is present in class A, it should also be present in class B so that the object of type B could substitute object of type A.
3. It means that for the class B to inherit class A, objects of type B and objects of type A must be same.



#### 15. Watch the design pattern video, and type the code, submit it to MavenProject folder

*singleton:* *https://www.bilibili.com/video/BV1Np4y1z7BU?p=22*

*Factory:* *https://www.bilibili.com/video/BV1Np4y1z7BU?p=35&vd_source=310561eab1216a27f7accf859bf7f6d9*

*Builder:* *https://www.bilibili.com/video/BV1Np4y1z7BU?p=50&vd_source=310561eab1216a27f7accf859bf7f6d9*

*Publisher_Subscriber:* *https://www.bilibili.com/video/BV1Np4y1z7BU?p=114&vd_source=310561eab1216a27f7accf859bf7f6d9*