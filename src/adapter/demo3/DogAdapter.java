package adapter.demo3;

public class DogAdapter extends Dog implements Robot {

	@Override
	public void cry() {
		System.out.println("������ģ��:");
		super.wang();
	}

	@Override
	public void move() {
		System.out.println("������ģ��:");
		super.run();
	}

}
