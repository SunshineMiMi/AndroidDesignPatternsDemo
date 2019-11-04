package net.lqtest.dptest.InterpreterPattern;

/**
 * 加法运算抽象解析器
 */
public class AdditionExpression extends OperatorExpression{

	public AdditionExpression(ArithmeticExpression exp1, ArithmeticExpression exp2) {
		super(exp1, exp2);
	}

	@Override
	public int interpret() {
		return mExp1.interpret() + mExp2.interpret();
	}

}
