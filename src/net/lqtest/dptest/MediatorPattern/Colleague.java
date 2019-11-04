package net.lqtest.dptest.MediatorPattern;

//抽象同事
public abstract class Colleague {

	protected Mediator mMediator;//每一个同事都该知道其中的中介者
	
	public Colleague(Mediator mediator){
		this.mMediator = mediator;
	}
}
