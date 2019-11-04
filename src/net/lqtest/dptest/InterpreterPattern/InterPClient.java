package net.lqtest.dptest.InterpreterPattern;

import android.util.Log;

public class InterPClient {

	public static final String TAG = "InterpreterPattern";

	public static void main(String[] args) {
		Calculator calculator = new Calculator("153+3589+125-33-214");
		Log.d(TAG, "test: " + calculator.calculate());
	}

}
