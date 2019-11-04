package net.lqtest.dptest.ProxyPattern;

/**
 * 代理律师
 */
public class Lawyer implements ILawsuit{

	//持有一个具体被代理者的引用
	private ILawsuit mILawsuit;
	
	public Lawyer(ILawsuit iLawsuit) {
		mILawsuit = iLawsuit;
	}
	
	@Override
	public void submit() {
		mILawsuit.submit();
	}

	@Override
	public void burden() {
		mILawsuit.burden();
	}

	@Override
	public void defend() {
		mILawsuit.defend();
	}

	@Override
	public void finish() {
		mILawsuit.finish();
	}

}
