package net.lqtest.dptest.MementoPattern.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * 负责管理DemoMemoto类
 */
public class NoteCareTaker {

	// 最大存储数量
	private static final int MAX = 50;
	// 存储50条数据
	private List<DemoMemoto> mMemotos = new ArrayList<DemoMemoto>(MAX);
	private int mIndex = 0;
	
	//保存到备忘录存档
	public void saveMemoto(DemoMemoto memoto) {
		if (mMemotos.size() > MAX) {
			mMemotos.remove(0);
		}
		mMemotos.add(memoto);
		mIndex = mMemotos.size() - 1;
	}
	
	// 返回到上一个存档,相当于撤销
	public DemoMemoto getNextMemoto() {
		mIndex = mIndex < mMemotos.size() - 1 ? ++mIndex : mIndex;
		return mMemotos.get(mIndex);
	}

	// 获取下一个存档信息，相当于重做
	public DemoMemoto getPrevMemoto() {
		mIndex = mIndex > 0 ? --mIndex : mIndex;
		return mMemotos.get(mIndex);
	}
}
