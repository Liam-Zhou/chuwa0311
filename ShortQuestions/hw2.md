### Question1

```java
// Encapsulation
class User {
    // attributes must be private
    private String userName;
    private String password;

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public void login(String userName, String password) {
        if (userName.equals(this.userName) && password.equals(this.password)) {
            System.out.println('Login success');
        } else {
            System.out.println('Login failed');
        }
    }
}

// Polymorphism
public class polymorphismUser() {
    private String name;
    private String address;
    private String phoneNumber;

    public polymorphismUser() {
        this.name = '';
        this.address = '';
        this.phoneNumber = '';
    }

    public polymorphismUser(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

}

// Inheritance
public class Shape {
    public double getArea() {
        return 0;
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    @Override
    public double getArea(){
        return this.width * this.height;
    }
}

```

### Question2: What is wrapper class in Java and Why we need wrapper class?
```
Wrapper class in Java is a way to use primitive data types as objects.
We use wrapper class because it can be used in Collections, ArrayList, HshMap can 
only store objects and not primitive types. It also provides utility methods for primitives.
```

### Question3: What is the difference between HashMap and HashTable?
```
HashMap: 
it is not synchronized, so it is not thread-safe without external synchronization; 
it allows one null key and multiple numm values;
HashTable: 
it is synchronized, but less efficient in scenarios where thread safty is not concern;
it does not allow null keys or null values;
```

###Question4: What is String pool in Java and why we need String pool?
```
String pool is a special storage area in Java jeap memory used to store unique string iterals.
We need String Pool because strings are immutable in Jave, storing only one copy of each Literal 
string in the pool saves memory, and it provides faster string comparison, because string literals in string 
pool have the same content and represented by the same memory address.
```

###Question5: What is Java garbage collection?
```
Java grabage collection is a form of automatic memory management to reclaim the unused memory allocated 
by objects that are no longer need by java application.
```
###Question6: What are access modifiers and their scopes in Java?
```
Public: anywhere
private: accessible only within the class it is declared
default: accessible only within same package
protected: accessible within the same package and also accessible in subclasses residing in different packages.

```
###Question7: What is final key word? (Filed, Method, Class)
```
Final keyword is a modifier.
In Field: it means that the variable is a constant and cannot be reassigned once it has been assigned a value.
In Method: it means that the method cannot be overridden by subclasses.
In Class: it means that the class cannot be subclassed.
```

###Question8: What is static keyword? (Filed, Method, Class). When do we usually use it?
```
static keyword indicates that the particular member belongs to the class itself, 
rather than to instances of the class.
In Field: A static Field is shared among all instances of a class. We use it to store constants that is common to all instances of the class.
In Method: A static method belongs to the class rather than any instance of the class and can be called without creating an instance of the class.
            We use it for operations that do not require any data from an instance of the object.
In Class: A static class do not requre an instance of the outer class to be created, it is used to group related classes together.

```
###Question9: What is the differences between overriding and overloading?
```
overriding:
It is the subclass has a method with the same name, return type and parameters as a method in its superclass;
It is determined at runtime
overloading:
It is two or more methods in one class have the same method name buyt differnt type, number of parameters;
It is resolved at compile-time;
```
###Question10: What is the differences between super and this?
```
this: it is a reference to the current object
super: it refers to the parent class of the object or the class where the current class is derived from
```
###Question11: What is the Java load sequence?
```
The Jave load sequence is a fundamental concept that defines how classes are loaded, lined and initialized within the JVM.
```

###Question12: What is Polymorphism ? And how Java implements it ?
```
Polymorphism simply means Many forms, many forms can be combined into a single interface.
Java implements is by overloading and overriding.
```
###Question13: What is Encapsulation ? How Java implements it? And why we need encapsulation?
```
Encapsulation means bunding attributes and methods into a single class.
Java implements by define private attributes and provide getter and setter for the attributes.
We need encapsulation to provide data safty, make sure the data cannot be modified of access out of the class.
```

###Question14: What is Interface and what is abstract class? What are the differences between them?
```
Both of them are used to achieve abstration, we can define a contract for subclasses without providing 
a complete implementation.
Interface cannot have fully implemented methods, but abstract classes can. Abstract class can have constructors and fields.
The access modifier of interface method are public by default.
```
###Question16: What are Queue interface implementations and what are the differences and when to use what?
```
LinkedList: implements both List and Queue interfaces, we use it when we need FIFO data structure
PriorityQueue: An unbounded priority queue based on a priority heap, elements of priority queue are ordered according to their natural ording or by a comparator.
QrrayDeque: A resizable array that allows ot to grow as needed to support usage as a stacck or a queue.
ConcurrentLinkedQueue: An unbounded thread-safe queue based on linked nodes. we used it for high-concurrency applications.
Blockingqueue: It is an interface that extends queue with operations that wait for the queue to become non-empty when retrieving an 
element and wait for space to become avaliable in the queue.
```
