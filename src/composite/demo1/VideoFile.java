package composite.demo1;

import java.util.ArrayList;

public class VideoFile extends AbstractFile {
	private String fileName;
	public VideoFile(String fileName){
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
		System.out.println("�����Ƶ�ļ���"+fileName);

	}

}
