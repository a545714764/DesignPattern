package AbstractFactory.demo2;
/*
 * 某系统为了改进数据库操作的性能,自定义数据库连接对象Connection和语句对象Statement
 * 可针对不同类型的数据库提供不同的连接对象和语句对象,如提供Oracle或MySQL专用连接类和与语句类
 * 而且用户可以通过配置文件等方式根据实际需要动态更换系统数据库
 */
public class Client {
	public static void main(String[] args) {
		DBFactory factory;
		Connection connection;
		Statement statement;
		factory = new OracleFactory();
		connection = factory.createConnection();
		statement = factory.createStatement();
		connection.connect();
		statement.executeStatement();
	}
}
