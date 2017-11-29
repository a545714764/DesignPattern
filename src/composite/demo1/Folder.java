package composite.demo1;

import java.util.ArrayList;

public class Folder extends AbstractFile {
	private ArrayList fileList = new ArrayList<>();
	private String fileName;
	public Folder(String fileName){
		this.fileName =fileName;
	}
	@Override
	public void add(AbstractFile element) {
		fileList.add(element);
	}

	@Override
	public void remove(AbstractFile element) {
		fileList.remove(element);

	}

	@Override
	public void display() {
		System.out.println("文件夹-"+fileName+"-包含如下资料：");
		for(Object obj:fileList){
			((AbstractFile)obj).display();
		}

	}

}
