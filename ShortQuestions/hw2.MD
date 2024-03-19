2.  What is wrapper class in Java and Why we need wrapper class?

A wrapper class is a class that encapsulates (wraps) a primitive data type, providing it with object-like behavior and additional methods to work with that primitive data type.

3.  What is the difference between HashMap and HashTable?

Hashtable is synchronized, which means it is thread-safe. In contrast, HashMap is not synchronized by default.
Hashtable does not allow null keys or null values, while HashMap allows one null key and any number of null values.
Due to the extra overhead of synchronization, HashMap is generally faster than Hashtable for single-threaded applications.

4.  What is String pool in Java and why we need String pool?

In Java, the String pool is a special memory area in the Java heap that stores and reuses string literals. The String pool is used to improve memory efficiency and performance when working with String objects.

5.  What is Java garbage collection?

Java Garbage Collection (GC) is an automatic memory management mechanism in the Java Virtual Machine (JVM) that periodically reclaims memory occupied by objects that are no longer in use by the running program.

6.  What are access modifiers and their scopes in Java?

In Java, access modifiers are keywords used to control the visibility and accessibility of classes, variables, methods, and constructors.

public: Accessible from any class and any package.

Protected: Accessible within the same package and by subclasses in any package.

Default: Accessible within the same package only.

Private: Accessible only within the same class.

7.  What is final key word? (Filed, Method, Class)

A final variable is a constant whose value cannot be changed once it is initialized.

A final method cannot be overridden by any subclasses.

A final class cannot be extended or inherited by any other class.

8.  What is static keyword? (Filed, Method, Class). When do we usually use it?

Static variables are initialized when the class is loaded into memory, and only one copy exists for the entire class.
Static variables are typically used to store class-level data or constants.

Static methods belong to the class itself, not instances of the class. They can be invoked without creating an object of the class.
Static methods are commonly used for utility or helper functions that don't require object instantiation.

A static inner class is a nested class that is associated with the class itself rather than instances of the outer class.
A good use of a static class is in defining one-off, utility and/or library classes where instantiation would not make sense.

9.  What is the differences between overriding and overloading?

Overriding occurs when a subclass provides its own implementation of a method that is already defined in its superclass.
The method in the subclass must have the same signature (method name, return type, and parameter list) as the method in the superclass.
Overriding is a way to achieve runtime polymorphism, where the actual method implementation is determined at runtime based on the object's type.

Overloading occurs within the same class when there are multiple methods with the same name but different parameter lists (number, types, or order of parameters).
The return type of the overloaded methods can be the same or different.
Overloading is a way to achieve compile-time polymorphism or static binding, where the method to be called is determined at compile-time based on the arguments passed.


10.  What is the differences between super and this?

The this keyword refers to the current object instance.
The super keyword is used to refer to the superclass (parent class) members.

11. What is the Java load sequence?

    1. Load the JRE.
    2. Load the Bootstrap Class Loader.
    3. Load the Extension Class Loader.
    4. Load the System Class Loader.
    5. Load the Main Class.
    6. Execute the static initializers.
    7. Execute the main() method.


12.  What is Polymorphism ? And how Java implements it ?

Polymorphism is the ability of objects to take on many forms or shapes.
Java implements polymorphism in two ways: Overriding (dynamic Polymorphism) and Overloading (static Polymorphism).

13.  What is Encapsulation ? How Java implements it? And why we need encapsulation?

Encapsulation is a way of hiding the internal implementation details of an object from the outside world.
Java implements encapsulation through the use of access modifiers and the concepts of classes and objects.
We need encapsulation to improve code modularity, maintainability, and data integrity.


14.  What is Interface and what is abstract class? What are the differences between them?

Interface:
* An interface is a blueprint or a contract that defines a set of methods, constants, and static methods that a class must implement or provide.
* It cannot have method implementations, except for default and static methods.
* A class can implement multiple interfaces.
* Variables declared in an interface are implicitly public, static, and final.
* An interface does not have a constructor.

Abstract Class:
* An abstract class is a class that cannot be instantiated.
* It can have both abstract and non-abstract methods.
* An abstract class can have instance variables and constructors.
* A class can extend only one abstract class.

16.  What are Queue interface implementations and what are the differences and when to use what?

LinkedList:
* LinkedList implements both the List and Queue interfaces.
* It is a doubly-linked list implementation, which provides efficient enqueue and dequeue operations at both ends.

PriorityQueue:
* an unbounded queue implementation that prioritizes elements based on their natural ordering or a custom Comparator.
* It does not follow the FIFO order but instead orders elements based on their priority.


ArrayBlockingQueue:
* A bounded blocking queue backed by an array. It blocks when trying to add to a full queue or trying to take from an empty queue.
* Useful in producer-consumer scenarios where you want to limit the number of elements a producer can create before blocking.

