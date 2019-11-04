package net.lqtest.dptest.FactoryPattern.factory;

import net.lqtest.dptest.FactoryPattern.Car;
import net.lqtest.dptest.FactoryPattern.simple.BmwCar;

public class FBmwCar extends FactoryDriver{

	@Override
	public Car createCar(String car) throws Exception {
		return new BmwCar();
	}

}
