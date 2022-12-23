package com.cisco.training.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.cisco.training.basics.ChemicalElement;

public class MapDemo {
	
	private static void simpleMapOps() {
		Map<String, Integer> runsMap = new LinkedHashMap<>();
		runsMap.put("rohit".toLowerCase(), 45);
		runsMap.put("virat".toLowerCase(), 18);
		runsMap.put("abc",23);
		runsMap.put("sky".toLowerCase(), 122);
		
		Scanner kb = new Scanner(System.in);
		while(true) {
			System.out.println("Enter a batsman name (or 'quit') : ");
			String name = kb.nextLine();
			if(name.equalsIgnoreCase("quit")) {
				break;
			}
			if(runsMap.containsKey(name.toLowerCase())) {
				System.out.println(name + " -----> " + runsMap.get(name.toLowerCase()));
			}else {
				System.out.println("No data for "+name);
			}
		}
		System.out.println("________________________");
		System.out.println("Anyone out for a duck? " + runsMap.containsValue(0));
		System.out.println("Here's the whole score card: ");
		
		Set<String> keys = runsMap.keySet();
		for(String aKey : keys) {
			System.out.println(aKey +" "+runsMap.get(aKey));
		}
	}

	public static void main(String[] args) {
		//simpleMapOps();
		mapWithUserDefinedKey();
	}

	private static void mapWithUserDefinedKey() {
		ChemicalElement o = new ChemicalElement(8, "Oxygen", "O");
		ChemicalElement h = new ChemicalElement(1, "Hydrogen", "H");
		ChemicalElement k = new ChemicalElement(19, "Potassium", "K");
		
		Map<ChemicalElement,Float> earthData = new HashMap<>();
		earthData.put(k, 2.5f);
		earthData.put(h, 25f);
		earthData.put(o, 23.1f);
		
		Scanner kb = new Scanner(System.in);
		while(true) {
			System.out.println("Enter an atomicNumber (or 'quit') : ");
			String input = kb.nextLine();
			if(input.equalsIgnoreCase("quit")) {
				break;
			}
			
			ChemicalElement c = new ChemicalElement(Integer.parseInt(input), "NA", "NA");
			if(earthData.containsKey(c)) {
				System.out.println("Element with atomic number "+input+ " -----> " + earthData.get(c) +"%");
			}else {
				System.out.println("No data for atomic number "+input);
			}
		}
	}

	

}
