1. see Coding/Collection packages
2. 
* A checked exception is caught at compile, and it must be handled either by re-throwing or with a try catch block.
*  An unchecked exception is caught at runtime and isn't required to be handled.

3. No

4. When both catch and finally return values, the final value would be returned by finally

5. 
* An unchecked exception/ runtime exception is something has gone wrong with the program and is unrecoverable, and this type of exception doesn't need to be handled.

* A Compile exception/ Checked exception is are checked by the compiler during the compilation process to confirm whether the exception is handled by the programmer or not. If not, then the system displays a compilation error.

6. The Throw keyword is used inside a method. Whereas the Throws keyword is used in the method signature.
7. Catch scope should be from small to large.
8. Optional is a new type introduced in Java 8. It is used to represent a value that may or may not be present.
9. The finally block always executes when the try block exits. This ensures that the finally block is executed even if an unexpected exception occurs.
10. Java design patterns are divided into three categories - creational, structural, and behavioral design patterns
11. 
* Single Responsibility
* Open/Close
* Liskov Substitution
* Interface Segregation
* Dependency Inversion
12. 
* Create the private constructor to avoid any new object creation with new operator.
* Declare a private static instance of the same class.
* Provide a public static method that will return the singleton class instance variable.
13. Classes, modules, functions, etc. should be open for extension, but closed for modification. An entity can allow its behaviour to be extended without modifying its source code.
14. 1. It means that if the object of typeA can do something,the object of typeB could also be able to perform the same thing