# Homework 2

1. Write up Example code to demonstrate the three foundmental concepts of OOP.(reference Code Demo repo as example)

   1. Encapsulation;

      ```java
      public class Encapsulation{
        private String name;
        private int age;
        
        public void setName(String name) {
          this.name = name;
        }
        public void setAge(int age) {
          this.age = age;
        }
        
        public String getName() {
          return name;
        }
        public String getAge() {
          return age;
        }
      }
      ```

   2.  Polymorphism; 

      ```java
      class Animal{
      	public void run {
          System.out.println("Animal run.");
        }
      }
      class Cat extends Animal{
        @Overide
        public void run {
          System.out.println("Cat run.");
        }
      }
      class Dog extends Animal{
        @Overide
        public void run {
          System.out.println("Dog run.");
        }
      }
      ```

   3. Inheritance;

      ```java
      class Animal{}
      class Cat extends Animal{}
      class Dog extends Animal{}
      ```

   

2. What is **wrapper class**in Java and Why we need wrapper class?

   In Java, wrapper classes are the Object representation of eight primitive types. All primitive types in Java have an associated wrapper class. 

   We need wrapper classes in Java to convert primitive data types into objects, enabling them to be used in contexts requiring objects, like in collections. They also provide utility methods for primitives.

   

3. What is the difference between **HashMap** and **HashTable**?

   - **Synchronization**: `HashMap` is not synchronized; `HashTable` is synchronized.

   - **Null values**: `HashMap` allows one null key and multiple null values; `HashTable` allows neither.

   - **Performance**: `HashMap` is generally faster due to lack of synchronization.

   - **Iterators**: `HashMap` uses fail-fast iterators which means it can throw a `ConcurrentModificationException` if the map is modified while iterating. `HashTable` uses enumerators which is not fail-fast..

   - **Inheritance**: `HashMap` extends `AbstractMap`; `HashTable` extends `Dictionary`.

     

4. What is **String pool** in Java and why we need String pool?

   The **String Pool** in Java is a special memory area in the Java Heap where unique string literals are stored. When you create a string literal, Java checks the pool first; if the string already exists, the reference to the existing string is returned. If it doesn't exist, a new string is created in the pool and its reference is returned.

   The String Pool in Java is used for memory efficiency and faster string comparisons by reusing immutable string literals.

   

5. What is Java **garbage collection**?

   Java garbage collection is the process by which Java programs perform automatic memory management. The Java runtime identifies objects that are no longer being used by the program and reclaims their memory for reuse, helping to prevent memory leaks and reduce manual memory management tasks.

   

6. What are **access modifiers** and their scopes in Java?

   Access modifiers in Java control the visibility and accessibility of classes, methods, and variables. 

   - **private**: The member is accessible only within the same class.

   - **default** (no modifier): The member is accessible only within classes in the same package.

   - **protected**: The member is accessible within all classes in the same package and within subclasses, even if they are in different packages.

   - **public**: The member is accessible from any other class in the Java program.

     

7. What is **final** keyword? (Filed, Method, Class)

   - **Final Field**: When a field is declared as final, its value cannot be modified once it is initialized. Final fields must be initialized when they are declared or in the constructor. 

   - **Final Method**: A final method cannot be overridden by subclasses. This allows the original method to be preserved without any alteration in the class hierarchy.

   - **Final Class**: A final class cannot be subclassed. This is useful for maintaining security and integrity by preventing the alteration of behavior through inheritance.

     

8. What is **static** keyword ?(Filed, Method, Class). When do we usually use it?

   - **Static Field (Variable)**: A static field is shared among all instances of a class. It belongs to the class itself, rather than to any specific instance. 

     Static fields are often used for constants or variables that should be common to all instances.

   - **Static Method**: A static method belongs to the class rather than any particular object instance. It can be called without creating an instance of the class. 

     Static methods are used for operations that don't require any data from an instance of the class (instance variables).

   - **Static Class**: In Java, you can't declare an entire class as static; however, nested classes can be static. A static nested class does not require an instance of the enclosing class to be created. 

     Static nested classes are used when the nested class doesn't need to access an instance of the enclosing class.

     

