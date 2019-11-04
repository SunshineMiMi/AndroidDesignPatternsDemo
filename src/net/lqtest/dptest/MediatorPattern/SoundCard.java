package net.lqtest.dptest.MediatorPattern;

import android.util.Log;

/**
 * 声卡同事
 */
public class SoundCard extends Colleague {

	private static final String TAG = "SoundCard";

	public SoundCard(Mediator mediator) {
		super(mediator);
	}

	public void soundPlay(String data) {
		Log.d(TAG, "音频：" + data);
	}
}
