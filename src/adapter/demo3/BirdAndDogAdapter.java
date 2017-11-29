package adapter.demo3;

public class BirdAndDogAdapter implements Robot{
	private Dog dog;
	private Bird bird;
	
	public BirdAndDogAdapter() {
		dog = new Dog();
		bird = new Bird();
		// TODO Auto-generated constructor stub
	}
	@Override
	public void cry() {
		System.out.println("������ģ��:");
		bird.tweedle();
	}

	@Override
	public void move() {
		System.out.println("������ģ��");
		dog.run();
	}

}
