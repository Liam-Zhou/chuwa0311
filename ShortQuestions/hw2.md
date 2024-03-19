# Homework 2 Short Answers
## 1. Writeup Example code to demonstrate the three foundmental concepts of OOP.(referenceCodeDemo repo as example)

```
// Encapsulation
//Encapsulation is that the internal states of an object is hidden from the outside world, and the access to it is restricted to the methods of the class.

class Area{
	int length;
	int breadth;

	Area(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	public void getArea() {
		int area = length * breadth;
		System.out.println("Area: " + area);
	}
}

class Main {
	public static void main(String[] args) {
		Area rectangle = new Area(2, 16);
		rectangle.getArea();
	}
}
```

```
// Polymorphism
// Polymorphism allows objects of different classes to be treated as objects of common superclass or interface
// overloading: compile time poly, same method, different parameter
// overriddign: runtime poly, subclass same method name, same parameter


//compile-time Polymorphism
public class Calculator{
	public int add(int x, int y) {
		return x + y;
	}

	public double add(double x, double y) {
		return x + y;
	}
}

//run-time Polymorphism
class Animal{
	public void sound() {
		System.out.println("Animal makes a sound");
	}
}

class Doc extends Animal {
	@Override
	public void sound() {
		System.out.println("barks");
	}
}

class Cat extends Animal {
	@Override
	public void sound() {
		System.out.println("meows");
	}
}
```

```
// Inheritance
// parent-child relationship, Dogs inherit from Animals is an example
class Animal{
	public void sound() {
		System.out.println("Animal makes a sound");
	}
}

class Doc extends Animal {
	@Override
	public void sound() {
		System.out.println("barks");
	}
}
```
## 2. What is wrapper class in Java and Why we need wrapper class?

Wrapper class is classes that encasulates the primitive type into objects, for example, int wraps Integer

We need that main for the Object-Oriented paradigm purpose. The wrapper makes the primitive became an object. Furthermore, the primitive type not allows a null value, but the wrapper class allow that.

## 3. What is the difference between HashMap and HashTable

HashMap is not thread-safe and HashTable is thread-safe. HashMap allow null value but HashTable not allow it. HashMap is more efficiency since HashTable need to deal with the thread-safe problem.


## 4. What is String pool in Java and why we need String pool

String pool is a memory space to store string literals. For example if you initialize String a = "Hello" and String b = "Hello", both a and b will refer to the same memory space in the string pool

The benefit of string pool is mainly for Memory efficiency.

## 5. What is Java Garbage collection?

JVM collect useless memory by itself, does not need user clean it mannully. The contrast example is C++, user need to free the memory mannually, otherwise the user will get a memory leak problem.

## 6. what are access modifiers and their scopes in Java?

- public - any other class or packages
- protected - own packages or subclasses
- default - only in the same package
- private - only within the class

## 7. final keyword

- final fields - cannot be modified
- final method - cannot be overrided
- final class - cannot be inheritant 

## 8. static keyword

- static field - field belongs to the class itself, rather than an instance, there is only one copy of the static field.
- static method - class can call the method directly, does not need an instance (famous example: println)
- static class - usually only used as static nest class, static nested classes are not associated with instances of the outer class, they exist independently, and it can access static members of the outer class, but not non-static members. As they do not have an implicit reference to an instance of the outer class. Furthermore, it often used in singleton design pattern.

## 9. Overriding and Overloading

- overriding (run time) is the child class method override the parent class method, the parameters should be same with the parent class.
- overloading (compile time) is kind of rewrite of a method, it is in the same class, the method name should be the same but the parameter list must be different

## 10. super vs this
Super refer to the current class's parent class. This refer to the current class

## 11. Java load sequence
- 1. static block is called
  2. check values of static variables
  3. constructor is called






