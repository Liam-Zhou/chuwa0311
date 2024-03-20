## 1. What is generic type in Java?

Generic type is same with the idea of meta programming, it allows you define a sequence of behavior without speicify the object. It is similar to C++'s template class
For example, the List<T> is a generic type, at the time you define it, you have no idea what T is, T can be Integer, Charaters or something else. List it self includes some functionality, but you do not need to know what T is to define those functionality.

## 2. Read code and type it

Please refer to the Codings folder

## 3. practice stream API

Please refer the Codings folder

## 4. practice Optional

Please refer the Codings folder

## 5. Write the Singleton design pattern include eager load and lazy load
```
// Singleton

//Eager Load
public class Singleton{
	// 1. private static variable
	private static singleton instance = new Singleton();

	// 2. private constructor, external usage is impossible
	private Singleton() {}

	// 3. static getInstance method: You can call this method without any instance
	public static Singleton getInstance() {
		return instance;
	}
}

Singleton is NOT nulle
Singleton.getInstance();


//Lazy load: the Singleton instance is created when the SingletonHolder class is loaded and initalized.
// This occurs only when the getInstance() method is called for the first time, ensuring lazy initialization.
// Since class loading and initialization are thread-safe in Java, this approach guarantees that the singleton instance is created only once
// even in a multi-threaded environment

public class Singleton{
	// private constructor to prevent instantiation from outside of the class
	private Singleton() {}

	static{}

	//static inner class to hold the Singleton instance
	private static class SingletonHolder {
		private static final Singleton INSTANCE = new Sington();
	}

	public static Singleton getInstance() {
		return SingletonHolder.INSTANCE;
	}
}

```

## 6. What is Runtime exception? Examples?

Runtime exception is the exception ocurrs during the program execution.
It is different from checked exceptions, which must be explicitely handled by the code or decleared in the method signature， runtime exceptions do not need to be caught or declear in advance, the compiler won't enforce to deal with that.

Examples:
- NullPointerException
- ArrayIndexOutOfBoundException
- ArithemticException
- ClassCastException
- NumberFormatException

## 7.One example of NullPointerException?

```
public class NullPointerExceptionExample {
    public static void main(String[] args) {
        String str = null;
        int length = str.length(); // This will throw a NullPointerException
    }
}
```

## 8.What is Optional class?
It is a new feature in Java 8, it is a container class, and you can put an optional value, meaning a value that it may or may not present. 

## 9. Advantage of using Optional class?
In this way, you will do a null check much easier. Furthermore, it also more safe when you write code.

## 10. What is the @FunctionalInterface?
It can make a interface be functional interface, and the interface will have one and only one abstract method. This design is for the lambda function usage

## 11.what is lambda
It is a way to write anonymous function, it suppors functional programming feature, the function syntax is concise

## 12.What is Method reference?
it's a syntex to refer to a method
```
ContainingClass::methodName
```

## 13. What is Java 8 new features
It is new features introduced in Java 8, most import features includes:
- Lambda expression
- functional interfaces
- Stream API
- Method reference
- Optional class

## 14. Lambda can use unchanged variable outside of lambda? What is the detail?
Yes, but it must be final or effectively final, the address of the variable should not be changed since the lambda function should executed in the same thread

## 15. Describe the newly added features in Java 8
- Lambda expression: you can define anomynous function, it is much more concise compare with regular functiosn
- Stream API: you can use it to process collections of data using provided method
- Optional class: a container class that you may or may not put an object in it

## 16. Can a functional interface extend/inherit another interface
Yes

## 17. What is the lambda expression in Java and How does a lambda expression relate to a functional interface?
It is a way to write anonymous function, it suppors functional programming feature, the function syntax is concise.

The functionalInterface is a special interface that it will contain one and only one abstract method, and when you write a lambda function, you are implementing that abstract method. Since there is one and only one abstract method, the compiler will know you are implementing that abstract function, you do not need to put the abstract function name, it makes the lambda function syntax very concise

## 18. In Java 8, what is Method Reference?
it's a syntex to refer to a method
```
ContainingClass::methodName
```

## 19. What does the String::ValueOf expression mean?
It use the method reference to call valueOf method.

The ValueOf() method in the String class is overloaded to accept various type of parameters and convert them into their string representations. When used in a method reference context, String::valueOf can be thought of  as a function taht takes an input argument and calls the ValueOf mtehod on the String class with that argument 

## 20 What is intermediate and terminal operation
those are two kinds of operations in StreamAPI

Intermediate operation can applied to data collections and do filter or transform operation, examples include:
- filter()
- map()
- distinct()
- sorted()

Terminate operation produce a result or side-effect and mark the end of a stream
- forEach()
- collect()
- reduce()
- count()
- min()
- max()

## 21. What is the most commonly used intermediate operations?
- filter
- distinct
- skip
- limit
- map
- flatmap

## 22. What is the difference between findFirst() and findAny()?
findFirst() will return the first element of the stream, findAny() will return any element of the stream, find first guarantee the order, but findAny does not guarantee the order.

## 23. How are Collections different from Stream?
- collections are mutable, stream is immutable
- collections use eager evaluation, stream use lazy evaluation
- collections store the data in memory, stream does not store data
