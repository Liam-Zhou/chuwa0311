# Home Work 3

5. #### Write the Singleton design pattern include eager load and lazy load.

    ```java
    public class EagerSingleton{
        private static final EagerSingleton INSTANCE_EAGER = new EagerSingleton();
        private EagerSingleton(){}
        public static EagerSingleton getInstance(){return INSTANCE_EAGER;}
    }
    
    public class LazySingleton{
        private static LazySingleton INSTANCE_LAZY;
        private LazySingleton(){}
        public static EagerSingleton getInstance(){
            if(INSTANCE_LAZY == null){
                INSTANCE_LAZY = new LazySingleton();
            }
            return INSTANCE_LAZY;}
    }
    ```

    

6. #### What is Runtime Exception? could you give me some examples?

    - A runtime exception in Java is a type of exception that occurs during the execution of a program, typically due to programming errors or exceptional conditions that are not checked by the compiler at compile time. Unlike checked exceptions, which must be either caught or declared in the method's throws clause, runtime exceptions do not need to be explicitly handled.
        - **NullPointerException (NPE):** Occurs when trying to access or call a method on a null object reference.
        - **ArrayIndexOutOfBoundsException:** Occurs when trying to access an invalid index of an array.

7. #### Could you give me one example of NullPointerException?

    ```java
    String str = null;
    int length = str.length(); // Throws NullPointerException
    ```

    

8. #### What is the Optional class?

    - The `Optional` class in Java is a container object that may or may not contain a non-null value. 

9. #### What are the advantages of using the Optional class?

    -  It encourages the use of explicit handling of null values, improving code readability and reducing the likelihood of NullPointerExceptions.
    - It forces developers to think about and handle the case when a value may not be present, leading to more defensive and predictable code.
    - It helps improve code readability by making it clear when a value may be absent and how to handle that situation.

10. #### What is the @FunctionalInterface?

    - The `@FunctionalInterface` annotation in Java is used to indicate that an interface is intended to be a functional interface. A functional interface is an interface that contains exactly one abstract method (**SAM: Single Abstract Method**) along with any number of default or static methods. Functional interfaces are a key feature of Java 8 and are used to support lambda expressions and method references.

11. #### what is lamda?

    - A lambda expression in Java is a compact way to represent an anonymous function. It's used with functional interfaces to pass behavior as arguments, making code more concise and readable.

12. #### What is Method Reference?

    - A method reference in Java is a shorthand for representing lambda expressions that directly call specific methods or constructors, making your code more concise and readable.

13. #### What is Java 8 new features?

    - Java 8 introduced several significant features and enhancements to the Java programming language.

14. #### Lambda can use unchanged variable outside of lambda? what is the details?

    - Yes, lambda expressions in Java can access variables from their enclosing scope, including **local variables, instance variables, and static variables**. However, there are certain rules and restrictions regarding accessing these variables, especially when they are captured by lambda expressions.

    - The local variable must be **final or effectively final**

        - for local reference variable: cannot reinitialize, but can change value
        - for local primitive variable: cannot change.

    - Instance variable and static variable are not effected, they can be changed.

        ```java
        public class DogeCoin {
            int coin = 30; //this referes to current outer value
            public void getDoge(){
                int coin = 20;
                PrintCoin printCoin = () -> {
                    this.coin = 40; // Instance variable are free to change within or outside of lambda
                    System.out.println(" Doge coins bought = "+ this.coin);
                    System.out.println(" local variable = "+ coin);
                };
                printCoin.print();
            }
        
            public static void main(String []args){
                DogeCoin doge = new DogeCoin();
                doge.getDoge();
            }
        }
        @FunctionalInterface
        interface PrintCoin{
            void print();
        }
        ```

        

