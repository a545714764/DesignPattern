package templateMethod.demo1;
//�������ݿ�����ࣺ������
public abstract class DBOperator {
	public abstract void connDB();
	public void openDB(){
		System.out.println("�����ݿ�");
	}
	public void useDB(){
		System.out.println("ʹ�����ݿ�");
	}
	public void closeDB(){
		System.out.println("�ر����ݿ�");
	}
	public void process(){
		connDB();
		openDB();
		useDB();
		closeDB();
	}
}
