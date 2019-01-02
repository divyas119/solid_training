package com.meditab.training.srp.exercise_refactored;

import java.util.Arrays;
import java.util.List;

public class CarDetails {
	private final Car _car;
	private List<Car> _carsDb = Arrays.asList(new Car("1", "Golf III", "Volkswagen"), new Car("2", "Multipla", "Fiat"),
			new Car("3", "Megane", "Renault"));
	public CarDetails(Car car) {
		_car = car;
	}

	public String getCarsNames() {
		StringBuilder sb = new StringBuilder();
		for (Car car : _carsDb) {
			sb.append(car.getBrand());
			sb.append(" ");
			sb.append(car.getModel());
			sb.append(", ");
		}
		return sb.substring(0, sb.length() - 2);
	}

	public Car getBestCar() {
		Car bestCar = null;
		for (Car car : _carsDb) {
			if (bestCar == null || car.getModel().compareTo(bestCar.getModel()) > 0) {
				bestCar = car;
			}
		}
		return bestCar;
	}
}
