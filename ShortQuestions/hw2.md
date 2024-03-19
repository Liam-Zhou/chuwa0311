#### 1. Write up Example code to demonstrate the three foundmental concepts of OOP.(reference Code Demo repo as example)

Encapsulation; 

```java
// File: Account.java
public class Account {
    private double balance; // Private variable, encapsulated within the class

    public Account(double initialBalance) {
        if (initialBalance > 0) {
            this.balance = initialBalance;
        }
    }

    // Getter method for balance
    public double getBalance() {
        return balance;
    }

    // Method to deposit amount
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Method to withdraw amount
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }
}
```
Polymorphism; 

```java
// File: Shape.java
public abstract class Shape {
    public abstract void draw();
}

// File: Circle.java
public class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

// File: Square.java
public class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a square");
    }
}

// File: Main.java
public class Main {
    public static void main(String[] args) {
        Shape shape1 = new Circle();
        Shape shape2 = new Square();

        shape1.draw(); // Prints "Drawing a circle"
        shape2.draw(); // Prints "Drawing a square"
    }
}

```

Inheritance

```java
// File: Animal.java
public class Animal {
    public void eat() {
        System.out.println("This animal eats food");
    }
}

// File: Dog.java
public class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("Dog eats dog food");
    }

    public void bark() {
        System.out.println("Dog barks");
    }
}

// File: InheritanceDemo.java
public class InheritanceDemo {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat(); // Prints "Dog eats dog food"
        myDog.bark(); // Prints "Dog barks"
    }
}

```



#### 2. What is wrapper class in Java and Why we need wrapper class?

A **wrapper class** in Java is a class whose object wraps or contains a primitive data type. These classes fall within the java.lang package and serve as the object representation of the eight primitive data types. For instance, the `Integer` class wraps a value of the primitive type `int`.

We need wrapper classes for several reasons:

1. **To use in Collections:** Java collections store objects, not primitive types. Wrapper classes enable the use of primitive data types in collections like `ArrayList`, `HashSet`, etc.
2. **To utilize method functionalities:** Wrapper classes provide a range of methods for converting between types, comparing, and managing values more efficiently than what's available with primitive types directly.
3. **To support null values:** Primitive types can't hold `null` values, which represent the absence of a value. Wrapper classes, being objects, can hold `null`, allowing for more nuanced control over data handling and validation.
4. **To facilitate object-oriented operations:** Java is an object-oriented programming language, and using wrapper classes allows primitive types to be manipulated as objects, making it possible to apply class-specific methods and techniques to these values.



#### 3. What is the difference between **HashMap **and **HashTable**?

`HashMap` and `HashTable` are both key-value pair collections in Java but differ significantly in several aspects:

1. **Synchronization:**
   - **HashTable** is <u>synchronized, meaning it's thread-safe</u>. If multiple threads access a Hashtable simultaneously, it ensures the integrity of the data.
   - **HashMap** is not synchronized, making it not thread-safe but more performant in environments where synchronization is not a concern.
2. **Null keys and null values:**
   - **HashMap** allows one null key and any number of null values, making it more flexible in handling data.
   - **HashTable** does not allow null keys or null values, throwing a `NullPointerException` if attempted.
3. **Iteration:**
   - **HashMap** provides an iterator to traverse the key-value pairs, which is fail-fast. It means if the HashMap is modified after the creation of the iterator (except through the iterator’s own remove method), it will throw a `ConcurrentModificationException`.
   - **HashTable** provides an enumerator and also an iterator for traversing, but its enumerator is not fail-fast.
4. **Inheritance:**
   - **HashMap** is a part of the Java Collections Framework (JCF) and inherits AbstractMap class.
   - **HashTable** is a legacy class and was part of the original version of Java. It inherits the Dictionary class.
5. **Performance:**
   - Because **HashMap** is not synchronized, it tends to perform better in situations where threading is not a concern.
   - The synchronization of **HashTable** adds overhead that can lead to it being slower than **HashMap** in single-threaded scenarios.
6. **Concurrency Control:**
   - For multi-threaded environments, instead of **HashTable**, one might consider **ConcurrentHashMap**, which offers better concurrency than **HashTable** while maintaining thread safety.



