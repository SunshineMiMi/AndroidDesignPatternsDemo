package net.lqtest.dptest.ProxyPattern;

import java.lang.reflect.Proxy;

/**
 * 客户类
 */
public class ProxyClient {
	
	public static void main(String[] args) {
		//构造小民(静态代理)
		ILawsuit iLawsuit = new XiaoMin();
		//构造一个代理律师并将小民作为构造参数传递进去
		ILawsuit lawyer = new Lawyer(iLawsuit);
		lawyer.submit();//律师提交诉讼
		lawyer.burden();//律师进行举证
		lawyer.defend();//律师替小民辩护
		lawyer.finish();//完成诉讼
		
		
		//构造小民(动态代理)
		ILawsuit xiaomin = new XiaoMin();
		//构建一个动态代理
		DynamicProxy proxy = new DynamicProxy(xiaomin);
		//获取被代理类小民的classloader
		ClassLoader loader = xiaomin.getClass().getClassLoader();
		//动态构造一个代理者律师
		ILawsuit dlawyer = (ILawsuit) Proxy.newProxyInstance(loader, new Class[] { ILawsuit.class }, proxy);
		dlawyer.submit();
		dlawyer.burden();
		dlawyer.defend();
		dlawyer.finish();
	}
}
