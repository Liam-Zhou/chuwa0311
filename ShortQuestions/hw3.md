
### Question6: What is Runtime Exception? could you give me some examples?
```
A RuntimeException in Java is a type of unchecked exception, which is a subclass of java.lang.Exception.
Runtime exceptions represent problems that are the result of a programming error, such as logic errors or improper use of an API.
Examples: NullPointerException, ArrayIndexOutOfBoundsException, ArithmeticException
```
### Question7: Could you give me one example of NullPointerException?
```java
String str = null;
int len = str.length();// This will throw NullPointerException because str is null
```

### Question8: What is the Optional class?
```
The Optional class in Java is a container object used to contain not-null objects. Introduced in Java 8, 
Optional is a means to prevent NullPointerException that can occur when a null value is accessed or manipulated. 
By using Optional, you can explicitly require a method caller to handle the case of a value being absent.
```
### Quesiton9: What are the advantages of using the Optional class?
```
It can prevent NullPointerException
```
### Question10: What is the @FunctionalInterface?
```
It is used to inditify an interface that only has one abstract method.
```
### Question11: what is lamda?
```
In Java, a lambda expression is a concise way to represent an anonymous function.
```
### Question12: What is Method Reference?
```
Method reference in Java is a feature that allows you to refer to methods or 
constructors of a class or object with a short syntax.
```
### Question13: What is Java 8 new features?
```
1. Lambda
2. optional
3. Stream API
4. Method Reference
```
### Question14: Lambda can use unchanged variable outside of lambda? what is the details?
```
Yes, the address of that variable cannot be changed, and the varitbla can be used in lambda.
```

### Question15: Describe the newly added features in Java 8?
```
1. Lambda: represent an anonymous function
2. optional: A container object used to contain not-null objects
3. Stream API: provides a high-level abstraction for Java collections by allowing bulk operations on data elements in a declarative manner
4. Method Reference: refer to methods or constructors of a class or object with a short syntax
```
### Question16: Can a functional interface extend/inherit another interface?
```
Yes, but it must have exactly one abstract method.
```
### Question17: What is the lambda expression in Java and How does a lambda expression relate to a functional interface?
```
Lambda expressions is used to implement instances of single-method interfaces using an expression.
lambda expressions can implement the abstract method of functional interface.
```
### Question18: In Java 8, what is Method Reference?
```
Method reference in Java is a feature that allows you to refer to methods or 
constructors of a class or object with a short syntax.
```
### Question19: What does the String::ValueOf expression mean?
```
It means the ValueOf method in String class
```
### Question20: What are Intermediate and Terminal operations?
```
Intermediate operations is used to process data, like map, filter
Terminate operation is used to collect data and end the stream pipeline
```
### Quesiton21: What are the most commonly used Intermediate operations?
```
filter(), limit(), skip(), distinct(), map(), flatmap(), sort()
```
### Question22: What is the difference between findFirst() and findAny()?
```
findFirst() wil return the first element in stream
findAny will return any elements that matches the query from stream
```
### Question23: How are Collections different from Stream?
```
Both of them are used to work with group of objects.
Collections are about storing and directly managing groups of elements, while streams are about describing computations on sequences of elements.
Collection operations are eager and performed immediately, while stream operations are lazy and only executed when necessary.
```