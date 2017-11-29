package PrototypePattern.demo3;

import java.io.IOException;
import java.io.OptionalDataException;

/*
 * ԭ��ģʽ:���
 * �����ʼ�������������ݽ϶�(�緢���ߡ������ߡ����⡢���ݡ����ڡ�������),ĳϵͳ������Ҫ�ṩһ��
 * �ʼ����ƹ���,�����Ѿ������õ��ʼ�����,����ͨ�����Ƶķ�ʽ����һ���µ��ʼ�����,�����Ҫ�ı�ĳ��
 * ������,�����޸�ԭʼ���ʼ�����,ֻ��Ҫ�޸ĸ��ƺ�õ����ʼ����󼴿�.ʹ��ԭ��ģʽ��Ƹ�ϵͳ.�ڱ�
 * ʵ����ʹ��ǳ��¡ʵ���ʼ���ֵ,�������ʼ�(E_mail)��ͬʱ�����Ƹ���(Attachment)
 */
public class Client {
	public static void main(String[] args) {
		Email email,copyEmail = null;
		 
		email = new Email();
		
		try {
			copyEmail = (Email) email.deepClone();
		} catch (OptionalDataException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("email==copyEmail?");
		System.out.println(email==copyEmail);
		
		System.out.println("email.getAttachment==copyAttachment?");
		System.out.println(email.getAttachment()==copyEmail.getAttachment());
		
	}
}
