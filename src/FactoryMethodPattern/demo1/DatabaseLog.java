package FactoryMethodPattern.demo1;

public class DatabaseLog implements Log {

	@Override
	public void writeLog() {
		System.out.println("数据库日志记录");

	}

}
