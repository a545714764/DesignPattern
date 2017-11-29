package mediator.demo1;

public abstract class Dialog {
	public void showDialog(){
		System.out.println("显示主界面");
	}
	public abstract void widgetChanged(Widget widget);
}
