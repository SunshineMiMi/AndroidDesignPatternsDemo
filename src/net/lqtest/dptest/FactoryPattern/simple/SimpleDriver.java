package net.lqtest.dptest.FactoryPattern.simple;

import net.lqtest.dptest.FactoryPattern.Car;

public class SimpleDriver {
	public static Car createCar(String car) {
		Car c = null;
		if ("Benz".equalsIgnoreCase(car))
			c = new BenzCar();
		else if ("Bmw".equalsIgnoreCase(car))
			c = new BmwCar();
		return c;
	}
}