9. What is the differences between **overriding** and **overloading**?

   **Overriding**:

   - Occurs when a subclass provides a specific implementation for a method that is already defined in its superclass.
   - Methods must have the same name, return type, and parameters.
   - Used for runtime polymorphism.

   **Overloading**:

   - Occurs when two or more methods in the same class have the same name but different parameters (type, number, or both).

   - Return type can be different.

   - Used for compile-time polymorphism (method resolution).

     

10. What is the differences between **super** and **this**?

    **super**:

    - Refers to the superclass (parent class) of an object.
    - Used to access methods and variables of the parent class.
    - Used to call the parent class's constructor.

    **this**:

    - Refers to the current instance of a class.

    - Used to access methods and variables of the current class.

    - Used to call another constructor in the same class.

      

11. What is the Java **load sequence**?

    In Java, the load sequence starts with the **Class Loading**, where the Java Virtual Machine (JVM) loads the class. This is followed by **Linking**, which includes Verification of the loaded class for correctness, Preparation where memory is allocated for class variables and initialized to default values, and Resolution where symbolic references are transformed into direct references. The sequence concludes with **Initialization**, during which static variables and blocks are initialized in order from the superclass down to the subclass, ensuring all static content is properly set up before the class is used in the application.

    

12. What is **Polymorphism** ? And how Java implements it ?

    In programming, **polymorphism** refers to the same object exhibiting different **forms and behaviors**. Java implements polymorphism by overloading and overriding.

    

13. What is **Encapsulation** ? How Java implements it? And why we need encapsulation?

    **Encapsulation** in OOP refers to binding the **data** and the **methods to manipulate that data** together in a single **unit** (class).

    Java implements Encapsulation through access modifiers like `private`, `public`, and `protected`. It allows for data hiding and modular code. We need encapsulation for data protection, code modularity, and ease of maintenance.

    

14. What is **Interface** and what is **abstract class** ? What are the differences between them?

    An **Interface** is blueprint for classes with abstract methods (no body) and Java 8 onwards, default and static methods with implementation. A interface supports multiple implementations. An **Abstract Class** is a partially implemented class with both abstract (no body) and concrete methods. Supports single inheritance.

    **Differences**:

    - **Method Implementation**: Interfaces can have abstract, default, and static methods; abstract classes can have any type of method.

    - **Inheritance**: Classes can implement multiple interfaces but can extend only one abstract class.

    - **Fields**: Interfaces only have static final fields; abstract classes can have any type of fields.

    - **Constructors**: Abstract classes can have constructors; interfaces cannot.

    - **Access Modifiers**: Interface methods are public by default; abstract class methods can have any visibility.

    

15. design a parking lot (put the code to **codingQuestions**/coding 1 folder, If you have no ability to design it, please find the solution in internet, then understand it, and re-type it. (**Do NOT just copy and paste**)

    [Parking Lot]()

    

16. What are Queue interface implementations and what are the differences and when to use what?

    1. **LinkedList**: General-purpose queue, allows nulls. Use for FIFO operations and list capabilities.
    2. **ArrayDeque**: Faster than LinkedList, no nulls. Use for efficient stack or queue operations.
    3. **PriorityQueue**: Elements sorted by priority, no nulls. Use when order matters based on priority.
    4. **LinkedBlockingQueue**: Thread-safe, optional bounds. Use in producer-consumer scenarios.
    5. **ArrayBlockingQueue**: Bounded, thread-safe. Use for fixed-size producer-consumer scenarios.
    6. **PriorityBlockingQueue**: Priority-based, thread-safe, unbounded. Use in concurrent priority tasks.
    7. **DelayQueue**: Elements delayed, thread-safe. Use for timed tasks.
    8. **SynchronousQueue**: Hand-off queue, no capacity. Use for direct thread-to-thread handoffs.