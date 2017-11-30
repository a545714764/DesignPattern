package state.demo3;

public class OffState extends State {

	@Override
	public void on(Switch s) {
		System.out.println("打开");
		
	}

	@Override
	public void off(Switch s) {
		System.out.println("已经关闭");
		
	}

}
