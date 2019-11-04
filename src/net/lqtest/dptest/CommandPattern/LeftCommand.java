package net.lqtest.dptest.CommandPattern;

/**
 * 具体命令者，左移命令类
 */
public class LeftCommand implements Command{

	private TetrisMachine mTetrisMachine;
	
	public LeftCommand(TetrisMachine machine) {
		this.mTetrisMachine = machine;
	}

	@Override
	public void execute() {
		mTetrisMachine.toLeft();
	}
}
