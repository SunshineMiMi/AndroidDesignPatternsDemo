package net.lqtest.dptest.CommandPattern;

/**
 * 具体命令者，快速下降命令类
 */
public class FallCommand implements Command{

	private TetrisMachine mTetrisMachine;
	
	public FallCommand(TetrisMachine machine) {	
		this.mTetrisMachine = machine;
	}
	
	@Override
	public void execute() {
		mTetrisMachine.fastToBottom();
	}

}
