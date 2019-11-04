package net.lqtest.dptest.VisitorPattern;

import java.util.LinkedList;
import java.util.List;

//员工业务报表
public class BusinessReport {

	List<Staff> mStaffs = new LinkedList<Staff>();

	public BusinessReport() {
		mStaffs.add(new Manager("ZHAO"));
		mStaffs.add(new Manager("QIAN"));
		mStaffs.add(new Engineer("SUN"));
		mStaffs.add(new Engineer("LI"));
		mStaffs.add(new Engineer("ZHOU"));
	}

	//为访问者提供报表
	public void showReport(Visitor visitor) {
		for (Staff staff : mStaffs) {
			staff.accept(visitor);
		}
	}
}
