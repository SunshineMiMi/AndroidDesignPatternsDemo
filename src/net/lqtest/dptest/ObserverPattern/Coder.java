package net.lqtest.dptest.ObserverPattern;

import java.util.Observable;
import java.util.Observer;

import android.util.Log;

/**
 * 程序员是观察者
 */
public class Coder implements Observer {

	private static final String TAG = "Coder";
	public String name;

	public Coder(String aName) {
		name = aName;
	}

	@Override
	public void update(Observable observable, Object data) {
		// 实现更新
		Log.d(TAG, name + ",更新内容啦!!内容是：" + data);
	}

	@Override
	public String toString() {
		return name + " --- Coder Ok!!";
	}
}
