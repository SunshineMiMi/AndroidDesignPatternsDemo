package net.lqtest.dptest.FactoryPattern.abstracts;

public class SportDriver extends AbstractDriver{

	@Override
	public ABenzCar createBenzCar(String car) throws Exception {
		return new BenzSportCar();
	}

	@Override
	public ABmwCar createBmwCar(String car) throws Exception {
		return new BmwSportCar();
	}

}
