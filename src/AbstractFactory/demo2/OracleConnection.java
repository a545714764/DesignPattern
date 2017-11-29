package AbstractFactory.demo2;

public class OracleConnection implements Connection {

	@Override
	public void connect() {
		System.out.println("连接Oracle数据库");

	}

}
