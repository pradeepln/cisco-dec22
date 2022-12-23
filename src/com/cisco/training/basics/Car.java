package com.cisco.training.basics;

public class Car extends Vehicle {
	
	@Override
	public void start() {
		System.out.println("<<<<<<< CAR Starting >>>>>>>");
	}
	
	
	@Override
	public void stop() {
		System.out.println("<<<<<<< Screeeeech >>>>>>>");
	}
	
	public void playMusic() {
		System.out.println("(((( Dhin Chak ))))");
	}

}
