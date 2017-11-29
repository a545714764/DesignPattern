package decorator.demo3;

public class Robot extends Changer {

	public Robot(Transform transform) {
		super(transform);
		System.out.println("变成机器人");
		// TODO Auto-generated constructor stub
	}
	
	public void say(){
		System.out.println("说话");
	}

}
