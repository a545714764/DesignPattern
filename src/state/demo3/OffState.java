package state.demo3;

public class OffState extends State {

	@Override
	public void on(Switch s) {
		System.out.println("��");
		
	}

	@Override
	public void off(Switch s) {
		System.out.println("�Ѿ��ر�");
		
	}

}
