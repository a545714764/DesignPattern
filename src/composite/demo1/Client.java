package composite.demo1;
/*
 * 组合模式实例1之杀毒软件
 * 使用组合模式设计一个杀毒软件(AntiVirus)的框架，该软件既可以对某个文件夹(Folder)杀毒
 * 也可以对某个指定的文件(File)进行杀毒，文件种类包括文本文件TextFile、图片文件ImageFile
 * 、视频文件VideoFile。
 */
public class Client {

	public static void main(String[] args) {
		AbstractFile file1,file2,file3,file4,file5,folder1,folder2,folder3;
		file1 = new ImageFile("房子.gif");
		file2 = new ImageFile("美女.jpg");
		file3 = new TextFile("设计模式.txt");
		file4 = new TextFile("Java程序设计.doc");
		file5 = new VideoFile("非成勿扰.rmvb");
		
		folder1 = new Folder("最新图片");
		folder1.add(file1);
		folder1.add(file2);
		
		folder2 = new Folder("学习资料");
		folder2.add(file3);
		folder2.add(file4);
		
		folder3 = new Folder("个人资料");
		folder3.add(file5);
		folder3.add(folder1);
		folder3.add(folder2);
		folder3.display();
	}

}
