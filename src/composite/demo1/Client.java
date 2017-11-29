package composite.demo1;
/*
 * ���ģʽʵ��1֮ɱ�����
 * ʹ�����ģʽ���һ��ɱ�����(AntiVirus)�Ŀ�ܣ�������ȿ��Զ�ĳ���ļ���(Folder)ɱ��
 * Ҳ���Զ�ĳ��ָ�����ļ�(File)����ɱ�����ļ���������ı��ļ�TextFile��ͼƬ�ļ�ImageFile
 * ����Ƶ�ļ�VideoFile��
 */
public class Client {

	public static void main(String[] args) {
		AbstractFile file1,file2,file3,file4,file5,folder1,folder2,folder3;
		file1 = new ImageFile("����.gif");
		file2 = new ImageFile("��Ů.jpg");
		file3 = new TextFile("���ģʽ.txt");
		file4 = new TextFile("Java�������.doc");
		file5 = new VideoFile("�ǳ�����.rmvb");
		
		folder1 = new Folder("����ͼƬ");
		folder1.add(file1);
		folder1.add(file2);
		
		folder2 = new Folder("ѧϰ����");
		folder2.add(file3);
		folder2.add(file4);
		
		folder3 = new Folder("��������");
		folder3.add(file5);
		folder3.add(folder1);
		folder3.add(folder2);
		folder3.display();
	}

}
