package net.lqtest.dptest.VisitorPattern;

import java.util.Random;

//工程师
public class Engineer extends Staff {

	public Engineer(String aName) {
		super(aName);
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	//代码量
	public int getCodeLines() {
		return new Random().nextInt(10 * 10000);
	}
}
