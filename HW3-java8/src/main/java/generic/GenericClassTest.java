package generic;

public class GenericClassTest {

    public static void main(String[] args){
        GenericClass<Integer> obj1 = new GenericClass<>(1);
        System.out.println(obj1.getObj());

        // Test for double type
        GenericClass<Double> obj2 = new GenericClass<>(0.66);
        System.out.println(obj2.getObj());

        // Test for String type
        GenericClass<String> obj3 = new GenericClass<>("Generic String");
        System.out.println(obj3.getObj());
    }
}
