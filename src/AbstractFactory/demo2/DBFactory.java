package AbstractFactory.demo2;

public interface DBFactory {
	public Connection createConnection();
	public Statement createStatement();
}
