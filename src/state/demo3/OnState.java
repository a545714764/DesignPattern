package state.demo3;

public class OnState extends State {

	@Override
	public void on(Switch s) {
		System.out.println("�Ѿ���");
	}

	@Override
	public void off(Switch s) {
		System.out.println("�ر�");
		s.setState(Switch.getState("off"));
	}

}