15. #### Describe the newly added features in Java 8?

    1. **Lambda Expressions**: Lambda expressions allow you to treat functionality as a method argument or create anonymous functions. This feature enables you to write more concise and readable code, especially when working with collections and functional interfaces.
    2. **Stream API**: The Stream API provides a fluent, functional-style way of processing collections of objects. It enables you to perform operations such as filtering, mapping, and reducing on collections with ease. Streams can significantly simplify code and improve performance.
    3. **Functional Interfaces**: Java 8 introduced the `@FunctionalInterface` annotation, which marks interfaces as functional interfaces. Functional interfaces have exactly one abstract method and can be used with lambda expressions.
    4. **Default Methods in Interfaces**: Interfaces can now have concrete methods, known as default methods, which provide backward compatibility for evolving interfaces. This feature allows you to add new methods to interfaces without breaking existing code.
    5. **Optional Class**: The `Optional` class is a container object that may or may not contain a non-null value. It helps to avoid null pointer exceptions and encourages better handling of potentially absent values.
    6. **Method References**: Method references provide a shorthand syntax for lambda expressions that simply call a method. They can make code more readable and concise, especially when passing method references as arguments to functional interfaces.

16. #### Can a functional interface extend/inherit another interface?

    A functional interface can’t extend another interface which has an abstract method, because it will void the fact that a functional interface allows only one abstract method, however functional interface can inherit another interface if it contains only static and default methods in it.

17. #### What is the lambda expression in Java and How does a lambda expression relate to a functional interface?

    - The Lambda expression is **used to provide the implementation of an interface which has functional interface**. It saves a lot of code. In case of lambda expression, we don't need to define the method again for providing the implementation. Here, we just write the implementation code.

18. #### In Java 8, what is Method Reference?

    - Method reference provide a shorthand notation for lambda expressions that only call a single method. Method references can be used to simplify the code and make it more readable.
    - **Reference to a static method:** A reference to a static method can be created using the syntax `ClassName::methodName`.
    - **Reference to an instance method of an object:** A reference to an instance method of an object can be created using the syntax `object::methodName`. 
    - **Reference to a constructor:** A reference to a constructor can be created using the syntax `ClassName::new`

19. #### What does the String::ValueOf expression mean?

    `String.ValueOf`, in lambda: `s -> String.valueOf(s)`

20. #### What are Intermediate and Terminal operations?

    - Intermediate operations in Java streams are operations that transform a stream into another stream, while terminal operations are operations that produce a result or a side-effect.

21. #### What are the most commonly used Intermediate operations?

    | Operation | Usage                                                        |
    | --------- | ------------------------------------------------------------ |
    | filter    | Returns a new stream consisting of elements that match the given predicate. |
    | map       | Returns a new stream consisting of the results of applying the given function to the elements of this stream. |
    | flatMap   | Returns a new stream consisting of the results of replacing each element of this stream with the contents of a mapped stream produced by applying the provided mapping function to each element. |
    | sorted    | Returns a stream consisting of the elements of this stream sorted according to the provided Comparator. |
    | limit     | Returns a stream consisting of the elements of this stream truncated to be no longer than the specified maximum size. |
    | skip      | Returns a stream consisting of the remaining elements of this stream after discarding the first n elements of the stream. |

22. #### What is the difference between findFirst() and findAny()?

    - The findAny() method returns any element from a Stream, while the findFirst() method returns the first element in a Stream

23. #### How are Collections different from Stream?

    - **Storage**: Collections store all their elements in memory, whereas streams do not necessarily store all their elements in memory. Streams can work with data from various sources, and they can process data on the fly, as it becomes available.
    - **Mutability**: Collections can be mutable or immutable, depending on the implementation. Streams, however, are always immutable and do not allow modification of their underlying data.
    - **Iteration**: Collections can be iterated over multiple times, and elements can be accessed in any order. Streams are typically consumed once and cannot be reused.
    - **Lazy evaluation**: Streams are evaluated lazily, meaning that intermediate operations are only performed when a terminal operation is invoked. This allows for more efficient processing of large data sets, as only the necessary data is processed.
    - **Parallel processing**: Streams support parallel processing, which means that large data sets can be processed in parallel, using multiple threads or processors.