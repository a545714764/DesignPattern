package bridage.demo2;

public class MPEGFile implements VideoFile{

	@Override
	public void decode(String osType, String fileName) {
		System.out.println("��ʽΪMPEG����Ƶ�ļ�"+fileName+"��"+
				osType+"ƽ̨�н��벥�š�"
				);
		
	}

}
