package bridage.demo2;

public class AVIFile implements VideoFile{

	@Override
	public void decode(String osType, String fileName) {
		System.out.println("��ʽΪAVI����Ƶ�ļ�"+fileName+"��"+
				osType+"ƽ̨�н��벥�š�"
				);
		
	}

}
