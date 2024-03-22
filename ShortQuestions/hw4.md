#### 2. What is the checked exception and unchecked exception in Java? Could you give one example?

Checked exception are exceptions that happens at compile time. E.g., IOException, SQLException. They must be either caught or declared by the method throwing them using a `"thorws"` clause

Unchecked exceptions are exceptions that happens at runtime. E.g., NullPointerException, ArraryIndexOutOfBoundException.

#### 3. Can there be multiple finally blocks?

No. Only one finally block is allowed.

#### 4. When both catch and finally return values, what will be the final result?

The final result comes from the finally block, even if there is return statement in the catch block.

#### 5. What is Rumtime/Unchecked exception? What is Compile/Checked Exception?

See 2.

#### 6. What is the difference between throw and throws?

`throw` is a keyword used to explicitly throw an exception within a method or block of code. It is followed by an instance of an exception class or a subclass of `Throwable`

`throws` is a keyword used in method declarations to specify that the method might or might not throw one or more types of exceptions.

#### 7. Why do we put the Null/Runtime exception before Exception?

We should put the more specific exceptions before the general ones. It would help us identify the errors.

#### 8. What is Optional? Why do we use it? Write an Optional example.

`Optional` is a container class that represents an optional value, meaning a value that may or may not be present. It provides a way to handle situations where a method may return a value or may return nothing without having to explicitly check for null references.

```java
Optional<String> opt = Optional.of("Hello");
Optional<String> opt2 = Optional.ofNullable();

if (opt.isPresent()) {
  System.out.println("has value");
} else {
  System.out.println("no value");
}

if (opt2.isPresent) {
  System.out.println("has value");
} else {
  System.out.println("no value");
}
```

#### 9. Why finally always be executed?

The `finally` block will be executed regardless of whether an exception occurs or not. It ensures certain cleanup or finalization tasks are performed even if an exception is throw and caught elsewhere in the code.

#### 10. What are the types of design patterns in Java?

Creational patterns, e.g., Singleton, Factory, Abstract Factory, Builder

Structural patterns, e.g., Adapter

Behavioral patterns, e.g., Strategy, Command, Observer

#### 11. What are the SOLID Principles?

1. **Single Responsibility Principle**

​	A class should have only one reason to change. A class should have only one responsibility or job.

2. **Open-Closed Principle**

   Software entities (classes, modules, functions, etc.) should be open for extension but closed for modification. This principle encourages the use of abstraction and polymorphism to allow behavior to be extended without modifying existing code.

3. **Liskov Substitution Principle**

   Objects of a superclass should be replaceable with objects of its subclass without affecting the correctness of the program. This principle ensures that derived class can be substituted for their base classes without altering the desirable properties of the program.

4. **Interface Segregation Principle**

​	Clients should not be forced to depend on interfaces they do not use. This principle encourages the 	use of smaller, more specific interfaces rather than large, monolithic interfaces.

5. **Dependency Inversion Principle**

   High-level modules should not depend on low-level modules. But should depend on abstractions. Abstractions should not depend on details. Details should depend on abstractions. This principle promotes loose coupling and high cohesion by advocating for the use of abstractions to decouple components and reduce direct dependencies.

#### 12. How can you achieve thread-safe singleton patterns in Java?

Use lazy load with inner static class.

The Singleton instance is created when the SingletonHolder class is loaded and initialized. This occurs only when the getInstance() method is called for the first time, ensuring lazy initialization. Since class loading and initialization are thread-safe in Java, this approach guarantees that the Singleton instance is created only once, even in a multi-threaded environment.

```java
public class Singleton {
    // Private constructor to prevent instantiation from outside the class
    private Singleton() {
    }
    static{
      ///do something
}
    // Static inner class to hold the Singleton instance
    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
}
    // Public static method to get the Singleton instance
    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
} }
```

#### 13. What do you understand by the Open-Closed Principle?

Entities should be open for extension but closed for modification. We should use abstraction and polymorphism to allow behavior to be extended without modifying existing code. 

In this example, we create an abstract class Shape and two inheriting class Rectangle and Circle. Suppose we want to implement a Triangle class, we can extends the abstract Shape class.

```java
// Abstract Shape class
abstract class Shape {
    abstract double area();
}

// Concrete Rectangle class extending Shape
class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double area() {
        return width * height;
    }
}

// Concrete Circle class extending Shape
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

// Client code
public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 3);
        Shape circle = new Circle(2);

        double rectangleArea = rectangle.area();
        double circleArea = circle.area();

        System.out.println("Rectangle Area: " + rectangleArea);
        System.out.println("Circle Area: " + circleArea);
    }
}

```

#### 14. Liskov’s substitution principle states that if class B is a subtype of class A, then object of type A may be substituted with any object of type B. What does this actually mean? (from OA ) choose your answer.

1. It mean that if the object of type A can do something, the object of type B could also be able to perform the same thing.
2. It means that all the objects of type A could execute all the methods present in its subtype B
3. <mark>It means if a method is present in class A, it should also be present in class B so that the object of type B could substitute object of type A.</mark>
4. It means that for the class B to inherit class A, objects of type B and objects of type A must be same

Reason: Derived class should possess parent class's functionalities, and might have additional functionalities

#### 15. Watch the design pattern video, and type the code.

