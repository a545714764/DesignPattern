package decorator.demo4;
/*
 * ͸��װ��ģʽʵ��4֮���ؼ���ϵͳ
 * ĳϵͳ�ṩ��һ�����ݼ��ܹ���,���Զ��ַ������м��ܡ���򵥵ļ����㷨ͨ������ĸ������λ��ʵ��
 * ͬʱ���ṩ���Ը��ӵ������������,���ṩ�˸�Ϊ�߼�����ģ���ܡ��û���ʹ����򵥵ļ����㷨����
 * �������м���,������û��������ԶԼ���֮��Ľ��ʹ�����������㷨���ж��μ���,��ȻҲ���Խ���
 * �����μ��ܡ���ʹ��װ��ģʽ��Ƹö��ؼ���ϵͳ
 */
public class Client {

	public static void main(String[] args) {
		String password = "sunnyLiu";
		String cpassword;
		Cipher sc,cc;
		sc = new SimpleCiper();
		cpassword = sc.encrypt(password);
		System.out.println(cpassword);
		System.out.println("----------------------");
		
		cc = new ComplexCipher(sc);
		cpassword = cc.encrypt(password);
		System.out.println(cpassword);
		System.out.println("--------------------");

	}

}
