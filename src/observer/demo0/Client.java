package observer.demo0;
/*
 * �۲���ģʽһ����ʽ��
 * �۲���ģʽҲ�з���-����ģʽ��Publish/Subscribe����ģ��-��ͼ��Model/View��ģʽ��
 * Դ-��������Source/Listener��������ߣ�Dependents��ģʽ
 * ���Ͽ���ԭ��
 * Java���ԶԹ۲���ģʽ֧��
 * Observer�ӿ�,�䵱����۲���
 * Oberverable��,�䵱�۲�Ŀ����,�кܶ෽��,����java API
 * "Java SE Application Design With MVC":��ַ->:http://www.oracle.com/technetwork/articles/javase/index-142890.html
 */
public class Client {
	public static void main(String[] args) {
		Subject subject = new ConcreteSubject();
		Observer observer = new ConcreteObserver();
		subject.attach(observer);
		subject.notify1();
	}

}
