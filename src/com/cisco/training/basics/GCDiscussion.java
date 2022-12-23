package com.cisco.training.basics;

public class GCDiscussion {

	public static void main(String[] args) {
		int j = 25;
		ChemicalElement c = new ChemicalElement(1, "hy", "H");
		m1();
		System.out.println("here in main -------- 3");
	}

	private static void m1() {
		Car c = new Car();
		int i = 42;
		m2(c);
		System.out.println("here in m1 ------ 1");
	}

	private static void m2(Car x) {
		Bus b = new Bus();
		System.out.println("here in m2 ----- 2");
	}

}
