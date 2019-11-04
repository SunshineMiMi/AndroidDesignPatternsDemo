package net.lqtest.dptest.MediatorPattern;

/**
 * CPU同事
 */
public class CPU extends Colleague {

	private String dataVideo, dataSound;

	public CPU(Mediator mediator) {
		super(mediator);
	}

	public String getDataVideo() {
		return dataVideo;
	}

	public String getDataSound() {
		return dataSound;
	}
	//解码数据
	public void  decodeData(String data){
		String[] tmp = data.split(",");
		//分割音、视频数据
		dataVideo = tmp[0];
		//解析音、视频数据
		dataSound = tmp[1];
		//告诉中介者自身状态的改变
		mMediator.changed(this);
	}

}
