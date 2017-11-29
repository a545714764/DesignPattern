package bridage.demo2;

public class UnixVersion extends OperationSystemVersion {

	@Override
	public void play(String fileName) {
		vf.decode("Unix", fileName);

	}

}
