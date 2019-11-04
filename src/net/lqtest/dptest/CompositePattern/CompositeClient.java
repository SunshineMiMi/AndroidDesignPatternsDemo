package net.lqtest.dptest.CompositePattern;

/**
 * 以文件系统为例
 */
public class CompositeClient {

	public static void main(String[] args) {
		Dir diskC = new Folder("C");
		
		diskC.addDir(new File("ImbaLog.txt"));
		
		Dir dirWin = new Folder("Windows");
		dirWin.addDir(new File("explorer.exe"));
		diskC.addDir(dirWin);
		
		Dir dirPer = new Folder("PerfLogs");
		dirPer.addDir(new File("null.txt"));
		diskC.addDir(dirPer);
		
		diskC.print();
		
		//C(ImbaLog.txt,Windows(explorer.exe),PerfLogs(null.txt))
	}
}
