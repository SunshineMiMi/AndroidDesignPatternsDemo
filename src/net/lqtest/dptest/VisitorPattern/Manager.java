package net.lqtest.dptest.VisitorPattern;

import java.util.Random;

//经理
public class Manager extends Staff{
	
	//产品数量
	private int products;
	
	public Manager(String aName) {
		super(aName);
		products = new Random().nextInt(10);
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	//产品数量
	public int getProducts(){
		return products;
	}
}
