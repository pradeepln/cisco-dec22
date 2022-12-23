package com.cisco.training.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {
	
	public static void loopOnAList(List<String> l) {
//		int size = l.size();
//		
//		for(int i = 0 ; i < size ; i++) {
//			String aValue = l.get(i);
//			//do something with aValue
//			System.out.println(aValue);
//		}
		
		Iterator<String> it = l.iterator();
		
		System.out.println(">>>>>>>>>> Iterator is of type >>>>>>>>>> "+it.getClass().getName());
		
		while(it.hasNext()) {
			String aValue = it.next();
			//do something with aValue
			System.out.println(aValue);
			if(aValue.length() < 3) {
				it.remove();
			}
		}
		
		System.out.println("_______________________________");
		
		for(String aValue : l) {
			System.out.println(aValue);
		}
		
	}
	
	public static void someAlgo(List<String> l) {
		
		String hundredth = l.get(99); // return contents[99] - random access AL - o(1)
									  // traverse from 1st link to 99 - random access LL - o(n)
		l.add("last");
		
		l.remove(0);
		
		l.add(0, "new first");
		
	}

	public static void main(String[] args) {
		
//		simpleRawList();
//		String[] oldArray,newArray;
		List<String> l = new ArrayList<>();
		l.add("hello");
		l.add("hi");
		l.add("how");
		l.add("is");
		l.add("it");
//		someAlgo(l);
		loopOnAList(l);
	}

	private static void simpleRawList() {
		List l = new ArrayList(100);
		l.add("one");
		l.add("duos");
		//......
		l.add("tenth");
		l.add("eleventh");
		l.add("12");
//		Integer intObj = new Integer(543);
//		l.add(intObj);
//		l.add(543);
		
//		Integer iObj = 45;
//		iObj++;
		
		System.out.println(l.size());
		System.out.println(l);
		l.remove("duos");
		System.out.println(l.size());
		System.out.println(l);
		String first = (String) l.get(0);
	}

	private static void simpleGenericList() {
		List<String> l = new ArrayList<String>(100);
		l.add("one");
		l.add("duos");
		//......
		l.add("tenth");
		l.add("eleventh");
		l.add("12");
//		Integer intObj = new Integer(543);
//		l.add(intObj);
//		l.add(543);
		
//		Integer iObj = 45;
//		iObj++;
		
		System.out.println(l.size());
		System.out.println(l);
		l.remove("duos");
		System.out.println(l.size());
		System.out.println(l);
		String first = l.get(0);
	}

	
}
