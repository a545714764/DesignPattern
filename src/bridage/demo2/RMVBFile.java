package bridage.demo2;

public class RMVBFile implements VideoFile{

	@Override
	public void decode(String osType, String fileName) {
		System.out.println("��ʽΪRMVB����Ƶ�ļ�"+fileName+"��"+
				osType+"ƽ̨�н��벥�š�"
				);
		
	}

}