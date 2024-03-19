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
//Polymorphism
```

```
//Inheritance
```
