# Home Work 2

**2.  What is wrapper class in Java and Why we need wrapper class?**

Wrapper classes are classes that encapsulate primitive data types into objects. They provide a way to represent primitive data types as objects, allowing them to be used in collections, generics, and other scenarios where objects are required. We need wrapper classes because Java collections and generics only work with objects, not primitives. Wrapper classes allow us to use primitive data types in these contexts by providing methods and behaviors for working with primitive values as objects.

**3.  What is the difference between HashMap and HashTable?**

The main difference is that HashMap is not synchronized, meaning it's not thread-safe, while HashTable is synchronized, making it thread-safe. Hashtable does not allow null keys or null values, while HashMap allows one null key and any number of null values.

HashTable ensures that no two threads can access it simultaneously, preventing data corruption and maintaining consistency. However, this making HashTable slower than HashMap in single-threaded applications. In general, HashMap is preferred for better performance in non-threaded scenarios, while HashTable is used in multi-threaded environments where thread safety is essential.

**4.  What is String pool in Java and why we need String pool?**

The String pool in Java is a special memory area where unique String literals are stored. When you create a String using double quotes (`" "`), Java first checks the String pool. If a String with the same content already exists in the pool, Java returns a reference to that String instead of creating a new one. This helps conserve memory by reusing existing String objects, it ensures that Strings with the same content are stored only once, promoting efficiency and reducing memory overhead.

**5. What is Java garbage collection?**

Java garbage collection is an automatic process in Java that manages memory by reclaiming memory occupied by objects that are no longer in use or reachable by the program. When objects are created in Java, they are allocated memory in the heap. However, as the program runs, some objects become unreachable because they are no longer referenced by the program. The garbage collector identifies these unreachable objects and frees up the memory they were occupying, making it available for future allocations.

**6. What are access modifiers and their scopes in Java?**

Access modifiers in Java are keywords used to control the accessibility of classes, fields, methods, and constructors within a Java program.

1. **public:** Accessible from anywhere, both within and outside the class.
2. **protected:** Accessible within the same package and by subclasses, even if they are in different packages.
3. **default (no modifier):** Accessible within the same package only.
4. **private:** Accessible only within the same class.

These access modifiers help enforce encapsulation, control visibility, and promote code maintainability and reusability.

**7. What is final key word? (Filed, Method, Class)**

1. **Final Field:** When applied to a field, it means the value of that field cannot be modified once it's initialized.

2. **Final Method:** When applied to a method, it means that the method cannot be overridden by subclasses.

3. **Final Class:** When applied to a class, it means that the class cannot be subclassed.

**8. What is static keyword? (Filed, Method, Class). When do we usually use it?**

1. **Static Field:** When applied to a field, it means that the field belongs to the class itself, rather than to instances of the class. There is only one copy of a static field shared by all instances of the class.

2. **Static Method:** When applied to a method, it means that the method belongs to the class rather than to instances of the class. Static methods can be called directly on the class without needing to create an instance.

3. **Static Class (Nested):** When applied to a nested class, it means that the nested class can be instantiated without requiring an instance of the outer class.

We usually use the `static` keyword when we want to define elements that are shared across all instances of a class, such as constants, utility methods, or counters.

**10. What is the differences between overriding and overloading?**

1. **Overriding:**
    - Occurs **in inheritance**  when a subclass provides a specific implementation of a method that is already defined in its superclass.
    - The method signature (name, return type, and parameter types) must be the same in both the superclass and subclass.
    - Overriding allows a subclass to provide its own implementation of a method inherited from its superclass, enabling polymorphic behavior.

2. **Overloading:**
    - Occurs when multiple methods in the same class have the same name but different parameter lists (different number or types of parameters).
    - Overloaded methods may have different return types, but they must have unique parameter lists.
    - Overloading allows a class to have multiple methods with the same name but different behaviors based on the parameters they accept.

In summary, overriding involves redefining a method in a subclass with the same signature as a method in its superclass, while overloading involves defining multiple methods in the same class with the same name but different parameters.

**11. What is the differences between super and this?**

`super` is used to access members of the superclass, while `this` is used to refer to the current instance of the class.

**12. What is the Java load sequence?**

1. **Bootstrap Class Loader:** Loads core Java classes from the bootstrap classpath.

2. **Extensions Class Loader:** Loads classes from the extension directories.

3. **System Class Loader:** Also known as the application class loader.

4. **Custom Class Loaders:** Optionally, custom class loaders can be implemented to load classes dynamically at runtime.

**13. What is Polymorphism ? And how Java implements it ?**

Polymorphism in Java refers to the ability of objects to take on multiple forms. It allows a single method name to represent different behaviors based on the object's type or class hierarchy. Java implements polymorphism through method overriding and method overloading.

**14. What is Encapsulation ? How Java implements it? And why we need encapsulation?**

Encapsulation in Java is the concept of bundling data and methods that operate on the data within a single unit, known as a class. Java implements encapsulation using access modifiers such as `private`, `protected`, and `public` to control access to the fields and methods of a class. Encapsulation helps achieve data hiding, which prevents direct access to the internal state of an object, enhancing security and preventing unintended modification of data.

**15. What is Interface and what is abstract class? What are the differences between them?**

An interface in Java is a blueprint of a class that specifies a set of methods that a class must implement.

An abstract class is a class that cannot be instantiated on its own and may contain both abstract and concrete methods. Abstract methods are declared without implementation and must be overridden by subclasses.

The main differences between interfaces and abstract classes are:

1. **Multiple Inheritance:**
    - Interfaces support multiple inheritance, allowing a class to implement multiple interfaces. Abstract classes do not support multiple inheritance; a class can only inherit from one abstract class.

2. **Implementation:**
    - Interfaces provide a contract that classes must adhere to by implementing all methods declared in the interface. Abstract classes can contain both abstract and concrete methods, providing partial implementation.

3. **Instantiation:**
    - Interfaces cannot be instantiated on their own; they require a concrete class to implement them. Abstract classes cannot be instantiated on their own either; they require subclasses to provide complete implementation.
    
**18. What are Queue interface implementations and what are the differences and when to use what?**

In Java, the `Queue` interface represents a collection of elements with a specific order, typically following the First-In-First-Out (FIFO) principle. Several implementations of the `Queue` interface are available in Java:

1. **LinkedList:** Implements the `Queue` interface and provides a doubly linked list implementation. It allows elements to be inserted and removed from both ends of the list efficiently.

2. **ArrayDeque:** Also implements the `Queue` interface and provides a resizable array implementation. It allows elements to be inserted and removed efficiently from both ends of the array.

3. **PriorityQueue:** Implements the `Queue` interface and provides a priority-based queue implementation. It orders elements based on their natural ordering or using a specified comparator.

Differences:
- `LinkedList` and `ArrayDeque` are both efficient for adding and removing elements at both ends of the queue, but `ArrayDeque` offers better performance due to its dynamic resizing array implementation.
- `PriorityQueue` maintains elements in priority order, allowing for efficient retrieval of the highest-priority element.

When to Use What:
- Use `LinkedList` when you need a simple and flexible queue implementation without specific performance requirements.
- Use `ArrayDeque` when you need a high-performance queue implementation with constant-time operations for adding and removing elements at both ends of the queue.
- Use `PriorityQueue` when you need to process elements based on their priority.
