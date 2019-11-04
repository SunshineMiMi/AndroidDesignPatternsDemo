package net.lqtest.dptest.VisitorPattern;

import android.util.Log;

public class CEOVisitor implements Visitor {

	private static final String TAG = "CEOVisitor";

	@Override
	public void visit(Engineer engineer) {
		Log.d(TAG, "工程师：" + engineer.name + ",KPI:" + engineer.kpi + ",CodeLines:" + engineer.getCodeLines());
	}

	@Override
	public void visit(Manager manager) {
		Log.d(TAG, "经理：" + manager.name + ",KPI:" + manager.kpi + ",Products:" + manager.getProducts());
	}

}
