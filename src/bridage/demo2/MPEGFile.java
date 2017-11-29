package bridage.demo2;

public class MPEGFile implements VideoFile{

	@Override
	public void decode(String osType, String fileName) {
		System.out.println("格式为MPEG的视频文件"+fileName+"在"+
				osType+"平台中解码播放。"
				);
		
	}

}
