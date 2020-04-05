package com.myproject.designpatterns.factorydesign.Vehicle;

public class Car implements Vehicle {
	@Override
	public void numberOfWheels() {
		System.out.println("Vehicle has 4 wheels............");
	}
}
