package com.cisco.training.threads;

public class PrimeCounterTask implements Runnable{
	
	long start,stop;
	int count;
	
	public PrimeCounterTask(long start, long stop) {
		this.start = start;
		this.stop = stop;
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
