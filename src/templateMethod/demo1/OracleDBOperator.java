package templateMethod.demo1;

public class OracleDBOperator extends DBOperator {

	@Override
	public void connDB() {
		System.out.println("连接Oracle数据库！");

	}

}
