2.  What is the checked exception and unchecked exception in Java, could you give one example?

Checked exceptions are checked at compile-time, which means that the compiler checks if the program handles or declares the exceptions explicitly. If the program does not handle or declare a checked exception, it will not compile.

Example: IOException

Unchecked Exceptions are exceptional conditions that occur due to programming errors or environmental issues that are beyond the control of the program. These exceptions are not checked at compile-time, and it is the responsibility of the programmer to handle them during runtime.

Example: NullPointerException


3.  Can there be multiple finally blocks?

No.

4.  When both catch and finally return values, what will be the final result?

The result returned by finally

5.  What is Runtime/unchecked exception? what is Compile/Checked Exception?

See Q1

6.  What is the difference between throw and throws?

The throw keyword is used to explicitly throw an exception within the body of a method or a block of code.

The throws keyword is used in the method signature to declare the checked exceptions that a method might throw.

7.  Run the below three pieces codes, Noticed the printed exceptions. why do we put the Null/Runtime
    exception before Exception ?

It is recommended to place the catch blocks for more specific exception types before the catch blocks for more general exception types.
If you place the more general Exception catch block before the NullPointerException catch block, any NullPointerException thrown will be caught by the Exception catch block, and the more specific NullPointerException catch block will never be executed.


7.  What is optional? why do you use it? write an optional example.

In Java 8, Optional is a container object designed to provide a better way to handle null values.
```
String name = "John";
Optional<String> optionalName = Optional.ofNullable(name);
String defaultName = optionalName.orElse("Default Name");
```

8.  Why finally always be executed ?

It ensures that certain cleanup or resource-releasing operations are performed, even in exceptional situations.

10.  What are the types of design patterns in Java ?

Java design patterns are divided into three categories:
* creational 
* structural 
* behavioral

11.  What are the SOLID Principles ?

* Single Responsibility Principle
* Open/Closed Principle
* Liskov Substitution Principle
* Interface Segregation Principle
* Dependency Inversion Principle

12.  How can you achieve thread-safe singleton patterns in Java ?

Eager initialization: create the instance of the Singleton class at the time of class loading.

Lazy initialization with synchronized method: use synchronized keyword at getInstance method.

13.  What do you understand by the Open-Closed Principle (OCP) ?

Software entities (classes, modules, functions, etc.) should be open for extension but closed for modification. 
This means that you should be able to extend the behavior of a system without modifying its source code.

14.  Liskov’s substitution principle states that if class B is a subtype of class A, then object of type A may be
     substituted with any object of type B. What does this actually mean? (from OA ) choose your answer.
    
    1.  It mean that if the object of type A can do something, the object of type B could also be able tp
        perform the same thing
    
    2.  It means that all the objects of type A could execute all the methods present in its subtype B
    
    3.  It means if a method is present in class A, it should also be present in class B so that the object of
        type B could substitute object of type A.
    
    4.  It means that for the class B to inherit class A, objects of type B and objects of type A must be same.

I choose 3


15. Watch the design pattern video, and type the code, submit it to MavenProject folder