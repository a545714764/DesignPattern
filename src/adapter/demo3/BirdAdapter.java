package adapter.demo3;

public class BirdAdapter extends Bird implements Robot {

	@Override
	public void cry() {
		System.out.println("������ģ��:");
		super.tweedle();
	}

	@Override
	public void move() {
		System.out.println("������ģ��:");
		super.fly();
	}

}
