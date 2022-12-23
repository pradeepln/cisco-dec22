package com.cisco.training.functional;

@FunctionalInterface
public interface TwoStringPredicate {

	
	
	public boolean isFirstBetterThanSecond(String first,String second);
	
	
	public default String someOp() {
		return "test data";
	}
}
