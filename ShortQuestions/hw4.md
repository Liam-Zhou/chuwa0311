## Home Work 4

2. **What is the checked exception and unchecked exception in Java, could you give one example?**
   
   **Checked exceptions** : it must be either caught or declared in the method signature using the throws keyword. They are checked at compile-time, meaning you are forced to handle these exceptions, either with a try-catch block or by declaring them with the throws keyword in the method signature. 
    ```java
        import java.io.FileInputStream;
        import java.io.FileNotFoundException;

        public class CheckedExceptionExample {
            public void readFile() throws FileNotFoundException {
                FileInputStream file = new FileInputStream("nonexistentfile.txt");
            }
        }
    ```
    **Unchecked Exceptions** : it inherits from RuntimeException. The compiler does not require these exceptions to be caught or declared in a method's signature. Unchecked exceptions usually indicate programming errors, such as logic mistakes or improper use of an API.


    ```java
        public class UncheckedExceptionExample {
            public static void main(String[] args) {
                int[] numbers = {1, 2, 3};
                System.out.println(numbers[4]); 
            }
        }

    ```

3. **Can there be multiple finally blocks?**
     There cannot be multiple finally blocks associated directly with a single try block. A try block can be followed by zero or more catch blocks for handling exceptions and must be followed by at most one finally block. The finally block is optional but, if present, is used to execute important code such as resource cleanup.
4. **When both catch and finally return values, what will be the final result?**

    When both catch and finally blocks have return statements, the finally block's return statement will take precedence, and its value will be the final result returned by the method. 

5. **What is Runtime/unchecked exception? what is Compile/Checked Exception**
   
   Unchecked exceptions are the exceptions that are not checked at compile-time. In other words, the compiler does not require methods to catch exceptions or declare these exceptions in the throws clause. Unchecked exceptions extend RuntimeException, and they are meant to indicate programming errors such as bugs.

   Checked exceptions are checked at compile-time. It means if a method is capable of causing an exception, it must either handle the exception with a try-catch block or declare it in its throws clause. 

6. **What is the difference between throw and throws**
  
7. **Run the below three pieces codes, Noticed the printed exceptions. why do we put the Null/Runtime exception before Exception**
    ```java
    public class Main {
        public static void main(String[] args) {
            int a = 0;
            int b = 3; 
            String s = null;
            try {
                System.out.println(b / a);
                System.out.println(s.equals("aa"));
                throw new RuntimeException();
            } catch (ArithmeticException e) {
                e.printStackTrace();
            } catch (NullPointerException e) {
                e.printStackTrace();
            } catch (RuntimeException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.getMessage(); 
            }
            System.out.println("End ...");
        }
    }

    public class Main {
        public static void main(String[] args) {
            int a = 0;
            int b = 3; 
            String s = null;
            try {
                // System.out.println(b / a); 
                System.out.println(s.equals("aa"));
                throw new RuntimeException();
            } catch (ArithmeticException e) {
                e.printStackTrace();
            } catch (NullPointerException e) {
                e.printStackTrace();
            } catch (RuntimeException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.getMessage(); 
            }
            System.out.println("End ...");
        }
    }

    public class Main {
        public static void main(String[] args) {
            int a = 0;
            int b = 3; 
            String s = null;
            try {
                // System.out.println(b / a); // This line is commented out
                // System.out.println(s.equals("aa")); // This line is also commented out
                throw new RuntimeException();
            } catch (ArithmeticException e) {
                e.printStackTrace();
            } catch (NullPointerException e) {
                e.printStackTrace();
            } catch (RuntimeException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.getMessage(); 
            }
            System.out.println("End ...");
        }
    }
    ```

    Because Java uses the first matching catch block found in the order they are written. This means if we have a catch block for a more general exception (like Exception) before more specific exceptions (like NullPointerException or RuntimeException), the more general catch block will handle all exceptions, preventing more specific catch blocks from ever being reached

8. **What is optional? why do you use it? write an optional example.**
   1. Optional is a container object used to contain not-null objects. Optional object is used to represent null with absent value. 
   2. - Clear Intent: Using Optional makes it clear from method signature that there might not be a value present. It forces the caller of method to actively think about the case where a value is missing, leading to more robust code.
      - Better Alternative to null: It provides a more expressive alternative to null, reducing the risk of NullPointerException errors.
      - Functional Style Operations: Optional supports fluent API style operations that include reference methods to perform conditional actions on the value inside Optional without explicit null checks. 

