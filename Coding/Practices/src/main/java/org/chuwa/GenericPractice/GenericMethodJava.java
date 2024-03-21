package org.chuwa.GenericPractice;

public class GenericMethodJava {
	public static void main(String[] args) {
		System.out.printf("Max of %d, %d, %d is %d\n\n", 3, 4, 5, MaximumGenericTest.maximum(3, 4, 5));
		System.out.printf("Max of %f, %f, %f is %f\n\n", 3.1, 4.1, 5.1, MaximumGenericTest.maximum(3.1, 4.1, 5.1));
		System.out.printf("Max of %s, %s, %s is %s\n\n", "pear", "apple", "orange",
				MaximumGenericTest.maximum("pear", "apple", "orange"));
	}
}
class MaximumGenericTest {
	public static <T extends Comparable<T>> T maximum (T x, T y, T z) {
		T max = x;

		if (y.compareTo(max) > 0) {
			max = y;
		}
		if (z.compareTo(max) > 0) {
			max = z;
		}
		return max;
	}
}
