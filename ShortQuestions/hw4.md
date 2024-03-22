### Question1:
```
In folder Coding/collection
```
### Question2: What is the checked exception and unchecked exception in Java, could you give one example?
```
Checked exceptions are exceptions that must be either caught or declared in the method where they can be thrown. 
Example: IOException
Unchecked exceptions are exceptions that are not checked at compile-time, the compiler does not require these exceptions to be caught or declared with a throws clause. 
Example: NullPointerException
```
### Question3: Can there be multiple finally blocks?
```
No, each try block can only have one finally block.
```
### Question4: When both catch and finally return values, what will be the final result?
```
If both catch and finally blocks contain return statements, 
the value returned from the finally block will be the final result, 
overriding any value returned from the catch block or the try block itself.
```
### Question5: What is Runtime/unchecked exception? what is Compile/Checked Exception?
```
Checked exceptions are exceptions that must be either caught or declared in the method where they can be thrown. 
Example: IOException
Unchecked exceptions are exceptions that are not checked at compile-time, the compiler does not require these exceptions to be caught or declared with a throws clause. 
Example: NullPointerException
```
### Question6: What is the difference between throw and throws?
```
throw: is used to explicitly throw an exception from a method or any block of code.
throws:  is used in the signature of a method to indicate that this method might throw one or more exceptions during its execution.
```
### Question7: Run the below three pieces codes, Noticed the printed exceptions. why do we put the Null/Runtime exception before Exception ?
```
Because we need to catch the more specifix exceptions before the general exceptions.
```
### Question7: What is optional? why do you use it? write an optional example.
```java
//Optional is a container object used to represent presence or absence of a value. 
//We use it to avoid NullPointerException, and massive IF statement, to increase the readability.
public Optional<User> findUserById(String userId) {
        User user = getUserFromDatabase(userId);
        return Optional.ofNullable(user);
        }

```
### Question9: Why finally always be executed ?
```
The finally block is used for clear. It is always executed to make sure the connection is closed or the opened file is closed.
```
### Question10: What are the types of design patterns in Java ?
```
Creational Patterns: Singleton Pattern, Factory Method Pattern
Structural Patterns: Adapter Pattern, Composite Pattern
Behavioral Patterns: Observer Pattern, Strategy Pattern
```

### Question11: What are the SOLID Principles ?
```
Single Responsibility Principle: A class should have one, and only one, reason to change, meaning it should have only one job or responsibility.
Open/Closed Principle: Software entities should be open for extension but closed for modification.
Liskov Substitution Principle: Objects of a superclass shall be replaceable with objects of a subclass without affecting the correctness of the program.
Interface Segregation Principle: No client should be forced to depend on methods it does not use. This principle suggests that multiple, 
specific client interfaces are better than one wide-ranging interface.
Dependency Inversion Principle: High-level modules should not depend on low-level modules. Both should depend on abstractions. 
```
### Question12: How can you achieve thread-safe singleton patterns in Java ?
```java
// We can use Eager singleton pattern:
public class SingletonEager {
    private static final SingletonEager instance = new SingletonEager();

    private SingletonEager() {}

    public static SingletonEager getInstance() {
        return instance;
    }
}
```
### Question13: What do you understand by the Open-Closed Principle (OCP) ?
```
The class is open for extension but closed for modification. It means, we can add extension method to the class, 
but not to modify the class content directly.
```
14.Liskov’s substitution principle states that if class B is a subtype of class A, 
then object of type A may be substituted with any object of type B. 
What does this actually mean? (from OA ) choose your answer.
Answer: It means that if the object of type A can do something, the object of type B could also be able tp
   perform the same thing