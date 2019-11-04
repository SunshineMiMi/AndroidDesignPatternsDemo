package net.lqtest.dptest.ProxyPattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理
 */
public class DynamicProxy implements InvocationHandler{

	private Object obj;
	
	public DynamicProxy(Object object) {
		this.obj = object;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		//调用被代理类对象的方法
		Object result = method.invoke(obj, args);
		return result;
	}

}
