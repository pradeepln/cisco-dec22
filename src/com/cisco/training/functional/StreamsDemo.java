package com.cisco.training.functional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsDemo {

	public static void main(String[] args) {
		String[] str = {"hi","hello","what","time"};
		List<String> words = Arrays.asList(str);
		
		//#1
//		words
//			.stream()
//			.forEach(s -> System.out.println("  "+s));
		
		//#2
//		words
//		.stream()
//		.forEach(System.out::println);

		//#3
		List<String> excitingWords = words
				.stream()
				.map(s -> s + "!")
				.toList(); // only after v 16
				//.collect(Collectors.toList()); //works in 8 upwards
		
		System.out.println(excitingWords);
		
		
//		List<String> eyeWords = transformedList(words, s -> s.replace("i", "eye"));
//		System.out.println(eyeWords);
//		List<String> upperCaseWords = transformedList(words, String::toUpperCase);
//		System.out.println(upperCaseWords);
		
		int multiplier = 3;
		
		List<Integer> lengths = words
				.stream()
				.map(s -> s.length())
				.map(i -> i * multiplier)
				.toList();
		
		System.out.println(lengths);
		
		
		//#4
		
		List<String> shortWords = words
				.stream()
				.filter(s -> s.length() < 4)
				.map(s -> s+"?")
				.toList();
		System.out.println(shortWords);
	}

}
