package com.myproject.designpatterns.factorydesign.Factory;

import com.myproject.designpatterns.factorydesign.Vehicle.Bike;
import com.myproject.designpatterns.factorydesign.Vehicle.Car;
import com.myproject.designpatterns.factorydesign.Vehicle.Vehicle;

public class VehicleFactory {
	public static Vehicle getVehicle(String type) {
		if (type.equalsIgnoreCase("bike")) {
			return new Bike();
		} else if(type.equalsIgnoreCase("car")){
			return new Car();
		}
		return null;
	}
}
