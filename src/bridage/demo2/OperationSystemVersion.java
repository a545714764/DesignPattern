package bridage.demo2;

public abstract class OperationSystemVersion {
	protected VideoFile vf;
	public void setVideoFile(VideoFile vf){
		this.vf = vf;
	}
	public abstract void play(String fileName);
}
