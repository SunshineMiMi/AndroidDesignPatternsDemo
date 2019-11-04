package net.lqtest.dptest.TemplatePattern;

public class TemplateClient {

	public static void main(String[] args) {
		AbstractComputer computer = new CoderComputer();
		computer.startUp();
		
		computer = new MilitaryComputer();
		computer.startUp();
	}
}
