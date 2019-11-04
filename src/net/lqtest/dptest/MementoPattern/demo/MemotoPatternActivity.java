package net.lqtest.dptest.MementoPattern.demo;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import net.lqtest.dptest.R;

public class MemotoPatternActivity extends Activity implements OnClickListener {

	private NodeEditText mEtNode;// 编辑器
	private TextView mTvSave;// 保存
	private ImageView mIvUndo;// 撤销
	private ImageView mIvRedo;// 重做
	private NoteCareTaker mNoteCareTaker;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_memoto);

		mNoteCareTaker = new NoteCareTaker();
		initView();
	}

	private void initView() {
		mEtNode = (NodeEditText) findViewById(R.id.et_memo_content);
		mTvSave = (TextView) findViewById(R.id.btn_save);
		mIvUndo = (ImageView) findViewById(R.id.btn_undo);
		mIvRedo = (ImageView) findViewById(R.id.btn_redo);

		mTvSave.setOnClickListener(this);
		mIvUndo.setOnClickListener(this);
		mIvRedo.setOnClickListener(this);
	}

	@Override
	public void onClick(View view) {
		switch (view.getId()) {
		case R.id.btn_save:
			mNoteCareTaker.saveMemoto(mEtNode.createMemoto());
			showToast("保存笔记：");
			break;
		case R.id.btn_undo:
			mEtNode.restoreMemoto(mNoteCareTaker.getPrevMemoto());
			showToast("撤销：");
			break;
		case R.id.btn_redo:
			mEtNode.restoreMemoto(mNoteCareTaker.getNextMemoto());
			showToast("重做：");
			break;
		default:
			break;
		}
	}

	private void showToast(String msg) {
		Toast.makeText(this, msg + mEtNode.getText() + " ,光标位置： " + mEtNode.getSelectionStart(), Toast.LENGTH_LONG)
				.show();
	}
	
}
