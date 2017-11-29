package AbstractFactory.demo2;

public class MySQLConnection implements Connection {

	@Override
	public void connect() {
		System.out.println("连接MySQL数据库");

	}

}