#### 4. What is **String pool**in Java and why we need String pool?

The **String Pool** in Java, also known as the String Intern Pool, is a special storage area in the Java Heap memory. It is used to store unique string literals. When a string is created in Java using string literals (e.g., `String s = "Hello";`), the JVM checks the String Pool first. If the string already exists in the pool, a reference to the pooled instance is returned instead of creating a new object. If the string does not exist in the pool, a new string instance is created in the pool, and its reference is returned.

The need for the String Pool arises from the following reasons:

1. **Memory Efficiency:** By reusing immutable string literals, Java significantly reduces the amount of memory needed for string storage. This is especially beneficial because strings are widely used in Java programs.
2. **Performance Improvement:** Accessing an existing string from the pool is faster than creating a new string object, thus improving the performance of string operations, particularly in scenarios involving string comparison and concatenation.
3. **String Immutability:** Since strings are immutable in Java (i.e., their state cannot be changed after they are created), reusing existing strings from the pool is feasible without the risk of accidental modifications.
4. **Reduced Garbage Collection Overhead:** Reusing strings from the pool decreases the number of string objects created, which in turn reduces the load on the garbage collector, leading to better performance of the Java application.



#### 5. What is Java **garbage collection**?

Java **garbage collection** (GC) is an automatic memory management feature that helps free up memory space by removing objects that are no longer in use by any part of the program. When objects are created in Java, they are stored in the heap memory. Over time, some objects may no longer be needed; if they remain in memory, they can waste valuable memory resources and potentially lead to memory leaks.



#### 6. What are access modifiers and their scopes in Java?
Access modifiers in Java are keywords used before class, method, or variable declarations to control their visibility and accessibility from other parts of the program. There are four main access modifiers in Java, each providing a different level of access:

1. **`public`**: The member is accessible from any other class in any package. This offers the least restrictive level of access.
2. **`protected`**: The member is accessible within its own package and by subclasses (including subclasses outside its package). This provides a medium level of access control, allowing more access than the default (no modifier) but less than `public`.
3. **`default`** (no modifier): When no access modifier is specified, the member is accessible only within its own package. This is more restrictive than `protected` and is often referred to as package-private access.
4. **`private`**: The member is accessible only within its own class. This is the most restrictive level of access.



#### 7.  What is final key word?(Field, Method, Class)

The `final` keyword in Java is a modifier applied to classes, methods, and variables. It has a different effect depending on its context of use:

1. **Final Variable**: When a variable is declared with the `final` keyword, its value cannot be modified once it has been assigned. This essentially makes the variable a constant. This applies to both primitive types, where the value cannot change, and reference types, where the reference cannot change, although the object it points to can still be modified if it's mutable. For example, `final int MAX_VALUE = 5;` means `MAX_VALUE` will always be 5.
2. **Final Method**: A method declared as final cannot be overridden by subclasses. This is useful when you want to lock down the method's behavior to prevent any subclass from altering it, ensuring consistent behavior across all instances of the object. For instance, `public final void show() { ... }` means the `show()` method cannot be overridden in any subclass.
3. **Final Class**: When a class is declared as final, it cannot be subclassed. This is particularly useful for creating immutable classes or securing classes by preventing other classes from inheriting and potentially altering their behavior. An example would be `public final class Constants { ... }`, which means no class can extend `Constants`.

The use of `final` provides several benefits:

- **Immutability**: It enables the creation of immutable classes, which are thread-safe and can be shared freely without locking or defensive copying.
- **Security and Safety**: It prevents unintended behavior or security breaches by restricting inheritance and overriding.
- **Design Clarity**: It makes your design intention clear, signaling that a class, method, or variable is complete in its current form and should not be changed or extended.
- **Performance Optimization**: In some cases, the use of `final` allows the Java compiler and runtime to make optimizations, such as inline method calls, because it knows the method will not change in subclasses.



#### 8. What is static keyword?(Field, Method, Class) When do we usually use it?

The `static` keyword in Java is used to indicate that a particular field, method, or inner class is associated with a class rather than instances of that class. This means that the `static` member can be accessed without creating an instance of the class.

