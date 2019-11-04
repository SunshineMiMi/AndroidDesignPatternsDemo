package net.lqtest.dptest.MementoPattern;

import android.util.Log;

/**
 * 使命召唤游戏
 */
public class CallOfDuty {

	private static final String TAG = "CallOfDuty";
	private int mCheckpoint = 1;
	private int mLifeValue = 100;
	private String mWeapon = "沙漠之鹰";

	public void play() {
		Log.d(TAG, "玩游戏：" + String.format("第%d关", mCheckpoint));
		mLifeValue -= 10;
		Log.d(TAG, "进度升级啦！");
		mCheckpoint++;
		Log.d(TAG, "到达" + String.format("第%d关", mCheckpoint));
	}

	public void quit() {
		Log.d(TAG, "退出前游戏属性：" + this.toString());
		Log.d(TAG, "退出游戏");
	}

	public Memoto createMemoto(){
		Memoto memoto = new Memoto();
		memoto.mCheckpoint = mCheckpoint;
		memoto.mLifeValue = mLifeValue;
		memoto.mWeapon = mWeapon;
		return memoto;
	}
	
	public void restore(Memoto memoto){
		this.mCheckpoint = memoto.mCheckpoint;
		this.mLifeValue = memoto.mLifeValue;
		this.mWeapon = memoto.mWeapon;
		Log.d(TAG, "恢复后游戏属性：" + this.toString());
	}

	@Override
	public String toString() {
		return "CallOfDuty [mCheckpoint=" + mCheckpoint + ", mLifeValue=" + mLifeValue + ", mWeapon=" + mWeapon + "]";
	}
	
}
