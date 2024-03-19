## Home Work 2

1. **Write up Example code to demonstrate the three foundmental concepts of OOP. (reference Code Demo
repo as example)**
   1. Encapsulation:
        ```
       public class Account {
            private String owner;
            private double balance;

            public Account(String owner, double balance) {
                this.owner = owner;
                this.balance = balance;
            }

            public void deposit(double amount) {
                if (amount > 0) {
                    balance += amount;
                    System.out.println("Added " + amount + " to the balance");
                }
            }

            public void withdraw(double amount) {
                if (amount > 0 && amount <= balance) {
                    balance -= amount;
                    System.out.println("Withdrew " + amount + " from the balance");
                } else {
                    System.out.println("Insufficient balance");
                }
            }

            public double getBalance() {
                return balance;
            }
        }

        ```
   2. Polymorphism;
         ```
        abstract class Animal {
            public abstract String speak();
        }

        class Dog extends Animal {
            @Override
            public String speak() {
                return "Woof!";
            }
        }

        class Cat extends Animal {
            @Override
            public String speak() {
                return "Meow!";
            }
        }

        public class TestAnimals {
            public static void main(String[] args) {
                Animal dog = new Dog();
                Animal cat = new Cat();

                System.out.println(dog.speak());  // Outputs: Woof!
                System.out.println(cat.speak());  // Outputs: Meow!
            }
        }
  
    3. Inheritance:
          ```
            class Vehicle {
                private String name;
                private String speed;

                public Vehicle(String name, String speed) {
                    this.name = name;
                    this.speed = speed;
                }

                public void displayInfo() {
                    System.out.println("Vehicle Name: " + name + ", Speed: " + speed);
                }
            }

            class Car extends Vehicle {
                private int mpg;

                public Car(String name, String speed, int mpg) {
                    super(name, speed);  // Call the superclass (Vehicle) constructor
                    this.mpg = mpg;
                }

                @Override
                public void displayInfo() {
                    super.displayInfo();  // Call the superclass (Vehicle) displayInfo method
                    System.out.println("MPG: " + mpg);
                }
            }

            public class TestVehicles {
                public static void main(String[] args) {
                    Car car = new Car("Toyota Corolla", "180 km/h", 30);
                    car.displayInfo();
                }
            }


2. **What is wrapper class in Java and Why we need wrapper class?**
   1. Wrapper classes are a part of the java.lang package and provide a way to use primitive data types (int, char, long etc.) as objects.
   2. 
      - Object Requirement: Collections like ArrayList, HashMap, etc., can only store objects and not primitive types.
      - Utility Methods: Wrapper classes have some useful methods.
      - Null Support: Primitive types cannot be null in Java, but wrapper classer can.
      - Generics Support.


3. **What is the difference between HashMap and HashTable?**
   1. Synchronization:
        - HashMap: HashMap is not synchronized, which means it does not guarantee thread safety.
        - HashTable: HashTable is thread-safe, it's synchronizes for each individual operation.
    2. Null Values and Keys:
        - HashMap: HashMap allows one null key and any number of null values
        - HashTable: HashTable does not allow null keys or null values
    3. Performance: HashMap offers better performance by accessing the entries.
    4. Inheritance: HashMap implements the Map interface, however HashTable extends the Dictionary class.

4. **What is String pool in Java and why we need String pool?**
   -  String Pool a special storage area in the Java heap memory. It is used to store unique string literals. When a string is created and if the same string already exists in the pool, the new variable will reference the string from the pool rather than creating a new one. 
   - Memory Efficiency: By reusing immutable strings, the String Pool minimizes the number of String objects created in the heap.  
    Security: String Pool helps ensure that these critical data are stored securely and are not duplicated unnecessarily in memory.

5. **What is Java garbage collection?**

    Java's garbage collection is a process by which the Java Virtual Machine automatically identifies and disposes objects that are no longer being used by a program. This process is crucial in managing memory within the JVM and helps prevent memory leaks that can degrade performance or cause applications to run out of memory.

6. **What are access modifiers and their scopes in Java?**
   
   Access modifiers are keywords used in the declaration of classes, methods, and variables to set the level of access control for them. There are four access modifiers and their scopes:
   - Private: within the same class.
   - Default: within the same package.
   - Protected: the same package and all subclasses.
   - Public: every where.
 
7. **What is final key word? (Filed, Method, Class)**
   
    Final keyword is a non-access modifier.
    1. Final Field: A final variable cannot change its value once it has been assigned.
    2. Final method: annot be overridden by subclasses.
    3. Final class: Cannot be extended by any subclass.


