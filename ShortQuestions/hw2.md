#### 1. Write up example code to demonstrate the three fundamental concepts in OOP.

1. Encapsulation

   ```java
   class Student {
       private int age;
       private String name;
       private String phoneNumber;
       private int grade;
   
     	// Getters and Setters
       public int getGrade() {
           return grade;
       }
   
       public void setGrade(int grade) {
           this.grade = grade;
       }
   
       public int getAge() {
           return age;
       }
   
       public void setAge(int age) {
           this.age = age;
       }
   
       public String getName() {
           return name;
       }
   
       public void setName(String name) {
           this.name = name;
       }
   
       public String getPhoneNumber() {
           return phoneNumber;
       }
   
       public void setPhoneNumber(String phoneNumber) {
           this.phoneNumber = phoneNumber;
       }
   }
   ```

2. Polymorphism

   Dynamic Polymorphism - Override

   ```java
   public class Sound {
       private int decibel;
       private String format;
   
       public int getDecibel() {
           return decibel;
       }
   
       public void setDecibel(int decibel) {
           this.decibel = decibel;
       }
   
       public String getFormat() {
           return format;
       }
   
       public void setFormat(String format) {
           this.format = format;
       }
   
       public void makeSound() {
           System.out.println("Make a " + "\""+ format + "\"" + "sound with " + decibel + " decibel");
       }
   }
   ```

   ```java
   class DogSound extends Sound {
       @Override
       public void makeSound() {
           System.out.println("Bark");
       }
   }
   
   class CatSound extends Sound {
       @Override
       public void makeSound() {
           System.out.println("Meow");
       }
   }
   ```

   ```java
   public class Main {
       public static void main(String[] args) {
           Sound dogSound = new DogSound();
           dogSound.makeSound();
           Sound catSound = new CatSound();
           catSound.makeSound();
       }
   }
   ```

   Static Polymorphism - (Method) Overload

   ```java
   public class Utility {
       private static final Utility utility = new Utility();
       private Utility() {
           
       }
   
       public static Utility getInstance() {
           return utility;
       }
   
       public static int add(int a, int b) {
           return a + b;
       }
   
       public static double add(double a, double b) {
           return a + b;
       }
   }
   ```

3. Inheritance

   ```java
   public class Cookware {
       public int price;
       public String functionality;
       
       public void use() {
           System.out.println("Spend $" + price + " to use for " + functionality);
       }
   }
   ```

   ```java
   public class Pan extends Cookware{
       public int price;
       public String functionality;
   
       @Override
       public void use() {
           System.out.println("Use fire to heat");
       }
   }
   ```

   ```java
   public class RiceCooker extends Cookware{
       public int price;
       public String functionality;
   
       @Override
       public void use() {
           System.out.println("Use electricity to heat");
       }
   }
   ```

#### 2. What is wrapper class in Java and why we need wrapper class?

In Java, a wrapper class is a class that encapsulates primitive data type into objects. The purpose is to 	treat primitive data types as objects such that they can be used in collections, generics, etc.

#### 3. What is the difference between HashMap and HashTable?

HashMap and HashTable are both implementations of the Map interface. But they have differences in 	terms of functionality, performance and synchronization

- Synchronization
  - HashTable: synchronized, thread-safe
  - HashMap: not synchronized by default

 - Null values
   - HashTable: does not allow null keys or values
   - HashMap: allows one null key and any number of null values

- Performance
  - HashTable: due to synchronization, slower operation compared to HashMap in a single threaded environment. In multi-threaded environments, the performance overhead of synchronization can be significant
  - HashMap: does not have overhead of synchronization

#### 4. What is String pool in Java and why we need String pool?

String pool is a pool of unique, immutable String objects stored in heap. When a String is created using a string literal, JVM first checks the String pool. If an identical string already exists, the existing reference to that String object will be returned. If not, a new String object is created in the pool.

1. Memory efficiency: multiple references to the same string literal do not result in multiple string objects consuming memory
2. Immutability: strings are immutable once created. It is safe to reuse string objects from the pool.
3. Performance optimization: when comparing strings using ".equals()" method, if both strings are from the string pool and have the same content, the comparison can be done quickly by comparing references instead of comparing individual characters.

