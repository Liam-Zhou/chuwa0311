### 1. Practice collection
Please check `/Coding/collection`

### 2. What is the checked exception and unchecked exception in Java, could you give one example?
- Checked Exceptions are exceptions that are checked at compile time. Example:
    ```
    public class CheckedExceptionExample {
        public static void main(String[] args) {
            try {
                BufferedReader reader = new BufferedReader(new FileReader("file.txt"));
                String line = reader.readLine();
                System.out.println(line);
                reader.close();
            } catch (IOException e) {
                System.err.println("An IOException occurred: " + e.getMessage());
            }
        }
    }
    ```
- Unchecked Exceptions also known as runtime exceptions, these exceptions are not checked at compile time. Example:
    ```
    public class UncheckedExceptionExample {
        public static void main(String[] args) {
            int[] numbers = {1, 2, 3};
            try {
                System.out.println(numbers[4]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.err.println("Array index out of bounds: " + e.getMessage());
            }
        }
    }
    ```

### 3. Can there be multiple finally blocks?
    There can only be one finally block, and it must follow the catch blocks. But for nested try-catch, there can be multiple finally:
    ```
    try {
    try {

    } finally {

    }
    } finally {

    }
    ```

### 4. When both catch and finally return values, what will be the final result?
If both catch and finally return, the receiving method will get the returned value from the finally block.

### 5. What is Runtime/unchecked exception? Whatis Compile/Checked Exception?
- Checked/Compile Exceptions are exceptions that are checked at compile time. Example:
- Unchecked/Runtime Exceptions also known as runtime exceptions, these exceptions are not checked at compile time. Example:

### 6. What is the difference between throw and throws?
- `throw` is a keyword used to explicitly throw an exception within a method or block of code.
- `throws` is a keyword used in method declarations to indicate that the method may throw certain types of exceptions.

### 7. Run the below three pieces codes, Noticed the printed exceptions. why do we put the Null/Runtime exception before Exception?
By handling more specific exceptions first, we can ensure that exceptions are caught and handled appropriately based on their specific causes before catching more general exceptions. Specific exceptions provide more information about what went wrong in the program and allow for more targeted error handling.

### 7. What is optional? why do you use it? write an optional example.
- `Optional` is a container object that may or may not contain a non-null value. 
- By using Optional, we can handle cases where a value might be null without risking a NullPointerException.
- Example:
```
Optional<String> optional = Optional.ofNullable(getName());

        if (optional.isPresent()) {
            String name = optional.get();
            System.out.println("Hello, " + name + "!");
        } else {
            System.out.println("Hello, there!");
        }
```

### 8. Why finally always be executed?

### 9. Practice collection problems here: https://github.com/TAIsRich/chuwa-eij-tutorial/tree/main/02-java-core/src/main/java/com/chuwa/exercise/collection
Please check `/Coding/collection`

### 10. What are the types of design patterns in Java ?
- For Resource Cleanup: eg. closing files. 
- Guaranteed Execution. 
- Exception Handling Cleanup.

### 11. What are the SOLID Principles?
1. Single Responsibility Principle (SRP): A class should have only one reason to change, meaning that it should have only one responsibility or job.
2. Open/Closed Principle (OCP): Software entities (classes, modules, functions, etc.) should be open for extension but closed for modification.
3. Liskov Substitution Principle (LSP): Objects of a superclass should be replaceable with objects of its subclasses without affecting the correctness of the program.
4. Interface Segregation Principle (ISP): Clients should not be forced to depend on interfaces they don't use.
5. Dependency Inversion Principle (DIP): High-level modules should not depend on low-level modules. Both should depend on abstractions.

### 12. How can you achieve thread-safe singleton patterns in Java?
1. Use Eager Initialization:
```
public class Singleton {
    private static final Singleton instance = new Singleton();

    private Singleton() {}

    public static Singleton getInstance() {
        return instance;
    }
}
```
2. Use Lazy Initialization with Synchronization:
```
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
3. Double-Checked Locking:
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

### 13. What do you understand by the Open-Closed Principle (OCP) ?
- Software entities (classes, modules, functions, etc.) should be open for extension but closed for modification.
- This means that the behavior of a module can be extended without modifying its source code.
- It encourages the use of abstraction and polymorphism to achieve flexibility and allows for adding new features without modifying existing code.

### 14. Liskov’s substitution principle states that if class B is a subtype of class A, then object of type A may be substituted with any object of type B. What does this actually mean? (from OA ) choose your answer. 
    1. It mean that if the object of type A can do something,the object of type B could also be able to perform the same thing
    2. It means that all the objects of type A could execute all the methods present in its subtype B
    3. It means if a method is present in class A, it should also be present in class B so that the object of type B could substitute object of type A.
    4. It means that for the class B to inherit class A,objects of type B and objects of type A must be same.
chose 1 and 3. Objects of a superclass should be replaceable with objects of its subclasses without affecting the correctness of the program.

### 15. Watch the design pattern video, and type the code, submit it to MavenProject folder
Please check `/Repo/MavenProject`