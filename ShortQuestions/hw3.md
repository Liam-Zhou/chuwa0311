## 1. What is generic type in Java?

Generic type is same with the idea of meta programming, it allows you define a sequence of behavior without speicify the object. It is similar to C++'s template class
For example, the List<T> is a generic type, at the time you define it, you have no idea what T is, T can be Integer, Charaters or something else. List it self includes some functionality, but you do not need to know what T is to define those functionality.

## 2. Read code and type it

Please refer to the Codings folder

## 3. practice stream API

Please refer the Codings folder

## 4. practice Optional

Please refer the Codings folder

## 5. Write the Singleton design pattern include eager load and lazy load
```
// Singleton

//Eager Load
public class Singleton{
	// 1. private static variable
	private static singleton instance = new Singleton();

	// 2. private constructor, external usage is impossible
	private Singleton() {}

	// 3. static getInstance method: You can call this method without any instance
	public static Singleton getInstance() {
		return instance;
	}
}

Singleton is NOT nulle
Singleton.getInstance();


//Lazy load: the Singleton instance is created when the SingletonHolder class is loaded and initalized.
// This occurs only when the getInstance() method is called for the first time, ensuring lazy initialization.
// Since class loading and initialization are thread-safe in Java, this approach guarantees that the singleton instance is created only once
// even in a multi-threaded environment

public class Singleton{
	// private constructor to prevent instantiation from outside of the class
	private Singleton() {}

	static{}

	//static inner class to hold the Singleton instance
	private static class SingletonHolder {
		private static final Singleton INSTANCE = new Sington();
	}

	public static Singleton getInstance() {
		return SingletonHolder.INSTANCE;
	}
}

```
## 6. 
