package generic;

public class GenericClassTest {

  public static void main(String[] args) {
    GenericClass<Integer> obj1 = new GenericClass<>(5);
    System.out.println(obj1.getObj());

    GenericClass<Double> obj2 = new GenericClass<>(5.55);
    System.out.println(obj2.getObj());

    GenericClass<String> obj3 = new GenericClass<>("This is String type Generic type");
    System.out.println(obj3.getObj());

    System.out.printf("Max of %d, %d, and %d is %d \n", 3, 4, 5, MaximumGenericTest.maximum(3 ,4 ,5));

    System.out.printf("Max of %.1f, %.1f, and %.1f is %.1f \n", 3.3, 4.4, 5.5, MaximumGenericTest.maximum(3.4 ,4.4 ,5.5));

    System.out.printf("Max of %s, %s, and %s is %s \n", "apple", "banana", "Orange", MaximumGenericTest.maximum("apple" ,"banana" ,"Orange"));


  }

}
class GenericMultiArguments {
  public static <T1, T2, T3> void temp(T1 x, T2 y, T3 z) {
    System.out.println("This is x = " + x);
    System.out.println("This is y = " + y);
    System.out.println("This is z = " + z);
  }

  public static void main(String[] args) {
    temp(1, '2',"3");
  }
}
class MaximumGenericTest {
  public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
    T max = x;
    if (y.compareTo(max) > 0) {
      max = y;
    }
    if (z.compareTo(max) > 0) {
      max = z;
    }
    return z;
  }
}
