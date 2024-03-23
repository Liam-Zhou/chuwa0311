## Home Work 3

1. **What is generic in Java? and type the generic code by yourself.**
   
    [Java Core Tutorial](https://github.com/TAIsRich/chuwa-eij-tutorial/tree/main/02-java-core/src/main/java/com/chuwa/tutorial/t01_basic/generic)
2. **Read those codes and type it one by one by yourself. the push the code to your branch.**
   
    [Java8](https://github.com/TAIsRich/chuwa-eij-tutorial/tree/main/02-java-core/src/main/java/com/chuwa/tutorial/t06_java8)

3. **practice stream API at least 3 times**

    [Stream](https://blog.devgenius.io/15-practical-exercises-help-you-master-java-stream-api-3f9c86b1cf82)
4. **Practice Optional methods at least 2 times**

    [Optional](https://github.com/CTYue/chuwa-eij-tutorial/blob/main/02-java-core/src/main/java/com/chuwa/tutorial/t06_java8/exercise/ShoppingCartUtil.java)

5. **Write the Singleton design pattern include eager load and lazy load.**
   1. Eager load:
   ```java
   public class EagerLoadedSingleton {

        private static final EagerLoadedSingleton INSTANCE = new EagerLoadedSingleton();

        private EagerLoadedSingleton() {}

        public static EagerLoadedSingleton getInstance() {
            return INSTANCE;
        }
    }
   ```
   2. lazy load:
    ```java
    public class LazyLoadedSingleton {

        private static LazyLoadedSingleton instance;

        private LazyLoadedSingleton() {}

        public static synchronized LazyLoadedSingleton getInstance() {
            if (instance == null) {
                instance = new LazyLoadedSingleton();
            }
            return instance;
        }
    }
    ```
6. **What is Runtime Exception? could you give me some examples?**
   RuntimeException is a subclass of Exception. Runtime exceptions do not have to be declared in a method's signature. Runtime exceptions typically represent errors that could occur during the execution of a program and often indicate programming errors, such as logical mistakes or improper use of an API.

   `NullPointerException`: Thrown when attempting to access a member of a null object reference.

    ```java
    String text = null;
    int length = text.length();
    ```
    `ArrayIndexOutOfBoundsException`: Thrown when an attempt is made to access an array with an index that is out of bounds.
    ```java
    int[] numbers = {1, 2, 3};
    int number = numbers[3]; 
    ```

7. **Could you give me one example of NullPointerException?**
   ```java
    public class Main {
        public static void main(String[] args) {
            String text = null; 
            int length = text.length(); 
            System.out.println("Length of the text: " + length);
        }
    }
    ``` 
8. **What is the Optional class?**

    The Optional class in Java is a container object used to contain not-null objects. It's introduced in Java 8. We can avoid NullPointerException, making your code more readable and less prone to errors.
9.  **What are the advantages of using the Optional class?**
    1. Reduces NullPointerException Risks.
    2. Improves Code Readability:  the intent of your code becomes clearer.
    3. Encourages Better API Design: optional nudges callers to think about and handle null value cases, leading to more robust usage of the API.
10.  **What is the @FunctionalInterface?**
    
        The @FunctionalInterface annotation in Java is used to indicate that an interface is intended to be a functional interface. A functional interface in Java is an interface that has exactly one abstract method. Despite having only one abstract method, functional interfaces can still have multiple default or static methods. 

11. **what is lamda？**
  
    A lambda expression, introduced in Java 8, is a short block of code which takes in parameters and returns a value. Lambda expressions are similar to methods, but they do not need a name and they can be implemented right in the body of a method.
12. **What is Method Reference?**
    
    A Method Reference in Java is a shorthand notation of a lambda expression to call a method. Method references further simplify the syntax when a lambda expression does nothing but call an existing method. Essentially, it's a way to refer to a method without executing it.
13. **What is Java 8 new features?**
    
    Java 8 includes several significant new features that marked a substantial evolution in the Java programming language and its core libraries. These features aimed at improving the expressiveness of the language, simplifying coding patterns, and enhancing the performance of Java applications. 
    
14. **Lambda can use unchanged variable outside of lambda? what is the details?**
    
    Yes, a lambda expression in Java can access variables from the outer scope where the lambda is defined, but there are some restrictions.  
    Specifically, lambda expressions can  use local variables from its enclosing scope, but those variables need to be effectively final(they don't have final modifier, but the value didn't change) or final. But for the instance fields and static variables, they don't have effectively final restriction. This is because instance fields and static variables are part of an object's state or the class's state, respectively, and their lifecycle is managed differently from that of local variables.
15. **Describe the newly added features in Java 8?**
    
    1. Lambda Expressions: a much-anticipated functional programming aspect to Java. They allow for clear and concise representation of functional interfaces.
    2. Stream API: introduced a new abstraction called Stream that allows processing sequences of elements in a functional style.
    3. Method References:  improve the readability and conciseness of lambda expressions.
    4. Optional Class: a container object used to contain not-null objects. 
    5. Default and Static Methods in Interfaces: default and static methods in interfaces.

16. **Can a functional interface extend/inherit another interface?**
    
    Yes, a functional interface in Java can extend another interface, but there are specific rules:

    - Extending a Non-Functional Interface: the interface can extend another interface that does not declare any abstract methods.

    - Extending Another Functional Interface: the interface will inherit the single abstract method of its parent, and thus, it should not declare another abstract method. 
17. **What is the lambda expression in Java and How does a lambda expression relate to a functional interface?**
    
    1. Lambda expressions are a significant feature that enables functional programming. They provide a clear and concise way to represent one method interface using an expression. Lambda expressions are essentially anonymous functions—they don't need a name, they can be implemented right in the body of a method.
    2. A functional interface is an interface that contains exactly one abstract method, although it can contain multiple default or static methods. This single abstract method defines the target type of a lambda expression.
18. **In Java 8, what is Method Reference?**
    
     Method reference is a feature that allows you to refer directly to a method without executing it. It provides a way to reference methods in a clear and concise manner, serving as a shorthand syntax for a lambda expression that executes just one method. Method references improve code readability and conciseness, especially in contexts where lambda expressions are used to call existing methods.
    
19. **What does the String::ValueOf expression mean?**
    
    The expression String::valueOf is a method reference in Java that refers to the static valueOf method of the String class. Method references provide a way to refer to methods without executing them, serving as a shorthand for writing lambda expressions for methods that already have a name.
20. **What are Intermediate and Terminal operations?**
    - Intermediate operations are operations that transform a stream into another stream. They are lazy, meaning they do not start processing the elements of the stream when they are called. Instead, they set up a pipeline of operations that is executed only when a terminal operation is invoked.
    - Terminal operations, on the other hand, are operations that close the stream. It triggers the execution of all intermediate operations that were set up and produces a result. After a terminal operation is called, the stream cannot be used anymore.
21. **What are the most commonly used Intermediate operations?**

| Intermediate Operation | Purpose                                              |
|------------------------|------------------------------------------------------|
| `filter`               | Filters elements according to a predicate.           |
| `map`                  | Transforms each element into another form.           |
| `flatMap`              | Flattens nested structures into a single stream.     |
| `distinct`             | Removes duplicate elements based on `.equals()` comparison. |
| `limit`                | Limits the number of elements the stream should process. |
| `skip`                 | Skips the first n elements of the stream.            |

22.  **What is the difference between findFirst() and findAny()?**

- findFirst(): Retrieves the first element of the stream.	
- findAny(): Retrieves any element of the stream.
23.   **How are Collections different from Stream?**
    
| Aspect              | Collections                                                         | Streams                                                                                     |
|---------------------|---------------------------------------------------------------------|---------------------------------------------------------------------------------------------|
| **Purpose** | Storing and accessing data.                                         | Describing computations on data.                                                            |
| **Storage**         | Data storage and retrieval. | Do not store data. pipeline for data processing.                                             |
| **Mutability**      | Can be mutable                       | Immutable. Once created, cannot be modified.                                                |           
| **Operations**      | Operations for direct access, addition, removal, modification.      | Support functional-style operations (map, filter, reduce).                                  |
| **Size**            | Finite size, determinable via `.size()`.                            | Can be finite or infinite. Size may not be predetermined.                                   |
| **Consumption**     | Can be accessed and traversed multiple times.                       | Designed to be consumed once. Cannot be reused after a terminal operation.                  |
| **Performance**     | Not optimized for parallel execution. Manual synchronization for concurrency. | Designed for parallel execution. Operations can be performed concurrently.                  |

