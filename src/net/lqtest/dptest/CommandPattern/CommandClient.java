package net.lqtest.dptest.CommandPattern;

public class CommandClient {

	public static void main(String[] args) {
			TetrisMachine machine = new TetrisMachine();
			
			LeftCommand leftCommand = new LeftCommand(machine);
			RightCommand rightCommand = new RightCommand(machine);
			FallCommand fallCommand = new FallCommand(machine);
			TransformCommand transformCommand = new TransformCommand(machine);
			
			Buttons buttons = new Buttons();
			buttons.setLeftCommand(leftCommand);
			buttons.setRightCommand(rightCommand);
			buttons.setFallCommand(fallCommand);
			buttons.setTransformCommand(transformCommand);
			
			buttons.toLeft();
			buttons.ToRight();
			buttons.fall();
			buttons.transform();
	}
}
