package com.cisco.training.functional;

import java.util.Arrays;

public class LambdaDemo {

//arity           ret       argType 
//sig acSp mod    ret  name argTypes       throws  	
	public static void main(String[] args) {
//		String[] words = {"this","is","a","bunch","of","strange","words","like","xylophone"};
//		System.out.println("Before \n"+Arrays.asList(words));
		
//		Arrays.sort(words, (String s1, String s2) -> { return s1.length() - s2.length(); });
		
//		Arrays.sort(words, (s1,s2) -> s1.length() - s2.length());
		
//		Arrays.sort(words, (s1,s2) -> s2.length() - s1.length());
		
		
//		Arrays.sort(words, (s1,s2) -> wordsWithEFirst(s1, s2));
		
//		LambdaDemo obj = new LambdaDemo();
//		Arrays.sort(words, obj::wordsWithEFirst);
//		System.out.println("After \n"+Arrays.asList(words));
		
		 String better = betterElement("hi"	, "hello", (s1, s2) -> s1.length() > s2.length());
		 System.out.println(better);
		 better =betterString("hi", "hello", (s1, s2) -> true);
		 System.out.println(better);
		 Integer larger = betterElement(1234,2345,(num1,num2) -> num1 > num2);
		 System.out.println(larger);
	}
	
	public static <X> X betterElement(X element1,X element2, TwoElementPredicate<X> decider) {
		if(decider.isFirstBetterThanSecond(element1, element2)) {
			return element1;
		}else {
			return element2;
		}
	}
	
	public static String betterString(String word1,String word2, TwoStringPredicate decider) {
		if(decider.isFirstBetterThanSecond(word1, word2)) {
			return word1;
		}else {
			return word2;
		}
	}
	
	
	
	
	
	
	
	
	
	

//arity      ret                 args
	private int wordsWithEFirst(String s1, String s2) {
		if(s1.contains("e") && !s2.contains("e")) {
			return -1;
		}else if(!s1.contains("e") && s2.contains("e")) {
			return 1;
		}else {
			return 0;
		}
}

}
