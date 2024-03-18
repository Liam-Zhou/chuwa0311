##HW2
###[1.  Write up Example code to demonstrate the three foundmental concepts of OOP. ]()
- Encapsulation:
```java
class Dog {
  private String name;
  private int age;
  public Dog(String name, int age) {
    this.name = name;
    this.age = age;
  }
  public setName(String name) {
    this.name = name;  
  }
  public getName(String name) {
    return name;
  }
}
class Test {
  public static void main(String[] args) {
    Dog dog = new Dog();
    dog.setName("Cola");
    System.out.println(dog.getName()); // output Cola
  }
}
```
- Polymorphism
```java
class Animal {

  public void eat() {
    System.out.println("eat food");
  }
}

class Dog extends Animal {

  @Override
  public void eat() {
    System.out.println("eat bones");
  }
}
class Cat extends Animal {

  @Override
  public void eat() {
    System.out.println("eat meats");
  }
}
class Test {
  public static void main(String[] args) {
    Dog dog = new Dog();
    System.out.println(dog.eat()); // eat bones
    Cat cat = new Cat();
    System.out.println(cat.eat()); // eat meats
  }
}
```
- Inheritance
```java
class Dog extends Animal {

  @Override
  public void eat() {
    System.out.println("eat bones");
  }
}
class Cat extends Animal {

  @Override
  public void eat() {
    System.out.println("eat meats");
  }
}
```
###[2.  What is wrapper class in Java and Why we need wrapper class?]()
- A **wrapper class** in Java is one of the eight classes provided in the java.lang package that 
corresponds to each of the eight primitive data types in Java. These classes "wrap" the primitive 
data types in an object, allowing primitives to be used as though they are objects.

    ###why?
- In Java, **everything** is an object, except primitive data types. There are situations, like when 
working with collection classes such as ArrayList, where you can only store objects.
Wrapper classes allow primitive data types to be used in such scenarios by treating them as objects.
- **Wrapper classes** provide a plethora of utility methods for primitives, such as methods for 
converting values to and from other primitive types, converting values to and from strings, and 
methods for comparing values.
- **Primitive data types** cannot be null in Java, but their wrapper classes can hold null, allowing 
them to represent the absence of a value.

###[3.  What is the difference between HashMap and HashTable?]()
- **Synchronization**

   HashTable is synchronized. This means it is thread-safe and can be shared between multiple 
   threads without causing a data inconsistency problem. However, this also means it is generally 
   slower than HashMap because of this overhead.
   HashMap is not synchronized by default, making it not thread-safe without external 
   synchronization but faster in environments where synchronization is not needed. 
- **Null Keys and Null Values**

   HashTable does not allow null keys or null values. Attempting to insert a null key or null value 
   throws a NullPointerException.
   HashMap allows one null key and multiple null values, making it more flexible in certain use cases.
- **Performance**

  Because HashTable is synchronized, it generally has worse performance than HashMap, particularly 
  in scenarios where thread safety is not a concern. HashMap offers better performance in 
  single-threaded or lock-controlled environments due to the lack of synchronization overhead.
###[4.  What is String pool in Java and why we need String pool?]()
- The **String Pool** in Java, also known as the String Intern Pool, is a special storage area in the 
Java heap memory. It is used to store unique string literals. Strings in Java are immutable, 
meaning once a string is created, it cannot be changed. This characteristic makes string 
manipulation operations costly in terms of memory and performance. The String Pool helps mitigate 
these costs by reusing instances of strings.
- When a string literal is created in Java, the JVM checks the String Pool first to see if an 
identical string already exists. If it does, the reference to the existing string is returned 
instead of creating a new object. If the string doesn't exist in the pool, a new string instance 
is created in the pool, and its reference is returned.

    ###Why
    By storing only one copy of each distinct string literal, the String Pool significantly reduces 
memory usage, especially in applications that use many strings or frequently create identical strings.
###[5.  What is Java garbage collection?]()

- **Garbage collection** is an automatic memory management process that Java uses to help developers 
avoid memory leaks and manage memory more efficiently. In Java, objects are dynamically allocated 
memory in the heap space, and this memory must be reclaimed once the objects are no longer needed, 
to prevent memory from being exhausted over time.

###[6.  What are access modifiers and their scopes in Java?]()
- **public**:

    **Classes**: Can be accessed from any other class or package.
