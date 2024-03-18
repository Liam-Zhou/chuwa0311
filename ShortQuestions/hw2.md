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

## 9. What is the differences between overriding and overloading?
| overriding | overloading |
|----------|----------|
| When the subclass have methods that have same name, return type, parameters to its super class  | Within a class, two methods have same name, return type, but different parameters     |
| Private    | declarations are visible within the class only    |
| Protected    | declarations are visible within the package or all subclasses    |
| Public    | declarations are visible everywhere    |

## 10. What is the differences between super and this?
## 11. What is the Java load sequence?
## 12. What is Polymorphism ? And how Java implements it ?
## 13. What is Encapsulation ? How Java implements it? And why we need encapsulation?
## 14. What is Interface and what is abstract class? What are the differences between them?
## 15. design a parking lot (put the code to codingQuestions/coding1 folder, ) If you have no ability to design it, please find the solution in internet, then understand it, and re-type it.(Do NOT just copy and paste)

## 16. What are Queue interface implementations and what are the differences and when to use what
