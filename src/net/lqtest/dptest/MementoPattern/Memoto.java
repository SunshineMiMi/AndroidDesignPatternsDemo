package net.lqtest.dptest.MementoPattern;

/**
 * 备忘录类
 */
public class Memoto {
	
	public int mCheckpoint;
	public int mLifeValue;
	public String mWeapon;
	
	
	@Override
	public String toString() {
		return "Memoto [mCheckpoint=" + mCheckpoint + ", mLifeValue=" + mLifeValue + ", mWeapon=" + mWeapon + "]";
	}
	
}
