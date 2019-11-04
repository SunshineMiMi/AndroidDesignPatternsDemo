package net.lqtest.dptest.ProxyPattern;

import android.util.Log;

/**
 * 具体诉讼人
 */
public class XiaoMin implements ILawsuit{

	private static final String TAG  = "XiaoMin";
	
	@Override
	public void submit() {
		Log.d(TAG, "特此申请仲裁！");
	}

	@Override
	public void burden() {
		Log.d(TAG, "这是相应的证据！");
	}

	@Override
	public void defend() {
		Log.d(TAG, "证据确凿，不用再说什么了！");
	}

	@Override
	public void finish() {
		Log.d(TAG, "诉讼成功！");
	}

}
