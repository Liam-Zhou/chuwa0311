1. Practice collection

2. What is the checked exception and unchecked exception in Java, could you give one example?

   - Checked Exceptions: All exceptions other than RuntimeException and Error are known as Checked exception. These exceptions are checked by the compiler at the compile time itself. E.g. when you are trying to read from a file, then compiler enforces us to handle the FileNotFoundException because it is possible that the file may not be present. Some other checked exceptions are SQLException, IOExceptionetc.

   - Unchecked Exceptions: Runtime Exceptions are known as Unchecked exceptions. Compiler does not force us to handle these exceptions but
   as a programmer, it is our responsibility to handle runtime exceptions e.g. NullPointerException, ArithmeticException, ArrayIndexOutOfBoundException etc.

3. Can there be multiple finally blocks?

   $Ans.$ There is only **one** finally block for each try block.

4. When both catch and finally return values, what will be the final result?

   $Ans.$ The returned value in finally blocks.

5. What is Runtime/unchecked exception? what is Compile/Checked Exception?

   $Ans.$ Runtime exception = unchecked exception.

   Compile exception = checked exception. The explanation is in Q#2.

6. What is the difference between throw and throws?

   $Ans.$ "throw" is a keyword used to explicitly raise an exception within a method or block of code. "throws" is a keyword used in method declarations to specify the exceptions that might be thrown by that method.

7. Run the below three pieces codes, Noticed the printed exceptions. why do we put the Null/Runtime exception before Exception ?

  $Ans.$ The Null/Runtime exception is inheritance of Exception. It has an small range than Exception. Also, when we catch the first exception in the codes, we will directly stop catching other exceptions. In order to catch the premise results for exceptions we need to put the concrete exception above the abstract one.

8. What is optional? why do you use it? write an optional example.

  $Ans.$ In Java, Optional is a container object that may or may not contain a non-null value. 

  Optional is primarily used to address the problem of NullPointerExceptions (NPEs) that often arise when dealing with null values. 

  ```java
  streetName = Optional.ofNullable(userMap.get(2))
  				.map(User::getAddress)
  				.map(Address::getStreet)
  				.orElse("Unknown");
  ```

  

9. Why finally always be executed ?

   $Ans.$ The `finally` block is typically used to perform cleanup operations such as closing files, releasing resources, or closing database connections. These operations are essential for maintaining the integrity of the program and ensuring that resources are properly managed, regardless of whether an exception occurs.

10. Practice collection problems here: https://github.com/TAIsRich/chuwa-eij-tutorial/tree/main/02-java-core/src/main/java/com/chuwa/exercise/collection

11. What are the types of design patterns in Java ?

    1. **Creational Design Patterns**:
       - These patterns focus on the process of object creation, providing flexibility and reusability in creating objects.

    2. **Structural Design Patterns**:
       - Structural patterns deal with the composition of classes or objects to form larger structures and provide new functionality.
       - They help in defining how objects and classes are connected to form larger structures.

    3. **Behavioral Design Patterns**:
       - Behavioral patterns are concerned with the interaction between objects, defining how they communicate and collaborate to fulfill specific tasks.
       - They focus on the responsibilities and algorithms of objects.

12. What are the SOLID Principles ?

    1. **Single Responsibility Principle (SRP)**:
       - A class should have only one reason to change, meaning that a class should have only one responsibility.
       - This principle advocates for designing classes that have a single purpose or responsibility, making them easier to understand, modify, and maintain.
    2. **Open/Closed Principle (OCP)**:
       - Software entities (classes, modules, functions, etc.) should be open for extension but closed for modification.
       - This principle encourages the design of systems in a way that allows new functionality to be added through extension or subclassing without altering existing code.
    3. **Liskov Substitution Principle (LSP)**:
       - Objects of a superclass should be replaceable with objects of a subclass without affecting the correctness of the program.
       - This principle emphasizes that subclasses should be able to substitute their parent classes without introducing errors or unexpected behavior.
    4. **Interface Segregation Principle (ISP)**:
       - A client should not be forced to depend on interfaces it does not use.
       - This principle suggests that interfaces should be specific to the needs of the clients that use them, rather than being general-purpose interfaces that require clients to implement unnecessary methods.
    5. **Dependency Inversion Principle (DIP)**:
       - High-level modules should not depend on low-level modules. Both should depend on abstractions.
       - Abstractions should not depend on details; details should depend on abstractions.
       - This principle encourages the use of abstractions (e.g., interfaces or abstract classes) to decouple high-level modules from low-level implementation details, promoting flexibility and easier maintenance.

13. How can you achieve thread-safe singleton patterns in Java ?

    Eager Initialization with Synchronized Method Or Static Initialization Holder Class*

14. What do you understand by the Open-Closed Principle (OCP) ?

    - Software entities (classes, modules, functions, etc.) should be open for extension but closed for modification.
    - This principle encourages the design of systems in a way that allows new functionality to be added through extension or subclassing without altering existing code.

15. Liskov’s substitution principle states that if class B is a subtype of class A, then object of type A may be substituted with any object of type B. What does this actually mean? (from OA ) choose your answer.

    It mean that if the object of type A can do something, the object of type B could also be able to perform the same thing

    

