package FactoryMethodPattern.demo1;

public class DatabaseLogFactory implements LogFactory{

	@Override
	public Log createLog() {
		
		return new DatabaseLog();
	}

}
