# Homework 2
1. #### Write up Example code to demonstrate the three foundmental concepts of OOP. (reference Code Demo repo as example)

   ```java
    //Encapsulation
    class Animal {
    private String name;
    private String sound;
    public Animal(String name, String sound) {
        this.name = name;
        this.sound = sound;
    }

    public void speak() {
        System.out.println(name + " says " + sound);
        }
    }
     ```
 
     ```java
   // Inheritance
    class Dog extends Animal {
        private String breed;
    
        public Dog(String name, String sound, String breed) {
            super(name, sound); 
            this.breed = breed;
        }
    
        public void fetch(String item) {
            System.out.println(name + ", the " + breed + ", fetches the " + item);
        }
    }
    ``` 
    ```java
   // Polymorphism
    public class Main {
        public static void main(String[] args) {
            Animal genericAnimal = new Animal("Generic animal", "some sound");
    
            Dog buddy = new Dog("Buddy", "Woof!", "Golden Retriever");
    
            genericAnimal.speak(); 
            buddy.speak(); 
    
            buddy.fetch("ball"); 

            makeItSpeak(genericAnimal); 
            makeItSpeak(buddy); 
        }
    
        public static void makeItSpeak(Animal animal) {
            animal.speak();
        }
    }
    ```

   

2. #### What is wrapper class in Java and Why we need wrapper class?
   - A wrapper class is used to convert primitive data types into objects. The primitive data types are boolean, byte, char, short, int, long, float, and double.
   - Some functionalities require the use of objects rather than primitives. For example, elements in a `Collection` framework, like an `ArrayList`, can only store objects and not primitive types. Wrapper classes enable the primitives to be used in situations where objects are required.

3. #### What is the difference between HashMap and HashTable?
| HashMap                                       | HashTable                                    |
|-----------------------------------------------|----------------------------------------------|
| Not synchronized (not thread-safe)            | Synchronized (thread-safe)                   |
| Allows one null key and multiple null values  | Does not allow null keys or values           |
| No guarantee of order (use LinkedHashMap for consistent order) | No guarantee of order                        |
| Inherits from AbstractMap and implements Map | Inherits from Dictionary and implements Map  |
| Provides fail-fast iterator (throws ConcurrentModificationException if modified during iteration) | Does not provide fail-fast iterator          |


4. #### What is String pool in Java and why we need String pool?
   - When a new string is created, Java checks the pool to see if an identical string already exists. If it does, the new variable will reference the existing string. If not, a new string is created in the pool, and the variable references that new string.
   -  By storing only one copy of each distinct string literal, the String Pool reduces the amount of memory required for string storage. Besides, comparing two string literals can be as fast as comparing their references, using `==` operator, instead of using the `equals()` method.

5. #### What is Java garbage collection?
    Java garbage collection is the process by which Java programs perform automatic memory management. Java programs compile to bytecode that runs on the Java Virtual Machine (JVM). Java handles these tasks automatically.

6. #### What are access modifiers and their scopes in Java?
    | Modifier    | Class | Package | Subclass | 
    |-------------|-------|---------|----------|
    | public      | Yes   | Yes     | Yes      |
    | protected   | No    | Yes     | Yes      | 
    | default     | No    | Yes     | No       |
    | private     | No    | No      | No       | 


7. #### **What is final key word? (Filed, Method, Class)**

    1. `Final Variables`: the variable's value cannot be changed.
    2. `Final Methods`: the method cannot be overridden by subclasses. 
    3. `Final Classes:`the class cannot be subclassed or extended. 
   
8. #### **What is static keyword? (Filed, Method, Class). When do we usually use it?**

    1. `static Fields`:the field belongs to the class itself, rather than to instances of the class. 

    2. `Static Methods`: belong to the class rather than any specific instance. They can be called without creating an instance of the class.

    3. `Static Classes`: the class is a static class nested in a non-static class. Static nested classes are associated with the outer class, but they can be instantiated without creating an instance of the outer class.
    
    When to Use `Static`: 
    - When the value of variable should not change from one object to another.
    - When you need to access methods or variables without creating an instance of the class.
    - For defining constants or methods that are not tied to instance variables.
    

9. #### **What is the differences between overriding and overloading?**
    | Method Overloading                                     | Method Overriding                                 |
    |--------------------------------------------------------|---------------------------------------------------|
    | Happens at compile time.                               | Happens at runtime.                               |
    | Gives better performance due to compile-time binding.  | Gives less performance due to runtime binding.    |
    | Private and final methods can be overloaded.           | Private and final methods cannot be overridden.   |
    | Return type of method does not matter.                  | Return type of method must be the same.           |
    | Arguments must be different in the case of overloading.| Arguments must be the same in the case of overriding.|
    | Done in the same class.                                | Requires base and derived (child) classes.        |
    | Used to increase the readability of the code.          | Used to provide the specific implementation of a method. |


10. #### **What is the differences between super and this?**

    1. `super:` refer to the superclass of the current object instance.
    2. `this:` refer to the current object instance.


11. #### **What is the Java load sequence?**

    The Java load sequence refers to the order where classes and objects are loaded, initialized, and used.

12. #### **What is Polymorphism ? And how Java implements it ?**

   - Static Polymorphism - Overload (same class) -compile time
   - Dynamic Polymorphism - Override (child class) - run time
    In programming, polymorphism refers to the same object exhibiting different forms and behaviors.

13.   #### **What is Encapsulation ? How Java implements it? And why we need encapsulation?**
      1. It refers to the bundling of data and methods that operate on the data into a single unit or class. 
      2. Encapsulation is implemented using class structures:
         1. `Private Variables`: Class variables  are declared as private. This restricts direct access from outside the class.
         2. `Public Methods`: Public getter and setter methods are provided for accessing and updating the private variables. This controlled access ensures that data is only modified in a safe and predictable manner.
 
14.   #### **What is Interface and what is abstract class? What are the differences between them?**

| Interface                                               | Abstract Class                                      |
|---------------------------------------------------------|-----------------------------------------------------|
| Cannot be instantiated                                  | Cannot be instantiated                              |
| No concrete methods (before Java 8), except default and static methods (Java 8+) | Can have both abstract and concrete methods         |
| Cannot have constructors                                | Can have constructors                               |
| Only public static final variables allowed              | Can have private, protected, or public variables    |
| A class can implement multiple interfaces               | A class can extend only one class                   |
| Methods are implicitly public; default methods are allowed in Java 8+ | Methods can have any access modifier                |
| Used to define a contract for classes without implementing behavior | Used for sharing code among closely related classes |
| An interface can extend multiple other interfaces       | Can extend only one class but implement multiple interfaces |


15.   #### design a parking lot (put the code to codingQuestions/coding1 folder)

16.   #### What are Queue interface implementations and what are the differences and when to use what?
| Feature        | LinkedList                          | ArrayDeque                         | PriorityQueue                     |
|----------------|-------------------------------------|------------------------------------|-----------------------------------|
| Ordering       | FIFO (can also be LIFO)             | FIFO (can also be LIFO)            | Elements ordered by priority      |
| Null elements  | Allows null elements                | Does not allow null elements       | Does not allow null elements      |
| Performance    | Good for frequent insertions/removals at ends | Faster than LinkedList for queue operations | Logarithmic time for insertions/removals |
| Capacity       | Expands dynamically                 | Expands dynamically, more space-efficient than LinkedList | Expands dynamically               |
| Use case       | When list and queue operations are both needed | Efficient insertions/deletions without nulls | Processing elements based on priority |



    