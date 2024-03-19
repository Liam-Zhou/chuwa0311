1.  Write up Example code to demonstrate the three foundmental concepts of OOP.

Please refer to the code in [hw2_oop.java](../Coding/coding1/hw2_oop.java) for details.

2.  What is wrapper class in Java and Why we need wrapper class?

A wrapper class in Java encapsulates a primitive data type in an object, enabling primitives to be used in contexts requiring objects, like collections. They also offer utility methods for operations on primitive values.

3.  What is the difference between HashMap and HashTable?

HashMap is non-synchronized, allows one null key and multiple null values, and is generally faster. HashTable is synchronized, doesn't allow null keys or values, and is thread-safe but slower.

4.  What is String pool in Java and why we need String pool?

The String pool in Java conserves memory by reusing identical string literals, reducing the number of String objects created, thereby improving performance.

5.  What is Java garbage collection?

Java garbage collection is the process of automatically freeing memory by reclaiming the memory used by objects that are no longer reachable or needed by the application, improving memory efficiency and preventing memory leaks.

6.  What are access modifiers and their scopes in Java?

Access modifiers in Java define the scope of access for classes, methods, and variables. There are four types:

public: Accessible from any other class.
protected: Accessible within the same package and by subclasses.
default (no modifier): Accessible only within the same package.
private: Accessible only within the class it is declared.

7.  What is final key word? (Filed, Method, Class)

Field: Marks a variable as unchangeable after it is initialized. It must be assigned a value exactly once, either in its declaration or in the constructor.
Method: Prevents a method from being overridden by subclasses.
Class: Prevents a class from being subclassed.

8.  What is static keyword? (Filed, Method, Class). When do we usually use it?

Field: A static field is shared among all instances of the class, meaning there is only one copy of it regardless of the number of instances.
Method: A static method belongs to the class and can be called without creating an instance of the class. It can only directly access other static members.
Class: Only nested classes can be static. A static nested class does not need an instance of the enclosing class to be instantiated.
Usage: static is commonly used for utility or helper methods that don't require any object state (for instance, methods in the Math class), constants (public static final fields), or when a common property is shared across all instances of a class (like a counter of instances). Static blocks can also be used for static initialization of a class.

9.  What is the differences between overriding and overloading?

Overloading occurs within the same class when two or more methods have the same name but differ in parameters (type, number, or both). It is a compile-time polymorphism technique that allows methods to handle different types and numbers of inputs.

Overriding happens when a subclass has a method with the same name, return type, and parameters as a method in its superclass. It allows the subclass to provide a specific implementation of a method that is already provided by its parent class. This is a runtime polymorphism technique enabling Java to use the overridden method of the subclass instead of the superclass method when it is invoked through a subclass object.

The key differences lie in their purposes (overloading for method behavior variation with different parameters, overriding for changing behavior of inherited methods) and their application contexts (overloading within the same class, overriding across superclass and subclass).

10. What is the differences between super and this?

this refers to the current object instance. It's used to access the current object's members (fields, methods), and to call other constructors in the same class from a constructor. Essentially, this is a reference to the current object whose method or constructor is being invoked.

super refers to the parent class of the current object. It's used to access members (fields, methods) of the parent class, especially when they are overridden by the child class. Additionally, super can be used to call the constructor of the parent class from the child class's constructor.

11. What is the Java load sequence?

1.Loading: Reading the class file and generating a Class object in memory.
2.Linking:
Verification: Ensuring bytecode correctness.
Preparation: Allocating memory for static fields.
Resolution: Transforming symbolic references into direct references.
3.Initialization: Executing static initializers and blocks in order.
Superclasses are loaded before subclasses, and static fields and blocks are processed in the order they appear.

12. What is Polymorphism ? And how Java implements it ?

Polymorphism is a fundamental concept in object-oriented programming that allows objects of different classes to be treated as objects of a common superclass. It enables a single interface to represent different underlying forms (data types). Java implements polymorphism in two main ways:
Compile-time polymorphism (Method Overloading): This is achieved by having multiple methods with the same name but different parameters within the same class.
Runtime polymorphism (Method Overriding): This occurs when a subclass provides a specific implementation of a method that is already provided by its parent class.

13. What is Encapsulation ? How Java implements it? And why we need encapsulation?

Encapsulation is a principle of bundling the data (attributes) and methods (functions) that operate on the data into a single unit called a class, and restricting access to some of the object's components. Java implements encapsulation by using access modifiers (private, public, protected) to restrict access to the members of a class. Encapsulation is needed to:
Hide the internal implementation details of a class.
Protect an object from unwanted access by clients in order to guard against unintended data manipulation.
Enable modular programming by separating the interface from the implementation.

14. What is Interface and what is abstract class? What are the differences between them?

An Interface is a reference type in Java that is a collection of abstract methods (methods without bodies). Starting from Java 8, interfaces can also have default and static methods with implementations. Interfaces specify what a class must do, but not how it does it.
An Abstract Class is a class that cannot be instantiated on its own and can include abstract methods (without an implementation) as well as methods with implementation. Abstract classes are used to provide a common definition of a base class that multiple derived classes can share.
Differences:

Interfaces support multiple implementations (a class can implement multiple interfaces), while a class can inherit from only one abstract class due to Java's single inheritance rule.
Abstract classes can have instance variables and constructors, whereas interfaces cannot.
Abstract methods in abstract classes can have any visibility (public, protected, private), while methods in interfaces are implicitly public (and abstract).
Starting from Java 8, interfaces can have static and default methods with implementations, adding more flexibility to how they can be used.

15. design a parking lot (put the code to codingQuestions/coding1 folder)

Please refer to the code in [ParkingLot.java](../Coding/coding1/ParkingLot.java) for details.

16. What are Queue interface implementations and what are the differences and when to use what?

LinkedList: Implements both List and Queue interfaces. It allows for constant-time insertions and removals and can be used as a general-purpose queue.

PriorityQueue: An implementation that orders its elements according to their natural ordering or by a Comparator provided at queue construction time. It does not ensure FIFO order but instead orders elements according to priority, making it suitable for priority-based scheduling.

ArrayDeque: A resizable-array implementation of the Deque interface, it can be used as both a last-in-first-out (LIFO) stack and a first-in-first-out (FIFO) queue. It's more efficient than Stack when used as a stack and more efficient than LinkedList when used as a queue.

Use LinkedList when you need a general-purpose queue without the need for concurrency.

Use PriorityQueue when elements need to be processed based on priority rather than in FIFO order.

Use ArrayDeque for efficient FIFO or LIFO operations.
