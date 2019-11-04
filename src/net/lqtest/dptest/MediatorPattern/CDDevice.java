package net.lqtest.dptest.MediatorPattern;

/**
 * 光驱同事
 */
public class CDDevice extends Colleague{
	
	private String data;//视频数据

	public CDDevice(Mediator mediator) {
		super(mediator);
	}

	public String read(){
		return data;
	}
	
	public void load(){
		data = "视频数据,音频数据";
		
		//通知中介者，也就是主板数据改变
		mMediator.changed(this);
	}
}
