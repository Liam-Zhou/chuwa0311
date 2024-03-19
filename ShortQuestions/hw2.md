1.
public class Cat {
	private String name;
	private int age;
	public Cat(String name, int age){
		this.name = name;
		this.age = age;
	}
	public void makeSound() {
		System.out.println(name + " is barking.");
	}
	...
}

class Ragdoll extends Cat {
	private String furColor;
	public Ragdoll(String name, int age, String furColor) {
		super(name, age);
		this.furColor = furColor;
	}
	@Override
	public void makeSound() {
		System.out.println(furColor+ " " + name + " is barking.");
	} 
}

2. A class encapsulates the primitive data type into an object.
Reasons: 1. we could use these primitive data types in contexts that need an object like ArrayList do now allow int but Integer. 2. It can be null and type conversion.

3. a) Hashtable is synchronized but HashMap is not; b) In hashtable, null is not allowed; c) HashMap is non-legacy; d) HashMap can have multiple threads operated simultaneously.

4. A special memory area in the Java heap that stores a pool of string literals. Reasons: save memory, performance optimization, string immutability.

5. An automatic memory management process that deallocates memory occupied by objects that are no longer referenced.

6. Keywords that are used to control the accessibility or visibility of classes, variables, methods, and constructors within Java programs.
public: can be accessed from any other class or package;
protected: the associated class, method, or variable to be accessed from within the same package or by subclasses;
default: the associated class, method, or variable to be accessed only from within the same package;
private: be accessed only within the same class.

7.
Field: the final keyword indicates that the field's value cannot be changed after initialization;
Method: the final keyword indicates that the method cannot be overridden by subclasses;
Class: the class cannot be subclassed or extended

8.
Used to create members (fields, methods, and nested classes) that belong to the class itself rather than to instances of the class.
Field: the field is a class-level variable, shared among all instances of the class;
Method: the method is a class-level method, not tied to any specific instance of the class. Static methods can be called directly using the class name, without creating an object of the class. They can access static fields and other static methods directly;
Nested class: it is associated with the outer class but does not have access to non-static members of the outer class.

Usage: For constants or shared variables that are common across all instances of a class (static fields).
For utility methods that perform common operations and do not require access to instance variables (static methods).
For static nested classes that are closely related to the outer class but do not depend on its instance variables.

9.
Overriding occurs when a subclass provides a specific implementation for a method that is already defined in its superclass; Overloading occurs when multiple methods in the same class (or subclass) have the same name but different parameter lists (different types or different number of parameters). The return type can be the same or different.

10.
The super keyword is used to refer to the superclass (parent class) of the current object or to invoke superclass constructors, methods, or variables; The this keyword is used to refer to the current object (instance of the class) itself. 

11.
A specific sequence that includes loading, linking, and initialization stages.

12.
It allows objects to be treated as instances of their parent class or interface, enabling different classes to be used interchangeably through a common interface.
Use overriding and overloading to implement.

13.
A fundamental concept that involves bundling the data (attributes or fields) and methods (functions or behaviors) that operate on the data into a single unit called a class.
Implement: use Access Modifiers, Getter and Setter Methods
Reason: Data Hiding, Data Validation and Access Control, Modularity for easier usage.

14.
Interface: a reference type defines a set of abstract methods without any contents and constant variables;
Abstract class: a class that cannot be instantiated directly and may contain both abstract methods and concrete methods.

Interface cannot have constructors but abstract class could; Abstract Class can contain both abstract methods and concrete methods but interface could only have abstract methods.

15.
see in coding1 folder

16.
The Queue interface represents a collection of elements that follow the FIFO (First-In-First-Out) order. Some examples like LinkedList and PriorityQueue: LinkedList provides a doubly linked list-based implementation of a queue. It allows for efficient element insertion and removal from both ends of the queue. While PriorityQueue provides an unbounded priority queue based on a priority heap.
