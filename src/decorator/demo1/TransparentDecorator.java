package decorator.demo1;

public class TransparentDecorator extends WindowDecorator {

	public TransparentDecorator(Window window) {
		super(window);
		// TODO �Զ����ɵĹ��캯�����
	}
	public void display(){
		this.setTransparent();
		super.display();
	}
	public void setTransparent(){
		System.out.println("����������Ϊ͸�����壡");
	}

}
