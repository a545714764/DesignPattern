package bridage.demo2;
/*
 * �����Ҫ����һ����ƽ̨��Ƶ�������������ڲ�ͬ����ϵͳƽ̨(��Windows��Linux��UNIX��)
 * �ϲ��Ŷ��ָ�ʽ����Ƶ�ļ�����MPEG��RMVB��AVI��WMV�ȳ�����Ƶ��ʽ����ʹ���Ž�ģʽ���
 * �ò�����
 */
public class Client {

	public static void main(String[] args) {
		VideoFile file;
		OperationSystemVersion version;
		file = new RMVBFile();
		version = new WindowsVersion();
		version.setVideoFile(file);
		version.play("�����ӵ��ɡ�");

	}

}