1. **Static Field (Variable)**: A `static` field is shared among all instances of a class. It is used to represent class-specific information that should be common to all objects of that class. For example, a static variable could be used to keep track of the number of objects created from that class.
2. **Static Method**: A `static` method belongs to the class rather than any object of the class and can be invoked without the need for creating an instance of the class. Static methods can access static data members and can change the value of it. However, they cannot access instance variables or methods directly; they must use an object reference to do so.
3. **Static Class (Inner Class)**: A `static` inner class is a nested class which does not implicitly associate with an instance of the outer class. It can be created and accessed independently of an outer class instance, and it can only access the outer class's static fields and methods.

### When to Use `static`

- **Constants**: Use `static final` for defining constants. Constants are variables that never change from their initial value.
- **Utility or Helper Methods**: For methods that do not require any object state since they receive all information from their arguments, such as mathematical operations or functions.
- **Counter Variables**: To keep track of global counts or serial numbers across instances of a class.
- **Singleton Design Pattern**: The `static` keyword is used in the Singleton pattern to ensure that only one instance of a class is created throughout the execution of a program.
- **Factory Methods**: Static methods are often used for factory methods, which are methods that return an instance of the class based on different parameters.

The use of `static` can make your program more efficient by reducing the overhead of multiple instances when a single instance or a utility method is sufficient. However, overuse of static members can lead to code that is less modular and harder to test, and it can cause issues with class dependencies. Therefore, it's important to use the `static` keyword judiciously, keeping in mind the specific needs of your application and adhering to good object-oriented design principles.



#### 9. What is the differences between overriding and overloading?

Overriding

- **Definition**: Overriding happens when a subclass has a method with the same name, return type, and parameters as a method in its superclass. The method in the subclass "overrides" the method in the superclass, providing its own implementation.

- **Purpose**: It's used to change or extend the behavior of a superclass method in a subclass.

- Rules

  :

  - The method must have the same name, return type, and parameters as in the superclass.
  - The access level can't be more restrictive than the original method's.
  - A method marked as `final` cannot be overridden.
  - Only instance methods can be overridden, not static methods.
  - The overriding method can throw checked exceptions if the superclass method does, but it cannot throw broader checked exceptions than those declared by the superclass method.

Overloading

- **Definition**: Overloading occurs when two or more methods in the same class have the same name but different parameters (different type, number, or both).

- **Purpose**: It's used to let methods perform similar functions but with different types or numbers of inputs.

- Rules

  :

  - Methods must have the same name but different parameter lists (either in type, order, or number of parameters).
  - Overloaded methods can have different return types and different access modifiers.
  - It applies to both static and instance methods.



#### 10. What is the differences between super and this?

### `this` Keyword

- **Purpose**: The `this` keyword is used to refer to the current instance of the class in which it's used. It's often used to differentiate between class fields and parameters or local variables with the same name.

- Usage

  :

  - **Referencing Fields**: Helps to distinguish between instance variables and parameters with the same name.
  - **Invoking Constructors**: Allows a constructor to invoke another constructor in the same class using `this()` with the appropriate parameters.
  - **Method Calls**: Can be used to call other methods of the same class using the current object context.
  - **Returning the current instance**: Useful in methods where you want to return the current object.

### `super` Keyword

- **Purpose**: The `super` keyword is used to refer to the superclass (parent class) of the current instance. It's used to access or call the superclass's methods and constructors that are overridden or hidden in the subclass.

- Usage

  :

  - **Accessing Superclass Methods**: Allows a subclass to call a method of its superclass, especially useful when overriding methods to add additional functionality rather than replace it entirely.
  - **Invoking Superclass Constructors**: Used in a subclass's constructor to call the superclass's constructor, either explicitly or implicitly (if not specified, the default constructor is called).
  - **Accessing Fields**: Can be used to reference fields in the superclass that are hidden by fields in the subclass with the same name.



#### 11. What is the Java load sequence?

The Java class loading sequence refers to the process by which Java runtime loads classes when they are needed. This sequence is part of Java's runtime class loading mechanism, allowing Java applications to be dynamic and flexible. The process can be described in the following steps:

