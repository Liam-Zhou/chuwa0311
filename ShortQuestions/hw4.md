# Homework 4

1. Practice collection

   

2. What is the checked exception and unchecked exception in Java,could you give one example?

   Checked exceptions are the exceptions that are checked at compile-time. This means if a method might throw a checked exception, it must either handle the exception with a `try-catch` block or declare it using the `throws` keyword in the method signature. Examples of checked exceptions include `IOException` and `SQLException`

   Unchecked exceptions are the exceptions that are not checked at compile-time. They are also known as runtime exceptions. Examples of unchecked exceptions include `NullPointerException` and `IndexOutOfBoundsException`

   

3. Can there be multiple finally blocks?

   No, each `try` can only be directly followed by one `finally`.

   

4. When both catch and finally return values, what will be the final result?

   If both `catch` and `finally` blocks contain `return` statements, the value returned from the `finally` block will be the final result, overriding any value returned from the `catch` block.

   

5. What is **Runtime/unchecked exception** what is Compile/Checked Exception?

   Checked exceptions are the exceptions that are checked at compile-time. This means if a method might throw a checked exception, it must either handle the exception with a `try-catch` block or declare it using the `throws` keyword in the method signature. Unchecked exceptions are the exceptions that are not checked at compile-time. They are also known as runtime exceptions. 

   

6. What is the difference between **throw** and **throws**?

   The `throw` keyword is used within a method or a block of code to explicitly throw an exception, signaling that an error or unexpected condition has occurred, thus altering the normal flow of execution. On the other hand, `throws` is used in the declaration of a method to indicate that the method may throw certain types of exceptions, especially checked exceptions, informing the caller of the method that these exceptions should be handled. 

   

7. Run the below three pieces codes, Noticed the printed exceptions. why do we put the Null/Runtime exception before Exception ?

   In Java, exceptions are caught top-down. If a more general exception is caught first, it will catch all exceptions, including all subclasses of `Exception`. This would mean that any more specific `catch` blocks placed after it would be unreachable. This is known as unreachable code and results in a compilation error. Moreover, catching specific exceptions before more general ones allows for more detailed and specific error handling. 

   

8. What is **optional**? why do you use it? write an optional example.

   `Optional` in Java is a container object used to contain not-null objects. `Optional` is a final class and is used to represent optional values that are either existent or non-existent.It's part of the `java.util` package and was introduced in Java 8 to avoid `NullPointerException`

   We use `Optional` because it provides a clear and explicit way to deal with the presence or absence of values, reducing the likelihood of `NullPointerException`. Moreover,  using `Optional `makes your code more readable by making the null checks more explicit and not hidden in your code logic.

   ```java
   Optional<String> optionalName = Optional.empty(); 
   String name = optionalName.orElseGet(() -> "Unknown"
   ```

   

9. Why finally always be executed?

   The `finally` block in Java is designed to ensure that specific critical code executes no matter what happens within the `try` and `catch` blocks. It is used mainly for cleanup activities like closing resources or releasing locks to avoid resource leaks. The `finally` block will execute after `try` and `catch` blocks, regardless of whether an exception is thrown or handled, and even if there's a `return`, `continue`, or `break` statement within those blocks. The only exceptions to this rule are if the JVM exits (due to a call like `System.exit()`) or if the thread running the code is terminated prematurely. 

   

10 . Practice collection problems here: https://github.com/TAIsRich/chuwa-eij-tutorial/tree/main/02-java-coe/src/main/java/com/chuwa/exercise/collection



11. What are the types of design patterns in Java ?

    - **Creational Patterns**

      - Singleton: Ensures that a class has only one instance and provides a global point of access to it.
      - Factory Method: Defines an interface for creating an object, but lets subclasses alter the type of objects that will be created.
      - Abstract Factory: Provides an interface for creating families of related or dependent objects without specifying their concrete classes.
      - Prototype: Creates new objects by copying an existing object, known as the prototype.

    - **Structural Patterns**

      - Adapter: Allows objects with incompatible interfaces to collaborate.
      - Proxy: Provides a surrogate or placeholder for another object to control access to it.

    - **Behaviroal Patterns**

      - Chain of Responsibility: Passes the request along a chain of handlers. Upon receiving a request, each handler decides either to process the request or to pass it 
      - Interpreter: Defines a grammatical representation for a language and provides an interpreter to deal with this grammar.

      - Observer: Defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.

        

12. What are the **SOLID** Principles ?

    The SOLID principles are a set of five design principles aimed at making software designs more understandable, flexible, and maintainable. SOLID principles include Single Responsibility Principle, Open Closed Principle, Liskov Substitution Principle, Dependency Inversion Principle, Interface Segregation Principle, 

     

13. How can you achieve thread-safe singleton patterns in Java ?

    ```java
    public class Singleton {
      private Singleton() {}
      
      private static class SingletonHolder {
        private final static Singleton INSTANCE = new Singleton();
      }
      
      public getInstance() {
        return SingletonHolder.INSTANCE;
      }
    }
    ```

    

14. What do you understand by the Open-Closed Principle (OCP) ?

    The Open-Closed Principle (OCP) states that software entities (like classes, modules, and functions) should be open for extension but closed for modification. OCP encourages developers to structure their code so that new functionalities can be added with minimal changes to existing code, leading to more manageable and scalable systems.

    

15. Liskov’s substitution principle states that if class B is a subtype of class A, then object of type A may be substituted with any object of type B. What does this actually mean? (from OA ) choose your answer.

    1. **It mean that if the object of type A can do something, the object of type B could also be able to  perform the same thing**

    2. It means that all the objects of type A could execute all the methods present in its sub type B

    3. It means if a method is present in class A, it should also be present in class B so that the object of type B could substitute object of type A.

    4. It means that for the class B to inherit class A,objects of type B and objects of type A must be same.

       

16. Watch the design pattern video, and type the code, submit it to **MavenProject** folder