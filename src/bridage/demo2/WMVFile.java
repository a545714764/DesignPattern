package bridage.demo2;

public class WMVFile implements VideoFile{

	@Override
	public void decode(String osType, String fileName) {
		System.out.println("��ʽΪWMV����Ƶ�ļ�"+fileName+"��"+
				osType+"ƽ̨�н��벥�š�"
				);
		
	}

}
