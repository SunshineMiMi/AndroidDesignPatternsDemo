package net.lqtest.dptest.InterpreterPattern;

/**
 * 运算符号抽象解析器
 */
public abstract class OperatorExpression extends ArithmeticExpression {

	protected ArithmeticExpression mExp1, mExp2;

	public OperatorExpression(ArithmeticExpression exp1, ArithmeticExpression exp2) {
		this.mExp1 = exp1;
		this.mExp2 = exp2;
	}

}
