package net.lqtest.dptest.ObserverPattern;

public class Test {

	public static void main(String[] args) {
		//被观察的角色
		DevTechFrontier devTechFrontier = new DevTechFrontier();
		
		//观察者
		Coder coder1 = new Coder("coder-1");
		Coder coder2 = new Coder("coder-2");
		Coder coder3 = new Coder("coder-3");
		Coder coder4 = new Coder("coder-4");
		
		//注册
		devTechFrontier.addObserver(coder1);
		devTechFrontier.addObserver(coder2);
		devTechFrontier.addObserver(coder3);
		devTechFrontier.addObserver(coder4);
		
		devTechFrontier.postNewPublication("内容更新啦!");
	}
}
