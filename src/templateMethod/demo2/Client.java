package templateMethod.demo2;
/*
 * ģ�巽��ʵ��2֮����ҵ���������
 * �����а���ҵ��ʱ,һ�㶼����������������,������Ҫȡ���Ŷ�,Ȼ��������ҵ��,�����Ҫ�����й�����Ա����
 * ����.���۾���ҵ����ȡ�����ת�ˣ���������̶�һ������ʹ��ģ�巽��ģʽģ������ҵ��������̡�
 */
public class Client {

	public static void main(String[] args) {
		BankTemplateMethod bank;
		bank = (BankTemplateMethod) XMLUtil.getBean();
		bank.process();
		System.out.println("-----------------------");
	}

}
