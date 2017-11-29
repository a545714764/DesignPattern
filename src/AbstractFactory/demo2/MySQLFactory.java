package AbstractFactory.demo2;

public class MySQLFactory implements DBFactory {

	@Override
	public Connection createConnection() {
		// TODO Auto-generated method stub
		return new MySQLConnection();
	}

	@Override
	public Statement createStatement() {
		// TODO Auto-generated method stub
		return new MySQLStatement();
	}

}
