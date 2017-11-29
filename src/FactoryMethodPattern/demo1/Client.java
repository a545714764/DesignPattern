package FactoryMethodPattern.demo1;
/*
 * ĳϵͳ��־��¼��Ҫ��֧�ֶ�����־��¼��ʽ
 * ���ļ���־��¼(FileLog),���ݿ���־��¼(DatabaseLog)��
 * ���û����Ը���Ҫ��̬ѡ����־��¼��ʽ,��ʹ�ù�������ģʽ��Ƹ�ϵͳ
 * 
 * ����ʹ�÷�����������ɹ�������
 */
public class Client {
	public static void main(String[] args) {
		LogFactory factory;
		Log log;
		factory = new FileLogFactory();
		log = factory.createLog();
		log.writeLog();
	}
}
