package proxy.demo4;
/*
 * ����ģʽʵ��4֮�����̳�
 * ������(Factory)��Ҫ������Ʒ(Product)�������̳�(E-Shop)�ṩ��һ��ƽ̨�����԰���������Щ��Ʒ����ø��������
 * �����˿�(Custom)�������̳�ѡ����Ʒ��ʱ��ʵ���Ǵ������̻�õ���Ʒ��Ӧ�ô���ģʽ����JAVA����̨Ӧ�ó���Ľ������
 * �����Ƹ�ģʽ��UMLͼ��
 */
public class Customer {

	public static void main(String[] args) {
		E_shopProxy proxy = new E_shopProxy();
		proxy.sell();
	}

}
