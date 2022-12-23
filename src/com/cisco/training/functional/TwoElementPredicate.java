package com.cisco.training.functional;

@FunctionalInterface
public interface TwoElementPredicate<T> {
	public boolean isFirstBetterThanSecond(T first,T second);
}
