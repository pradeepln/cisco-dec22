package com.cisco.training.threads;

import java.util.stream.IntStream;

public class PrimeCounterUsingParallelStreams {

	public static void main(String[] args) {
		long count = IntStream.range(1, 200_001).parallel().filter(i -> isPrime(i)).count();
		
		System.out.println(count);

	}

	
	static boolean isPrime(long num) {
		//System.out.println(Thread.currentThread().getName());
		if(num <= 2) {
			return true;
		}
		for(long i=2;i<num;i++) {
			if((num % i) == 0) {
				return false;
			}
		}
		return true;
	}
}
