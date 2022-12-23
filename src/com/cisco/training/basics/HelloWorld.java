package com.cisco.training.basics;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello Java");
		System.out.println("Hello Eclipse!!");

		referenceVsPrimitive();

		m1(75);
		m1(75L);
		m1(75.0);
		m1(75D);
		m1(75.0f);
	}

	private static void m1(int i) {
		// some logic1
	}

	private static void m1(long i) {
		// some logic2
	}

	private static void m1(double i) {
		// some logic3
	}

	private static void m1(float i) {
		// some logic4
	}

	private static void referenceVsPrimitive() {
		int i = 10;

		int[] iArray = new int[100];
		iArray[0] = 42;

		methodWithPrimitiveArg(i);
		methodWithRefArg(iArray);

		System.out.println(i);
		System.out.println(iArray[0]);
	}

	private static void methodWithPrimitiveArg(int x) {
		x++;
	}

	private static void methodWithRefArg(int[] x) {
		x[0]++;
	}

	int instanceVar;
	static int statVar;

	public void simpleMethod() {
		int localVar;
		localVar = 23;

		long lonVar = localVar;

		int i = (int) lonVar;

		localVar++;
		System.out.println(localVar);

		instanceVar++;
		statVar++;
	}

}
