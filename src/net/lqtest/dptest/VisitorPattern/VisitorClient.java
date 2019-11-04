package net.lqtest.dptest.VisitorPattern;

/**
 * 员工：工程师(代码量)、经理(新产品数量) 	
 * 评定员工：CEO(工程师的KPI)、CTO(经理的KPI)
 */
public class VisitorClient {

	public static void main(String[] args) {
		//构建报表
		BusinessReport report = new BusinessReport();
		//设置访问者，这里是CEO,CEO报表
		report.showReport(new CEOVisitor());
		//另一个访问者，CTO报表
		report.showReport(new CTOVisitor());
	}
}
