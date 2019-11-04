package net.lqtest.dptest.FactoryPattern.abstracts;

public abstract class AbstractDriver {
	public abstract ABenzCar createBenzCar(String car) throws Exception;

	public abstract ABmwCar createBmwCar(String car) throws Exception;
}
