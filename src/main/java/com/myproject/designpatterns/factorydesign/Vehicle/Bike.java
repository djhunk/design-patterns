package com.myproject.designpatterns.factorydesign.Vehicle;

public class Bike implements Vehicle {
	@Override
	public void numberOfWheels() {
		System.out.println("Vehicle has 2 wheels");
	}
}
