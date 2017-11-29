package decorator.demo3;

public class Airplane extends Changer {

	public Airplane(Transform transform) {
		super(transform);
		System.out.println("变成飞机");
		// TODO Auto-generated constructor stub
	}
	
	public void fly(){
		System.out.println("在天空飞翔");
	}

}
