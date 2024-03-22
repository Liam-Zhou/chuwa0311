## 1.  Practice  collection
## 2.  What is the checked exception and unchecked exception in Java, could you give one example?
Checked Exception - 必须用 catch or throws
- IOException (e.g. FileNotFound)
- SQLException/NetworkException

Unchecked Exception - Runtime Exception
- NullPointerException
## 3.  Can there be multiple finally blocks?
- finally can only be used once with a try or try-catch block.
- finally is optional in the try-catch block.
- finally will be executed whether or not the exception is handled.
- finally will still be executed if there is a return statement in the catch clause.

## 4.  When both catch and finally return values, what will be the final result?
the value returned by the finally block will be the final result of the method, overriding any value returned by the catch block. This behavior is due to the finally block being designed to execute after the try and catch blocks have completed, ensuring that cleanup code is executed no matter what happens in the try and catch blocks.
## 5.  What is Runtime/unchecked exception? what is Compile/Checked Exception?
Compile/Checked exception
- Definition: Checked exceptions are exceptions that are checked at compile-time. This means that the compiler requires the code to either handle these exceptions with a try-catch block or declare them in the method signature using the throws keyword.
- Purpose: They are used to handle recoverable conditions and encourage error handling at compile-time, ensuring that the programmer handles these exceptions.
- Examples: IOException, SQLException, ClassNotFoundException.

Runtime/unchecked exception
- Definition: Unchecked exceptions are exceptions that are not checked at compile-time. These include runtime exceptions (subclass of RuntimeException) and errors (subclass of Error). The compiler does not require these exceptions to be caught or declared in the method's signature.
- Purpose: They are used for errors that reflect some internal inconsistency or reflect problems that a program should not try to catch. It's usually a programming error, such as logic errors or improper use of an API.
- Examples: ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException.
## 6.  What is the difference between throw and throws?
throw
- Keyword Usage: throw is a statement used within a method.
- Purpose: It's used to explicitly throw an exception, either a new instance of an exception or an exception that was caught by a catch block. The throw statement is followed by an instance of Throwable (or a subclass of Throwable).

throws
- Keyword Usage: throws is part of a method signature.
- Purpose: It declares that a method might throw one or more exceptions during its execution. These exceptions must be either handled by a catch block where the method is called or declared in the method signature of the calling method using throws. This is primarily used for checked exceptions, which require handling or declaration.

## 7.  Run the below three pieces codes, Noticed the printed exceptions. why do we put the Null/Runtime exception before Exception ?
This is because Exception is a superclass of all checked exceptions, and RuntimeException is a subclass of Exception. As a result, more specific catch blocks placed after a generic catch block will never be reached.


## 7.  What is optional? why do you use it? write an optional example.
In short, it is used To avoid Null checks and run time NullPointerExceptions.

The Optional class in Java is a container object used to contain not-null objects. Optional object is used to represent null with absent value. It was introduced in Java 8 and provides a clear and explicit way to deal with null values effectively.

## 8.  Why finally always be executed ?

The finally block in Java is designed to always be executed after the try block (and any catch blocks, if present) have executed, regardless of whether an exception was thrown or caught.

## 9.  Practice collection problems here: https://github.com/TAIsRich/chuwa-eij-tutorial/tree/main/02-java-core/
    src/main/java/com/chuwa/exercise/collection
## 10.  What are the types of design patterns in Java ?
1. Creational Patterns
2. Structural Patterns
3. Behavioral Patterns

## 11.  What are the SOLID Principles ?
1. Single Responsibility Principle (SRP)
   - A class should have one and only one reason to change, meaning that a class should have only one job or responsibility.
2. Open-Closed Principle (OCP)
   - Software entities (classes, modules, functions, etc.) should be open for extension but closed for modification.
3. Liskov Substitution Principle (LSP)
   - Objects of a superclass shall be replaceable with objects of a subclass without affecting the correctness of the program.
4. Interface Segregation Principle (ISP)
   - Clients should not be forced to depend upon interfaces they do not use.
5. Dependency Inversion Principle (DIP)
   - High-level modules should not depend on low-level modules. Both should depend on abstractions. Furthermore, abstractions should not depend on details. Details should depend on abstractions.
## 12.  How can you achieve thread-safe singleton patterns in Java ?
- Eager Initialization
- Lazy Initialization with Synchronized Method
- Static Inner Class
- Double-checked Locking
- Enum Singleton

## 13.  What do you understand by the Open-Closed Principle (OCP) ?
Software entities (classes, modules, functions, etc.) should be open for extension but closed for modification.
## 14.  Liskov’s substitution principle states that if class B is a subtype of class A, then object of type A may be substituted with any object of type B. What does this actually mean? (from OA ) choose your answer.
1.  It mean that if the object of type A can do something, the object of type B could also be able tp
    perform the same thing
2.  It means that all the objects of type A could execute all the methods present in its subtype B
3.  It means if a method is present in class A, it should also be present in class B so that the object of
    type B could substitute object of type A.
4.  It means that for the class B to inherit class A, objects of type B and objects of type A must be same.
## 15.  Watch the design pattern video, and type the code, submit it to MavenProject folder
     singleton: https://www.bilibili.com/video/BV1Np4y1z7BU?p=22
     Factory: https://www.bilibili.com/video/BV1Np4y1z7BU?p=35&vd_source=310561eab1216a27f7accf859bf7f6
     Builder: https://www.bilibili.com/video/BV1Np4y1z7BU?p=50&vd_source=310561eab1216a27f7accf859bf7f6
     Publisher_Subscriber: https://www.bilibili.com/video/BV1Np4y1z7BU?p=114&vd_source=310561eab1216a27f