9.  **Why finally always be executed?**
    The finally block in Java is designed to be executed after the try block and any associated catch blocks, regardless of whether an exception was thrown or caught, or even if a return statement was encountered within the try or catch blocks. This behavior ensures that the finally block is a reliable place to perform cleanup actions, such as releasing resources (files, network connections, database connections, etc.) that must be done to avoid resource leaks.

10. **Practice collection problems here: https://github.com/TAIsRich/chuwa-eij-tutorial/tree/main/02-java-core/src/main/java/com/chuwa/exercise/collection**

11. **What are the types of design patterns in Java ?**
     - Creational Patterns:
       - Singleton: Ensures a class has only one instance, and provides a global point of access to it.
       - Factory Method: Defines an interface for creating an object, but lets subclasses alter the type of objects that will be created.
     -  Structural Patterns:
        - Adapter: Allows the interface of an existing class to be used as another interface. 
        - Composite: Composes objects into tree structures to represent part-whole hierarchies. It lets clients treat individual objects and compositions of objects uniformly.
        - Proxy: Provides a surrogate or placeholder for another object to control access to it.   
     - Behavioral Patterns:
       - Observer: Defines a dependency between objects so that when one object changes its state, all its dependents are notified and updated automatically.
       - Strategy: Defines a family of algorithms, encapsulates each one, and makes them interchangeable. Strategy lets the algorithm vary independently from clients that use it.  

12. **What are the SOLID Principles ?**
    1. Single Responsibility Principle (SRP): a class should have only one reason to change, meaning it should have only one job or responsibility. This principle helps in making the system easier to understand and maintain.
    2. Open/Closed Principle (OCP): software entities (classes, modules, functions, etc.) should be open for extension, but closed for modification. This means you should be able to add new functionality without changing the existing code.
    3. Liskov Substitution Principle (LSP): objects in a program should be replaceable with instances of their subtypes without altering the correctness of the program. Essentially, if class B is a subclass of class A, instances of A may be replaced with instances of B without affecting the behavior of the program.
    4. Interface Segregation Principle (ISP): no client should be forced to depend on methods it does not use. This principle suggests that it is better to have many smaller, client-specific interfaces than one large, general-purpose interface.
    5. Dependency Inversion Principle (DIP): high-level modules should not depend on low-level modules. Both should depend on abstractions. Additionally, abstractions should not depend on details; details should depend on abstractions. This principle aims to reduce the coupling between the components of a system.

    
13. **How can you achieve thread-safe singleton patterns in Java ?**
    - Eager Initialization:
    ```java
    public class Singleton {
        private static final Singleton INSTANCE = new Singleton();

        private Singleton() {}

        public static Singleton getInstance() {
            return INSTANCE;
        }
    }
    ```
    - Lazy Initialization with Synchronization:
    ```java
    public class Singleton {
        private static Singleton instance;
        private Singleton() {}

        public static synchronized Singleton getInstance() {
            if (instance == null) {
                instance = new Singleton();
            }
            return instance;
        }
    }

    ```
    
14. **What do you understand by the Open-Closed Principle (OCP) ?**
    - Open for Extension:
        Being "open for extension" implies that the behavior of a module can be extended. As new requirements arise, a system should be able to incorporate new features or behaviors through extensions rather than changes to the existing code. This often involves using interfaces or abstract classes in a way that new functionality can be added with new implementations of those interfaces or subclasses of those abstract classes.

    - Closed for Modification:
        Being "closed for modification" means that the source code of the module is set and cannot be modified. The idea is to write your code so that once it is tested, it does not have to be touched again. Any new functionality should be added via new code, not by changing old code that already works.
15. **Liskov’s substitution principle states that if class B is a subtype of class A, then object of type A may be 
substituted with any object of type B. What does this actually mean? (from OA ) choose your answer.**

    *1. It mean that if the object of type A can do something, the object of type B could also be able tp perform the same thing*

    *2. It means that all the objects of type A could execute all the methods present in its subtype B*

    *3. It means if a method is present in class A, it should also be present in class B so that the object of type B could substitute object of type A.*

    *4. It means that for the class B to inherit class A, objects of type B and objects of type A must be same.*

