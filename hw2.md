# Homework 2
### Zan
### Mar 16th

2.**What is wrapper class in Java and Why we need wrapper class?**
 - Wrapper class provide a way to use primitive data types as objects
 - **Primitive Data Type**	/ **Wrapper Class**
   - byte / Byte
   - short / Short
   - int / Integer
   - long / Long
   - double / Double
 - Sometime must use wrapper classes because working with collection objects, such as ArrayList

3.**Different between HashMap and HashTable**
 - Both implement of the Map interface which represents of key-value pairs. 
 - some differences:
  - Because HashTable is Synchronized, it is thread safe. It ensures that no two threads can modify the HashTable at the same time.
  - HashMap performs better because it is not synchronized(Threads are not required to wait).
  - HashMap allows null for key and value, HashTable doesn't

4.**String pool in Java, Why need it**
- String pool is a storage space in Java Heap memory,and it is used to optimize memory usage in Java 
- String s1 = "Cat" and String s2 = "Cat" are both pointing to "Cat" in Java Heap; the reference to the existing string(Cat) is returned instead of creating a new object. This process is called string interning.
- Need it because:
  - Memory efficiency
  - Performance: Since string literals are immutable, they can be safely shared among multiple references 
  
5.**What is Garbage collection in Java?**
- is an automatic memory management mechanism in the JVM that periodically reclaims memory occupied by objects that are no longer in use by the running program.

6.**What are access modifiers and their scopes in Java?**
- Public
  - accessible anywhere in the program
- Protected
  - accessible within the same package and by subclasses, but not by unrelated classes outside the package
- Default
  - accessible only within the same package
- Private
  - accessible only within the same class 

7.**Final key word**
- A final variable is a constant whose value cannot be changed once it is initialized.
- A final method cannot be overridden by any subclasses.
- A final class cannot be extended or inherited by any other class.

8.**Static key word**
- Filed
  - static variables are initialized when class is loaded into memory. 
  - There is only one copy of Static variables for the entire class, rather than each instance having its own copy
  - Changing the value of a static variable affects all instances of the class and is reflected in all objects of that class.
```
public class MyClass {
    static int num = 9;
    public static void main(String[] args) {
        // Changing the value of num
        num = 10;
        //output:10
        System.out.println("New value of num: " + num);
    }
}
```
- Method
  - static method belong to the class rather than any specific class instance. This means you can call a static method from anywhere in your code without creating an instance of the class first.
```
public class MathUtility {
    // Static method to calculate the square of a number
    public static int square(int num) {
        return num * num;
    }
    
    public static void main(String[] args) {
        // Calling static methods without creating an object
        int squareResult = MathUtility.square(5);
    }
}
```
- Class
  -  A static class in Java is a class that cannot be instantiated. That is, we cannot create objects of a static class. We can only access its members using the class name itself. In other words, a static class is a class that only contains static members.
```
public class OuterClass {
    private static int val1 = 10;
    private int val2 = 20;

    // Static nested class
    public static class StaticNestedClass {
        public void display() {
            // Accessing static members of the outer class
            System.out.println("Outer static variable: " + val1);
            
            // Cannot access non-static members of the outer class from a static context
            // System.out.println("Outer non-static variable: " + val2);
        }
    }

    public static void main(String[] args) {
        // Accessing the static nested class without creating an instance of the outer class
        OuterClass.StaticNestedClass nestedObject = new OuterClass.StaticNestedClass();
        nestedObject.display();
    }
}
```

9.**overriding vs overloading**
- Overloading
  - occur within one class
  - name of the method is same but parameter are different
  - purpose: increase readability of program
  - return type can be different
  - compile time polymorphism
- Overwriting
  - occur in two classes: super class and subclass(inheritance involved)
  - name and parameter are same
  - purpose: use the method in the child class which is already present in parent class
  - return type always is same
  - run time polymorphism

10.**super VS this**
- super keyword is used to access methods of the parent class
- this keyword is used to access current class

11.**Java load sequence**
- JVM invokes a loadClass() method
- Three default class loader used in Java:
  - BootStrap classLoader
  - Extension classLoader
  - System(Application) ClassLoader
- As classes are loaded by the class loaders, they undergo a process called linking, which involves verifying the bytecode, allocating memory for class variables, and resolving symbolic references.
- After classes have been loaded and linked, they are initialized. This involves executing static initializers (static blocks and static variable initializations) and performing any necessary initialization tasks.
- Finally, the main() method of the main class specified when running the Java program is invoked. 

12.**What is Polymorphism ? And how Java implements it?**
- In programming, polymorphism refers to the same object exhibiting different forms and behaviors.
For example, take the Shape Class. The exact shape you choose can be anything. It can be a rectangle, a circle, a polygon or a diamond. So, these are all shapes but their properties are different. This is called Polymorphism.
- Method Overriding(**dynamic Polymorphism**):
```
class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Dog(); // Upcasting
        animal.makeSound(); // Output: Dog barks
    }
}
```
- Method Overloading(**static Polymorphism**):
```
public class Calculator {
    public int add(int x, int y) {
        return x + y;
    }

    public double add(double x, double y) {
        return x + y;
    }
}
```
- **What is Encapsulation? How Java implements it? And why we need encapsulation?**
- Encapsulation is a way of hiding the internal implementation details of an object from the outside world. Java implements encapsulation through the use of access modifiers and the concepts of classes and objects. We need encapsulation to improve code modularity, maintainability, and data integrity.

14.**What is Interface and what is abstract class? What are the differences between them?**
- interface:
  - All methods declared within an interface are implicitly abstract and do not contain a method body. This means that interfaces only define the method signature
  - can contain only abstract methods
  - cannot have instance variables or constructors
  - All methods declared in an interface are implicitly public and abstract, but they are not static or final. Static and default methods in interfaces are allowed, but they are not implicitly declared for regular methods.
  - A class can implement multiple interfaces
- abstract class:
  - can declare instance variables and constructors
  - cannot be instantiated directly and may contain abstract methods (methods without a body) as well as concrete methods (methods with a body).
  - when extending an abstract class, you have the choice to either implement or override the abstract methods, but you are required to inherit the concrete methods
  - a class can extend only one abstract class

16.**Queue interface implementations and what are the differences and when to use what?**
- LinkedList
  - implements both the List and Queue interfaces
  - Use LinkedList when you need a simple and flexible queue implementation
- ArrayDeque
  - is a resizable-array implementation of the Deque interface, which extends the Queue interface.
  - provides fast element insertion and removal from both ends of the queue
  - Use ArrayDeque when you need a high-performance queue implementation with dynamic resizing
- PriorityQueue
  - is an unbounded priority queue based on a priority heap
  - Use PriorityQueue when you need a queue that orders elements according to their priority
