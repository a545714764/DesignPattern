package facade.demo1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriter {
	public void write(String encryptStr,String fileNameDes){
		System.out.println("�������ģ�д���ļ���");
		try{
			FileOutputStream outFS = new FileOutputStream(fileNameDes);
			outFS.write(encryptStr.getBytes());
			outFS.close();
		}catch(FileNotFoundException e){
			System.out.println("�ļ�������");
		}catch(IOException e){
			System.out.println("�ļ���������");
		}
	}
}
