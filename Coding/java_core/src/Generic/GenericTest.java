package src.Generic;

public class GenericTest {
    public static void main(String[] args) {
        Generic<Integer> o1 = new Generic<>(1);
        System.out.println(o1.getObj());

        Generic<String> o2 = new Generic<>("hello");
        System.out.println(o2.getObj());
    }
}
