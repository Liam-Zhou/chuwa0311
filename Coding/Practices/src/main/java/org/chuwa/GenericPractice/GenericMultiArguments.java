package org.chuwa.GenericPractice;

public class GenericMultiArguments {
	public static <T1, T2, T3> void temp(T1 x, T2 y, T3 z) {
		System.out.println("X = " + x);
		System.out.println("Y = " + y);
		System.out.println("Z = " + z);
	}

	public static void main(String[] args) {
		temp(1, "2", 3L);
	}
}
