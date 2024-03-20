# Homework 3
1. #### What is generic in Java? and type the generic code by yourself.
2. #### Read those codes and type it one by one by yourself. the push the code to your branch.
3. #### practice stream API at least 3 times
4. #### Practice Optional methods at least 2 times
5. #### Write the Singleton design pattern include eager load and lazy load.
   Eager load
    ```java
    public class EagerLoadSingleton {
        private static EagerLoadSingleton instance = new EagerLoadSingleton();
    
        private EagerLoadSingleton(){
        }
    
        public static EagerLoadSingleton getInstance(){
            return instance;
        }
    }
    ```
    Lazy load
    ```java
    public class LazyLoadSingleton {
        private LazyLoadSingleton(){
        }
        static{
        }
        private static class SingletonHolder{
            private static final LazyLoadSingleton INSTANCE = new LazyLoadSingleton();
        }
        public static LazyLoadSingleton getInstance(){
            return SingletonHolder.INSTANCE;
        }
    }
    ```

6. #### What is Runtime Exception? could you give me some examples?
    `Runtime Exceptions` are known as `Unchecked exceptions`. Compiler does not force us to handle these exceptions, but as a programmer, it is our responsibility to handle `runtime exceptions` e.g. `NullPointerException`, `ArithmeticException`, `ArrayIndexOutOfBoundException` etc.

7. #### Could you give me one example of NullPointerException?
    ```java
    public class Unchecked {
        public static void main(String[] args) {
            String name = null;
            printLength(name);
        }
    
        private  static void printLength (String myString){
            System.out.println(myString.length());
        }
    }
    ```

8. #### What is the Optional class?
    The `Optional` class in Java is a container object which may or may not contain a non-null value. It's part of the `java.util package`, introduced in `Java 8`, to help avoid `NullPointerException` errors.

    - `Optional.empty()`: Returns an empty Optional instance.
    - `Optional.of(value)`: Returns an Optional with the specified non-null value.
    - `Optional.ofNullable(value)`: Returns an Optional describing the specified value, if non-null; otherwise returns an empty Optional.
    - `Optional.isPresent()`: Returns true if there is a value present, otherwise false.
    - `Optional.ifPresent(consumer)`: If a value is present, it applies the given consumer with the value, otherwise does nothing.
    - `Optional.get()`: If a value is present, returns the value, otherwise throws NoSuchElementException.
    - `Optional.orElse(defaultValue)`: Returns the value if present, otherwise returns defaultValue.
    - `Optional.orElseGet(supplier)`: Returns the value if present, otherwise invokes supplier and returns the result of that invocation.
    - `Optional.orElseThrow(exceptionSupplier)`: Returns the contained value if present, otherwise throws an exception created by the provided supplier.

9.  #### What are the advantages of using the Optional class?
     `Optional` was introduced to provide a better approach for handling values that can be `null`. It encourages programmers to handle the absence of a value explicitly, instead of relying on nulls, thus reducing the likelihood of `NullPointerExceptions`.
   
10. #### What is the @FunctionalInterface?
       A functional interface is defined as an interface with exactly one `abstract` method. If you annotate an interface with `@FunctionalInterface`, and it doesn't meet the requirements (such as having more than one abstract method), the compiler will throw an error. A functional interface can have any number of `default` methods. `Lambda` is the implementation of the abstract method.
11.  #### what is lamda?
        Before Java 8, `anonymous inner classes` were often used to implement interfaces that have only one method. Lamba is a feature in Java introduced in Java 8. Lambda expressions provide a much more concise and readable alternative. Lambda expressions implement interfaces with a `single abstract method (SAMs)` but do not work with interfaces having more than one abstract method.
        The general syntax of a lambda expression is: 
        ```java
        (argument-list) -> { body }
        ```
        - `argument-list`: This is the list of parameters for the lambda expression, which can be empty or contain one or multiple parameters. 
        - `->`: This is the lambda arrow operator, which separates the list of parameters from the body of the lambda.
        - `body`: This is the code block that specifies the actions of the lambda expression. 
12.  #### What is Method Reference?
        `Method references` in Java are a shorthand notation of a `lambda` expression to call a method. They are designed to make instances of functional interfaces more readable and concise. A method reference is used to refer directly to a method without executing it. 
        There are four types of method references:
        - Reference to a `static `method: 
        ```java
        // Using a lambda expression
        Function<String, Integer> lambdaFunction = s -> Integer.parseInt(s);
        
        // Using a method reference
        Function<String, Integer> methodReference = Integer::parseInt;  
        ```
        - Reference to an instance method of a `particular object`
        ```java
        // Using a lambda expression
        Consumer<String> lambdaConsumer = s -> System.out.println(s);
        
        // Using a method reference
        Consumer<String> methodReference = System.out::println;
        ```
        - Reference to an instance method of an `arbitrary object` of a particular type
        ```java
        // Using a lambda expression
        BiPredicate<String, String> lambdaBiPredicate = (s1, s2) -> s1.equals(s2);
        
        // Using a method reference
        BiPredicate<String, String> methodReference = String::equals;
        ```
        - Reference to a `constructor`
        ```java
        // Using a lambda expression
        Supplier<List<String>> lambdaSupplier = () -> new ArrayList<>();
        
        // Using a method reference
        Supplier<List<String>> methodReference = ArrayList::new;
        ```
