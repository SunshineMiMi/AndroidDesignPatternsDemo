package net.lqtest.dptest.FactoryPattern.abstracts;

public abstract class ABmwCar {
	private String name;

	public abstract void drive();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
