package FactoryMethodPattern.demo1;

public class FileLogFactory implements LogFactory{

	@Override
	public Log createLog() {
		
		return new FileLog();
	}

}
