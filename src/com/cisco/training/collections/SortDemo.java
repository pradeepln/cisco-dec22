package com.cisco.training.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.cisco.training.basics.ChemicalElement;

public class SortDemo {

	public static void main(String[] args) {
		String[] words = {"this","is","a","bunch","of","strange","words","like","xylophone"};
		//simpleSort(words);
		//sortUserDefinedType();
		sortUsingCustomComparisonLogic(words);
	}

	
	private static void sortUsingAnon(String[] words) {
		System.out.println("Before \n"+Arrays.asList(words));
		
		Arrays.sort(words, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return s1.length() - s2.length();
			}
		} );
		
		System.out.println("After \n"+Arrays.asList(words));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	private static void sortUsingCustomComparisonLogic(String[] words) {
		System.out.println("Before \n"+Arrays.asList(words));
		
		Arrays.sort(words, new StringLengthComparator());
		
		System.out.println("After \n"+Arrays.asList(words));
	}

	private static void sortUserDefinedType() {
		ChemicalElement o = new ChemicalElement(8, "Oxygen", "O");
		ChemicalElement h = new ChemicalElement(1, "Hydrogen", "H");
		ChemicalElement k = new ChemicalElement(19, "Potassium", "K");
		
		List<ChemicalElement> cList = new ArrayList<>();
		cList.add(o);cList.add(h);cList.add(k);
		
//		List<ChemicalElement> cList = List.of(o, k, h);
		System.out.println("Before sort: \n"+cList);
		
		Collections.sort(cList);
		
		System.out.println("After sort: \n"+cList);
	}

	private static void simpleSort(String[] words) {
		List<String> wordList = Arrays.asList(words);
		System.out.println("Before sort: \n"+wordList);
		
		Collections.sort(wordList);
		
		System.out.println("After sort: \n"+wordList);
		
	}

}
