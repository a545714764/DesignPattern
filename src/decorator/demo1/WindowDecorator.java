package decorator.demo1;

public class WindowDecorator extends Window{
	private Window window;
	public WindowDecorator(Window window){
		this.window = window;
	}
	public void display(){
		window.display();
	}
}
