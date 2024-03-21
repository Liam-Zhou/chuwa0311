## HW 4
## March 21th 2024

2. checked exception VS unchecked exception
- ``checked exception`` are checked at compile time. Compiler will enforce you to either handle the exception using ``try-catch`` or declare it using ``throws``
```
public class CheckedExceptionExample {
    public static void main(String[] args) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("file.txt"));
            String line = reader.readLine();
            System.out.println("First line of the file: " + line);
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        } finally {
            try {
                if (reader != null)
                    reader.close();
            } catch (IOException e) {
                System.err.println("Error closing the reader: " + e.getMessage());
            }
        }
    }
}
```
- ``unchecked exception`` known as runtime exceptions. This means that the compiler does not enforce you to handle these exceptions
- Examples: NullPointerException, ArrayIndexOutOfBoundsException, etc. 
```
public class UncheckedExceptionExample {
    public static void main(String[] args) {
        String str = null;
        try {
            int length = str.length(); // This line throws a NullPointerException
            System.out.println("Length of string: " + length);
        } catch (NullPointerException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
```
3. Can there be multiple finally blocks?
- No, ``finally`` can only be used once with a try or try-catch block.

4. When both catch and finally return values,what will be the final result?
   - the finally block will be the final result. The ``finally`` block always executes, regardless of whether an exception is caught in the catch block or not, and its return value takes precedence.
 ```  
try {
   orderDao.findOrderById(orderId);
   //return 1;
} catch(OrderNotFoundException e) {
   // busic logic
   return 3;
} finally {
   return 5;
   // This value will be returned
}
```
5. What is Runtime/unchecked exception? what is Compile/Checked Exception?


6. throw VS throws?
- ``throw`` is used to manually throw an exception within a method
```   
public void validateAge(int age) {
    if (age < 0) {
        throw new IllegalArgumentException("Age cannot be negative");
    }
}
```
- ``throws`` is used in method declaration to specify the exceptions that a method might throw, but doesn't handle internally.

```
public void getOrder(String orderId) throws OrderNotFoundException, DBException,

}
```

7. Run the below three pieces codes,Noticed the printed exceptions.why do we put theNull/Runtime exception before Exception ?
- catch the more specific exceptions before catching more general exceptions.

7. What is optional? why do you use it? write an optional example.
- Optional is a container class that can hold a value of a certain type T, or represent null value.
- The Optional class provides many useful methods, so that null value checking does not need to be explicitly performed when dealing with nullable values. This allows for more concise and safe handling of potentially null values.
- A more elegant and safer way to handle potentially nullable values is by using Optional objects. With Optional objects, we can avoid NullPointerExceptions and make our code more concise and readable.
```
// With Optional
Map<Integer, User> userMap = new HashMap<>();
userMap.put(1, new User("Alice", new Address("Main Street")));
userMap.put(2, new User("Bob", null));

streetName = Optional.ofNullable(userMap.get(2))
           .map(User::getAddress)
           .map(Address::getStreet)
           .orElse("Unknown");
System.out.println("Street name with Optional: " + streetName);
```
8. Why finally always be executed?
- imagine you opened a file in a``try``block, get an exception, then throw or returned, but never closed. that's the reason why finally always be executed.

9. Practice collection problems

10. What are the types of design patterns in Java ?
- **Creation Patterns:**
  -  Singleton Pattern: Ensures that a class has only one instance and provides a global point of access to it.
  -  Factory Pattern: Provides an interface for creating objects, but allows subclasses to alter the type of objects that will be created.
- **Structural Patterns:**
   - Adapter Pattern: Allows incompatible interfaces to work together by wrapping the interface of one class into another interface that a client expects.
   - Decorator Pattern: Adds new functionality to an object dynamically without altering its structure.
   - Proxy Pattern: Provides a surrogate or placeholder object to control access to another object.
- **Behavioral Patterns:**
   - Observer Pattern: Defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.
   - Strategy Pattern: Defines a family of algorithms, encapsulates each one, and makes them interchangeable.
   - Command Pattern: Encapsulates a request as an object, thereby allowing for parameterization

12. What are the SOLID Principles ?
- **Single Responsibility Principle (SRP)**:
  - A class should have only one reason to change, meaning it should have only one responsibility.
  - Each class should encapsulate one and only one functionality or responsibility.
  - Promotes high cohesion and reduces coupling.

- **Open/Closed Principle (OCP)**:
  - Software entities (classes, modules, functions, etc.) should be open for extension but closed for modification.
  - Behavior of a module can be extended without modifying its source code.
  - Extension is achieved through inheritance, composition, or other mechanisms without modifying existing code.

- **Liskov Substitution Principle (LSP)**:
  - Objects of a superclass should be replaceable with objects of a subclass without affecting the correctness of the program.
  - In other words, derived classes must be substitutable for their base classes without altering the desirable properties of the program.
  - Violations of LSP can lead to unexpected behavior when using polymorphism.

- **Interface Segregation Principle (ISP)**:
  - Clients should not be forced to depend on interfaces they do not use.
  - Encourages smaller, more specific interfaces to prevent coupling.

- **Dependency Inversion Principle (DIP)**:
  - High-level modules should not depend on low-level modules. Both should depend on abstractions.
  - Abstractions should not depend on details; details should depend on abstractions.
  - This principle promotes loose coupling between classes by ensuring that the implementation details can be replaced without affecting the higher-level modules.

12. How can you achieve thread-safe singleton patterns in Java ?
- **Eager initialization:**
  - The singleton instance is created eagerly when the class is loaded.
  - This ensures that the instance is created before any thread can access it, making it inherently thread-safe.

```
public class Singleton {
    private static final Singleton instance = new Singleton();
    
    private Singleton() {}
    
    public static Singleton getInstance() {
        return instance;
    }
}
```
- **Lazy Initialization with Double-Checked Locking:**
  - The singleton instance is created lazily, only when it is requested for the first time.
  - Double-checked locking is used to ensure thread safety while minimizing the performance overhead.
```
public class Singleton {
    private static volatile Singleton instance;
    
    private Singleton() {}
    
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
```

- **Initialization-on-Demand Holder Idiom (Static Inner Class):**
  - The singleton instance is created lazily using a static inner class.
  - This leverages the fact that inner classes are loaded only when they are referenced, providing lazy initialization with thread safety.
```
public class Singleton {
    private Singleton() {}
    
    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }
    
    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
```
14. What do you understand by the Open-Closed Principle (OCP) ?
- software entities (classes, modules, functions) should be open for extension but closed for modification. 
- This means that the behavior of a module should be extendable without modifying its source code.

