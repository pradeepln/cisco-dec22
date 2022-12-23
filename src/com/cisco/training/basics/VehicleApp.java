package com.cisco.training.basics;

public class VehicleApp {

	public static void main(String[] args) {
		Car c = new Car();
		Bus b = new Bus();
		//new Vehicle();
		Driver d = new Driver();
								//type substitution
		d.goFromPointAToPointB(c);
		
		d.goFromPointAToPointB(b);

	}

}
