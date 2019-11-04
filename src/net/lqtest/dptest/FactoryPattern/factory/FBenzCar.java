package net.lqtest.dptest.FactoryPattern.factory;

import net.lqtest.dptest.FactoryPattern.Car;
import net.lqtest.dptest.FactoryPattern.simple.BenzCar;

public class FBenzCar extends FactoryDriver{

	@Override
	public Car createCar(String car) throws Exception {
		return new BenzCar();
	}

}
