package observer.demo1;
/*
 * ĳ���߹�Ʊ�����Ҫ�ṩ���¹���:����Ʊ�������������ĳ֧��Ʊ�۸�仯���ȴﵽ5%ʱ
 * ϵͳ���Զ�����֪ͨ(�����¼۸�)������ù�Ʊ�Ĺ���
 * ��ʹ�ù۲���ģʽ��Ƹ�ϵͳ,������ͼ�����ʵ��
 */
public class Client {

	public static void main(String[] args) {
		Investor investor1,investor2;
		investor1 = new ConcreteInvestor("���");
		investor2 = new ConcreteInvestor("С��Ů");
		
		Stock haier =new Stock("�ຣ����", 20.00);
		haier.attach(investor1);
		haier.attach(investor2);
		
		haier.setPrice(25.00);

	}

}
