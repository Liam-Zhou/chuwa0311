### 1. [Practice collection](https://github.com/CTYue/chuwa-eij-tutorial/tree/main/02-java-core/src/main/java/com/chuwa/exercise/collection)
### 2. What is the checked exception and unchecked exception in Java, could you give one example?
- Checked Exceptions are exceptions that are checked at compile time. 
```Java
public class CheckedException {
    public static void main(String[] args) {
        File file = new File("example.txt");
        try {
            FileReader fr = new FileReader(file);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}

```
- Unchecked Exceptions also known as runtime exceptions, these exceptions are not checked at compile time. 
```Java
public class NullPointerExceptionExample {
    public static void main(String[] args) {
        String str = null;
        try {
            int length = str.length(); 
            System.out.println("Length of the string: " + length);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e.getMessage());
        }
    }
}

```
### 3. Can there be multiple finally blocks?
Each `try` block can have at most one `finally` block. Multiple` try `blocks can have multiple `finally` blocks.
   ```Java
   public class MultipleFinallyBlocksExample {
    public static void main(String[] args) {
        try {
            System.out.println("Inside try block");
            int result = 10 / 0; 
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        } finally {
            System.out.println("First finally block");
        }

        try {
            System.out.println("Another try block");
        } finally {
            System.out.println("Second finally block");
        }
    }
}

```
### 4. When both catch and finally return values, what will be the final result?
The value returned by `finally `block will be the `final` result.
### 5. What is Runtime/unchecked exception? What is Compile/Checked Exception?
- `Checked/Compile`: These exceptions are checked by the compiler at the `compile time` itself. E.g. when you are trying to read from a file, then compiler enforces us to handle the `FileNotFoundException` because it is possible that the file may not be present. Some other checked exceptions are `SQLException` , `IOException` etc.
- `Unchecked/Runtime`: Compiler does not force us to handle these exceptions but as a programmer, it is our responsibility to handle runtime exceptions e.g. `NullPointerException `, `ArithmeticException` , `ArrayIndexOutOfBoundException` etc.
### 6. What is the difference between throw and throws?
- `throw` is a keyword used to explicitly throw an exception within a method or block of code.
- `throws` is a keyword used in method declarations to indicate that the method may throw certain types of exceptions.

### 7. Run the below three pieces codes, Noticed the printed exceptions. why do we put the Null/Runtime exception before Exception?
To ensure that more specific exceptions (like `NullPointerException` and `RuntimeException`) are caught before the more general `Exception`.
### 7. What is optional? why do you use it? write an optional example.
`Optional` is a container object that may or may not contain a non-null value. By using Optional, we can handle cases where a value might be null without risking a `NullPointerException`.
```Java
Optional<String> optional = Optional.of("Hello");
System.out.println(optional.get());
```

### 8. Why finally always be executed?
`finally` blocks are often used to perform cleanup operations such as closing resources (like files or database connections) that were opened in the corresponding `try` block. Ensuring that the `finally` block is always executed guarantees that these resources are properly released, even if an exception occurs.

### 9. Practice collection problems here: https://github.com/TAIsRich/chuwa-eij-tutorial/tree/main/02-java-core/src/main/java/com/chuwa/exercise/collection

### 10. What are the types of design patterns in Java ?
- Factory Design Pattern
- Abstract Factory Design Pattern
- Strategy Design Pattern
- Builder Design Pattern
- Singleton Design Pattern
- Observer Design Patter
### 11. What are the SOLID Principles?
1. Single Responsibility Principle (SRP)
2. Open/Closed Principle (OCP)
3. Liskov Substitution Principle (LSP)
4. Interface Segregation Principle (ISP)
5. Dependency Inversion Principle (DIP)

### 12. How can you achieve thread-safe singleton patterns in Java?
1. Eager Initialization:
```Java
public class Singleton {
    private static final Singleton instance = new Singleton();

    private Singleton() {}

    public static Singleton getInstance() {
        return instance;
    }
}
```
2. Lazy Initialization:
```Java
public class Singleton {
    private static volatile Singleton INSTANCE;

    private Singleton() {}

    public static Singleton getInstance() {
        if (INSTANCE == null) {
            synchronized (Singleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Singleton();
                }
            }
        }
        return INSTANCE;
    }
}

```
3. Static Block Initialization:
```Java
public class Singleton {
    private static final Singleton INSTANCE;

    static {
        try {
            INSTANCE = new Singleton();
        } catch (Exception e) {
            throw new RuntimeException("Exception occurred in creating singleton instance");
        }
    }

    private Singleton() {
    }

    public static Singleton getInstance() {
        return INSTANCE;
    }
}

```

### 13. What do you understand by the Open-Closed Principle (OCP) ?
The` Open-Closed Principle (OCP)` emphasizes that software entities such as classes, modules, or functions should be open for` extension `without requiring `modification` of their existing source code.

### 14. Liskov’s substitution principle states that if class B is a subtype of class A, then object of type A may be substituted with any object of type B. What does this actually mean? (from OA ) choose your answer. 
1. It mean that if the object of type A can do something, the object of type B could also be able to perform the same thing
2. It means that all the objects of type A could execute all the methods present in its subtype B
3. It means if a method is present in class A, it should also be present in class B so that the object of type B could substitute object of type A.
4. It means that for the class B to inherit class A, objects of type B and objects of type A must be same.
Answer: 1

### 15. Watch the design pattern video, and type the code, submit it to MavenProject folder

