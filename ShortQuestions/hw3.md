1.
generics allow creating classes, interfaces, and methods that operate on a type parameter. This type parameter can be specified when using the generic class, interface, or method.

class GenericList<T> {
	private T[] arr;
	public GenericList(int size) {
		arr = (T[]) new Object[size];
	}

	public void add(int idx, T ele) {
		arr[idx] = ele;
	}

	public T get(int idx) {
		return arr[idx];
	}
}

class GenericTest{
	public static void main(String[] args) {
		GenericList<Integer> gl = new GenericList<>(3);
		gl.add(1, 100);
		System.out.println(gl.get(1))
	}
}


2,3,4,5.
see Coding/coding_hw3

6.
An exception that occurs during the execution of a program, typically due to logical errors, invalid input, or unexpected conditions

Example:
NullPointerException:
	String str = null;
	int length = str.length(); 

ArrayIndexOutOfBoundsException:
	int[] numbers = {1, 2, 3, 4, 5};
	int val = numbers[5];

ArithmeticException:
	int res = 10 / 0;


7.
see 6.

8.
A container object that may or may not contain a non-null value. Provide a more expressive and robust way to handle situations where a value may be absent or unknown.

9.
a) Avoiding Null Pointer Exceptions;
b) Improved Readability;
c) Explicit Documentation of Absence.

10.
An interface that contains exactly one abstract method, known as the functional method.

11.
A concise way to represent an anonymous function or a method without a name.

12.
A shorthand notation that allows you to refer to a method without explicitly defining a lambda expression.

13,
Lambda Expressions, Stream API, Default and Static Methods, Optional, Functional Interfaces, Date and Time API

14.
Yes. lambda expressions can use variables from their enclosing scope, including local variables and parameters, provided that these variables are effectively final or effectively immutable

15.
Lambda Expressions: useful when working with functional interfaces and the Stream API;
Stream API: a fluent and functional way to process collections of objects;
Default and Static Methods: enables backward compatibility and code reuse in interfaces;
Optional Class: helps avoid NullPointerExceptions (NPEs) and encourages more robust error handling.

16.
Can't

17.
the implementation of the functional interface. It allows you to treat functionality as a method argument or to create instances of functional interfaces.

18.
A shorthand syntax that allows you to refer to a method without explicitly writing a lambda expression to call that method.

19.
An example of a method reference. Convert other types to String.

20.
Intermediate operations are operations that transform or filter the elements of a stream. They do not execute immediately and instead build a pipeline of operations.
Terminal operations, on the other hand, are operations that trigger the execution of the stream pipeline and produce a result.

21.
filter, map, distinct, sorted and limit.

22.
findFirst() method returns an Optional containing the first element of the stream, or an empty Optional if the stream is empty.It is deterministic, meaning it will always return the first element in a consistent manner.
findAny() method returns an Optional containing any element of the stream, or an empty Optional if the stream is empty. It is non-deterministic and can return any element from the stream.

23.
Collections in Java (e.g., ArrayList, HashSet, HashMap) are data structures that hold a group of objects or elements. Streams: Streams represent a sequence of elements that support aggregate operations on collections of data. They don't store elements themselves but rather provide a way to process elements from a source such as a collection;

Collections are typically mutable but streams are designed to be immutable and non-modifiable.

