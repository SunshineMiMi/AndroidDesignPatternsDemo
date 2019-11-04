package net.lqtest.dptest.InterpreterPattern;


/**
 * 抽象解析器
 */
public abstract class ArithmeticExpression {
	
	/**
	 * 抽象解析方法
	 * 具体的解析逻辑由具体的子类实现
	 * @return 解析得到的具体值
	 */
	public abstract int interpret();
	

}
