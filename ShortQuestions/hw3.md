## 1. What is generic in Java? and type the generic code by yourself.
- https://github.com/TAIsRich/chuwa-eij-tutorial/tree/main/02-java-core/src/main/java/com/chuwa/tutorial/t01_basic/generic

Generics is a feature that allows you to write classes, interfaces, and methods with type parameters. This means you can specify a type of object that a collection can contain, or a type of object that a class can operate on, when you declare or instantiate it.

## 2. Read those codes and type it one by one by yourself. the push the code to your branch.
- https://github.com/TAIsRich/chuwa-eij-tutorial/tree/main/02-java-core/src/main/java/com/chuwa/tutorial/t06_java8
  
## 3. practice stream API at least 3 times
- https://blog.devgenius.io/15-practical-exercises-help-you-master-javastream-api-3f9c86b1cf82
  
## 4. Practice Optional methods at least 2 times
- https://github.com/TAIsRich/chuwa-eij-tutorial/blob/main/02-java-core/src/main/java/com/chuwa/tutorial/t06_java8/exercise/ShoppingCartUtil.java
  
## 5. Write the Singleton design pattern include eager load and lazy load. 
- Eager Loading Singleton
```
public class Singleton {

    private static Singleton instance = new Singleton();
    
    private Singleton() {
    }
    
    public static Singleton getInstance() {
        return instance;
    }
}
Singleton is NOT null
Singleton.getInstance();
```

-lazy load
```
public class Singleton {

    private Singleton() {
    }
    
    static{
    }
    
    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }
    
    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
```
## 6. What is Runtime Exception? could you give me some examples?
Runtime exception, aka unchecked exception, will not be checked by the compiler. Compiler will not force us to handle these exceptions. Examples: NullPointerException, ArithmaticException, ArrayIndexOutOfBoundException.

## 7. Could you give me one example of NullPointerException?
public class NullPointerExceptionExample {
    public static void main(String[] args) {
        String text = null; 
        int length = text.length(); 
        System.out.println("Length of the string: " + length);
    }
}

## 8. What is the Optional class?
The Optional class in Java is a container object which may or may not contain a non-null value. It is introduced to avoid Null checks and run time NullPointerExceptions.

## 9. What are the advantages of using the Optional class?
- By forcing the developer to address the presence or absence of a value, Optional helps in reducing the chances of inadvertently dereferencing null and encountering a NullPointerException
- The use of Optional makes it explicitly clear that a variable can either hold a value or not, and thus have clear semantics.

## 10. What is the @FunctionalInterface?
A specific kind of interface that must have one and only one abstract method.

## 11. what is lamda?
Lambda is the implementation of the abstract method to Replace anonymous inner class and can work with functional interface.

## 12. What is Method Reference?
Method reference allows you to refer directly to methods of existing classes or objects using a compact, easy-to-read syntax. Method references can be seen as shorthand, or syntactic sugar, for lambda expressions used to call methods. 

## 13. What are some Java 8 new features?
Lambda, method reference, Optional Class, Stream API, Default Methods in Interfaces.

## 14. Lambda can use unchanged variable outside of lambda? what is the details?
The variable has to be final or effectively final. Or, saying in another way, the memory address of the variable must not change.

## 15. Describe the newly added features in Java 8?
Lambda, method reference, Optional Class, Stream API, Default Methods in Interfaces.

## 16. Can a functional interface extend/inherit another interface?
Yes.

## 17. What is the lambda expression in Java and How does a lambda expression relate to a functional interface?
Lambda expressions are essentially a shorthand notation for instances of functional interfaces. When you write a lambda expression, you are creating an instance of a functional interface without having to use an anonymous class. The lambda expression matches the signature of the single abstract method in the functional interface, and its body provides the implementation.

## 18. In Java 8, what is Method Reference?
Same as above.

## 19. What does the String::ValueOf expression mean?
When you use String::valueOf, you're essentially providing a shorthand for a lambda expression that calls one of the valueOf methods to converts different types of values into their string representation.

## 20. What are Intermediate and Terminal operations?
Intermediate operations are primarily used to process data in stream.
Terminal operations are usually used to collect data. Once there is a terminal operation, the stream pipeline will stop.

## 21. What are the most commonly used Intermediate operations?
⼀，筛选
1. filter(Predicate p) - 接受lambda, 从流中排出某些元素
2. limit(n) - 截断流，使其元素不超过给定的数量
3. skip(n) - 跳过前n个元素
4. distinct() - 筛选，通过元素的hashcode(), equals()去除重复元素
   
⼆，映射
1, map(function f) element -> black box(f) -> return new element
2, flatMap(function f) 

三， 排序
1, sort

## 22. What is the difference between findFirst() and findAny()?
- findFirst - 返回第⼀个元素
- findAny - 返回当前流中的任意元素

## 23. How are Collections different from Stream?
- Collections focus on efficient management and access to data, while Streams focus on expressing complex computation tasks such as filter-map-reduce transformations.
- Collections are mutable and directly modifiable; Streams are immutable and describe a fixed set of operations.
- Collections are primarily about storing and accessing a group of elements. They are data structures (e.g., List, Set, Map) that hold elements.
- Streams are about defining a pipeline of operations on a source of elements.
