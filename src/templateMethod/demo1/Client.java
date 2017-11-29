package templateMethod.demo1;
/*
 * 模板方法
 * 对数据库的操作一般包括连接、打开、使用、关闭等步骤，再数据库操作模板类中我们定义了
 * connDB()、openDB()、useDB()、closeDB()四个方法分别对应这四个步骤。对于不
 * 同类型的数据库(如SQL server和Oracle),其操作步骤都一致，只是连接数据库connDB()
 * 方法有所区别，先使用模板方法模式对其进行设计
 */
public class Client {
	public static void main(String[] args) {
		DBOperator operator;
		operator = new SQLServerDBOperator();
		operator.process();
		System.out.println("-------------------------");
		operator = new OracleDBOperator();
		operator.process();
	}
}
