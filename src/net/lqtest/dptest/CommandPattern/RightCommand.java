package net.lqtest.dptest.CommandPattern;

/**
 * 具体命令者，右移命令类
 */
public class RightCommand implements Command{
	
	private TetrisMachine mTetrisMachine;

	public RightCommand(TetrisMachine machine) {
		this.mTetrisMachine = machine;
	}
	
	@Override
	public void execute() {
		mTetrisMachine.toRight();
	}

}
