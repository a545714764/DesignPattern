package FactoryMethodPattern.demo1;

public class FileLog implements Log {

	@Override
	public void writeLog() {
		System.out.println("文件日志记录");

	}

}
