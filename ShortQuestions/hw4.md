# 2. What is the checked exception and unchecked exception in Java, could you give one example?
* Checked Exceptions: These are exceptions that are checked at compile time. This means that the code must handle these exceptions either with a try-catch block or by declaring them in the method signature using the throws keyword.
* Unchecked Exceptions: These are exceptions that are not checked at compile time. In other words, the compiler does not force you to either handle these exceptions with a try-catch block or declare them with a throws keyword.

# 3. Can there be multiple finally blocks?
No, you can have no finally block, or exactly one

# 4. When both catch and finally return values, what will be the final result?
The return statement from the finally block will be executed, and the value from the finally block will be the final result of the method.

# 5. What is Runtime/unchecked exception? what is Compile/Checked Exception?
See Question #2 for answer

# 6. What is the difference between throw and throws?
The throw keyword is used within a method to actually throw an exception.\
The throws keyword is used in a method's declaration to indicate that this method might throw one or more exceptions

# 7. Run the below three pieces codes, Noticed the printed exceptions. why do we put the Null/Runtime exception before Exception ?
In Java's exception handling, the catch blocks are evaluated in the order they are written. Therefore, more specific exceptions should be caught before more general exceptions

# 8. Why finally always be executed ?
This design serves a crucial purpose in ensuring that certain essential actions are performed no matter what happens in the try block. The typical use cases include cleaning up or releasing resources such as files, network connections, or database connections.

# 9. What are the types of design patterns in Java ?
* Creational Patterns: These patterns are all about class instantiation or object creation. 
* Structural Patterns: These patterns are concerned with how classes and objects are composed to form larger structures
* Behavioral Patterns: These patterns are concerned with algorithms and the assignment of responsibilities between objects. 

# 11. What are the SOLID Principles ?
* S - Single Responsibility Principle: A class should have one, and only one, reason to change.
* O - Open/Closed Principle: Software entities (classes, modules, functions, etc.) should be open for extension, but closed for modification.
* L - Liskov Substitution Principle: Objects in a program should be replaceable with instances of their subtypes without altering the correctness of the program.
* I - Interface Segregation Principle: Many client-specific interfaces are better than one general-purpose interface.
* D - Dependency Inversion Principle: Depend on abstractions, not on concretions.

# 12. How can you achieve thread-safe singleton patterns in Java ?
```java
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

# 13. What do you understand by the Open-Closed Principle (OCP) ?
The OCP encourages the use of a modular architecture where components are loosely coupled and can be easily and safely extended or replaced.
It leads to more maintainable and scalable code that can adapt to new requirements over time.

# 14. Liskov’s substitution principle states that if class B is a subtype of class A, then object of type A may be substituted with any object of type B. What does this actually mean? (from OA ) choose your answer.
```
1.  It mean that if the object of type A can do something, the object of type B could also be able tp
    perform the same thing
2.  It means that all the objects of type A could execute all the methods present in its subtype B
3.  It means if a method is present in class A, it should also be present in class B so that the object of
    type B could substitute object of type A.
4.  It means that for the class B to inherit class A, objects of type B and objects of type A must be same.
```
The answer is 1, LSP ensures that a subclass can stand in for its superclass. The key here is that the new subclass should extend the base class without changing its behavior.