package PrototypePattern.demo2;
/*
 * 原型模式:浅复制
 * 由于邮件对象包含的内容较多(如发送者、接受者、标题、内容、日期、附件等),某系统中现需要提供一个
 * 邮件复制功能,对于已经创建好的邮件对象,可以通过复制的方式创建一个新的邮件对象,如果需要改变某部
 * 分内容,无须修改原始的邮件对象,只需要修改复制后得到的邮件对象即可.使用原型模式设计该系统.在本
 * 实例中使用浅克隆实现邮件赋值,即复制邮件(E_mail)的同时不复制附件(Attachment)
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