1. **Loading**: The class loader reads the `.class` file (bytecode) from the file system, network, or other sources and converts it into a `Class` object in the heap memory. This step is performed by an instance of the class loader.
2. **Linking**:
   - **Verification**: Checks the correctness of the bytecode, ensuring it adheres to the Java language specification and does not violate JVM's internal security constraints.
   - **Preparation**: Allocates memory for class variables and initializing the memory to default values.
   - **Resolution**: Transforms symbolic references from the type into direct references. It involves finding other classes that are referenced by the class being loaded and ensuring all the references to other classes, methods, and fields are resolved.
3. **Initialization**: Executes static initializers and static initialization blocks in the order they appear in the class definition. This step initializes class variables to their proper starting values.



#### 12. What is Polymorphism? And how Java implements it?

Polymorphism is a fundamental concept in object-oriented programming (OOP) that allows objects of different classes to be treated as objects of a common superclass. It's a Greek word meaning "many shapes," reflecting the ability of a single function or entity to represent different types in different contexts. In Java, polymorphism enables a single interface to be used for a general class of actions. The specific action is determined by the exact nature of the situation.

There are two main types of polymorphism in Java:

1. **Compile-time Polymorphism (Static Polymorphism)**: This type is achieved through method overloading. Method overloading means having multiple methods in the same class with the same name but different parameters (different number, type, or both). The compiler determines which version of the method to call at compile time based on the method signature.
2. **Runtime Polymorphism (Dynamic Polymorphism)**: This type is achieved through method overriding. Method overriding occurs when a subclass provides a specific implementation of a method already provided by one of its superclasses. The decision about which method implementation to use is made at runtime, based on the object type (not the reference type).



#### 13. What is Encapsulation? How Java implements it? And why we need encapsulation?


Encapsulation is a fundamental concept in object-oriented programming (OOP) that involves bundling the data (attributes) and methods (functions) that operate on the data into a single unit, or class, and restricting access to some of the object's components. This concept is often described as "data hiding" because it enables an object to hide its internal state and require that all interaction be performed through an object's methods, providing a controlled interface to that object's data.

### How Java Implements Encapsulation

In Java, encapsulation is implemented using access modifiers with classes, fields, and methods to control access levels. The four access modifiers are:

- `private`: The field or method is accessible only within its own class.
- `default` (no modifier): The field or method is accessible only within classes in the same package.
- `protected`: The field or method is accessible within all classes in the same package and subclasses in other packages.
- `public`: The field or method is accessible from any other class.

To achieve encapsulation in Java:

1. **Declare the variables of a class as `private`.**
2. **Provide `public` getter and setter methods to modify and view the variables' values.**

Why we need encapsulation?

1. **Control of the internal state**: Encapsulation prevents clients of a class from directly changing its internal state in ways that might leave it in an inconsistent state or expose sensitive data.
2. **Increased Flexibility and Maintainability**: Encapsulated classes can change their internal implementation without breaking the code that uses them, as long as the interface to the class remains unchanged.
3. **Modularity**: Encapsulation enhances the modularity of the application by keeping classes separated and preventing them from tightly coupling with each other.
4. **Security**: By hiding the implementation details and exposing only what is necessary, encapsulation adds a layer of security to the application.



#### 14. What is **Interface** and what is **abstract** class? What are the differences between them?

In Java, both interfaces and abstract classes are used to achieve abstraction, allowing you to define a required structure without providing a full implementation. However, they serve different purposes and have distinct characteristics.

Interface

An **interface** in Java is a reference type, similar to a class, that can contain only constants, method signatures, default methods, static methods, and nested types. Interfaces cannot contain instance fields. The methods in interfaces are abstract by default, which means they do not have a body and must be implemented by classes that choose to implement the interface.

- **Purpose**: Interfaces are used to define a contract for what a class can do, without specifying how it does it.
- **Usage**: A class can implement multiple interfaces, allowing Java to overcome the limitation of single inheritance.

Abstract Class

An **abstract class** is a class that cannot be instantiated on its own and must be subclassed. It can contain abstract methods (methods without a body) as well as concrete methods (methods with a body). Abstract classes are used to provide a common definition of a base class that multiple derived classes can share.

- **Purpose**: Abstract classes are used when you want to share code among several closely related classes.
- **Usage**: A class can extend only one abstract class, thus abstract classes are used when classes share a common structure or behavior.

Differences between Interface and Abstract Class

