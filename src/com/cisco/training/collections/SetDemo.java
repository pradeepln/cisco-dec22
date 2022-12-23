package com.cisco.training.collections;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
//		Set<String> uniqueWords = new LinkedHashSet<>();
		
		Set<String> uniqueWords = new TreeSet<>( new StringLengthComparator() );
		
		
		Scanner kb = new Scanner(System.in);
		while(true) {
			System.out.println("Enter word (or 'quit') : ");
			String input = kb.nextLine();
			if(input.equalsIgnoreCase("quit")) {
				break;
			}
			
			boolean added = uniqueWords.add(input);
			if(!added) {
				System.out.println("That's a duplicate!!");
			}
		}
		System.out.println("__________ All unique Words: __________");
		for(String aWord : uniqueWords) {
			System.out.println(aWord);
		}

	}

}
