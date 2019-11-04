package net.lqtest.dptest.ProxyPattern;

/**
 * 诉讼接口类
 */
public interface ILawsuit {

	/**
	 * 申请提交
	 */
	void submit();
	
	/**
	 * 进行举证
	 */
	void burden();
	
	/**
	 * 开始辩护
	 */
	void defend();
	
	/**
	 * 诉讼完成
	 */
	void finish();
	
}
