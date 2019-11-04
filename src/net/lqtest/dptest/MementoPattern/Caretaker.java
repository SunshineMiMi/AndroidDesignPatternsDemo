package net.lqtest.dptest.MementoPattern;

/**
 * 管理通讯录类
 */
public class Caretaker {

	Memoto mMemoto;// 备忘录

	//存档
	public void archive(Memoto memoto) {
		this.mMemoto = memoto;
	}

	//获取存档
	public Memoto getMemoto(){
		return mMemoto;
	}
}
