package com.cisco.training.threads;

import java.util.concurrent.CountDownLatch;

public class PrimeCounterTaskWithLatch implements Runnable{
	
	long start,stop;
	int count;
	CountDownLatch latch;
	
	public PrimeCounterTaskWithLatch(long start, long stop,CountDownLatch latch) {
		this.start = start;
		this.stop = stop;
		this.latch = latch;
	}



	@Override
	public void run() {
		System.out.println("Prime counting between "+start+" and "+stop+" in "+Thread.currentThread().getName());
		for(long i = start; i <= stop ; i++) {
			if(isPrime(i)) {
				count++;
			}
			if(Thread.interrupted()) {
				System.out.println("Prematurely stoping counting after having counted "+count);
				return;
			}
		}
		System.out.println("Primes between"+start+" and "+stop+" = "+count);
		latch.countDown();
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



	public int getCount() {
		return count;
	}
}
