package net.lqtest.dptest.CompositePattern;

import java.util.Iterator;
import java.util.List;

import android.util.Log;

public class Folder extends Dir{
	
	private static final String TAG = "Folder";

	public Folder(String name) {
		super(name);
	}

	@Override
	public void addDir(Dir dir) {
		mDirs.add(dir);
	}

	@Override
	public void rmDir(Dir dir) {
		mDirs.remove(dir);
	}

	@Override
	public List<Dir> getFiles() {
		return mDirs;
	}

	@Override
	public void clear() {
		mDirs.clear();
	}

	@Override
	public void print() {
		Log.d(TAG, getName() + "(");
		Iterator<Dir> iterator = mDirs.iterator();
		while (iterator.hasNext()) {
			Dir dir = iterator.next();
			dir.print();
			if (iterator.hasNext()) {
				Log.d(TAG, ", ");
			}
		}
		Log.d(TAG, ")");
	}

}
