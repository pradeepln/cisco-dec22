package com.cisco.training.threads;

import java.util.concurrent.Callable;

public class PrimeCounterCallable implements Callable<Integer>{
	
	long start,stop;
	
	
	public PrimeCounterCallable(long start, long stop) {
		this.start = start;
		this.stop = stop;
	}



	@Override
	public Integer call() {
		int count = 0;
		System.out.println("Prime counting between "+start+" and "+stop+" in "+Thread.currentThread().getName());
		for(long i = start; i <= stop ; i++) {
			if(isPrime(i)) {
				count++;
			}
			if(Thread.interrupted()) {
				System.out.println("Prematurely stoping counting after having counted "+count);
				return -1;
			}
		}
		System.out.println("Primes between"+start+" and "+stop+" = "+count);
		return count;
	}

	
	
	private boolean isPrime(long num) {
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
