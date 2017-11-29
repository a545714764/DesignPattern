package decorator.demo1;

public class ScrollbarDecorator extends WindowDecorator {

	public ScrollbarDecorator(Window window) {
		super(window);
		// TODO 自动生成的构造函数存根
	}
	public void display(){
		this.setScrollbar();
		super.display();
	}
	public void setScrollbar(){
		System.out.println("给窗体增加滚动条！");
	}

}
