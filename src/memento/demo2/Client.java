package memento.demo2;
/*
 * ����¼ʵ��2֮���������ָ�
 * ĳϵͳ�ṩ���û���Ϣ����ģ�飬�û������޸��Լ��ĸ�����Ϣ��Ϊ��ʹ�������̸������Ի���
 * ��ʹ�ñ���¼ģʽ��ϵͳ���иĽ���ʹ���û��ڽ����˴������֮����Իָ�������֮ǰ��
 * ״̬��
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserInfoDTO user = new UserInfoDTO();
		Caretaker c = new Caretaker();
		
		user.setAccount("zhangsan");
		user.setPassword("123456");
		user.setTelNo("12345678901");
		System.out.println("״̬1��");
		user.show();
		c.setMemento(user.saveMemento());
		System.out.println("----------------------------");
		
		user.setPassword("11111111");
		user.setTelNo("15632541235");
		System.out.println("״̬1��");
		user.show();
		System.out.println("------------------------");
		
		user.restoreMemento(c.getMemento());
		System.out.println("�ص�״̬1��");
		user.show();
		System.out.println("-----------------------");

	}

}
