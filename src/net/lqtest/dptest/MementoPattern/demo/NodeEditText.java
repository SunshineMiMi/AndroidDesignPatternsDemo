package net.lqtest.dptest.MementoPattern.demo;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EditText;

/**
 * 自定义EditTest
 *
 */
public class NodeEditText extends EditText {

	public NodeEditText(Context context, AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
	}

	public NodeEditText(Context context, AttributeSet attrs) {
		this(context, attrs, 0);
	}

	public NodeEditText(Context context) {
		this(context, null);
	}

	public DemoMemoto createMemoto(){
		DemoMemoto demoMemoto = new DemoMemoto();
		demoMemoto.text = getText().toString();
		demoMemoto.cursor = getSelectionStart();
		return demoMemoto;
	}
	
	public void restoreMemoto(DemoMemoto memoto){
		setText(memoto.text);
		setSelection(memoto.cursor);
	}
}
