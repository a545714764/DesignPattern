package bridage.demo2;

public class LinuxVersion extends OperationSystemVersion {

	@Override
	public void play(String fileName) {
		vf.decode("Linux", fileName);

	}

}
