package decorator.demo3;

public class Airplane extends Changer {

	public Airplane(Transform transform) {
		super(transform);
		System.out.println("��ɷɻ�");
		// TODO Auto-generated constructor stub
	}
	
	public void fly(){
		System.out.println("����շ���");
	}

}
