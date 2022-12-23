package com.cisco.training.threads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadsDemo {

	private static void usingCallable() throws Exception {
		ExecutorService pool = Executors.newFixedThreadPool(4);
		
		PrimeCounterCallable asyncTask1 = new PrimeCounterCallable(1, 100_000);
		PrimeCounterCallable asyncTask2 = new PrimeCounterCallable(100_001, 200_000);
		
		Future<Integer> f1 = pool.submit(asyncTask1);
		Future<Integer> f2 = pool.submit(asyncTask2);
		
		System.out.println(f1.get());
		System.out.println(f2.get());
		
		pool.shutdown();
	}
	
	
	

	public static void main(String[] args) throws Exception {
		// simpleThreadSubclass();
		// simpleRunnable();
		// forceStop();
		//usingThreadPoolAndRunnable();
		usingCallable();
	}

	
	


	public static void usingThreadPoolAndRunnable() throws Exception {

		System.out.println("About to create thread pool in " + Thread.currentThread().getName());
		ExecutorService pool = Executors.newFixedThreadPool(4);
		
		CountDownLatch latch = new CountDownLatch(2);
		
		PrimeCounterTaskWithLatch task1 = new PrimeCounterTaskWithLatch(1, 100_000,latch);
		PrimeCounterTaskWithLatch task2 = new PrimeCounterTaskWithLatch(100_001, 200_000,latch);
		
		pool.execute(task1);
		pool.execute(task2);
		
		latch.await();
		
		System.out.println(task1.getCount());
		System.out.println(task2.getCount());
		System.out.println("Finished.....");
		pool.shutdown();
	}
	
	private static void simpleRunnable() throws Exception {
		System.out.println("About to create child threads in " + Thread.currentThread().getName());

		PrimeCounterTask task1 = new PrimeCounterTask(1, 100_000);
		PrimeCounterTask task2 = new PrimeCounterTask(100_001, 200_000);

		Thread t1 = new Thread(task1);
		Thread t2 = new Thread(task2);

		t1.start();
		t2.start();

		t1.join();
		t2.join();

		System.out.println(task1.getCount());
		System.out.println(task2.getCount());
		System.out.println("Finished...");
	}

	private static void simpleThreadSubclass() throws Exception {
		System.out.println("About to create child threads in " + Thread.currentThread().getName());

		PrimeCounterThread t1 = new PrimeCounterThread(1, 100_000);
		PrimeCounterThread t2 = new PrimeCounterThread(100_001, 200_000);

		t1.start();
		t2.start();

		t1.join();
		t2.join();

		System.out.println(t1.getCount());
		System.out.println(t2.getCount());
		System.out.println("Finished...");
	}

	// static Queue<Long> sharedList = new LinkedList<>();

	public static void threadSafe() {
		// List<String> nonSafe = new ArrayList<>();
		List<String> threadSafeWrapper = Collections.synchronizedList(new ArrayList<>());

		Map<String, String> threadSafeMap = new ConcurrentHashMap<>();
	}

	private static void forceStop() throws Exception {
		System.out.println("About to create child threads in " + Thread.currentThread().getName());

		PrimeCounterTask task1 = new PrimeCounterTask(100_001, 200_000);

		Thread t1 = new Thread(task1);

		t1.start();

		Thread.sleep(2000);
		t1.interrupt();

		System.out.println(task1.getCount());

		System.out.println("Finished...");
	}
}
