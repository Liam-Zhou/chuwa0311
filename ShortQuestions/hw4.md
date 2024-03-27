### 1. [Practice collection](https://github.com/CTYue/chuwa-eij-tutorial/tree/main/02-java-core/src/main/java/com/chuwa/exercise/collection)
  
### 2. What is the checked exception and unchecked exception in Java, could you give one example?
- Checked Exceptions are exceptions that are checked at compile time. 
- Examples: SQLException, IOException
  
### 3. Can there be multiple finally blocks?
Yes

### 4. When both catch and finally return values, what will be the final result?
Result from finnnally.

### 5. What is Runtime/unchecked exception? What is Compile/Checked Exception?
Runtime exception, aka unchecked exception, will not be checked by the compiler. Compiler will not force us to handle these exceptions.
Compile/Checked Exception are exceptions that are checked at compile time.

### 6. What is the difference between throw and throws?
- throw is a keyword which is used to explicitly throw an exception in the program, inside a function or inside a block of code, whereas throws is a keyword which is used with the method signature to declare an exception which might get thrown by the method while executing the code
- throw keyword is followed by an instance of an Exception class whereas throws is followed by Exception class names
- You can throw one exception at a time but you can declare multiple exceptions using throws keyword
- Using throw keyword, only unchecked exceptions are propagated, whereas using throws keyword both checked and unchecked exceptions can be propagated.

### 7. Run the below three pieces codes, Noticed the printed exceptions. why do we put the Null/Runtime exception before Exception?
- The catch blocks are evaluated from top to bottom. If a catch block for a more generic exception (Exception in this case) were placed before more specific exceptions (like NullPointerException or ArithmeticException), the generic catch block would catch all exceptions, and the more specific catch blocks would never be reached.
- Java enforces that more specific exceptions are caught before more generic ones. If you try to catch a generic exception before a specific one (e.g., catching Exception before NullPointerException), the Java compiler will give you an error indicating unreachable catch block for the specific exception.

### 7. What is optional? why do you use it? write an optional example.
The Optional class in Java is a container object which may or may not contain a non-null value. It is introduced to avoid Null checks and run time NullPointerExceptions.
```
public class Optional Demo{
  public static void main(String[] args){
    Map<Integer, User> userMap = new HashMap<>;
    userMap.put(1, new User("Alice", new Address("Main Street")));
    userMap.put(2, new User("Bob", null));

    streetName = Optional.ofNullable(userMap.get(2))
        .map(User::getAddress)
        .map(Adress::getStreet)
        .orElse("Unknown");
    System.out.println("Street name with Optional: " + streetName);
  }
}
```
### 8. Why finally always be executed?
It is designed to always be executed. It is important to guarantees the execution of certain cleanup code during exception handling process.

### 9. Practice collection problems here: https://github.com/TAIsRich/chuwa-eij-tutorial/tree/main/02-java-core/src/main/java/com/chuwa/exercise/collection

### 10. What are the types of design patterns in Java ?
- Factory Design Pattern
- Abstract Factory Design Pattern
- Strategy Design Pattern
- Builder Design Pattern
- Singleton Design Pattern
- Observer Design Pattern
  
### 11. What are the SOLID Principles?
- Single Responsibility Principle:  a class should have only one job or responsibility.
- Open/Closed Principle: Software entities (classes, modules, functions, etc.) should be open for extension but closed for modification.
- Liskov Substitution Principle: Objects of a superclass shall be replaceable with objects of a subclass without affecting the correctness of the program.
- Interface Segregation Principle: No client should be forced to depend on methods it does not use. Instead of one large interface, several small interfaces are preferred based on groups of methods, each one serving one submodule.
- Dependency Inversion Principle: High-level modules should not depend on low-level modules. Both should depend on abstractions (e.g., interfaces). Abstractions should not depend on details; details (concrete implementations) should depend on abstractions

### 12. How can you achieve thread-safe singleton patterns in Java?

For Eager Initialization
```
public class SingletonEager {
    private static final SingletonEager instance = new SingletonEager();

    private SingletonEager() {}

    public static SingletonEager getInstance() {
        return instance;
    }
}
```

For lazy initialization 
```
public class SingletonDoubleChecked {
    private static volatile SingletonDoubleChecked instance;

    private SingletonDoubleChecked() {}

    public static SingletonDoubleChecked getInstance() {
        if (instance == null) {
            synchronized (SingletonDoubleChecked.class) {
                if (instance == null) { 
                    instance = new SingletonDoubleChecked();
                }
            }
        }
        return instance;
    }
}
```

### 13. What do you understand by the Open-Closed Principle (OCP) ?
OCP means  Software entities (classes, modules, functions, etc.) should be open for extension but closed for modification. This means that the behavior of a module can be extended without modifying its source code. Thus, OCP encourages the use of interfaces and abstract classes to allow behaviors to be extended without changing the existing code, reducing the risk of breaking existing functionality.

### 14. Liskov’s substitution principle states that if class B is a subtype of class A, then object of type A may be substituted with any object of type B. 
### What does this actually mean? (from OA ) choose your answer. 
  - It mean that if the object of type A can do something, the object of type B could also be able to perform the same thing
  - It means that all the objects of type A could execute all the methods present in its subtype B
  - It means if a method is present in class A, it should also be present in class B so that the object of type B could substitute object of type A.
  - It means that for the class B to inherit class A, objects of type B and objects of type A must be same.

The third one.

### 15. Watch the design pattern video, and type the code, submit it to MavenProject folder
Uploaded
