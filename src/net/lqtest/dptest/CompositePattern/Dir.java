package net.lqtest.dptest.CompositePattern;

import java.util.ArrayList;
import java.util.List;

public abstract class Dir {

	//声明一个list成员变量存储文件夹下的所有元素
	protected List<Dir> mDirs = new ArrayList<>();
	
	//当前文件或者文件夹名
	private String mName;
	
	public Dir(String name) {
		this.mName = name;
	}
	
	/**
	 * 添加一个文件或文件夹
	 */
	public abstract void addDir(Dir dir);
	
	/**
	 * 删除一个文件或文件夹
	 */
	public abstract void rmDir(Dir dir);

	/**
	 * 获取文件夹下的文件或者子文件夹
	 */
	public abstract List<Dir> getFiles();
	
	/**
	 * 清空文件夹下的所有元素
	 */
	public abstract void clear();
	
	/**
	 * 输出文件目录结构
	 */
	public abstract void print();
	
	/**
	 * 获取文件或文件夹名
	 * @return
	 */
	public String getName(){
		return mName;
	}
}
