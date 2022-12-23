package com.cisco.training.functional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalInterfacesDemo {
	
	public static <T> List<T> allMatches(List<T> input,Predicate<T> condition){
		List<T> output = new ArrayList<>();
		for(T aValue : input) {
			if(condition.test(aValue)) {
				output.add(aValue);
			}
		}
		return output;
	}
	
	public static <T,R> List<R> transformedList(List<T> input,Function<T, R> transformationLogic){
		List<R> output = new ArrayList<>();
		for(T aValue : input) {
			R transformedValue = transformationLogic.apply(aValue);
			output.add(transformedValue);
		}
		return output;
	}

	private static void functionDemo(List<String> words) {
		List<String> excitingWords = transformedList(words, s -> s + "!");
		System.out.println(excitingWords);
		List<String> eyeWords = transformedList(words, s -> s.replace("i", "eye"));
		System.out.println(eyeWords);
		List<String> upperCaseWords = transformedList(words, String::toUpperCase);
		System.out.println(upperCaseWords);
		List<Integer> lengths = transformedList(words, s -> s.length());
		System.out.println(lengths);
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		String[] str = {"hi","hello","what","time"};
		List<String> words = Arrays.asList(str);
		//predicateDemo(words);
		
		functionDemo(words);

	}

	

	private static void predicateDemo(List<String> words) {
		List<String> shortWords = allMatches(words, s -> s.length() < 4);
		System.out.println(shortWords);
		List<String> wordsWithB = allMatches(words, s -> s.contains("b"));
		System.out.println(wordsWithB);
		List<String> evenLengthWords = allMatches(words, s -> (s.length() % 2) == 0);
		System.out.println(evenLengthWords);
		List<Integer> nums = Arrays.asList(1, 10, 100, 1000, 10000);
		List<Integer> bigNums = allMatches(nums, n -> n>500);
		System.out.println(bigNums);
	}

}
