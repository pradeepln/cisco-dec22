package com.cisco.training.basics;

public class FixedArrayStack implements Stack {
	
	private Object[] contents;
	private int top = -1;
	
	public FixedArrayStack(int capacity) {
		contents = new Object[capacity];
	}

	@Override
	public void push(Object element) {
		if(top == contents.length - 1) {
			throw new StackFullException("Sorry, stack is full with "+contents.length+" elements!!");
		}
		contents[++top] = element;		
	}

	@Override
	public Object pop() {
		if(top == -1) {
			throw new StackEmptyException("Oops..., no elements left to pop out!!!");
		}
		return contents[top--];
	}


}
