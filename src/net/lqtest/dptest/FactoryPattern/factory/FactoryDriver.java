package net.lqtest.dptest.FactoryPattern.factory;

import net.lqtest.dptest.FactoryPattern.Car;

public abstract class FactoryDriver {
	public abstract Car createCar(String car) throws Exception;
}
