package net.lqtest.dptest.MediatorPattern;

public class MediatorClient {

	public static void main(String[] args) {
		//构建主板对象
		MainBoard board = new MainBoard();
		
		//分别构造各个零件
		CDDevice cdDevice = new CDDevice(board);
		CPU cpu = new CPU(board);
		GraphicsCard card = new GraphicsCard(board);
		SoundCard soundCard = new SoundCard(board);
		
		//将各个零件安装到主板
		board.setmCdDevice(cdDevice);
		board.setmCpu(cpu);
		board.setmGraphicsCard(card);
		board.setmSoundCard(soundCard);
		
		//开始播放资源
		cdDevice.load();
	}
}
