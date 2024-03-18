## 1. Write up Example code to demonstrate the three foundmental concepts of OOP. (reference Code Demo repo as example)
```
Encapsulation;
Polymorphism;
Inheritance;
```
## 2. What is wrapper class in Java and Why we need wrapper class?
Wrapper classes in Java are a part of the java.lang package and serve as the object representation of the eight primitive data types. In Java, primitive data types (like int, char, double, etc.) are not objects; they are stored directly in memory and are very fast to access. However, there are situations in Java programming where you need to use objects instead of primitives. This is where wrapper classes come in.

Why need wrapper class:
- To use in Java Collections: Collections such as ArrayList, HashMap, etc., can only store objects and not primitive types. Wrapper classes enable you to store the primitives in these collections by wrapping them in their corresponding object representation.
- Since wrapper classes are objects, they can have methods and properties which can be very useful. 
- Primitives cannot be null, but their wrapper class objects can be. This is useful for representing a lack of a value or checking if a value has been assigned.

## 3. What is the difference between HashMap and HashTable?
| HashMap | HashTable |
|----------|----------|
| No method is synchronized    | Every method is synchronized |
| Multiple threads can operate simultaneously and hence hashmap’s object is not thread-safe.    | At a time only one thread is allowed to operate the Hashtable’s object. Hence it is thread-safe.   |
| Threads are not required to wait and hence relatively performance is high.    | It increases the waiting time of the thread and hence performance is low  |
| Null is allowed for both key and value    | Null is not allowed for both key and value.    |

## 4. What is String pool in Java and why we need String pool?
The Java String Pool is a special memory region where String objects are stored by the Java Virtual Machine (JVM).
The String Pool optimizes memory usage and improves performance by reducing the number of duplicate String objects created in heap memory.
Multiple string literals with the same value refer to the same object in the pool, reducing the memory footprint of the program.
## 5. What is Java garbage collection?

## 6. What are access modifiers and their scopes in Java?
| Modifier | Description |
|----------|----------|
| Default    | declarations are visible only within the package (package private)     |
| Private    | declarations are visible within the class only    |
| Protected    | declarations are visible within the package or all subclasses    |
| Public    | declarations are visible everywhere    |

## 7. What is final key word? (Filed, Method, Class)
If you use final with a primitive type variable, then its value cannot be changed once assigned.
If you use final with a method, then you cannot override it in the subclass.
If you use final with class, then that class cannot be extended.
If you use final with an object type, then that object cannot be referenced again.

## 8. What is static keyword? (Filed, Method, Class). When do we usually use it?
static makes something class level.

Static Method:
A static method belongs to the class rather than any object of the class and can be called without creating an instance of the class.

Static class:
In Java, you can't declare a top-level class as static, but nested classes can be static. A static nested class is associated with its outer class, and like static methods and fields, it doesn't require an instance of the outer class to be created.

Static Variables:
A static field is shared among all instances of the class.

## 9. What is the differences between overriding and overloading?
| overriding | overloading |
|----------|----------|
| When the subclass have methods that have same name, return type, parameters to its super class  | Within a class, two methods have same name, return type, but different parameters     |
| Overridden methods cannot have a more restrictive access modifier | overloaded methods can have different access modifiers |
| overriding is dynamic polymorphism. | Overloading is static polymorphism|

## 10. What is the differences between super and this?
| super | this |
|----------|----------|
| Reference to the Superclass | Reference to the Current Object  |
| super can be used to call a constructor of the parent class | this can also be used to call another constructor in the same class |

## 11. What is the Java load sequence?
The Java load sequence refers to the order in which classes and objects are loaded, initialized, and made available for use in a Java program.

## 12. What is Polymorphism ? And how Java implements it ?
We can perform a single action in different ways. It occurs when we have many classes that are related to each other by inheritance. Java implements by overriding and overloading.

## 13. What is Encapsulation ? How Java implements it? And why we need encapsulation?
Encapsulation refers to binding the data and the methods to manipulate that data together in a single unit (class). Java implements it by access modifiers.

Why We Need Encapsulation:
- Control over Data: Encapsulation gives control over the data by restricting who can access it and how it can be accessed or modified.
- Data Hiding: It hides the implementation details of a class from the users of that class, exposing only what is necessary.
- Modularity: Encapsulated code is more modular and easier to manage, as each part of the code has a clearly defined role.
- Security: Encapsulation provides a form of data security by keeping the data and the code that manipulates the data together, protecting against unauthorized access and misuse.

## 14. What is Interface and what is abstract class? What are the differences between them?
| Interface | Abstract class |
|----------|----------|
| blueprint of a class. It has static constants and abstract methods. |  a class that cannot be instantiated on its own and can include abstract as well as concrete methods  |
| super can be used to call a constructor of the parent class | this can also be used to call another constructor in the same class |

Differences between Interface and Abstract class:
- Abstract class can have both abstract and concrete methods but interface can only have abstract methods (Java 8 onwards, it
can have default and static methods as well)
- Abstract class methods can have access modifiers other than public but interface methods are implicitly public and abstract
- Abstract class can have final, non-final, static and non-static variables but interface variables are only static and final
- A subclass can extend only one abstract class but it can implement multiple interfaces
- An Abstract class can extend one other class and can implement multiple interfaces but an interface can only extend other interfaces

## 15. design a parking lot (put the code to codingQuestions/coding1 folder, ) If you have no ability to design it, please find the solution in internet, then understand it, and re-type it.(Do NOT just copy and paste)

## 16. What are Queue interface implementations and what are the differences and when to use what
The Queue interface in Java is part of the Java Collections Framework and provides a structure for storing elements in a specific order for processing.
1. LinkedList
- Features: Implements both List and Queue interfaces. It is a doubly-linked list that allows for efficient insertion and removal operations.
- When to Use: Use LinkedList when you need a general-purpose queue and also might need list operations. It's not thread-safe, so external synchronization is needed for concurrent access.

2. PriorityQueue
- Features: An unbounded priority queue based on a priority heap. Elements of the queue are ordered according to their natural ordering or by a Comparator provided at queue construction time.
- When to Use: Use PriorityQueue when you need to process elements not in FIFO (first-in-first-out) but in priority order. It's not thread-safe.

3. ArrayDeque
- Features: A resizable-array implementation of the Deque interface. It has no capacity restrictions and is faster than LinkedList when used as a queue.
- When to Use: Use ArrayDeque when you need a highly efficient queue (or stack) and do not require capacity constraints. It's not thread-safe.
