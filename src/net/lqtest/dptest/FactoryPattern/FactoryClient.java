package net.lqtest.dptest.FactoryPattern;

import net.lqtest.dptest.FactoryPattern.abstracts.ABenzCar;
import net.lqtest.dptest.FactoryPattern.abstracts.AbstractDriver;
import net.lqtest.dptest.FactoryPattern.abstracts.BusinessDriver;
import net.lqtest.dptest.FactoryPattern.factory.FBenzCar;
import net.lqtest.dptest.FactoryPattern.factory.FactoryDriver;
import net.lqtest.dptest.FactoryPattern.simple.SimpleDriver;

public class FactoryClient {

	public static void main(String[] args) {
		// 简单工厂模式
		// 老板告诉司机我今天坐奔驰
		Car car = SimpleDriver.createCar("benz");
		car.setName("benz");
		// 司机开着奔驰出发
		car.drive();

		// 工厂方法模式
		try {
			FactoryDriver factoryDriver = new FBenzCar();
			Car bCar;
			bCar = factoryDriver.createCar("benz");
			bCar.setName("benz");
			bCar.drive();
		} catch (Exception e) {
			e.printStackTrace();
		}

		// 抽象工厂模式
		try {
			AbstractDriver abstractDriver = new BusinessDriver();
			ABenzCar aBenzCar = abstractDriver.createBenzCar("benz");
			aBenzCar.drive();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
