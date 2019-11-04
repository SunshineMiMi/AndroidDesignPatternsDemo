package net.lqtest.dptest.CommandPattern;

/**
 * 具体命令者，改变形状命令类
 */
public class TransformCommand implements Command{

	private TetrisMachine mTetrisMachine;
	
	public TransformCommand(TetrisMachine machine) {
		this.mTetrisMachine = machine;
	}
	
	@Override
	public void execute() {
		mTetrisMachine.transform();
	}

}