1. **Multiple Implementations**:
   - **Interface**: A class can implement multiple interfaces.
   - **Abstract Class**: A class can extend only one abstract class.
2. **Method Implementation**:
   - **Interface**: Cannot have fully implemented methods (except default methods and static methods in Java 8 and later).
   - **Abstract Class**: Can have fully implemented methods.
3. **Constructor**:
   - **Interface**: Interfaces cannot have constructors.
   - **Abstract Class**: Abstract classes can have constructors.
4. **Instance Variables**:
   - **Interface**: Cannot have instance variables. Variables declared in an interface are implicitly public, static, and final.
   - **Abstract Class**: Can have instance variables.
5. **Access Modifiers**:
   - **Interface**: All methods in interfaces are implicitly public.
   - **Abstract Class**: Methods in an abstract class can have any access modifier.
6. **Usage Scenarios**:
   - **Interface**: Use an interface when various implementations only share method signatures.
   - **Abstract Class**: Use an abstract class when classes share a common implementation.
7. **New Features (Java 8 and later)**:
   - **Interface**: Java 8 introduced default and static methods in interfaces, allowing interfaces to have methods with a default implementation.



#### 15. Design a parking lot (put the code to **codingQuestions**/coding1 folder)

- [x] 



#### 16. What are Queue interface implementations and what are the differences and when to use what?

The Queue interface in Java is part of the Java Collections Framework and represents a collection designed for holding elements prior to processing. Queues typically, but not necessarily, order elements in a FIFO (first-in-first-out) manner. There are several implementations of the Queue interface in Java, each with its specific use cases:

1. LinkedList

- **Characteristics**: Implements both List and Queue interfaces. It stores its elements in a doubly linked list format.
- **Use Cases**: Useful when you need a Queue and a List's functionalities, such as dynamic resizing and easy insertion/removal from the beginning or end.
- **Performance**: Good for frequent insertions and deletions.

2. PriorityQueue

- **Characteristics**: An unbounded priority queue based on a priority heap. Elements of the PriorityQueue are ordered according to their natural ordering, or by a Comparator provided at queue construction time.
- **Use Cases**: Use when you need to process elements based on their priority rather than just FIFO.
- **Performance**: Offers efficient removal of the highest or lowest priority element.

3. ArrayBlockingQueue

- **Characteristics**: A bounded blocking queue backed by an array. This queue orders elements FIFO. Attempts to put an element into a full queue will result in the operation blocking; similarly, attempts to take an element from an empty queue will be blocked.
- **Use Cases**: Suitable for producer-consumer scenarios where you need to safely share data between multiple threads without additional synchronization.
- **Performance**: Good for high concurrency situations but with a fixed capacity.

4. LinkedBlockingQueue

- **Characteristics**: An optionally bounded blocking queue based on linked nodes. This queue orders elements FIFO.
- **Use Cases**: Similar to ArrayBlockingQueue but with the option to be unbounded. Ideal for producer-consumer scenarios where you want the flexibility of dynamic resizing.
- **Performance**: Better throughput than ArrayBlockingQueue in most concurrent scenarios.

5. PriorityBlockingQueue

- **Characteristics**: An unbounded blocking queue that uses the same ordering rules as PriorityQueue and supplies blocking retrieval operations.
- **Use Cases**: Useful in concurrent programming when processing elements asynchronously based on their priority.
- **Performance**: Provides priority-based processing in a thread-safe manner.

6. DelayQueue

- **Characteristics**: An unbounded blocking queue of Delayed elements, in which an element can only be taken when its delay has expired.
- **Use Cases**: Ideal for scheduling tasks to be executed after a certain delay.
- **Performance**: Handles timed scheduling efficiently.

When to Use What?

- **FIFO Operations**: `LinkedList`, `ArrayBlockingQueue`, or `LinkedBlockingQueue`.
- **Priority-Based Processing**: `PriorityQueue` or `PriorityBlockingQueue` for concurrent scenarios.
- **Thread-Safe Producer-Consumer**: `ArrayBlockingQueue` or `LinkedBlockingQueue` for bounded queues, `LinkedBlockingQueue` for optionally bounded queues.
- **Scheduled or Timed Processing**: `DelayQueue`.