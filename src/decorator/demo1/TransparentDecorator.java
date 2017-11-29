package decorator.demo1;

public class TransparentDecorator extends WindowDecorator {

	public TransparentDecorator(Window window) {
		super(window);
		// TODO 自动生成的构造函数存根
	}
	public void display(){
		this.setTransparent();
		super.display();
	}
	public void setTransparent(){
		System.out.println("将窗体设置为透明窗体！");
	}

}
