package decorator.demo3;

public final class Car implements Transform {
	
	public Car(){
		System.out.println("���ν����һ����!");
	}

	@Override
	public void move() {
		System.out.println("��½�����ƶ�!");
	}
	
}
