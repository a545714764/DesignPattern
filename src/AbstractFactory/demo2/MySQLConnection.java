package AbstractFactory.demo2;

public class MySQLConnection implements Connection {

	@Override
	public void connect() {
		System.out.println("����MySQL���ݿ�");

	}

}
