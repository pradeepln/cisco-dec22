package com.cisco.training.basics;

public class Driver {

	public void goFromPointAToPointB(Vehicle v) {
		v.start();
		System.out.println("[[[ Going from A to B ]]]");

		if (v instanceof Car c) {
			//Car c = (Car) v;
			c.playMusic();
		}
		v.stop();
	}

}
