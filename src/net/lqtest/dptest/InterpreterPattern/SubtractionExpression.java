package net.lqtest.dptest.InterpreterPattern;

/**
 * 减法运算抽象解析器
 */
public class SubtractionExpression extends OperatorExpression{

	public SubtractionExpression(ArithmeticExpression exp1, ArithmeticExpression exp2) {
		super(exp1, exp2);
	}

	@Override
	public int interpret() {
		return mExp1.interpret() - mExp2.interpret();
	}

}
