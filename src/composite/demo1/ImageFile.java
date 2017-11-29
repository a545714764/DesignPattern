package composite.demo1;

import java.util.ArrayList;

public class ImageFile extends AbstractFile {
	private String fileName;
	public ImageFile(String fileName){
		this.fileName =fileName;
	}
	@Override
	public void add(AbstractFile element) {
		System.out.println("对不起，不支持该方法");
	}

	@Override
	public void remove(AbstractFile element) {
		System.out.println("对不起，不支持该方法");
	}

	@Override
	public void display() {
		System.out.println("浏览图片文件："+fileName);

	}

}
