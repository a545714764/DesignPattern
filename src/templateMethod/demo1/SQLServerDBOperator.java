package templateMethod.demo1;

public class SQLServerDBOperator extends DBOperator {

	@Override
	public void connDB() {
		System.out.println("连接SQL server数据库！");

	}

}
