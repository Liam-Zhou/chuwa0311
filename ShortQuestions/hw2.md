### 1. Foundmental Concepts of OOP
1. Encapsulation
```
public class Student {
    private static int id = 1;
    private String FirstName;
    private String LastName;

    public Student(String FirstName, String LastName) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.id++;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getLastName() {
        return LastName;
    }
    
    public int getId() {
        return id;
    }
}
```
2. Polymorphism
```
class Subway {
    public void broadcast() {
        System.out.println("Some messages");
    }
}

class TrainA extends Subway {
    @Override
    public void broadcast() {
        System.out.println("This is train A");
    }
}

class TrainC extends Subway {
    @Override
    public void broadcast() {
        System.out.println("This is train C");
    }
}

public class demo {
    public static void main(String[] args) {
        Subway train1 = new TrainA();
        Subway train2 = new TrainC();

        train1.broadcast(); // This is train A
        train2.broadcast(); // This is train C
    }
}
```
3. Inheritance
```
class Vehicle {
    private String model;

    public Vehicle(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void details() {
        System.out.println("The model is: " + model);
    }
}

class Wagon extends Vehicle {
    private int seats;

    public Car(String model, int seats) {
        super(model);
        this.seats = seats;
    }

    public int getSeats() {
        return this.seats;
    }
}

public class demo {
    public static void main(String[] args) {
        Car car = new Car("A4", 5);

        System.out.println("Model: " + car.getModel()); //A4

        System.out.println("Number of seats: " + car.getSeats()); // 5
    }
}
```

### 2. What is wrapper class in Java and Why we need wrapper class?
A wrapper class is a class wraps primitive data types (byte, short, int, long, float, double, char, boolean) within an object. Wrapper classes provide a way to work with primitive data types in an object-oriented manner, enabling flexibility and functionality in Java. 

### 3. What is the difference between HashMap and HashTable?
- HashMap is not synchronized while HashTable is supporting multi-thread programming. 
- HashTable is slower than HashMap since its synchronization.
- HashTable does not allow null keys or null values, while HashMap supports null keys and multiple null values.
### 4. What is String pool in Java and why we need String pool?
String pool is an area in the Java heap memory where the JVM stores string values. When creating a new String instance, the JVM would check if there's an existing identical String, if yes, it would point to the existing one rather than creating a new string. String pool makes string immutable and memory-efficient. 

### 5. What is Java garbage collection?
JVM manages memory by releasing memory that is no longer in use or reachable by the application. It involves identifying and freeing up memory occupied by objects that are no longer referenced by any part of the program. It includes steps:
- Memory Allocation
- Reference Tracking
- Identifying Unreachable Objects
- Mark and Sweep
- Memory Reclamation

### 6. What are access modifiers and their scopes in Java?
Access Modifiers are keywords used to control the visibility and accessibility of classes, variables, methods, and constructors within a Java program.
- `public`: unrestricted access. 
- `protected`: access within the package and subclasses.
- `default`: access within the package. 
- `private`: access within the class. 

### 7. What is final keyword?(Field, Method, Class)
- When the final keyword applied to a field, the value of that field cannot be changed once it has been assigned a value. 
- When applied to a method, the method cannot be overridden by subclasses.
- When applied to a class, the class cannot be subclassed. 

### 8. What is static keyword?(Field, Method, Class).When do we usually use it?
- When applied to a field (variable), the field is shared among all instances of the class. There is only one copy of the field shared by all instances of the class.
- When applied to a method, the method belongs to the class itself, not to any specific instance of the class.
- When applied to a nested class, the nested class is a static nested class. Static nested classes do not have access to instance variables of the enclosing class. They can only access static members of the enclosing class.
- When we are going to define any constants, tool methods, we could use the `static` keyword.

### 9. What is the differences between overriding and overloading?
1. Return Type: The return type of the overriding method can be the same as, or a subtype of, the return type of the overridden method. The return type of the overloaded methods can be the same or different, but it does not play a role in determining which overloaded method is invoked.
2. Overriding provides a way for a subclass to customize the behavior of methods inherited from its superclass. Overloading allows a class to define multiple methods with the same name but different parameter lists within the same class or its subclasses.
### 10. What is the differences between super and this?
Super refers to the superclass of the current object. This Refers to the current object itself.
### 11. What is the Java load sequence?
The load sequence is the process by which classes are loaded, initialized, and executed within the JVM. The process is:
1. Loading
2. Linking
3. Initialization
4. Execution
### 12. What is Polymorphism ? And how Java implements it ?
It allows objects of different types to be treated as objects of a common superclass type. In Java, polymorphism is implemented by method overriding and overloading.
### 13. What is Encapsulation ? How Java implements it? And why we need encapsulation?
It involves bundling the variables and methods that operate on the data into a class. It helps in hiding the internal state of an object and only exposing necessary functionality to the outside world. 
In Java, encapsulation is implemented using access modifiers (private, protected, public) to control the visibility of class variables and methods. 


### 14. What is Interface and what is abstract class? What are the differences between them?
Interfaces and abstract classes are used to define abstractions. Differences:
- Interfaces cannot be instantiated directly. It should be implemented by classes. Abstract classes cannot be instantiated directly. It is extended by subclasses.
- Interfaces support multiple inheritances. Abstract Classes do not support multiple inheritance for classes. 
- Interfaces methods  are implicitly public and abstract. Abstract classes may contain both abstract methods (without implementations) and concrete methods (with implementations).
- Interfaces can only contain constant fields. Abstract classes can contain fields of any type. 
- Interfaces cannot have constructors. Abstract classes can have constructors. 
### 15. design a parking lot (put the code to codingQuestions/coding1 folder, )
Please check the `Coding/coding1` folder. 
### 16. What are Queue interface implementations and what are the differences and when to use what?
1. LinkedList:

    LinkedList class in Java implements both the List and Queue interfaces.

    It provides efficient operations for adding elements to the end of the queue (offer() method), removing elements from the beginning of the queue (poll() method), and inspecting the element at the beginning of the queue (peek() method).

    LinkedList is not thread-safe. 

2. ArrayDeque:

    ArrayDeque class in Java implements the Deque interface, which extends the Queue interface.

    It provides efficient operations for adding elements to both the beginning and end of the queue (offer() and offerLast() methods), removing elements from the beginning and end of the queue (poll() and pollFirst() methods), and inspecting elements at the beginning and end of the queue (peek() and peekFirst() methods).
    ArrayDeque is not thread-safe.

3. BlockingQueue:

    BlockingQueue implementations are thread-safe and provide additional blocking operations for concurrent access by multiple threads.

