package net.lqtest.dptest.VisitorPattern;

import android.util.Log;

public class CTOVisitor implements Visitor {

	private static final String TAG = "CTOVisitor";

	@Override
	public void visit(Engineer engineer) {
		Log.d(TAG, "工程师：" + engineer.name + ",CodeLines:" + engineer.getCodeLines());
	}

	@Override
	public void visit(Manager manager) {
		Log.d(TAG, "经理：" + manager.name + ",Products:" + manager.getProducts());
	}

}
