1. Practice collection
2. What is the checked exception and unchecked exception in Java, could you give one example?

    Checked exceptions are checked at complie time, and unchecked exceptions are checked at runtime.

    Example of checked exception: IOException

    Example of unchecked exception: NullPointerException
    
3. Can there be multiple finally blocks?

    Each try block can have at most one finally block.
    Multiple try blocks can have multiple finally blocks.

4. When both catch and finally return values, what will be the final result?

      The value returned by finally block will be the final result.

5. What is Runtime/unchecked exception? what is Compile/Checked Exception?

      Runtime/unchecked exception: These exceptions are not checked at compile time, and they are checked at runtime. These exceptions are subclasses of RuntimeException.
   
      Compile/Checked Exception: These exceptions are checked at compile time. These exceptions are subclasses of Exception.

6. What is the difference between throw and throws?

      throw: throw keyword is used to throw an exception explicitly.
      
      throws: throws keyword is used to declare a method might throws expcetions.

7. Run the below three pieces codes, Noticed the printed exceptions. why do we put the Null/Runtime exception before Exception ?

    Null/Runtime exception should be put before Exception because Null/Runtime exception is a subclass of Exception. If we put Null/Runtime exception after Exception, the Null/Runtime exception will not be caught.

7. What is optional? why do you use it? write an optional example.

      Optional is a container object that may or may not contain a non-null value. It is used to avoid null pointer exceptions. 
   
      Example:
      ```java
      Optional<String> optional = Optional.of("Hello");
      System.out.println(optional.get());
      ```

8. Why finally always be executed ?

      finally block is always executed because it is used to release resources. It is executed even if an exception is thrown.

9. Practice collection problems here: https://github.com/TAIsRich/chuwa-eij-tutorial/tree/main/02-java-core/src/main/java/com/chuwa/exercise/collection
10. What are the types of design patterns in Java ?

      1. Creational Design Patterns
      2. Structural Design Patterns
      3. Behavioral Design Patterns

11. What are the SOLID Principles ?

      1. Single Responsibility Principle (SRP)
      2. Open-Closed Principle (OCP)
      3. Liskov Substitution Principle (LSP)
      4. Interface Segregation Principle (ISP)
      5. Dependency Inversion Principle (DIP)

12. How can you achieve thread-safe singleton patterns in Java ?

      1. Eager Initialization
      2. Static Block Initialization
      3. Lazy Initialization
      4. Thread Safe Singleton
      5. Bill Pugh Singleton Implementation

13. What do you understand by the Open-Closed Principle (OCP) ?

      Open-Closed Principle states that the software entities should be open for extension but closed for modification. It means that the behavior of a module can be extended without modifying its source code.

14. Liskov’s substitution principle states that if class B is a subtype of class A, then object of type A may be
substituted with any object of type B. What does this actually mean? (from OA ) choose your answer.

      1. It mean that if the object of type A can do something, the object of type B could also be able tp
      perform the same thing
      2. It means that all the objects of type A could execute all the methods present in its subtype B
      3. It means if a method is present in class A, it should also be present in class B so that the object of
      type B could substitute object of type A.
      4. It means that for the class B to inherit class A, objects of type B and objects of type A must be same.

   Answer: 1


