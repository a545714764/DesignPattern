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
		System.out.println("机器人模仿:");
		bird.tweedle();
	}

	@Override
	public void move() {
		System.out.println("机器人模仿");
		dog.run();
	}

}
