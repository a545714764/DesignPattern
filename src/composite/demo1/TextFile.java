package composite.demo1;

import java.util.ArrayList;

public class TextFile extends AbstractFile {
	private String fileName;
	public TextFile(String fileName){
		this.fileName =fileName;
	}
	@Override
	public void add(AbstractFile element) {
		System.out.println("�Բ��𣬲�֧�ָ÷���");
	}

	@Override
	public void remove(AbstractFile element) {
		System.out.println("�Բ��𣬲�֧�ָ÷���");
	}

	@Override
	public void display() {
		System.out.println("����ı��ļ���"+fileName);

	}

}