13. #### What is Java 8 new features?
    - `Lambda Expressions`: This feature brought a new way to write concise and flexible code. Lambda expressions can be used primarily to define the inline implementation of functional interfaces.
    
    - `Streams API`: The Streams API was introduced to bring a functional approach to processing collections of objects. Using the Streams API, you can write more concise and readable code to perform filter-map-reduce operations, which are common when dealing with collections.
    
    - `Default Methods`: Default methods enable you to add new functionality to the interfaces and ensure binary compatibility with code written for older versions of those interfaces.
    
    - `Optional`: The Optional class is a container object used to contain not-null objects. Optional object is used to represent null with absent value. 
    
    - `Method References`: Method references help to point to methods by their names. A method reference is described using `::` symbol. 

14. #### Lambda can use unchanged variable outside of lambda? what is the details?
    Lambda can use unchanged variable outside of Lambda.
    - Final variable 
    - Non-final variable however never changed 
    - Object variable (if we use new to reassign a new memory, then this variable is changed, can not be used in lambda)
15. #### Describe the newly added features in Java 8?
    Refer to [question 13](#what-is-java-8-new-features).
16. #### Can a functional interface extend/inherit another interface?
    Yes, a functional interface can extend another interface, but the child interface must still only have one abstract method, including those inherited from the parent interface. 

17.  #### What is the lambda expression in Java and How does a lambda expression relate to a functional interface?
        Refer to [question 11](#what-is-lamda?). A functional interface in Java is an interface that contains exactly one abstract method. Functional interfaces enable Lambda expression as an instance.

18. #### In Java 8, what is Method Reference?
    Refer to [question 12](#What-is-Method-Reference?).

19. #### What does the String::ValueOf expression mean?
    ```java
    // Using a lambda expression
    Function<Integer, String> lambdaFunction = x -> String.valueOf(x);

    // Equivalent method reference
    Function<Integer, String> methodReference = String::valueOf;
    ```
20. #### What are Intermediate and Terminal operations?
    - `Intermediate `operations return a new stream. They are lazy, meaning that executing an intermediate operation does not actually perform any filtering, mapping, or other operations immediately. Instead, they create a new stream from an existing stream, where each element is lazily processed according to the intermediate operation when needed.
    - `Terminal` operations, produce a result or a side-effect and terminate the stream pipeline. Once a terminal operation is invoked on a stream, the stream can no longer be used. Terminal operations force the execution of all lazy operations preceding them in the pipeline.

21. #### What are the most commonly used Intermediate operations?

    | Intermediate Operation | Description                                                                                        |
    |------------------------|----------------------------------------------------------------------------------------------------|
    | `filter(Predicate<T>)` | Returns a stream consisting of elements that match the given predicate.                            |
    | `map(Function<T,R>)`   | Returns a stream where each element is replaced by the application of a provided function.         |
    | `flatMap(Function<T,Stream<R>>)` | Flattens multiple Streams into one Stream.                                                        |
    | `distinct()`           | Returns a stream with unique elements based on the elements' `equals()` method.                    |
    | `sorted()`             | Returns a stream with elements sorted according to their natural order or by a provided Comparator.|
    | `limit(long n)`        | Returns a stream truncated to be no longer than the specified length.                              |
    | `skip(long n)`         | Returns a stream consisting of the remaining elements after discarding the first n elements.       |
    | `peek(Consumer<T>)`    | Performs the provided action on each element as they are consumed from the stream.                 |
    

22. #### What is the difference between findFirst() and findAny()?
    - `findFirst():` returns an Optional describing the first element of the stream. 
    - `findAny()`: returns an Optional describing some element of the stream. It can return any element from the stream.

23.  #### How are Collections different from Stream?
        | COLLECTIONS                                         | STREAMS                                                  |
        |-----------------------------------------------------|----------------------------------------------------------|
        | Data structure holds all the data elements          | No data is stored. Have the capacity to process an infinite number of elements on demand |
        | External Iteration                                  | Internal Iteration                                        |
        | Can be processed any number of times                | Traversed only once                                       |
        | Elements are easy to access                         | No direct way of accessing specific elements             |
        | Is a data store                                     | Is an API to process the data                             |
        
        