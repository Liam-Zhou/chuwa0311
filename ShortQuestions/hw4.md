# Homework 4

## 1. practice collection
Please refer to coding folder

## 2.What is the checked exception and unchecked exception
- checked exception will be check during compile time, you must deal with it by throws an exception
- unchecked exception is checking during run time, and you will not know if it will throw an exception or not until runtime, NullPointerException and OutOfBoundException is unchecked exception.

## 3. Can there be multiple final block?
No

## 4. Both catch and finally return result, what's the value?
finally will supersede the previous catch result, so the value will be finally return result.

## 5. What is Runtime/unchecked exception? What is compile/checked exception?

 - compile/checked exception: exception will be checked during compile time, it must be catch or throw
   - IOException
   - SQLException/NetworkException
 - Runtime/unchecked exception: is the exception occur during run time, you do not have to handle it
   - NullPointerException
   - IndexOutOfBoundsException

## 6. What is the difference between throw and throws
throw keyword throw one exception, and it will inside of the method or block of code
```
throw new Exception("something went wrong");
```
throws keyword is using in the method signiture, and it can throw multiple exception
```
public void myMethod() throws IOException {
    // Method code that might throw an IOException
}
```
    
   
