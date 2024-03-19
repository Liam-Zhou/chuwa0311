# HW3 Questions&Answers

1. What is generic in Java? and type the generic code by yourself.

   Generic in Java is a feature that allows us to create classes, interfaces, and methods that take types as parameters. This allows us to re-use the same code with different inputs. The benefit of using generics is to enforce type-safety at compile time and to reduce the risk of ClassCastException at runtime.

2. Read those codes and type it one by one by yourself. the push the code to your branch.

3. practice stream API at least 3 times

4. Practice Optional methods at least 2 times

5. Write the Singleton design pattern include eager load and lazy load.

   eager load:
   ```java
   public class Singleton {
       private static final Singleton instance = new Singleton();
       private Singleton() {}
       public static Singleton getInstance() {
           return instance;
       }
   }
   ```

   lazy load:
   ```java
   public class Singleton{

      private Singleton(){}

      public static Singleton getInstance(){
         return SingletonHolder.INSTANCE;
      }

      private static class SingletonHolder{
         private static final Singleton INSTANCE = new Singleton();
      }
   }
   ```
6. What is Runtime Exception? could you give me some examples?

   Runtime Exception is exception that occurs on runtime, not complie time.
   Examples:
   - NullPointerException
   - ArrayIndexOutOfBoundsException
   - IllegalArgumentException

7. Could you give me one example of NullPointerException?
   
   ```java
   public class Main {
      public static void main(String[] args) {
         String str = null;
         System.out.println(str.length());
      }
   }
   ```

8. What is the Optional class?

   Optional is a container object which may or may not contain a non-null value. It is used to reduce NullPointerException in Java applications. 

9. What are the advantages of using the Optional class?

   - Null checks are not required.
   - No more NullPointerException at runtime.
   - We can develop clean and neat APIs.

10. What is the @FunctionalInterface?

    FunctionalInterface is an interface that contains only one absract method. It can have any number of default and static methods.

11. what is lambda?

    Lambda is a syntax suger for anonymous method. It is a block of code that can be passed around and executed later. It is a way to represent one method interface using an expression.

12. What is Method Reference?

    Method reference is a shorthand syntax for a lambda expression that execute one method. It is used to refer method of functional interface.

13. What is Java 8 new features?

      - Lambda expressions
      - Method references
      - Optional class
      - Stream API
      - Default methods
      - Functional interfaces

14. Lambda can use unchanged variable outside of lambda? what is the details?
    
    Lambda can use effectively final variables from the enclosing scope. It means that the variable is not modified after it is initialized.

15. Describe the newly added features in Java 8?

    see question 13.

16. Can a functional interface extend/inherit another interface?

    Yes, a functional interface can extend another interface. But it can only extend another functional interface.

17. What is the lambda expression in Java and How does a lambda expression relate to a functional interface?

      Lambda is used to provide the implementation of an interface which has only one method. It is used to provide the implementation of functional interface.

18. In Java 8, what is Method Reference?

    see question 12.

19. What does the String::ValueOf expression mean?

      It is a method reference to the static method valueOf() of the String class.

20. What are Intermediate and Terminal operations?

      Intermediate operations return a new stream. They are always lazy, meaning that they are not executed until a terminal operation is invoked. Terminal operations return a result or a side-effect. They are eager, meaning that they are executed immediately.

21. What are the most commonly used Intermediate operations?

      - filter()
      - map()
      - flatMap()
      - distinct()
      - sorted()
      - peek()
      - limit()

22. What is the difference between findFirst() and findAny()?

      findFirst() returns the first element of the stream, while findAny() returns any element of the stream.

23. How are Collections different from Stream?
   
      Collections are in-memory data structures, while Streams are not. Streams are used to compute the result, while Collections are used to store the result.


