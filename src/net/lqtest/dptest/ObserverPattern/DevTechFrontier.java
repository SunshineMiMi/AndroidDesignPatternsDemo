package net.lqtest.dptest.ObserverPattern;

import java.util.Observable;

/**
 * 网站是被观察者
 */
public class DevTechFrontier extends Observable{

	public void postNewPublication(String content){
		//标识状态或者内容发生改变
		setChanged();
		//通知所有观察者
		notifyObservers(content);
	}
}
