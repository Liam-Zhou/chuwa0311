# Home Work 2
1. #### Write up Example code to demonstrate the three foundmental concepts of OOP. (reference Code Demo repo as example)

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

   

2. #### What is wrapper class in Java and Why we need wrapper class?

   - In Java, a wrapper class is a class that encapsulates, or "wraps," a primitive data type within an object. The Java programming language provides wrapper classes for each of the primitive data types:
   > `Integer` for `int`
   > 
   > `Short` for `short`
   > 
   > `Character` for `char`
   > 
   > `Boolean` for `boolean`
   > 
   > `Byte` for `byte`
   > 
   > `Long` for `long`
   >
   > `Float` for `float`
   > 
   > `Double` for `double`
   - Wrapper classes provide a way to treat primitive data types as objects. They are primarily used in situations where an object is required, such as when working with collections, generics, or with APIs that deal with objects.
   - **Collections**: Most of the Java collection classes such as ArrayList, LinkedList, etc., work with objects, not with primitive data types. Wrapper classes allow us to use primitive data types in these collections.
   - **Generics**: Java generics cannot be used with primitive data types. If you need to use a primitive type in a generic class or method, you can use its corresponding wrapper class instead.

3. #### What is the difference between HashMap and HashTable?

   - **Thread Safety**:
     - HashMap is not synchronized, meaning it is not thread-safe. Multiple threads can access a HashMap concurrently without any external synchronization. 
     - Hashtable is synchronized, meaning it is thread-safe. Access to a Hashtable is internally synchronized, ensuring that multiple threads cannot modify the Hashtable at the same time without proper synchronization.
   - **Performance**:
     - HashMap generally performs better than Hashtable because it is not synchronized. In single-threaded environments or situations where thread safety is not a concern.
     - HashMap is preferred due to its better performance.
     Hashtable has synchronized methods, which can introduce overhead in performance, especially in multi-threaded environments.
   - **Null Values**:
     - HashMap allows null as both keys and values. It permits one null key and multiple null values. 
     - Hashtable does not allow null keys or values. If you try to store null as a key or value, it will throw a NullPointerException.
   - **Iterating**:
     - Both HashMap and Hashtable support iteration through their key-value pairs using iterators, but the iterator of Hashtable is thread-safe since the entire Hashtable is synchronized.
   - **Inheritance**:
     - HashMap is part of the Java Collections Framework and extends the AbstractMap class. 
     - Hashtable is a legacy class and not part of the Collections Framework, but it does implement the Map interface.
   - In summary, if you need thread safety and synchronization, Hashtable can be used. However, if thread safety is not required, or if you want better performance, HashMap is usually the preferred choice. For new code, HashMap is generally recommended over Hashtable due to its better performance and flexibility.

4. #### What is String pool in Java and why we need String pool?

   - The string pool in Java is a special area in the Java heap memory where strings are stored. When you create a string using string literals (e.g., "hello"), the JVM checks if the string already exists in the pool. If it does, the reference to the existing string object is returned. If not, a new string object is created in the pool, and its reference is returned.
   - Reason need String pool:
       1. **Memory Efficiency:** By reusing strings already present in the pool, the string pool helps conserve memory. Instead of creating multiple copies of the same string, all references to that string point to a single object in the pool.
       2. **String Immutability:** Java strings are immutable, meaning their values cannot be changed once they are created. This immutability allows strings to be safely shared across multiple parts of a program without fear of unintended modifications.
       3. **Performance:** String interning, the process of adding strings to the string pool, can improve performance by reducing the time and resources required to create and manage strings. Comparing interned strings for equality is faster than comparing non-interned strings because it involves comparing references rather than comparing the contents character by character.

5. #### What is Java garbage collection?

    - Garbage collection in Java is the automated process of deleting code that's no longer needed or used. This automatically frees up memory space and ideally makes coding Java apps easier for developers. It is a process JVM automatically manages memory allocation and deallocation for Java objects.

6. #### What are access modifiers and their scopes in Java?

    - Access modifiers in Java are keywords that define the accessibility or visibility of classes, variables, methods, and constructors. These access modifiers provide control over the visibility of members, allowing developers to enforce encapsulation and information hiding principles in their code. 
        - **public:** Anywhere, same package or other packages.
        - **protected:** Within the same package and **by subclasses**, even if they are in a different package.
        - **default (no modifier):** Only within the same package.
        - **private:** Only within the same class.

7. #### **What is final key word? (Filed, Method, Class)**

    1. **Final Variables:**
        - When applied to a variable, the variable's value cannot be changed once it has been initialized.
        - A final variable must be initialized either at the time of declaration or in the constructor of the class.
    2. **Final Methods:**
        - When applied to a method, the method cannot be overridden by subclasses. It provides a way to enforce method implementation immutability in subclasses.
    3. **Final Classes:**
        - When applied to a class, the class cannot be subclassed or extended. It provides a way to prevent inheritance, making the class immutable and ensuring that its behavior cannot be altered by subclasses.
        - Final classes are typically used in the context of creating utility classes or classes that should not be modified or extended by other classes.

