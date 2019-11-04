package net.lqtest.dptest.MediatorPattern;

import android.util.Log;

/**
 * 显卡同事
 */
public class GraphicsCard extends Colleague {

	private static final String TAG = "GraphicsCard";

	public GraphicsCard(Mediator mediator) {
		super(mediator);
	}

	public void videoPlay(String data) {
		Log.d(TAG, "视频：" + data);
	}
}
