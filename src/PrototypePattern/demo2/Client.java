package PrototypePattern.demo2;
/*
 * ԭ��ģʽ:ǳ����
 * �����ʼ�������������ݽ϶�(�緢���ߡ������ߡ����⡢���ݡ����ڡ�������),ĳϵͳ������Ҫ�ṩһ��
 * �ʼ����ƹ���,�����Ѿ������õ��ʼ�����,����ͨ�����Ƶķ�ʽ����һ���µ��ʼ�����,�����Ҫ�ı�ĳ��
 * ������,�����޸�ԭʼ���ʼ�����,ֻ��Ҫ�޸ĸ��ƺ�õ����ʼ����󼴿�.ʹ��ԭ��ģʽ��Ƹ�ϵͳ.�ڱ�
 * ʵ����ʹ��ǳ��¡ʵ���ʼ���ֵ,�������ʼ�(E_mail)��ͬʱ�����Ƹ���(Attachment)
 */
public class Client {
	public static void main(String[] args) {
		Email email,copyEmail;
		 
		email = new Email();
		
		copyEmail = (Email) email.clone();
		
		System.out.println("email==copyEmail?");
		System.out.println(email==copyEmail);
		
		System.out.println("email.getAttachment==copyEmail.getAttachment?");
		System.out.println(email.getAttachment()==copyEmail.getAttachment());
	}
}
