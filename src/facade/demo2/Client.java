package facade.demo2;
/*
 * ���ģʽʵ��2֮��Դ�ܿ���
 * ���ڿ���һ����Դ�ܿ��ص�����,�Ա��һ��˵�����ģʽ��Ϊ��ʹ�÷���,һ����Դ�ܿ��ؿ��Կ�����յ�ơ�һ�����ȡ�
 * һ̨�յ���һ̨���ӻ��������͹رա�ͨ���õ�Դ�ܿ��ؿ���ͬʱ�����������������豸,ʹ�����ģʽ��Ƹ�ϵͳ
 */
public class Client {

	public static void main(String[] args) {
		GeneralSwitchFacade gsf = new GeneralSwitchFacade();
		gsf.on();
		System.out.println("-----------------");
		gsf.off();
	}

}