**Methods/Fields**: Can be accessed from any class and package.
- **protected**:
**Methods/Fields**: Can be accessed within the same package or in subclasses located in any package. 
Cannot be applied to classes at the top level (i.e., not nested classes).
- **default** (Package-Private):
**Classes/Methods/Fields**: Can only be accessed within classes in the same package.
- **private**:
**Methods/Fields**: Can only be accessed within the declaring class. Cannot be applied to classes at 
the top level, but can be applied to nested or inner classes.

###[7.  What is final key word? (Filed, Method, Class)]()
- **Final Variables**:
     When the final keyword is used with variables, it indicates that the variable's value cannot 
be modified once it is initialized. This applies to both primitive types, where the value cannot 
change, and reference types, where the reference cannot change to point to a different object after 
it is assigned. However, the state of the object that the reference points to can still be modified
unless the object itself is immutable.
- **Final Method**: A final method cannot be overridden by subclasses.
- **Final Class**: it cannot be subclassed. This is particularly useful when creating an immutable 
class or a class that provides critical security features that should not be altered by extending 
the class
###[8.  What is static keyword? (Filed, Method, Class). When do we usually use it?]()
  - **Static Fields**:

    A static field is shared by all instances of the class. This means that if you change the value 
of a static field in one instance, the change is reflected in all other instances. Static fields are
often used for constants or variables that should be common to all instances. 
  - **Static Methods**:

    Static methods belong to the class rather than any specific instance. They can be called without
creating an instance of the class. Static methods can only directly access static members and can’t 
access instance variables or methods directly.
  - **Static Classes** (Nested Classes Only)

    Static nested classes are declared static within another class. They can be instantiated without
an instance of the enclosing class and can't access the instance variables or methods of the 
outer class.
### when to use?
- **Constants**: 

    **Static fields** are used for defining constants. The final keyword is often used in conjunction 
with static to create class constants.
- **Static methods**:

    that perform a generic task unrelated to instance variables can be declared static. For example,
utility or helper methods that take input, process it, and return a result without requiring access 
to the state of an instance.
- **Counter or Tracker**: 

    Static fields can be used to count the number of instances of a class.

- **Nested Classes**: 

A static nested class is useful when it doesn’t need to access an outer class’s instance fields 
or methods
###[9.  What is the differences between overriding and overloading?]()
- **Method Overloading**:

    Method overloading occurs within a single class when two or more methods in the same class have
the same name but differ in parameters (different number of parameters, different types of 
parameters, or both).

    **Purpose**: It is used to increase the readability of the program and to perform a similar 
operation with different types or numbers of inputs.

    **Scope**: Within the same class.

    **Parameters**: Must differ in type, number, or order of parameters.

    **Return Type**: Can be different or the same for overloaded methods.

- **Method Overriding**:

    What it is: Method overriding happens when a subclass has a method with the same name, return 
type, and parameters as a method in its parent class.

    **Purpose**: It allows a subclass to provide a specific implementation of a method that is 
already provided by one of its parent classes, enabling polymorphism.

    **Scope**: Across two classes that have a parent-child relationship.

    **Parameters**: Must exactly match the parameters of the method in the parent class.

    **Return Type**: Must be the same as, or a subtype of, the return type declared in the method of 
the parent class
###[10.  What is the differences between super and this?]()
- **Reference Point**: this refers to the current object instance, while super refers to the 
superclass instance of the current object.
- **Purpose**: this is primarily used for accessing or modifying the properties and methods of the 
current instance. super is used to access or call the superclass's properties, methods, and 
constructors from the subclass context.
- **Constructor Calls**: this() is used for calling another constructor of the same class, whereas 
super() is used for calling the superclass constructor from a subclass.

###[11.  What is the Java load sequence?]()
**1. Loading**      
    **What Happens**: During this phase, the JVM loads the .class files (the compiled Java bytecode) that
    it requires. This includes the class you're running and any other classes referenced by that 
    class, directly or indirectly.  
   **How It Works**: Classes are loaded by class loaders in the JVM. There are three primary class loaders:     
   **Bootstrap Class Loader**: Loads the core Java API classes.
   **Extension Class Loader**: Loads the classes that are part of the Java extensions directory.
   **System/Application Class Loader**: Loads the classes that are found in the Java classpath, 
   which typically includes the classes we write.

**2. Linking**      
    After classes are loaded, they go through the linking process, which prepares them for execution.
    Linking involves three main activities:     
**Verification**: Ensures the correctness of the loaded class files, checking that they adhere to 
the Java Language Specification and do not violate access rights.
**Preparation**: Allocates memory for class variables and initializing the memory to default values.        
**Resolution**: Transforms symbolic references from the loaded class file into direct references. 
This is where the JVM figures out the actual memory locations of referenced classes.        
**3. Initialization**       
    **What Happens**: This is where class variables are initialized to their proper starting values, 
    and static initialization blocks are executed.
   **Order of Execution**:
   If the class has a superclass, initialize the superclass first (unless the superclass is already 
    initialized). Execute static variable declarations and static initializers in the order they 
    appear in the class.

