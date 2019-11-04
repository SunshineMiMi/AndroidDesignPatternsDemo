package net.lqtest.dptest.InterpreterPattern;

/**
 * 数字解析器
 */
public class NumExpression extends ArithmeticExpression{

	private int mNum;
	
	public NumExpression(int num) {
		this.mNum = num;
	}
	
	@Override
	public int interpret() {
		return mNum;
	}

}
