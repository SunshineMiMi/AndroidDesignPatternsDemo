package net.lqtest.dptest.MementoPattern;

public class MemotoPClient {

	public static void main(String[] args) {
		// 构建游戏对象
		CallOfDuty game = new CallOfDuty();
		game.play();

		Caretaker caretaker = new Caretaker();
		// 游戏存档
		caretaker.archive(game.createMemoto());
		// 退出游戏
		game.quit();
		// 恢复游戏
		CallOfDuty newGame = new CallOfDuty();
		newGame.restore(caretaker.getMemoto());
	}

}
