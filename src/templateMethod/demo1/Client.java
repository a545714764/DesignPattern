package templateMethod.demo1;
/*
 * ģ�巽��
 * �����ݿ�Ĳ���һ��������ӡ��򿪡�ʹ�á��رյȲ��裬�����ݿ����ģ���������Ƕ�����
 * connDB()��openDB()��useDB()��closeDB()�ĸ������ֱ��Ӧ���ĸ����衣���ڲ�
 * ͬ���͵����ݿ�(��SQL server��Oracle),��������趼һ�£�ֻ���������ݿ�connDB()
 * ��������������ʹ��ģ�巽��ģʽ����������
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
