package decorator.demo3;

public class Robot extends Changer {

	public Robot(Transform transform) {
		super(transform);
		System.out.println("��ɻ�����");
		// TODO Auto-generated constructor stub
	}
	
	public void say(){
		System.out.println("˵��");
	}

}
