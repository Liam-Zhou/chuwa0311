# 1. Write up Example code to demonstrate the three fundamental concepts of OOP. (reference Code Demo repo as example)
```java
// Encapsulation
public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }
}

// Polymorphism
// Method Overloading (Compile-Time Polymorphism)
class Calculator {
	public int add(int a, int b) {
		return a + b;
	}

	public int add(int a, int b, int c) {
		return a + b + c;
	}
}

// Method Overriding (Runtime Polymorphism)
class Animal {
	public void sound() {
		System.out.println("Animal makes a sound");
	}
}

class Dog extends Animal {
	@Override
	public void sound() {
		System.out.println("Dog barks");
	}
}

// Inheritance
// Superclass
public class Vehicle {
	private String brand;

	public Vehicle(String brand) {
		this.brand = brand;
	}

	public void honk() {
		System.out.println("Beep beep!");
	}

	public String getBrand() {
		return brand;
	}
}

// Subclass that extends Vehicle
public class Car extends Vehicle {
	private int numberOfSeats;

	public Car(String brand, int numberOfSeats) {
		super(brand); 
		this.numberOfSeats = numberOfSeats;
	}

	public void displayInfo() {
		System.out.println("Brand: " + getBrand() + ", Seats: " + numberOfSeats);
	}
}
```

# 2. What is wrapper class in Java and Why we need wrapper class?
Wrapper classes are a group of classes that provide a way to use primitive data types (int, boolean, char, etc.) as objects. Wrapper classes provide a range of utility methods for primitives.
Java's collection framework, such as ArrayList and HashMap, can only store objects, not primitive types. Wrapper classes allow primitives to be used in these collections.

# 3. What is the difference between HashMap and HashTable?
Use HashMap when you don't need synchronization, allowing for better performance. Use HashTable in a multi-threaded environment, but consider ConcurrentHashMap as a modern alternative.

# 4. What is String pool in Java and why we need String pool?
The String Pool in Java is a special storage area in the Java Heap memory. It's used to store a collection of String literals.
The String Pool helps in saving memory. Since strings are immutable in Java, the JVM can optimize the amount of memory allocated for strings by storing only one copy of each literal string in the pool.

# 5. What is Java garbage collection?
Java Garbage Collection is a process by which the JVM automatically identifies and frees up memory that is no longer in use, thus managing memory in the Java runtime environment

# 6. What are access modifiers and their scopes in Java?
There are Private, Protected, Public, Default.\
Private: Within class only.\
Default: Within package only.\
Protected: Within package and in subclasses outside the package.\
Public: Everywhere, no restriction.

# 7. What is final key word? (Filed, Method, Class)
The final keyword in Java is a modifier that can be applied to a class, method, or variable.\
When the final keyword is applied to a field, it means that once the field has been initialized, its value cannot be changed. It effectively makes the field a constant.\
A method declared as final cannot be overridden by subclasses. This is often done to prevent altering the behavior of a method, ensuring consistency and security.\
When a class is declared as final, it means that the class cannot be subclassed. This is particularly useful when creating an immutable class or a class that provides critical security features that should not be altered.

# 8. What is static keyword? (Filed, Method, Class). When do we usually use it?
The static keyword in Java is used to indicate that a particular member (field or method) belongs to the class, rather than instances of the class.\
A static field is shared by all instances of a class; there's only one copy of this field for the entire class, regardless of how many objects are created.\
Static methods belong to the class and not the instance. They can be called without an instance of the class.\
Static blocks are used for static initialization, executed when the class is first loaded into memory.\
A static nested class is associated with its outer class. Unlike inner classes, it doesn't have access to the instance variables and methods of the outer class.\
Static Fields: For shared constants or variables (like counters, configuration constants).\
Static Methods: For utility/helper functions, or when a method doesn't need access to instance data.\
Static Blocks: For complex static variable initialization.\
Static Nested Classes: For closely related helper classes.

# 9. What is the differences between overriding and overloading?
Overloading is about having the same method name with different parameters within the same class, and it's determined at compile-time.\
Overriding involves defining a method in the subclass that already exists in the superclass with the same method signature, and it's determined at runtime.

# 10. What is the differences between super and this?
this is about the current class: its constructors, methods, and variables.\
super is about the superclass: its constructors, methods, and variables.

# 11. What is the Java load sequence?
The Java class loading sequence refers to the process through which the Java Runtime Environment loads classes when a Java program is executed. This sequence involves several key steps,
including loading, linking, initialization, usage, and unloading

# 12. What is Polymorphism ? And how Java implements it ? 
polymorphism allows objects of different classes to be treated as objects of a common super class.\
There are Compile-Time Polymorphism and Runtime Polymorphism

# 13. What is Encapsulation ? How Java implements it? And why we need encapsulation?
Encapsulation means bundling of variables and methods that manipulate the data into a single class.\
This is done by setting private variables and offer public getter/setter for those variables\
It gives control over the data by providing getters and setters.

# 14. What is Interface and what is abstract class? What are the differences between them?
An Interface and an Abstract Class in Java are two different ways of achieving abstraction, which is one of the key principles of object-oriented programming.\
Interfaces cannot provide an implementation for their declared methods (except for default and static methods in Java 8 and later), whereas abstract classes can provide a mix of method implementations (both abstract and concrete methods).

# 15. design a parking lot (put the code to codingQuestions/coding1 folder, )

# 16. What are Queue interface implementations and what are the differences and when to use what? 
LinkedList: Good choice for general-purpose queue operations, especially when you also need list operations.\
PriorityQueue: Use when you need to process elements in a specific order (like min-max heap).\
ArrayDeque: Ideal for stacks (LIFO) and queues (FIFO) where elements are added and removed only from the ends.\
ConcurrentLinkedQueue: Use in multithreaded applications where threads share a single queue.\
BlockingQueue: Use when you need to wait for the queue to become non-empty when retrieving an element, and wait for space to become available in the queue when storing an element. 