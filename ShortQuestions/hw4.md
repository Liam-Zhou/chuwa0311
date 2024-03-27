1.
see Coding/coding_hw4

2.
Checked exceptions are the exceptions that are checked at compile time by the compiler. 
Example:
    public void readFromFile(String filename) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String line = reader.readLine();
        System.out.println("Read line: " + line);
        reader.close();
    }

Unchecked exceptions are the exceptions that are not checked at compile time by the compiler. 
Example:
    public void demonstrateNullPointerException() {
        String str = null;
        System.out.println(str.length());
    }

3.
No, only one.

4.
The value returned by the finally block will be the final result when no exception. If an exception is thrown and caught by a catch block, the value returned by the catch block will be the final result.

5.
Unchecked exceptions are exceptions that are not checked by the compiler at compile time. 
Checked exceptions are exceptions that are checked by the compiler at compile time.

6.
The throw keyword is used to explicitly throw an exception within a method or a block of code.
The throws keyword is used in method declarations to indicate that the method may throw certain types of exceptions.

7.
Because Java matches exceptions with catch blocks from top to bottom in the order they are written.
(tried in coding/hw4)

7.(2)
It represent an optional value, which can either be present or absent. It is designed to address the issue of handling null values more effectively by providing a type-safe way to deal with potentially null objects.

Example:
    public static Optional<String> getUsernameById(int id) {
        if (id == 1) {
            return Optional.of("Chuwa");
        } else {
            return Optional.empty();
        }
    }

8.
The finally block in Java is designed to always be executed, regardless of whether an exception occurs or not.

9.
See Coding/coding_hw4

10.
1) Creational Patterns; 2) Structural Patterns; 3) Behavioral Patterns

11.
Single Responsibility Principle (SRP); Open/Closed Principle (OCP); Liskov Substitution Principle (LSP); Interface Segregation Principle (ISP); Dependency Inversion Principle (DIP).

12.
The instance of the Singleton class is created eagerly (at the time of class loading)
public class Singleton {
    private static final Singleton instance = new Singleton();

    private Singleton() {
    }

    public static synchronized Singleton getInstance() {
        return instance;
    }
}

13.
The OCP states that software entities (classes, modules, functions, etc.) should be open for extension but closed for modification.
