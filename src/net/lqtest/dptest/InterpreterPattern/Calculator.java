package net.lqtest.dptest.InterpreterPattern;

import java.util.Stack;

/**
 * 处理与解析相关的业务
 */
public class Calculator {

	// 声明一个Stack栈存储并操作所有相关的解析器
	private Stack<ArithmeticExpression> mExpStack = new Stack<ArithmeticExpression>();

	public Calculator(String expression) {
		// 声明两个临时变量，存储运算符两边的数字解析器
		ArithmeticExpression exp1, exp2;

		// 根据空格分割表达式字符串
		String[] elements = expression.split(" ");
		for (int i = 0; i < elements.length; i++) {
			switch (elements[i].charAt(0)) {
			case '+':// 如果为加号
				// 将栈中的解析器弹出作为运算符号左边的解析器
				exp1 = mExpStack.pop();
				// 同时将运算符号数组下标下一个元素构成为一个数字解析器
				exp2 = new NumExpression(Integer.valueOf(elements[++i]));
				// 通过上面两个数字解析器构造加法运算解析器
				mExpStack.push(new AdditionExpression(exp1, exp2));
				break;
			case '-'://如果为减号
				exp1 = mExpStack.pop();
				exp2 = new NumExpression(Integer.valueOf(elements[++i]));
				mExpStack.push(new SubtractionExpression(exp1, exp2));
				break;
			default:// 如果为数字
				mExpStack.push(new NumExpression(Integer.valueOf(elements[i])));
				break;
			}
		}
	}
	
	public int calculate(){
		return mExpStack.pop().interpret();
	}
}
