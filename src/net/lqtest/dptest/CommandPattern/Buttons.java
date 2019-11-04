package net.lqtest.dptest.CommandPattern;

/**
 * 请求者类,命令由按钮发起
 */
public class Buttons {

	private LeftCommand mLeftCommand;
	private RightCommand mRightCommand;
	private FallCommand mFallCommand;
	private TransformCommand mTransformCommand;
	
	public void setLeftCommand(LeftCommand leftCommand){
		this.mLeftCommand = leftCommand;
	}
	
	public void setRightCommand(RightCommand rightCommand){
		this.mRightCommand = rightCommand;
	}
	
	public void setFallCommand(FallCommand fallCommand){
		this.mFallCommand = fallCommand;
	}
	
	public void setTransformCommand(TransformCommand transformCommand){
		this.mTransformCommand = transformCommand;
	}
	
	public void toLeft(){
		mLeftCommand.execute();
	}
	
	public void ToRight(){
		mRightCommand.execute();
	}
	
	public void fall(){
		mFallCommand.execute();
	}
	
	public void transform(){
		mTransformCommand.execute();
	}
	
}
