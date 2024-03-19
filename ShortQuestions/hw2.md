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
//Inheritance
```
