### 1. What is generic in Java? and type the generic code by yourself.
Generic in Java creates classes, interfaces, and methods that operate with types specified as parameters. Generic code: `/Coding/coding2/Generic`

### 2. Read those codes and type it one by one by yourself. the push the code to your branch.
Java8 code: `/Coding/coding2/java8`

### 3. practice stream API at least 3 times
Stream API code: `/Coding/coding2/java8/features/stream_api`

### 4. Practice Optional methods at least 2 times
Optional methods code: `/Coding/coding2/java8/exercise/ShoppingCartUtil.java` and `/Coding/coding2/java8/features/optional`

### 5. Write the Singleton design pattern include eager load and lazy load.
Singleton code: `/Coding/coding2/singleton`

### 6. What is Runtime Exception? could you give me some examples?
Runtime Exception is an exception that occurs during the execution of a program, usually due to logical errors in the code or unexpected conditions during runtime. Examples:
- NullPointerException
```
String str = null;
System.out.println(str.length());
```
- ArrayIndexOutOfBoundsException
```
int[] arr = {1, 2};
System.out.println(arr[2]); 
```

### 7. Could you give me one example of NullPointerException?
- NullPointerException
```
String str = null;
System.out.println(str.length());
```

### 8. What is the Optional class?
It is a container object tolerants a non-null value. It is used to represent optional values that might be absent. This class helps to avoid the use of null references and the NullPointerExceptions.

### 9. What are the advantages of using the Optional class?
It avoids NullPointerExceptions and related null checks and enforces immutability.

### 10. What is the @FunctionalInterface?
This annotation in Java is used to indicate that an interface is intended to be a functional interface. A functional interface is an interface that contains exactly one abstract method. 

### 11. what is lamda?
A lambda expression in Java is a way to represent an anonymous function, a function that doesn't have a name and can be passed around as a parameter to other methods or stored in variables. Example:
```
Arrays.sort(nums, (a, b) -> b - a);
```

### 12. What is Method Reference?
Method reference in is a shorthand syntax that allows users to refer to methods or constructors without actually invoking them. It provides a way to express lambda expressions that just call an existing method or constructor. Example:
```
Function<String, Integer> func = Integer::parseInt;
```

### 13. What is Java 8 new features?
Java 8 new features mainly contain:
- Default Interface Method
- Lambda
- Method Reference
- Optional
- Stream API

### 14. Lambda can use unchanged variable outside of lambda? what is the details?
Lambda can use constant variable(final parameters) outside of lambda. It can also use "effectively final" parameters whose value does not change after it has been initialized. 
 
### 15. Describe the newly added features in Java 8?
- Default Interface Method
- Lambda
- Method Reference
- Optional
- Stream API

### 16. Can a functional interface extend/inherit another interface?
Yes, a functional interface in Java can extend or inherit another interface. This allows you to create functional interfaces that build upon or implement other interfaces while still maintaining their functionalities.


### 17. What is the lambda expression in Java and How does a lambda expression relate to a functional interface?
A lambda expression in Java is a way to represent an anonymous function, a function that doesn't have a name and can be passed around as a parameter to other methods or stored in variables. A functional interface is an interface that contains exactly one abstract method. Such interfaces are designed to represent single abstract methods (SAMs) and are often used to represent functions or actions. Lambda expressions provide a syntax for implementing the abstract method of a functional interface.

### 18. In Java 8, what is Method Reference?
Method reference in is a shorthand syntax that allows users to refer to methods or constructors without actually invoking them. It provides a way to express lambda expressions that just call an existing method or constructor.

### 19. What does the String::ValueOf expression mean?
The method reference String::valueOf refers to the valueOf method of the String class in Java. This method is a static method that converts different types of data into a string representation.

### 20. What are Intermediate and Terminal operations?
- Intermediate operations are operations that can be applied to a stream and produce another stream as a result. Examples: `map()`, `filter()`, `sorted()`.
- Terminal operations are operations that consume the elements of a stream and produce a result or side effect. Examples: `forEach()`, `collect()`, `reduce()`.

### 21. What are the most commonly used Intermediate operations?
`map()`, `filter()`, `flatMap()`, `distinct()`, `sorted()`, `limit()`. 

### 22. What is the difference between findFirst() and findAny()?
- `findFirst()` returns the first element of the stream, if any, that matches the condition.
- `findAny()` returns any element of the stream, if any, that matches the condition.

### 23. How are Collections different from Stream?
- Collections represent a group of objects, typically stored in data structures like lists, sets, maps, etc.
- Streams represent a sequence of elements that you can process sequentially or in parallel. Streams are lazily evaluated, meaning they don't store all the elements in memory at once. Instead, elements are processed as they are encountered in the stream pipeline.