###[12.  What is Polymorphism ? And how Java implements it ?]()
- **Polymorphism** describes the ability of a single interface or method to represent or operate on 
different underlying forms.
  **Static Polymorphism**: This is achieved through method overloading and operator overloading
  **Dynamic Polymorphism**: This is achieved through method overriding, where a subclass provides a 
specific implementation of a method that is already provided by one of its parent classes.
###[13.  What is Encapsulation ? How Java implements it? And why we need encapsulation?]()
**Access Modifiers**: Java provides access modifiers (private, protected, public, and package-private 
(default)) to set the accessibility of classes, methods, and variables. By using these access 
modifiers, Java allows you to control who can access the data and methods within a class.

**Getter and Setter Methods**: Java uses getter and setter methods to access and update the value of 
a private variable. This is a common practice where the variables of a class are made private, 
providing public get and set methods to access and modify the values of these variables.
###Why we need it    
- **Control Over Data**: Encapsulation provides control over the data by restricting who can access 
it. This helps to prevent accidental or unauthorized modifications.

- **Increased Flexibility and Maintainability**: By encapsulating the details of the implementation,
changes can be made to the encapsulated part without affecting other parts of the program that use 
the class. This makes the code more flexible and easier to maintain.

- **Improved Security**: Encapsulation allows for the implementation details to be hidden and 
protected from outside access, enhancing the security of the code.

- **Ease of Use and Reduced Complexity**: Encapsulation allows complex systems to be simplified from
the outside. Users of a class do not need to know its internal workings to use it, reducing the 
complexity they must deal with.
###[14.  What is Interface and what is abstract class? What are the differences between them?]()
**Multiple Inheritance**:

**Interface**: A class can implement multiple interfaces, allowing for a form of multiple inheritance.

**Abstract Class**: A class can extend only one abstract class because Java supports single inheritance 
for classes.

**Method Implementation**:

**Interface**: Before Java 8, interfaces could not provide any method implementation except for static 
methods. From Java 8 onwards, interfaces can provide implementations for default and static methods.

**Abstract Class**: Can provide an implementation for some or all of its members.

**Access Modifiers**:

**Interface**: All methods in interfaces are implicitly public. From Java 9, interfaces can also have 
private methods (static or instance) but are restricted to be accessible within the interface.

**Abstract Class**: Methods in an abstract class can have any access modifier.

**Fields**:

**Interface**: Fields in interfaces are automatically public, static, and final.

**Abstract Class**: Abstract classes can have instance fields, and the fields can have any access 
modifier.

**Constructors**:

**Interface**: Cannot have constructors because interfaces cannot be instantiated by themselves.

**Abstract Class**: Can have constructors, which can be called by subclasses during instantiation.

**Usage**:

**Interface**: Used to define a contract for classes without imposing any inheritance hierarchy.

**Abstract Class**: Used when classes share a common structure and behavior, serving as a superclass 
that provides common implementation to subclasses.

**Design Intent**:

**Interface**: Should be used when you want to specify what a class must do, but not how it does it.

**Abstract Class**: Should be used when you want to share code among several closely related classes.

###[16.  What are Queue interface implementations and what are the differences and when to use what?]()
- **LinkedList**

    **Characteristics**: Implements both List and Queue interfaces. It maintains elements in insertion 
order, allowing it to be used as a FIFO queue.

    **When to Use**: Use LinkedList when you need a FIFO queue and also need to perform frequent 
insertions and deletions of elements at the beginning or end of the list. It's also useful when you
need a queue and a list simultaneously.
- **PriorityQueue**

    **Characteristics**: An implementation of the queue interface that stores elements according to 
their natural ordering or according to a Comparator provided at queue construction time. It does 
not enforce FIFO order; instead, elements are ordered by priority.

    **When to Use**: Use PriorityQueue when you need elements processed based on their priority 
rather than the order they were added to the queue.
- **ArrayBlockingQueue**

    **Characteristics**: A bounded, blocking queue backed by an array. It blocks the thread trying to 
enqueue when the queue is full and blocks the thread trying to dequeue when the queue is empty.

    **When to Use**: Use ArrayBlockingQueue in producer-consumer scenarios where you need to safely 
share data between multiple threads and need to handle cases where the queue might be full or empty.
