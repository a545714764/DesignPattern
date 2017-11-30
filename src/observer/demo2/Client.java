package observer.demo2;

/*
 * �۲���ģʽʵ��2֮è����������
 * ����è������͹��Ĺ۲�Ŀ�꣬����͹�ʺ�۲��ߣ�è�������ܣ���Ҳ���ŽУ�ʹ�ù۲���ģʽ
 * �����ù��̡�
 */
public class Client {
	public static void main(String[] args) {
		MySubject subject = new Cat();
		
		MyObserver o1,o2,o3;
		o1 = new Mouse();
		o2 = new Mouse();
		o3 = new Dog();
		
		subject.attach(o1);
		subject.attach(o2);
		subject.attach(o3);
		subject.cry();
		
	}
	
}
