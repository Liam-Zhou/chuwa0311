1. Write up Example code to demonstrate the three foundamental concepts of OOP. (reference Code Demo repo as example)

   [Encapsulation](https://github.com/CTYue/chuwa-eij-tutorial/blob/main/02-java-core/src/main/java/com/chuwa/tutorial/t02_oop/encapsulation/Encapsulation.java);

   ```java
   class User{
   	String name;
       String number;
       
       public void setName(String name) {
           this.name = name;
       }
       public String getName(){
           return name;
       }
       
       public void setNumber(String number) {
           this.number = number;
       }
       public String getNumber(){
           return number;
       }
   }
   ```

   

   [Polymorphism](https://github.com/CTYue/chuwa-eij-tutorial/blob/main/02-java-core/src/main/java/com/chuwa/tutorial/t02_oop/polymorphism/Shape.java);

   ```java
   class Person {
   	public void run() {
           System.out.println("A persosn is running...");
       }
   }
   class Student extends Person {
       @override
       public void run() {
           System.out.println("The student is running...");
       }
   }
   ```

   

   [Inheritance](https://github.com/CTYue/chuwa-eij-tutorial/blob/main/02-java-core/src/main/java/com/chuwa/tutorial/t02_oop/abstractclass_interface/Person.java);

   ``` java
   abstract class Person {
   	public abstract void run();
   }
   interface Ability {
   	default void runSomething();
   }
   ```

   

2. What is wrapper class in Java and Why we need wrapper class? 

   $Ans.$ In Java, a wrapper class is a class that provides an object representation of primitive data types. Wrapper classes are used to convert primitive data types into objects (i.e., boxing) and objects back into primitive data types (i.e., unboxing). They are particularly useful in scenarios where objects are required, such as collections (like `ArrayList`, `HashMap`, etc.), or when using features such as generics, which require objects rather than primitives, or initializing with `null`.

3. What is the difference between HashMap and HashTable?

   | HashMap                                                      | HashTable                            |
   | ------------------------------------------------------------ | ------------------------------------ |
   | not synchronized and is not thread-safe.                     | synchronized and is thread-safe.     |
   | allows `null` as both key and value. It permits one null key and multiple null values | does not allow `null` keys or values |
   | better performance                                           | lower performance                    |

   

4. What is String pool in Java and why we need String pool? 

   $Ans. $ String Pool is possible only because String is Immutable in Java. String pool is a special storage area in Java heap. If the string is already present in the pool, then instead of creating a new object, old object’s reference is returned. This way different String variables can refer to the same reference in the pool, thus saving a lot of heap space also. If String is not immutable then changing the string with one reference will lead to the wrong values to other string variables having the same reference.

5. What is Java garbage collection?

   $Ans.$ Garbage collection in java is the process of looking at heap memory, identifying which objects are in use and which are not and deleting the unused objects. An unused object or unreferenced object, is no longer referenced by any part of your program.

6. What are access modifiers and their scopes in Java? 

   - **public**: Accessible from anywhere.
   - **protected**: Accessible within the same package and by subclasses, even if they are in different packages.
   - **default (no modifier)**: Accessible only within the same package.
   - **private**: Accessible only within the same class.

7. What is final key word? (Filed, Method, Class)

   $Ans.$ If you use final with a primitive type variable, then its value cannot be changed once assigned.
   If you use final with a method, then you cannot override it in the subclass.
   If you use final with class, then that class cannot be extended.
   If you use final with an object type, then that object cannot be referenced again.

8. What is static keyword? (Filed, Method, Class). When do we usually use it?

   $Ans.$ In Java, a static member is a member of a class that isn’t associated with
   an instance of a class. Instead, the member belongs to the class itself. All the members with static will be compiled within compiling period, which is different from runtime period. 

   In Java, Static is applicable for the following:

   - **Static Variable**: Only single copy of the variable in the class gets created and all instances of the class share same static variable. The static variable gets memory only once in the class area at the time of class loading.
   - **Static Method**: These methods belong to the class rather than the object of the class. As a result, a static method can be directly accessed using class
     name without the need of creating an object. For example,  the collections' methods, such as `Collections.sort()`
   - **Static Block**: Static block gets executed exactly once when the class is first loaded, use static block to initialize the static variables.
   - **Static nested classes**: Static nested classes can access only the static members of the outer class. 

9. What is the differences between overriding and overloading?

   | overloading                                 | overriding                                      |
   | ------------------------------------------- | ----------------------------------------------- |
   | At compile time(better performance)         | At runtime(less performance)                    |
   | Private and final methods can be overloaded | Private and final methods can NOT be overridden |
   | Return type doesn't matter                  | Return type must be same                        |
   | arguments must be different                 | arguments must be the same                      |
   | in the same class                           | in parent and child class                       |

   

10. What is the differences between super and this?

    $Ans.$ `this` is a reference to the current object instance within an instance method or constructor. `super` is a reference to the superclass of the current object instance.

11. What is the Java load sequence?

    1. **Loading**: The class loader locates the binary representation of the class or interface and loads it into memory. The loading process reads the class file from the file system, network, or other sources, and creates a `Class` object representing the class in memory.
    2. **Linking**:
       - **Verification**: The JVM verifies the bytecode of the class to ensure that it follows the rules and constraints of the Java language and the JVM specification. This step checks for various security and structural issues in the class file.
       - **Preparation**: Static fields are allocated memory space and initialized with default values (e.g., `0` for numeric types, `null` for object references, `false` for boolean types). This step prepares the class for initialization.
       - **Resolution**: Symbolic references in the class are resolved to concrete references. This includes resolving symbolic references to other classes, fields, and methods.
    3. **Initialization**: The static variables and static initializers of the class are executed in the order they appear in the code. This step initializes the class, including executing static initializer blocks and initializing static fields with explicit values.

12. What is Polymorphism ? And how Java implements it ? 

    $Ans.$ Polymorphism is the process in which an object or function takes different forms.
    There are 2 types of Polymorphism :

    - Compile Time Polymorphism (Method Overloading)
    - Run Time Polymorphism (Method Overriding)

    In Method overloading, two or more methods in one class have the same method name but different arguments.
    Overriding means when we have two methods with same name and same parameters in parent and child class.

13. What is Encapsulation ? How Java implements it? And why we need encapsulation? 

    $Ans.$​ Encapsulation is a process of Binding data and methods within a class. 

    Java provides every features in the field a setter and a getter to allow outer member to access the features and sets the features as private entries to ensure encapsulation.

    By encapsulating data and providing controlled access through methods, encapsulation protects the integrity of the data from accidental or unauthorized modification. It also allows for validation and enforcement of constraints on the data.

14. What is Interface and what is abstract class? What are the differences between them?

    $Ans.$ An interface in Java is a reference type, similar to a class, that can contain only abstract methods, default methods, static methods, and constant (final) fields. An abstract class in Java is a class that cannot be instantiated on its own and can contain both abstract and concrete methods.

    - Abstract class methods can have access modifiers other than public but interface methods are implicitly public and abstract

    - Abstract class can have final, non-final, static and non-static variables but
    interface variables are only static and final
    - A subclass can extend only one abstract class but it can implement multiple
    interfaces
    - An Abstract class can extend one other class and can implement multiple interfaces but an interface

15. design a parking lot (put the code to codingQuestions/coding1 folder, ) If you have no ability to design it, please find the solution in internet, then understand it, and re-type it.(Do NOT just copy and paste)

    

16. What are Queue interface implementations and what are the differences and when to use what? 

    $Ans.$ In Java, the `Queue` interface represents a collection of elements with a specific order for processing. Elements are typically processed in a first-in, first-out (FIFO) manner.

    1. **LinkedList**: provides a doubly linked list implementation for situations where frequent additions or removals are required from both the beginning and end of the queue.
    2. **PriorityQueue**: unbounded priority queue implementation  for scenarios where elements need to be processed based on priority rather than insertion order.