package decorator.demo1;

public class ScrollbarDecorator extends WindowDecorator {

	public ScrollbarDecorator(Window window) {
		super(window);
		// TODO �Զ����ɵĹ��캯�����
	}
	public void display(){
		this.setScrollbar();
		super.display();
	}
	public void setScrollbar(){
		System.out.println("���������ӹ�������");
	}

}
