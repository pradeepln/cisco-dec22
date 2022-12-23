package com.cisco.training.functional;

import java.util.ArrayList;
import java.util.List;

public class GenericsDemo {
	
	public static <T> T pickABetterValue(List<T> candidates,T sample) {
		
		return null;
	}
	
	public static double sum(List<? extends Number> numList) {
		double sum = 0;
//		numList.add(1234.98D);
		for(Number n : numList) {
			sum += n.doubleValue();
		}
		return sum;
	}

	
	public static void main(String[] args) {
		Object o = new String("abcd");
		List<String> sList = new ArrayList<String>();
		sList.add("123");
		
//		ArrayList<Object> oList = new ArrayList<String>();
		
//		ArrayList<Object> oList = sList;
		
//		oList.add(123);
		
		String s = sList.get(0);
		List<Integer> iList = List.of(12, 15, 56);
		double sum = sum(iList);
		
		String betterName =  pickABetterValue(sList, "abc");
		
		Integer betterNum =  pickABetterValue(iList, 12);
		
		String betterName2 = pickABetterValue(sList, "1234");
	}

}
