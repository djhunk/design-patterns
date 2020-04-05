package com.myproject.designpatterns.factorydesign;

import java.util.Objects;

import com.myproject.designpatterns.factorydesign.Factory.VehicleFactory;
import com.myproject.designpatterns.factorydesign.Vehicle.Vehicle;

public class FactoryTest {
	public static void main(String[] args) {

		Vehicle car = VehicleFactory.getVehicle("car");
		if (Objects.nonNull(car))
			car.numberOfWheels();

		Vehicle bike = VehicleFactory.getVehicle("bike");
		if (Objects.nonNull(bike))
			bike.numberOfWheels();
	}
}
