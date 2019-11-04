package net.lqtest.dptest.FactoryPattern.abstracts;

public class BusinessDriver extends AbstractDriver{

	@Override
	public ABenzCar createBenzCar(String car) throws Exception {
		return new BenzBusinessCar();
	}

	@Override
	public ABmwCar createBmwCar(String car) throws Exception {
		return new BmwBusinessCar();
	}

}
