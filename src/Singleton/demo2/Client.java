package Singleton.demo2;
/*
 * ����ģʽʵ��2֮���֤����
 * ����ʵ������,�������֤�������Ψһ��,ͬһ���˲������ж�����֤����,��һ���������֤ʱ
 * �����������һ�����֤����,���֮����Ϊ��ʧ��ԭ�򲹰�ʱ,����ʹ��ԭ�������֤����,�����
 * ���µĺ���.��ʹ�õ���ģʽģ��ó���
 */
public class Client {

	public static void main(String[] args) {
		IdentityCardNo no1,no2;
		no1 = IdentityCardNo.getInstance();
		no2 = IdentityCardNo.getInstance();
		System.out.println("���֤�����Ƿ�һ��:"+(no1==no2));
		
		String str1,str2;
		str1 = no1.getIdentityCardNo();
		str2 = no2.getIdentityCardNo();
		System.out.println("��һ�κ���:"+str1);
		System.out.println("�ڶ��κ���"+str2);
		System.out.println("�����Ƿ����:"+str1.equalsIgnoreCase(str2));
		System.out.println("�Ƿ�����ͬ����:"+(str1==str2));
	}

}
