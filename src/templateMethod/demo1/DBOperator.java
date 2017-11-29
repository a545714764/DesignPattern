package templateMethod.demo1;
//抽象数据库操作类：抽象类
public abstract class DBOperator {
	public abstract void connDB();
	public void openDB(){
		System.out.println("打开数据库");
	}
	public void useDB(){
		System.out.println("使用数据库");
	}
	public void closeDB(){
		System.out.println("关闭数据库");
	}
	public void process(){
		connDB();
		openDB();
		useDB();
		closeDB();
	}
}
