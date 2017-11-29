package AbstractFactory.demo2;
/*
 * ĳϵͳΪ�˸Ľ����ݿ����������,�Զ������ݿ����Ӷ���Connection��������Statement
 * ����Բ�ͬ���͵����ݿ��ṩ��ͬ�����Ӷ����������,���ṩOracle��MySQLר����������������
 * �����û�����ͨ�������ļ��ȷ�ʽ����ʵ����Ҫ��̬����ϵͳ���ݿ�
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
