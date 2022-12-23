package com.cisco.training.basics;

public class StackApp {

	public static void main(String[] args) {
		StackUser u = new StackUser();
		Stack s = new FixedArrayStack(9);
//		Stack s = new FancyNewStack();
		u.fill(s);

	}

}
