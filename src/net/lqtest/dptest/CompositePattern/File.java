package net.lqtest.dptest.CompositePattern;

import java.util.List;

import android.util.Log;

public class File extends Dir{

	private static final String TAG = "File";
	
	public File(String name) {
		super(name);
	}

	@Override
	public void addDir(Dir dir) {
		throw new UnsupportedOperationException("文件对象不支持该操作！");
	}

	@Override
	public void rmDir(Dir dir) {
		throw new UnsupportedOperationException("文件对象不支持该操作！");		
	}

	@Override
	public List<Dir> getFiles() {
		throw new UnsupportedOperationException("文件对象不支持该操作！");
	}

	@Override
	public void clear() {
		throw new UnsupportedOperationException("文件对象不支持该操作！");		
	}

	@Override
	public void print() {
		Log.d(TAG, getName());
	}

}
