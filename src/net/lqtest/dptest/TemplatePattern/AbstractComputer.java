package net.lqtest.dptest.TemplatePattern;

public abstract class AbstractComputer {
	
	protected void powerOn(){
		
	}

	protected void checkHardware(){
		
	}
	
	protected void loadOS() {
		
	}
	
	protected void login(){
		
	}
	
	//开机
	public final void startUp(){
		powerOn();
		checkHardware();
		loadOS();
		login();
	}
}
