package bridage.demo2;
/*
 * 如果需要开发一个跨平台视频播放器，可以在不同操作系统平台(如Windows、Linux、UNIX等)
 * 上播放多种格式的视频文件，如MPEG、RMVB、AVI、WMV等常见视频格式。现使用桥接模式设计
 * 该播放器
 */
public class Client {

	public static void main(String[] args) {
		VideoFile file;
		OperationSystemVersion version;
		file = new RMVBFile();
		version = new WindowsVersion();
		version.setVideoFile(file);
		version.play("《让子弹飞》");

	}

}
