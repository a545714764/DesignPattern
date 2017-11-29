package PrototypePattern.demo3;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OptionalDataException;
import java.io.Serializable;

import sun.awt.image.ByteArrayImageSource;

public class Email implements Serializable {
	private Attachment attachment = null;
	
	public Email(){
		this.attachment = new Attachment();
	}
	
	public Object deepClone() throws IOException,ClassNotFoundException,OptionalDataException{
		//将对象写入流中
		ByteArrayOutputStream bao = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bao);
		oos.writeObject(this);
		
		ByteArrayInputStream bis = new ByteArrayInputStream(bao.toByteArray());
		ObjectInputStream ois = new ObjectInputStream(bis);
		return (ois.readObject());
	}
	
	public Attachment getAttachment(){
		return this.attachment;
	}
	
	public void display(){
		System.out.println("查看邮件");
	}
}
