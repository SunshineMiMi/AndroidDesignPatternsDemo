package net.lqtest.dptest.MediatorPattern;

/**
 * 主板中介者
 */
public class MainBoard extends Mediator {

	private CDDevice mCdDevice;// 光驱设备
	private CPU mCpu;// cpu
	private GraphicsCard mGraphicsCard;// 显卡设备
	private SoundCard mSoundCard;// 声卡设备

	@Override
	public void changed(Colleague colleague) {
		// 如果光驱读取了数据
		if (colleague == mCdDevice) {
			handleCD((CDDevice) colleague);
		} else if (colleague == mCpu) {// 如果cpu处理完数据
			handleCpu((CPU) colleague);
		}
	}

	//处理光驱读取数据后与其他设备的交互
	private void handleCD(CDDevice cdDevice) {
		mCpu.decodeData(cdDevice.read());
	}

	//处理CPU读取数据后与其他设备的交互
	private void handleCpu(CPU cpu) {
		mSoundCard.soundPlay(cpu.getDataSound());
		mGraphicsCard.videoPlay(cpu.getDataVideo());
	}

	public void setmCdDevice(CDDevice mCdDevice) {
		this.mCdDevice = mCdDevice;
	}

	public void setmCpu(CPU mCpu) {
		this.mCpu = mCpu;
	}

	public void setmGraphicsCard(GraphicsCard mGraphicsCard) {
		this.mGraphicsCard = mGraphicsCard;
	}

	public void setmSoundCard(SoundCard mSoundCard) {
		this.mSoundCard = mSoundCard;
	}

}