#### 5. What is Java garbage collection?

GC is a process by which the JVM automatically manages memory in Java programs. It's responsible for identifying and reclaiming memory that is no longer in use by the program, making it available for future allocation.

#### 6. What are access modifiers and their scopes in Java

Access modifiers are keywords used to control the accessibility or visibility of classes, methods, and other members within a Java program.

- Public: declarations are visible everywhere
- Default: declarations are visible only within the package (package private)
- Protected: declarations are visible within the package or all subclasses
- Private: declarations are visible within the class only

#### 7. What is final key word? (Field, Method, Class)

- Field: define constants
- Method: prevent override
- Class: prevent inheritance and make class immutable

#### 8. What is static keyword? (Field, Method, Class). When do we usually use it?

The 'static' keyword is used to declare members that belong to the class itself, rather than to the instances of the class.

- Field: only one instance for this field
- Method: can directly call static method using class name, usually used for utility methods
- Class: static nested classes are nested within another class and declared static. They can be accessed without instantiating the outer class.

#### 9. What is the differences between overloading and overiding?

- Overloading happens at compile time. Overriding happens at runtime
- Private and final methods can be overloaded. Private and final methods can not be overidden.

- Return type of method does not matter in overloading. Return type of methods must be the same in overriding.
- Parameter signature must be different in overloading. Arguments must be the same in overriding.
- Overloading is done in the same class. Overriding requires parent and child class.

#### 10. What is the differences between super and this keyword?

- super: Used to  refer to members of the superclass (the class from which the current class is derived). It is used to access superclass methods, constructors and fields.
- this: Used to refer to the current instance of the class. It can be used to access instance variables, invoke constructors, or call methods within the current class

#### 11. What is the Java load sequence?

1. Loading: the class loader loads the bytecode of a class into memory.
2. Linking: 
   - Verification: The bytecode of the loaded class is verified to ensure it is structurally correct and does not violate any security constraints.
   - Preparation: Static fields are initialized to their default values.
   - Resolution: Symbolic references (references to other classes, methods, or fields) in the class are resolved to concrete references

3. Initialization: The static initialization blocks and static variables are executed in the order they appear in the class file.
4. Class initialization: Initialization of the class
5. Usage: The class is ready for use

#### 12. What is Polymorphism? How Java implements it?

Polymorphism refers to the same object exhibiting different forms and behaviors. It is achieved through method overriding and method overloading.

#### 13. What is Encapsulation? How Java implements it? Why we need Encapsulation?

Encapsulation refers to binding the data and the methods to manipulate that data together in a single unit (class). For example, the getter and setter methods instead of direct access. It serves to hide the internal state of an object and restrict access to it from outside the class.

#### 14. What is Interface and what is abstract class? What are the differences between them?

An interface in Java is a reference type that defines a set of abstract methods (methods without a body) and  constants. Interfaces support multiple inheritance, meaning a class can implement multiple interfaces.

An abstract class is a class that cannot be instantiated directly and may contain abstract methods as well as concrete methods with implementations. Abstract classes can have constructors, instance variables, and non-abstract methods in addition to abstract methods. Abstract methods are declared within a body and must be implemented by subclasses. Unlike interfaces, abstract classes can extend only one abstract class.

In summary, interfaces are used when there is **a set of behaviors that all subclasses must support**, but the implementation details can vary. Abstract classes are used when there is some **common behavior that all subclasses must share**.

#### 15. Design a Parking Lot

See code.

#### 16. What are Queue interface implementations and what are the differences and when to use what?

ArrayDeque implements Queue interface. It provides APIs such as offerFirst(), offerLast(), pollFirst(), pollLast(), and can be used as a FIFO queue or FILO stack data structure.

LinkedList implements Queue interface. It provides APIs such as add(), remove(), element() and can be used as a FIFO queue data structure.

PriorityQueue implements Queue interface. It is also known as heap data structure. It is used to maintain dynamic data with certain priority. Elements are ordered according to their natural ordering or by a specified behavior (priority)