8. #### **What is static keyword? (Filed, Method, Class). When do we usually use it?**

    1. **static Fields:**

        - When applied to a field, the field belongs to the class itself, rather than to instances of the class. There will be only one copy of a static field shared among all instances of the class.
        - Static fields are initialized only once, at the time the class is loaded

    2. **Static Methods:**

        - When applied to a method, the method belongs to the class itself, rather than to instances of the class. Static methods can be invoked using the class name, without the need to create an instance of the class.

        - Static methods cannot access instance variables or call instance methods directly because they are not associated with any instance of the class.

        - Static methods are commonly used for utility functions or operations that do not require access to instance-specific data.

        - *can be overloaded but not overrided*

            ```bash
            public class Base {
                public static void display() {
                    System.out.println("Base::display()");
                }
            }
            
            public class Derived extends Base {
                public static void display() {
                    System.out.println("Derived::display()");
                }
            }
            
            public class Main {
                public static void main(String[] args) {
                    Base b = new Derived();
                    b.display(); // Output: Base::display()
                }
            }
            ```

    3. **Static Nested Classes:**

        - When applied to a class, the class is a static class nested in a non-static class. Static nested classes are associated with the outer class, but they can be instantiated without creating an instance of the outer class.
        - Static nested classes cannot access non-static members (fields or methods) of the outer class directly.

    4. **Static blocks**

        - in Java are used for static initialization of a class. They are executed when the class is loaded into the JVM and before the execution of the `main()` method or the creation of any instance of the class.

9. #### **What is the differences between overriding and overloading?**

    1. **Overloading(static polymorphism):**
        - Overloading occurs when multiple methods in the **same class** have the **same name** but different parameter lists (number or types of parameters).
        - Overloaded methods have the same name but different signatures.
        - Overloading is resolved at **compile time** based on the number and types of arguments passed to the method.
        - Overloaded methods may or may not have the same return type.
    2. **Overriding:(dynamic polymorphism)**
        - Overriding occurs when a **subclass** provides a implementation of a method that is already defined in its **superclass**.
        - Overridden methods have the same name, return type, and parameter list as the method in the superclass.
        - Overriding is resolved at **runtime** based on the actual object type (dynamic dispatch).
        - Overridden methods must have the same or covariant return type (subtype of the return type in the superclass).

10. #### **What is the differences between super and this?**

    1. **super:**

    - Refer to the superclass (parent class) of the current object instance.
    - Used to access members of the superclass that are hidden or overridden by a subclass.
    - `super` can be used to invoke superclass constructors or methods, or to access superclass fields.

    2. **this:**

    - Refer to the current object instance (the instance of the class in which it appears).
    - Used to access members of the current object, especially when there is a name conflict with local variables or method parameters.
    - Used to invoke constructors of the same class from other constructors (constructor chaining).

11. #### **What is the Java load sequence?**

    - Loading:
        - During the loading phase, the class loader loads the class file into memory
    - Linking -> Verifiction -> Preparation -> Resolution
    - Initializing: 静态变量，静态变量块在初始化的时候执行，实例变量和实例块在对象创建的时候执行，构造器最后执行
        - JVM initializes the class variables and executes the static initializer block.

12. #### **What is Polymorphism ? And how Java implements it ?**

    - Polymorphism is a concept in object-oriented programming that allows objects of different classes to be treated as if they were objects of the same class
    - In Java, polymorphism is achieved through method overriding and method overloading

13. #### **What is Encapsulation ? How Java implements it? And why we need encapsulation?**

    - Encapsulation in Java refers to integrating data (variables) and code (methods) into a single unit. In encapsulation, a class's variables are hidden from other classes and can only be accessed by the methods of the class in which they are found.
    - Java implements encapsulation through controlled access to data:
        1. **Private Data Members:** Prevents direct modification of the data from outside the class.
        2. **Public Methods:** Public methods are provided to access and modify the private data members. 
        3. **Getter and Setter Methods:** Getter methods used to retrieve the values of private fields, while setter methods are used to set or modify the values of private fields. 
    - Encapsulation hides the internal state of an object from the outside world, preventing unauthorized access and modification. This helps maintain **data integrity** and prevents direct manipulation of data.

14. #### **What is Interface and what is abstract class? What are the differences between them?**

    **Interface:**

    - An interface in Java is a reference type similar to a class that contains only abstract methods, default methods, static methods, and constant fields.
    - It defines a contract for a set of methods that implementing classes must implement.
    - Interfaces allow **multiple inheritance** in Java.

    **Abstract Class:**

    - An abstract class in Java is a class that cannot be instantiated directly and may contain abstract methods as well as concrete methods.
    - Abstract classes can also contain fields, constructors, and other types of methods.
    - Abstract classes are used to provide a common base for a group of related classes, allowing them to share common behavior.
    - A class can extend only one abstract class.

15. #### design a parking lot (put the code to codingQuestions/coding1 folder)

16. #### What are Queue interface implementations and what are the differences and when to use what?

    | Queue Implementation      | Description                                                  | Key Features                                                 | When to Use                                                  |
    | ------------------------- | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
    | **LinkedList**            | Implements the Queue interface, providing FIFO operations. It is a doubly-linked list. | - Dynamically sized<br/>- Allows null elements<br/>\- Provides queue and deque operations | \- Suitable for applications needing list and queue functionalities<br/>\- Frequent insertions and deletions |
    | **PriorityQueue**         | A priority heap based queue that orders elements by natural ordering or a provided Comparator. | \- Ordered by natural ordering or Comparator<br/>\- No null elements<br/>\- Not strictly FIFO | \- Processing elements in priority order<br/>\- Suitable for algorithms like Dijkstra's or priority-based task scheduling |
    | **ConcurrentLinkedQueue** | A thread-safe version of a linked queue with non-blocking operations, suitable for high concurrency. | \- Lock-free, thread-safe<br/>\- High concurrency<br/>\- Uses CAS operations | \- High-throughput, concurrent scenarios<br/>\- Non-blocking operations and scalability |

    