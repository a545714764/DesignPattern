package FactoryMethodPattern.demo1;
/*
 * 某系统日志记录器要求支持多种日志记录方式
 * 如文件日志记录(FileLog),数据库日志记录(DatabaseLog)等
 * 且用户可以根据要求动态选择日志记录方式,现使用工厂方法模式设计该系统
 * 
 * 可以使用反射机制来生成工厂对象
 */
public class Client {
	public static void main(String[] args) {
		LogFactory factory;
		Log log;
		factory = new FileLogFactory();
		log = factory.createLog();
		log.writeLog();
	}
}