8.  **What is static keyword? (Filed, Method, Class). When do we usually use it?**
   
    1. Static Field:
        - A static field is shared by all instances of the class, meaning all instances will see the same value for this field. 
        - Static fields are often used for variables that should be common to all instances.
    2. Static Method
       - A static method belongs to the class rather than any object of the class and can be invoked without the need for creating an instance of the class.
       - They are commonly used for utility or helper methods that don't require any object state for their operation.
    3. Only nested classes can be static. A static nested class is associated 
       -  with its outer class, it can be accessed without creating an instance of the outer class.
       -  Static nested classes are used when the nested class doesn't need to access an instance of the outer class.

 
9.  **What is the differences between overriding and overloading?**

    | Feature                         | Method Overloading                                             | Method Overriding                                              |
    |---------------------------------|----------------------------------------------------------------|----------------------------------------------------------------|
    | Time of Execution               | Compile-time                                                   | Runtime                                                        |
    | Performance                     | Better performance due to compile-time binding                 | Lesser performance due to runtime binding                      |
    | Method Signature                | Must be different  | Must be the same          |
    | Return Type                     | Can be different or the same, doesn't matter                   | Must be the same or covariant                     |
    | Applicability                   | Within the same class                                          | Across parent and child classes                                |
    | Access Modifiers for Methods    | Private and final methods can be overloaded                    | Private methods cannot be overridden; final methods cannot be overridden |
    | Argument List                   | Must be different                                              | Must be the same                                               |
    | Purpose                         | Increases the readability of the code                           | Provides specific implementation of a method in the child class|

10. **What is the differences between super and this?**
    
| Feature                     | `this`                                                        | `super`                                                       |
|-----------------------------|---------------------------------------------------------------|---------------------------------------------------------------|
| Purpose                     | Refers to the current object instance.                        | Refers to the parent class object instance.                   |      |
| Constructor Calls           | `this()` can be used to call another constructor in the same class. | `super()` is used to call the superclass's constructor.        |

11.  **What is the Java load sequence?**
    
     The Java load sequence refers to the process that the Java Virtual Machine follows to load classes into memory before they can be executed. This sequence is a part of Java's runtime class loading mechanism, which allows classes to be loaded on demand, rather than loading all classes when the application starts
        

12. **What is Polymorphism ? And how Java implements it ?**
    
    - Polymorphism is a fundamental concept in object-oriented programming that allows objects of different classes to be treated as objects of a common super class. 
    - It is implemented by two ways: Method Overloading (Compile-Time Polymorphism) and method Overriding (Run-Time Polymorphism)
    
13. **What is Encapsulation ? How Java implements it? And why we need encapsulation?**
    1. Encapsulation is a core principle of object-oriented programming that involves bundling the data and code into a single class and restricting access to some of the object's components.
    2. - Private Variables: Fields are declared as private to ensure that they can only be accessed within the same class. 
       - Public Methods: Public getter and setter methods are provided for the private variables. This allows controlled access to the variables.
    3.  Encapsulation provides control over the data by restricting access to it. This helps to prevent accidental or unauthorized modifications of data. It also help increases modularity and understandability.

14. **What is Interface and what is abstract class? What are the differences between them?**
        
    | Feature               | Interface                                               | Abstract Class                                      |
    |-----------------------|---------------------------------------------------------|-----------------------------------------------------|
    | Implementation        | A class can implement multiple interfaces.              | A class can extend only one abstract class.         |
    | Constructors          | Cannot have constructors.                               | Can have constructors.                              |
    | Method Implementation | Before Java 8, cannot have implementations . | Can have both abstract and concrete methods.        |
    | Access Modifiers      | Methods are implicitly public.                        | Methods can have any access modifiers.              |
    | Default & Static Methods | Can have default and static methods (Java 8+).         | Can have static methods, and default methods (Java 8+ for interfaces). |


15. **design a parking lot (put the code to codingQuestions/coding1 folder, ). If you have no ability to design it, please find the solution in internet, then understand it, and re-type it.(Do NOT just copy and paste)**
 
16.  **What are Queue interface implementations and what are the differences and when to use what?**
 

| Implementation   | Features                                                                 | Use Cases                                                   |
|------------------|--------------------------------------------------------------------------|-------------------------------------------------------------|
| `ArrayDeque`     | - Resizable-array implementation of the Deque interface.                 | - When you need a resizable array implementation that does not restrict capacity (unless memory is constrained). Ideal for stacks or queues. |
| `LinkedList`     | - Doubly-linked list implementation of the List and Deque interfaces.    | - When you need both List and Deque functionalities. Suitable for implementing stacks, queues, or when you frequently insert/remove at the beginning/middle of the list. |
| `PriorityQueue`  | - An unbounded priority queue based on a priority heap.                  | - When elements need to be processed based on priority rather than FIFO. Not thread-safe.  |

